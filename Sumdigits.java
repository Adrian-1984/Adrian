public class Sumdigits {
	
	public static void main(String[] args) {
		int number = 35;
		int sumDigit = 0;
		while (number > 0) {
			sumDigit = sumDigit + number % 10; // 0 + 35%10 = 5
			number = number /10;		   // 35/10 = 3.5 = 3 rounded
		}
		System.out.println(sumDigit);
	}
}