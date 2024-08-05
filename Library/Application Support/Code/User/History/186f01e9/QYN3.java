interface Addinterface
{
	void sum(int a,int b);
}
public class Functionalinterface implements Addinterface{
	public void sum(int a,int b){
		System.out.println(a+b);
	}
        public static void main(String args[]){
		Functionalinterface f=new Functionalinterface();
		f.sum(10,200);
	}
}
