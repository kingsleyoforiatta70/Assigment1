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
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                }
            }
                System.out.println("Invalid Input.Please enter 1 or 2.");
                scanner.nextLine(); //Getting rid of invalid number entered earlier
            }
            System.out.print("Enter the temperature to convert: ");
            double temperature = 0;

            //incase the user doesn't give a valid temperature
            while (!scanner.hasNextDouble()){
                System.out.println("Wrong Inout.Please enter a valid number for the temperature.");
                scanner.next(); //Getting rid of invalid number entered earlier
            }
            temperature =scanner.nextDouble();

            //now here we do the conversion
            if (choice == 1) {
                System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, celsiusToFahrenheit(temperature));
            }
            else {
                System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, fahrenheitToCelsius(temperature));

            }
            System.out.println("Congrats for using my temperature converter!");
            scanner.close();
        }

        public static double celsiusToFahrenheit(double celsius){
            return (celsius * 9 / 5) + 32;
        }
        public static double fahrenheitToCelsius(double fahrenheit){
            return (fahrenheit - 32)* 5 / 9;
        }
        
    }
