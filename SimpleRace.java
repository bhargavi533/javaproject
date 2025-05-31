package xyz;

class Car{
	public void BMW() {
		for (int i=1;i<=3;i++) {
			System.out.println("car moving"+i);
		}
	}
}
class Bike{
	public void ninja() {
		for (int i=1;i<=3;i++) {
			System.out.println("Bike  moving"+i);
		}
	}
}
public class SimpleRace {
	public static void main(String[] args) {
		Car c=new Car();
		Bike b=new Bike();
		c.BMW();
		b.ninja();
		// TODO Auto-generated method stub

	}

}
