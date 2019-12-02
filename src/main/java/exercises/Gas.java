package exercises;
import java.util.Scanner;
public class Gas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int miles =input.nextInt();
        System.out.println("How many gallons have you used?");
        int gallons =input.nextInt();
        System.out.println("You are getting " + miles/gallons + " miles per gallon");
    }
}
