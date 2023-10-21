package project_1;

public class Condition {

	public static void main(String[] args) {

	Solution obj= new Solution();
		obj.eligibleOrNot(12);
	}

}
 class Solution{
	
	
	
	void eligibleOrNot(int age) {
		if(age>18) {
			System.out.println("You are eligible.");
		}
		else if (age==18){
			System.out.println("Wait for one year");
		}
		else {
			System.out.println("You are not eligible");
		}
	}
	
}