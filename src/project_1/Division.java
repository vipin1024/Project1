package project_1;

public class Division {

	public static void main(String[] args) {

	Solve obj1= new Solve();
			int d= obj1.division(20,5);
			System.out.println("your output is= "+d);
		
		int z= 	obj1.addOneToN(7) ;
			System.out.println("addition of 1 to N is = " + z);
	
	
	}

}

class Solve{
	
 int division (int a, int b) {
	int c;
	c= a/b;
	return c;
 }
 
 int addOneToN (int N) {
	int c=0;
	while(N>=1) {
		
		c=c+N;
		N--;
		
	}
	 
	 return c;
	 
 }
 
 
 
}
