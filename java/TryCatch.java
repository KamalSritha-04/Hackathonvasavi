import java.util.Scanner;
class TryCatch{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=s.nextInt();
		System.out.println("enter b value:");
		int b=s.nextInt();
		try{
			int i=(a/b);
			System.out.println(i);
		}
		catch(ArithmeticException e){
            System.out.println("exception handled");
			System.out.println("Arithmetic Exception"+e.getMessage());
		}
	}
}