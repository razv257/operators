
public class Shift {
//left shift operator << is used to shift all of the bits in a value to the left side of a specified number of times
	public static void main(String[] args) {
		System.out.println(10<<2);	//10*2^2=10*4=40  
		System.out.println(10<<3);	//10*2^3=10*8=80  
		System.out.println(20<<2);	//20*2^2=20*4=80  
		System.out.println(15<<4);	//15*2^4=15*16=240  
		
//right shift operator >> is used to move left operands value to right by the number of bits specified by the right operand.
		System.out.println(10>>2);		//10/2^2=10/4=2  
		System.out.println(20>>2);		//20/2^2=20/4=5  
		System.out.println(20>>3);		//20/2^3=20/8=2  
		
//For positive number, >> and >>> works same  
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
//For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);
	}

}
