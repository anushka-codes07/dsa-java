package Basics;
import java.util.*;
public class BonusCalculator {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter employee base salary: ");
            double baseSalary = sc.nextDouble();
            System.out.print("Enter bonus percentage (e.g., 10 for 10%): ");
            double bonusPercentage = sc.nextDouble();
            double bonusAmount = baseSalary * (bonusPercentage / 100);
            double totalSalary = baseSalary + bonusAmount;
            System.out.println("\n--- Salary Breakdown ---");
            System.out.printf("Base Salary   : $%.2f\n", baseSalary);
            System.out.printf("Bonus Amount  : $%.2f\n", bonusAmount);
            System.out.printf("Total Salary  : $%.2f\n", totalSalary);
    }
}