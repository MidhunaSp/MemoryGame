import java.util.*;

public class MemoryGame {

    static List<Integer> sequence = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        int level = 1;

        System.out.println("🧠 Memory Booster Game Started!");

        while (true) {

            System.out.println("\nLevel " + level);

            sequence.add(rand.nextInt(4) + 1);

            System.out.println("Remember this sequence:");
            for (int num : sequence) {
                System.out.print(num + " ");
            }

            try { Thread.sleep(2000); } catch (Exception e) {}

            System.out.println("\n\n\n\n\n\n");

            System.out.println("Enter the sequence:");
            List<Integer> userInput = new ArrayList<>();

            for (int i = 0; i < sequence.size(); i++) {
                userInput.add(sc.nextInt());
            }

            if (userInput.equals(sequence)) {
                System.out.println("✅ Correct!");
                level++;
            } else {
                System.out.println("❌ Game Over!");
                System.out.println("You reached Level: " + level);
                break;
            }
        }
    }
}
