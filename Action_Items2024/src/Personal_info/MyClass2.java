//Static Methods
package Personal_info;

public class MyClass2 {
	public static void myMethod() {
        System.out.println("Hello, World!");
    }

	public void anotherMethod() {
        myMethod(); 
        MyClass.myMethod(); 
    }
}
