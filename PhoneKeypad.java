import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter a letter
       System.out.print("Enter a letter: ");

       String s1 = input.nextLine();

       //Exits the program if more than one letter
       if(s1.length() !=1){
           System.out.println("Error, spaces or extra characters added. Please only add one letter and no spaces");
           System.exit(1);
       }

      //The input located at the position will always be capitalized, and this will convert the string into a character
       char ch = Character.toUpperCase(s1.charAt(0));

        //If the letter is within 'A'-'C'
       if (ch >= 'A' && ch <= 'C')
       //Display the result
        System.out.println(ch +" displays the number " + 2);

       else if(ch >= 'D' && ch <= 'F')
        System.out.println(ch +" displays the number " + 3);
       
       else if(ch >='G' && ch <= 'I')
        System.out.println(ch +" displays the number " + 4);
       
       else if(ch >='J' && ch <= 'L')
        System.out.println( ch +" displays the number "+ 5);
       
       else if(ch >='M' && ch <= 'O')
        System.out.println(ch +" displays the number " + 6);

       else if(ch >='P' && ch <= 'S')
        System.out.println(ch +" displays the number "+ 7);

       else if(ch >='T' && ch <='V')
        System.out.println(ch +" displays the number "+ 8);
       
       else if(ch >='W' && ch <='Z')
        System.out.println(ch +" displays the number "+ 9);

        //If the input is a digit, display error
       else if(Character.isDigit(ch)){
           System.out.println("Error: not a letter. Please input a letter.");
           System.exit(1);
       }
       //Display errors for invalid inputs
       else{
           System.out.println("Error: invalid input");
           System.exit(1);
       }   
       
    }
}
