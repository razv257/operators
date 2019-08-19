
public class Bitwise_Logical {
//The logical && operator doesn't check second condition if first condition is false. It checks second condition only if first one is true.

//The bitwise & operator always checks both conditions whether first condition is true or false.
	public static void main(String[] args) {
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a<c);//false && true = false  
		System.out.println(a<b&a<c);//false & true = false  
		
		//&& vs &
		System.out.println(a<b&&a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a<b&a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked
		
		
		// logial || vs Bitwise |
		System.out.println(a>b||a<c);//true || true = true  
		System.out.println(a>b|a<c);//true | true = true  
		//|| vs |  
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked  
	}

}
