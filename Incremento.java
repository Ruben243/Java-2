/*
 * 
 * Incremento.java
 */
 
 public class Incremento
 {
	 public static void main (String args[])
	 {
		 
		 int x;

         x = 0;

		 System.out.println(x);
		 System.out.println(++x + x++);
		 System.out.println(x);
		 
		 System.out.println();
        		 
		 x = 0;
		 
		 System.out.println(x);
		 System.out.println(++x + x++ + ++x + x++);
		 System.out.println(x);

		 System.out.println(); 
		                    
		 x = 0;
		 
		 System.out.println(x);
		 System.out.println(++x + x++ + 12 *  ++x);
		 System.out.println(x);
		     
		 System.out.println();
		 
	 }
 }
