package test;

public class Stringreverse {
	
	 public static void main(String args[]) {
		 
		 String str = "hello friends chai pilo"; 
	 
		 System.out.println("original string is" +str);
		 
		 String reversestr= new StringBuffer(str).reverse().toString();
		 System.out.println("reverse string using string buffer:"+reversestr);
				 
				 
	 }

}
