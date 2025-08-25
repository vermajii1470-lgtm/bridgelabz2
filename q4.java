// 4. Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
// Hint => 
// Use a single print statement to display multiline text and variables.
// Profit = selling price - cost price
// Profit Percentage = profit / cost price * 100
// I/P => NONE
// O/P => 
// The Cost Price is INR ___ and Selling Price is INR ___
// The Profit is INR ___ and the Profit Percentage is ___


public class q4 {
    
    public static void main(String[] args) {
        int CP =129;
        int SP = 191;
        int profit = SP-CP;
        double profitper =(profit * 100.0) / CP ;
         System.out.println("The cost price is INR " + CP + "  and selling price is INR " + SP +"\n" +
         " The profit is INR " + profit + " and the profit percentage " + profitper

         );

    }
}
