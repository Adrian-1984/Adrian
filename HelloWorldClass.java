

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
	}
}
