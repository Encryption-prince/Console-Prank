// import java.util.Random;

// public class FunnyConsolePrank {
//     public static void main(String[] args) throws InterruptedException {
//         String[] colors = {
//                 "\u001B[31m", // Red
//                 "\u001B[32m", // Green
//                 "\u001B[33m", // Yellow
//                 "\u001B[34m", // Blue
//                 "\u001B[35m", // Purple
//                 "\u001B[36m", // Cyan
//                 "\u001B[37m" // White
//         };

//         String blink = "\u001B[5m"; // Blinking
//         String reset = "\u001B[0m"; // Reset

//         String[] funFacts = {
//                 "Fun Fact: A group of flamingos is called a 'flamboyance'!",
//                 "Fun Fact: Bananas are berries, but strawberries aren't!",
//                 "Fun Fact: Honey never spoils. Archaeologists have eaten 3000-year-old honey.",
//                 "Fun Fact: A single strand of spaghetti is called a 'spaghetto'.",
//                 "Fun Fact: Cows have best friends and get stressed when separated.",
//                 "Fun Fact: Wombat poop is cube-shaped."
//         };

//         Random rand = new Random();
//         int fakeProgress = 0;
//         int factCounter = 0;

//         while (true) {
//             int randomColorIndex = rand.nextInt(colors.length);
//             String color = colors[randomColorIndex];

//             // Blinking warning message
//             System.out.print(color + blink + "WARNING: System format in progress..." + reset + "\n");

//             // Fake progress bar
//             System.out.print(color + "[");
//             for (int i = 0; i < fakeProgress; i++) {
//                 System.out.print("=");
//             }
//             for (int i = fakeProgress; i < 50; i++) {
//                 System.out.print(" ");
//             }
//             System.out.print("] " + fakeProgress * 2 + "%" + reset + "\r");

//             Thread.sleep(200); // Delay

//             fakeProgress++;
//             factCounter++;

//             // Play a beep occasionally
//             if (rand.nextInt(10) < 2) { // 20% chance
//                 System.out.print("\u0007"); // Terminal bell sound
//             }

//             // Show a fun fact every 100 iterations
//             if (factCounter >= 100) {
//                 int randomFactIndex = rand.nextInt(funFacts.length);
//                 System.out.println("\n" + color + funFacts[randomFactIndex] + reset);
//                 factCounter = 0;
//             }

//             // Loop progress bar
//             if (fakeProgress > 50) {
//                 fakeProgress = 0;
//                 System.out.print("\n");
//             }
//         }
//     }
// }
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FunnyConsolePrank {
    public static void main(String[] args) {
        JFrame frame = new JFrame("System Alert");
        JLabel label = new JLabel("VIRUS DETECTED! Formatting C:\\ Drive...", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(label);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Random rand = new Random();

        // Random color and position changer loop
        while (true) {
            // Random background color
            Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            frame.getContentPane().setBackground(randomColor);

            // Random beep
            if (rand.nextInt(5) == 0) { // 20% chance
                Toolkit.getDefaultToolkit().beep();
            }

            // Random window position
            int x = rand.nextInt(Toolkit.getDefaultToolkit().getScreenSize().width - frame.getWidth());
            int y = rand.nextInt(Toolkit.getDefaultToolkit().getScreenSize().height - frame.getHeight());
            frame.setLocation(x, y);

            // Sleep before next change
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
