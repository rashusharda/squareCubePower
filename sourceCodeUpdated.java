import java.util.Scanner;

public class sourceCodeUpdated {

    private static double getNumberFromUser(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static double getExponentFromUser(Scanner scanner) {
        System.out.print("Enter the power: ");
        return scanner.nextDouble();
    }

    private static void displayResult(double number, double exponent, String operation) {
        double result = Math.pow(number, exponent);
        System.out.println("The " + operation + " of " + number + " is " + result);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        double number, exponent;

        do {
            System.out.println(" ");
            System.out.println("---Cool Squares, Cubes & Powers Program---");
            System.out.println("1... Find the value of a number squared");
            System.out.println("2... Find the value of a number cubed");
            System.out.println("3... Find the value of a number to any power");
            System.out.println("Enter 4 to exit the program");
            System.out.print("Please enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    number = getNumberFromUser(scanner, "Enter the number: ");
                    displayResult(number, 2, "square");
                    break;

                case 2:
                    number = getNumberFromUser(scanner, "Enter the number: ");
                    displayResult(number, 3, "cube");
                    break;

                case 3:
                    number = getNumberFromUser(scanner, "Enter the number: ");
                    exponent = getExponentFromUser(scanner);
                    displayResult(number, exponent, "power");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println(" ");
            }
        } while (choice != 4);

        System.out.println("You have exited the program. Thanks for trying it!");
        scanner.close();
    }

}