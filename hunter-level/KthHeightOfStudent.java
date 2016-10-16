import java.util.Arrays;
import java.util.Scanner;

 class SmallNumber {
	public static void main(String[] args){
		int number=50,k;
		double[] students=new double[number];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter height of 50 students(in inch)");
		for(int i=0;i<number;i++){
			students[i]=in.nextDouble();
		}
		Arrays.sort(students);
		System.out.println("Eneter the value of k <=50");
		k=in.nextInt();
		System.out.println("The heignt of "+k+"th student is ="+students[k-1]);
	}
}
