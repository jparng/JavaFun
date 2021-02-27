import java.util.Scanner; 

public class ValidateCreditCards {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Prompt user to input credit card number
        System.out.print("Enter a credit card number as a long integer ");

        long number = input.nextLong();

        //If the boolean method checkValid returns true, print "valid", otherwise print "invalid"
        System.out.println(number + " is " + (checkValid(number) ? "valid" : "invalid"));
       
    }

    //Method to check validity
    public static boolean checkValid(long number){
        // if card length is >= 13 AND <=16 AND matches Visa, Master, Amex, OR discover, AND
        //the sum of even and odd digits places are divisible by 10, this method will return true, otherwise return false
        return (getLength(number) >= 13 && getLength(number) <=16) &&
         (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
         || prefixMatched(number,6)) && ((doubleEvenDigits(number) + oddDigits(number)) % 10 == 0);
        }

    //This method converts the long integer into a string and then returns 
    //the number of digits in the long integer
    public static int getLength(long d){
        String num = d + "";
        return num.length();
    }
    //adds both the digits multiplied by 2 and the double-digit
    //numbers converted into a single-digit number
    public static int doubleEvenDigits(long num){
        int sum = 0;
        String n = num + "";
        for (int i = getLength(num)- 2; i >= 0; i -= 2 )
            sum += doubleToSingle(Integer.parseInt(n.charAt(i) + "") * 2);

        return sum;
    }
    // This will return a number if it's a single digit, otherwise
    // it will return the sum of the 2 digit values
    public static int doubleToSingle(int num){
        if (num < 9)
            return num;
        return num / 10 + num % 10; 
}
    // This will return the sum from the odd-placed digits in the number
    public static int oddDigits(long num){
        int sum = 0;
        String n = num + "";
        for(int i = getLength(num) - 1; i>= 0; i-= 2)
            sum += Integer.parseInt(n.charAt(i) + "");
        return sum;
}

    //checks if the first digit is valid for credit cards and will return true
    public static boolean prefixMatched(long num, int d){
        return getPrefix(num, getLength(d)) == d;
    }

    //If the number of digits is greater than the integer i, return the first digit in the 
    //string format from method getLength, otherwise return the number.
    public static long getPrefix(long num, int i){
        if(getLength(num) > i){
            String n = num + "";
            return Long.parseLong(n.substring(0, i));
        }
        return num;
    }

}