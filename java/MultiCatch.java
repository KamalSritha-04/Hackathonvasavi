import java.util.Scanner;
class MultiCatch{
	public static void main(String args[]){
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sobj.nextInt();
		try{
			System.out.println(a/10);
			int[] array={1,2,3,4};
			int b=array[10];
			System.out.println(b);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception Ocuured");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Acess the correct index element");
		}
		System.out.println("end of main block");
	}
}
