package Lec1;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 30;
		if (age >= 18) {
			if (age > 18 && age <= 30) {
				System.out.println("dringk water");
			} if (age >= 30 && age < 50) {
				System.out.println("soda");
			} else if (age > 50 && age < 90) {
				System.out.println("medicine");
			} else {
				System.out.println("Bdiya h");
			}

		} else {
			System.out.println("nhi de skte vote");
		}
	}

}
