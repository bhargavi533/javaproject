package xyz;

class animal{
	void sound() {
		System.out.println("Animals make sound");
	}
}
class Dog extends animal{
	void sound() {
		System.out.println("Dogs barks");
	}
}
class cat extends animal{
	void sound() {
		System.out.println("cat meows");
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		animal a1=new animal();
		animal a2=new Dog();
		animal a3=new cat();
		a1.sound();
		a2.sound();
		a3.sound();

	}

}
