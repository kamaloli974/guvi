import java.util.Arrays;
import java.util.Scanner;

class IndexAndValueEqual {
	int a[],n,count=0;
	
	public void indexAndValue(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		n=input.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array in increasing order");
		for(int i=0;i<n;i++){
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]==i){
				System.out.println("The element which equal to it's index is = "+a[i]);
				count++;
			}
		}
		if(count==0){
			System.out.println("No such element is present");
		}
		
	}
	
	
}

class MainExecutionClass {

	public static void main(String[] args) {
		IndexAndValueEqual iv=new IndexAndValueEqual();
		iv.indexAndValue();

	}

}
