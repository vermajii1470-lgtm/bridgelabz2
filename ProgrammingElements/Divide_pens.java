package programmingelements;

public class Divide_pens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pens = 14;
		int students = 3;
		int remaining_pens = pens%students;
		int pens_to_each = pens/students;
		System.out.println("The pen per student is " + pens_to_each + " and the remaining pen not distributed is " + remaining_pens);
	}

}
