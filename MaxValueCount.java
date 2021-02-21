import java.util.Scanner; 

public class MaxValueCount {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        //Prompt user for integers
        System.out.print("Enter an integer (input ends if it is 0): ");
        int number = input.nextInt();
        
        //Create a variable "max" holding user's number
        int max = number;
        //Create a variable to store occurences, starts at 1
        int count = 1;
        
        //Create a loop to calculate the number of inputs until a "0" is input
        while (number != 0){
            number = input.nextInt();
            //If statement to find the max number input, reset count to 1
            if (number > max){
              max = number;
              count = 1;
            }
            //Else if to count the number of max number inputs
            else if(number == max){
                count++;
            }
            //Error message if you include negative integers
            else if(max < 0){
                System.out.println("Please enter some positive integers");
                System.exit(1);
            }
        } 
        //Display results
        System.out.println("The max is " + max);
        System.out.println("Number of times " + max + " occurred: " + count);
    }
}
