package OOPs;



public class MethodDemo {
	// 1.No parameters no return
	public void methodOne() {
		System.out.println("Hey, we are learning method!");

	}

	// 2.No parameters but returns value
	public String methodTwo() {
		String a = "Hello.";
		String b = "how are you?";
		return a + b;

	}

	// 3.Takes parameters but doesn't return
	public void methodThree(String name) {
		System.out.println(name + ", how are you?");
	}

	// 4.Takes parameters and returns value
	public int add(int a, int b) {
		return a + b;

	}

}
