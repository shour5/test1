import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class Date {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a value for x: ");
        int inputValue = keyboard.nextInt();
        double calculatedX = Math.pow((5 - inputValue), 2) + Math.pow((inputValue - 5), 2) - 5;
        int newcalculatedX = (int)calculatedX;
        System.out.println("(5-x)^2 + (x-5)^2 - 5 = " + newcalculatedX);
        
        
        
    }
}
