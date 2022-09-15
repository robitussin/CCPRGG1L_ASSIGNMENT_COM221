
// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        //int sum = add();
        //System.out.println("The sum is: " + sum);

        // Method call
        // int difference = subtract();
        // System.out.println("The difference is: " + difference);


        // String crush = revealmyCrush();
        // System.out.println(crush);

        myOrder();
        
        // Close scanner
        scan.close();
    }

    static int add() {
        System.out.println("Please enter two numbers to add");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x + y;
    }

    static int subtract() {
        System.out.println("Please enter two numbers to subtract");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x - y;
    }

    static String revealmyCrush(){
        System.out.println("This method will reveal your crush");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter the name of your crush: ");
        String crush = scan.nextLine();

        return name + " loves " + crush;

    }

    static void myOrder(){
        System.out.println("Welcome to KFC! Please make your order");

        System.out.print("Enter first order: ");
        String order1 = scan.nextLine();

        System.out.print("Enter price: ");
        double price1 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter second order: ");
        String order2 = scan.nextLine();

        System.out.print("Enter price: ");
        double price2 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter third order: ");
        String order3 = scan.nextLine();

        System.out.print("Enter price: ");
        double price3 = scan.nextDouble();

        double totalAmount = price1 + price2 + price3;

        System.out.println("Your order is: " + order1 +  " " + order2 + " " + order3);
        System.out.println("Total amount: " + totalAmount);

    }



}
