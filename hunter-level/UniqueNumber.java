import java.util.Arrays;
import java.util.Scanner;

class UniqueInteger {
	int n,i,a[];
	public void uniqueNumber(){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		n=in.nextInt();
		a=new int[n];
		System.out.println("Enter the element of an array,and each element must repeat once except one element");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		if(n%2!=0){
			int i=0;
			while(i<n){
				if(a[i]==a[i+1]){
					i=i+2;
				}
				else{
					System.out.println("The unique number is "+a[i]);
					break;
				}
				if(i==n-1){
					System.out.println("The unique number is "+ a[i]);
					break;
				}
			}
			
			
		}
		else{
			System.out.println("No possiblity for existence of unique number");
			System.out.println("Please give value of size as an odd");
		}
	}
}
class MainExecutionClass {

	public static void main(String[] args) {
		UniqueInteger uq=new UniqueInteger();
		uq.uniqueNumber();

	}

}
