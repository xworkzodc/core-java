import java.util.*;
class ForloopMulti{
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner in =new Scanner(System.in);
	
		int n = in.nextInt();
	     int mul;
		 //int sum=0;
		for(int i=1; i<=10; i++){
			mul=n*i;  // this will print adition of 0 to 10;
			System.out.println(mul );
		}
	}
}