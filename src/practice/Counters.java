package practice;
class Number1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("1");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

class Number2 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("2");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
public class Counters {

	public static void main(String[] args) {
		Runnable obj1= new Number1();
        Runnable obj2 = new Number2();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();

	}

}
