import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Welcome message and option for the user to chose from
        System.out.println("Welcome to the temperature Converter!");
        System.out.println("1. Convert Celsius to Fehrenheit!");
        System.out.println("2. Convert Fehrenheit to Celsius!");

        int choice =0;

        //Checking to see if the user inout a valid choice
        while (true){
            System.out.print(
                    "Enter 1 or 2: ");
            if (scanner.hasNextInt()){
                choice =scanner.nextInt();
                if (choice == 1 || choice ==2){
                    break;
                }
                System.out.println("Invalid Input.Please enter 1 or 2.");
                scanner.nextLine(); //Getting rid of invalid number entered earlier
            }

        }

    }
}