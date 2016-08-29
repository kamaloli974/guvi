import java.util.Scanner;

class SquareChecking {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int cordinates[]=new int[8];
		double ab,bc,cd,da;
		int dx1,dx2,dx3,dx4,dy1,dy2,dy3,dy4;
		System.out.println("Enter  co-ordinates of four points respectively:");
		System.out.println("co-A(x1,y1),co-b(x2,y2),co-c(x3,y3),co-D(x4,y4");
		for(int i=0;i<8;i++){
			cordinates[i]=input.nextInt();
		}
		dx1=Math.abs(cordinates[0]-cordinates[2]);
		dx1=dx1*dx1;
		dx2=Math.abs(cordinates[2]-cordinates[4]);
		dx2=dx2*dx2;
		dx3=Math.abs(cordinates[4]-cordinates[6]);
		dx3=dx3*dx3;
		dx4=Math.abs(cordinates[6]-cordinates[0]);
		dx4=dx4*dx4;
		dy1=Math.abs(cordinates[1]-cordinates[3]);
		dy1=dy1*dy1;
		dy2=Math.abs(cordinates[3]-cordinates[5]);
		dy2=dy2*dy2;
		dy3=Math.abs(cordinates[5]-cordinates[7]);
		dy3=dy3*dy3;
		dy4=Math.abs(cordinates[7]-cordinates[1]);
		dy4=dy4*dy4;
		ab=(double)Math.abs(dx1+dy1);
		bc=(double)Math.abs(dx2+dy2);
		cd=(double)Math.abs(dx3+dy3);
		da=(double)Math.abs(dx4+dy4);
		if(ab==bc&&bc==cd&&cd==da&&da==ab){
			System.out.println("The given cordinates forms square.");
		}
		else{
			System.out.println("The given co-ordinates  does not form square.");
		}
	}

}
