import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

 class LargestPossibleNumber {

	public static void main(String[] args) {
		int n,i,newNumber;
		String g="";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		n=input.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements of an array");
		for(i=0;i<n;i++){
			array[i]=input.nextInt();
		}
		Arrays.sort(array);
		for(i=n-1;i>=0;i--){
			g=g+array[i];
		}
		newNumber=Integer.parseInt(g);
		System.out.println("The maximum of the number which can be form from the given number is: "+newNumber);

	}

}
