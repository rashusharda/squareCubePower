import java.util.Scanner; //Scanner feature imported
    public class sourceCode {


    public static void main(String[] args) {
    
        Scanner keyedInput = new Scanner(System.in); //Scanner declared
        int choice; //integer variable declared to hold user's option
        int i; //integer variable declared to use in for loop
        double answer; //integer variable declared to hold answer and initialized to value 1
        double number; //double variable declared to hold base
        double exponent; //double variable declared to hold exponent (power the number is raised to)
        
        
        do { //the following code occurs until a specific condition is met
                System.out.println("---Cool Squares, Cubes & Powers Program---"); //header
                System.out.println(" "); //space
                System.out.println("1... Find the value of a number squared"); //option 1 to find the square
                System.out.println("2... Find the value of a number cubed "); //option 2 to find the cube
                System.out.println("3... Find the value of a number, to any power"); //option 3 to find the value of number to any power
                System.out.println("Enter 4 to exit the program"); //option 4 to exit the program
                System.out.print("Please enter your response: "); //collects user's information
                choice = keyedInput.nextInt(); //response to above question stored as response1
                                    
                switch (choice){ //switch statement to match the option selected with the process
                    case 1: //option 1
                        System.out.print("Enter the number: "); //user instructions to enter the base
                        number = keyedInput.nextDouble(); //stores the response to above question in variable number
                        System.out.println(" "); //space
                            System.out.println("The square of " + number + " is " + number * number ); //final output message variable number is multiplied to itself thrice to find its sqaure
                            System.out.println("------------------------------"); //line break for organization
                            System.out.println(" "); //space
                        break;
                        
                    case 2: //option 2
                        System.out.print("Enter the number: "); //user instructions to enter the base
                        number = keyedInput.nextDouble(); //stores the response to above question in variable number
                        System.out.println(" "); //space
                            System.out.println("The cube of " + number + " is " + number * number * number ); //final output message variable number is multiplied to itself twice to find its cube
                            System.out.println("------------------------------"); //line break for organization
                            System.out.println(" "); //space
                        break; 
                        
                    case 3: //option 3
                        answer = 1; //answer variable is reset to value of 1
                        System.out.print("Enter the number: "); //user instructions to enter the base
                        number = keyedInput.nextDouble(); //stores the response to above question in variable number
                        System.out.print("Enter the power: "); //user instructions to enter the base
                        exponent = keyedInput.nextInt(); //stores the response to above question in variable exponent
                        
                            for (i=1; i<= exponent; i++) //variable i is set to the value of 1, if i is lesser than or equal to the exponent then the below code takes place, i increases in increment of 1
                            {
                                answer = answer * number; //answer is multiplied to number, the result keeps on multiplying so the final answer can be found
                            }
                                System.out.println(number + " to the power " + exponent + " is: " + answer); //final output message
                                System.out.println("------------------------------"); //line break for organization
                                System.out.println(" "); //space
                        break; 
                        
                    default:
                        break;
                }   
                } while (choice != 4); //if user enters 4, then the program exits
                {
                    System.out.println("You have exited the program. Thanks for trying it!"); //outputs farewell message
                }

        keyedInput.close(); //closing the scanner
                    
}

}
