package xyz;

class Motor implements Runnable{
	public void run() {
		for (int i=1;i<=3;i++) {
			System.out.println("BMW Motor moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
		}
	}
}
}
class Jeep implements Runnable{
	public void run() {
		for (int i=1;i<=3;i++) {
			System.out.println(" ninja Jeep  moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
		}

	}
}
}

public class SimpleRace1 {

	public static void main(String[] args) {
		Thread caThread=new Thread(new Motor());
		Thread baThread=new Thread(new Jeep());
		System.out.println("Goooo");
		caThread.start();
		baThread.start();
	}

	}


