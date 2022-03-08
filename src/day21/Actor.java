package day21;

public interface Actor {
	 void act();
     void speak();
    default void comedy() //we can update a body in an interface by making it "default".
     {
   	  System.out.println("I can make people laugh");
     }
}
