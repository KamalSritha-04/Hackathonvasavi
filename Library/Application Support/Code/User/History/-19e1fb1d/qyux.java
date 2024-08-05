interface Ione{
	int rollNo=21;
	void display();
}
class Interfacedemo implements Ione{
	public void display(){
		System.out.println(Ione.rollNo);
	
	}
	public static void main(String args[]){
		Interfacedemo i=new Interfacedemo();
		i.display();
	}
}