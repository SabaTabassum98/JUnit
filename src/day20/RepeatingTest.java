package day20;
import org.junit.jupiter.api.RepeatedTest;
public class RepeatingTest {
	@RepeatedTest(10)
	void test() {
		System.out.println("0");
	}
	@RepeatedTest(10)
	void test1() {
		System.out.println("1");
	}
	
	
	
}
