package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        int miles;
        int gallons;
        int mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven");
        miles = input.nextInt();

        input = new Scanner(System.in);
        System.out.println("Please enter the amount of gas you have consumed");
        gallons = input.nextInt();
        input.close();

       mpg = miles / gallons;
       System.out.println("you have driven " + mpg + " miles-per-gallon");

    }
}
