interface Iinterface{
	public void square(int x);
	static void display(){
		System.out.println("Static method");
	}
}
class Staticinterfacedemo implements Iinterface{
	public void square(int x){
		System.out.println(x*x);
	}
	public static void main(String args[]){
		 Staticinterfacedemo s=new Staticinterfacedemo();
		 s.square(10);
		 Iinterface.display();
	}
}	