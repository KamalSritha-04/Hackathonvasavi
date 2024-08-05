import java.util.Scanner;
class NestedTry{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=s.nextInt();
		System.out.println("enter b value:");
		int b=s.nextInt();
		System.out.println("enter string name:");
		String k=s.next();
		try{
			System.out.println("In outer try block");
			int i=(a/b);
			System.out.println(i);
			try{
				System.out.println("In inner try block");
				k=null;
				k.charAt(0);
			}
			catch(NullPointerException n){
				System.out.println(n.getMessage());
			}
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}
