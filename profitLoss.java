package Basics;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cp: ");
        int cp = sc.nextInt();
        System.out.print("Enter sp: ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("Profit");
        }
        else if(sp==cp){
            System.out.println("no profit no loss");
        }
        else{
            System.out.println("Loss");
        }
    }
}