package programmingelements;

public class discount_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fee = 125000;
		int discounted_percent = 10;
		int discount = (fee/100)*discounted_percent;
		int discounted_fee = fee-discount;
		System.out.printf(" The discount amount is INR %d and final discounted fee is INR %d", discount , discounted_fee);
	}

}
