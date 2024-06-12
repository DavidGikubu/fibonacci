import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //It takes input N from the user and calculates the Nth Fibonacci number accordingly
        System.out.println("welcome to the fibonacci series");
        Scanner scanner = new Scanner(System.in);//creating a scanner object to take users input.
        int number = scanner.nextInt();//reading the user input for the position of the fibonacci number to find

        int firstNumber = 0;//the first fibonacci number
        int secondNumber = 1;//the second fibonacci number
        //handling corner cases when N is 0 or negative
        if(number <=0){
            System.out.println("The number can never be zero or negative");/*printing the error message*/
            return; //exiting the program
        }
        //printing the first fibonacci number
        if(number == 1){
            System.out.println(firstNumber);
        }
        //printing the second fibonacci number
        else if(number == 2){
            System.out.println(secondNumber);
        }
        //if the number is greater than 2 calculate the number iteratively
        else {

        }


    }
}