class University
{
 void display(){
 System.out.println("cvr college");
 }
}
class Employees extends University
{
 void emp(){
 System.out.println("employees");
 }
}
class Students extends Employees
{
 final void stu(){
 System.out.println("final students method");
 }
}
final class Inheritancefinal{
public static void main(String args[])
{
 System.out.println("final class");
 final int x=10;
 int y=20;
 int z=x+y;
 System.out.println(z);
 Students d=new Students();
 d.display();
 d.emp();
 d.stu();
}
}

