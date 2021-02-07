import java.util.Scanner;
public class CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        //Make a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt user for Investment amount
        System.out.print("Enter investment amount: ");
        //set up variable for investment amount
        double investmentAmount = input.nextDouble();
        
        //Prompt user for Annual interest rate
        System.out.print("Enter annual interest rate: ");

        //Set up variable for annual interest rate
        double annualInterestRate = input.nextDouble();

        //Prompt user for number of years
        System.out.print("Enter number of years: ");

        //Set up variable for number of years
        double numberofYears = input.nextDouble();

        //calculate the future investment value
        //formula is futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberofYears*12
        double monthlyInterestRate = (annualInterestRate / 12 ) / 100; 
        double x = (1 + monthlyInterestRate);
        double y = numberofYears * 12;
        double futureInvestmentValue = investmentAmount * Math.pow(x,y);
        //Display future investment value
        System.out.println("Accumulated value is " + Math.round(futureInvestmentValue * 100.0)/100.0);

    }
}
