
public class Unary {
//++ and --
	public static void main(String[] args) {
		int x= 20;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
	
//~ and !
	
		int a=10;
		int b=-10;
		boolean c=true;
		boolean d=false;
		System.out.println(~a); //(minus of total positive value which starts from 0)
		System.out.println(~b); //positive of total minus, positive starts from 0
		System.out.println(!c); // opposite of boolean value
		System.out.println(!d);
	}
}
