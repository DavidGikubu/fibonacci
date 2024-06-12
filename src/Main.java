import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //It takes input Number from the user and calculates the Nth Fibonacci number accordingly
        System.out.println("welcome to the fibonacci series: give me a number: ");

        Scanner scanner = new Scanner(System.in);//creating a scanner object to take users input.
        int number = scanner.nextInt();//reading the user input for the position of the fibonacci number to find

        int firstNumber = 0;//the first fibonacci number
        int secondNumber = 1;//the second fibonacci number
        //handling corner cases when Number is 0 or negative
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
            //variable to hold the current fibonacci number
            int current = 0;
            //loop for the Nth fibonacci number
            for (int j = 3; j<=number; j++ ){
                current= firstNumber +secondNumber;//calculating the current fibonacci number
                firstNumber = secondNumber;//updating the current fibonacci number
                secondNumber = current;//updating the second fibonacci number

            }
            //printing the Nth fibonacci number
            System.out.println("The "+ number +"th fibonacci number is : " + current);
        }


    }
}