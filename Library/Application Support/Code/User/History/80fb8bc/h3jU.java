abstract class Person{
	abstract void stu(int rollNo);
	abstract void fac(String name);
}
class Student extends Person{
	public void stu(int id){
		System.out.println("Students roll no"+id);
	}
	public void fac(String sname){
		System.out.println("Faculty name"+sname);
	}
}
class Faculty extends Person{
	public void stu(int id){
		System.out.println("Students roll no"+id);
	}
	public void fac(String sname){
		System.out.println("Faculty name"+sname);
	}
}
class Abstractdemo {
	public static void main(String args[]){
		Faculty f=new Faculty();
		f.fac("kamal");
		f.stu(3321);
		Student s=new Student();
		s.fac("shriya");
		s.stu(3338);
	}
}
