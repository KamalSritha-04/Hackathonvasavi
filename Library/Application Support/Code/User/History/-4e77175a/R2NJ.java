interface Ione{
	public void square(int a);
	default void display(){
		System.out.println("default method");
	}
}
class DefaultInterfaceDemo implements Ione
{
	public void square(int a){
		System.out.println(a*a);
	}
	public static void main(String args[]){
		DefaultInterfaceDemo d=new DefaultInterfaceDemo();
		d.square(10);
		d.display();
	}
}
