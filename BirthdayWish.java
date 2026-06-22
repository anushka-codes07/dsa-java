import java.util.*;
public class BirthdayWish {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the birthday person's name: ");
            String name = sc.nextLine();
            System.out.print("Enter their birth year (e.g., 1995): ");
            int birthYear = sc.nextInt();
            // Calculate age based on current year (2026)
            int currentYear = 2026;
            int age = currentYear - birthYear;
            // Output greeting
            System.out.println("\n=========================================");
            System.out.println("  🎉 HAPPY BIRTHDAY, " + name.toUpperCase() + "! 🎉");
            System.out.println("  Cheers to turning " + age + " years old!");
            System.out.println("=========================================\n");
            // Print ASCII birthday cake
            System.out.println("       i i i i i i i i");
            System.out.println("      | : : : : : : : |");
            System.out.println("    __|_|___________|_|__");
            System.out.println("   |^^^^^^^^^^^^^^^^^^^^^|");
            System.out.println("   |   H A P P Y         |");
            System.out.println("   |     B I R T H D A Y |");
            System.out.println("   |                     |");
            System.out.println("   ~~~~~~~~~~~~~~~~~~~~~~~");
            sc.close();
    }
}