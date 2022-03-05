package day20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
// import java.util.function.Consumer;
public class StreamAPIDemo {

	public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1,2,3,4,5,6);
     for(int i=1; i<=6; i++) {
    	 System.out.println(i);
     }
     Iterator<Integer> ivalues = values.iterator();
     while(ivalues.hasNext()) {
    	 System.out.println(ivalues.next());
     }
     for(int i : values) {
    	 System.out.println(i);
     }
    	/* values.forEach(new Consumer<Integer>(){
    		public void accept(Integer i) {
    			System.out.println(i);
    		}
    	 });*/
    
	}

}