package OOPs;

public class MethodTest {

	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		m.methodOne();
		String result = m.methodTwo();	
		System.out.println(result);
		
		m.methodThree("Sarmin");
		int sum = m.add(100, 999);
		System.out.println(sum);
	}

}
