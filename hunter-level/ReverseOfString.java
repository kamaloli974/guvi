import java.util.Scanner;

class ReverseOfString {

	public static void main(String[] args) {
		String kamal,reverse="";
		Scanner reverseInput=new Scanner(System.in);
		System.out.println("Enter the string which you want to reverse in place");
		kamal=reverseInput.nextLine();
		for(int i=kamal.length()-1;i>=0;i--){
			reverse=reverse+kamal.charAt(i);
		}
		System.out.println("The reverse of the string \""+kamal+"\" is "+"\""+reverse+"\"");
	}

}
