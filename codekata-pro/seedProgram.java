package guvi_seed_pro;

import java.util.Scanner;

 class SeedProgram {

	public static void main(String[] args) {
		int x,y,mult = 1,n,help;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number x");
		x=in.nextInt();
		System.out.println("Enter number y");
		y=in.nextInt();
		n=x;
		while(n>0){
			mult=mult*(n%10);
			n=(int)n/10;
			
		}
		mult=x*mult;
		if(mult==y){
			System.out.println(x+" is a seed of "+y);
		}
		else {
			System.out.println(x+" is not a seed of "+y);
		}

	}

}
