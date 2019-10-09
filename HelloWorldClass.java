

public class HelloWorldClass {

	HelloWorldClass(String parameter) {
		System.out.println("check git");
		text = parameter;
	}

	String text = "Field welcomes you";

	String greet() {
		return new String(text);
	}

	public static void main(String[] args) {
		HelloWorldClass hwc = new HelloWorldClass("Conrtuctor parameter");
		System.out.println(hwc.greet());
		int number = 35;
		int sumDigit = 0;
		while (number > 0) {
			sumDigit = sumDigit + number % 10; // 0 + 35%10 = 5
			number = number /10;		   // 35/10 = 3.5 = 3 rounded
		}
		System.out.println(sumDigit);

	}
}
