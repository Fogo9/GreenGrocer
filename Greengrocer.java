import java.util.Scanner;

public class Greengrocer{
    public static void main(String[] args) {

        double Pear = 2.14, Apple = 3.67, Tomato = 1.11, Banana = 0.95, Aubergine = 5.00;


        Scanner input = new Scanner(System.in);

        System.out.print("How many kilograms is a Pear? :");

        Pear = input.nextDouble();

        System.out.print("How many kilograms is a Apple? :");

        Apple = input.nextDouble();

        System.out.print("How many kilograms is a Tomato? :");

        Tomato = input.nextDouble();

        System.out.print("How many kilograms is a Banana? :");

        Banana = input.nextDouble();

        System.out.print("How many kilograms is a Aubergine? :");

        Aubergine = input.nextDouble();


        double amount = (Pear * 2.14) + (Apple * 3.67) + (Tomato * 1.11) + (Banana * 0.95) + (Aubergine * 5.00);

        System.out.println("Total Amount : " + amount + " TL ");

    }
}
