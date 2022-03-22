package practice_1;
 import java.util.Scanner;
public class fabonacci_1 {
	public static void main(String[] args) {
	Scanner SC = new Scanner (System.in);
	System.out.println("enter the number:");
	int x=0,y=1,z=0,n;
	n=SC.nextInt();
	while(z<=n) {
		x=y;
		y=z;
		z=x+y;
	}
	System.out.println(z);
	}
}
