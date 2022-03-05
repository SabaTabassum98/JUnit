package day20;


	interface Readable{  
		 void read();  
		}  
		public class AnonymousclassExample{  
		 public static void main(String args[]){  
			 Readable r=new Readable(){  
		  public void read(){System.out.println("inner anonymous class example");}  
		 };  
		 r.read();  
		 }  
		}  

