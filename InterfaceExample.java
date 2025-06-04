package xyz;

interface printtable{
	
	void print();
}
class Message implements printtable{
	public void print() {
		System.out.println("Hello From INTERFACE");
	}
}

public class InterfaceExample {
	public static void main(String[] args)
	{
		Message msg = new Message();
		msg.print();
	}

}
