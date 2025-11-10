package programmingelements;

public class Profit_And_Loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost_price = 129;
		int selling_price = 191;
		int profit_number = selling_price - cost_price;
		float profit_percentage = ((float) profit_number / (float)cost_price) *100;
		
		System.out.println("The profit is INR " + profit_number + " and the profit percentage is " + profit_percentage);
	}

}
