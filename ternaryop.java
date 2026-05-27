package Basics;
import java.util.*;
public class ternaryop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        System.out.println((n%2==0) ? "even" : "Odd" );
    }
}