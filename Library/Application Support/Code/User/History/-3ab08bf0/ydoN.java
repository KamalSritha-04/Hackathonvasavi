class University
{
 String s="sritha";
 int x=5;
 void display(){
 System.out.println("cvr college");
 }
}
class Employees extends University
{
 String s="kamal";
 int x=10;
 void emp(){
 System.out.println("employees");
 System.out.println(x);
 System.out.println(super.x);
 System.out.println(s);
 System.out.println(super.s);
 super.display();
 }
}
class Students extends Employees
{
 void stu(){
 System.out.println("students");
 super.emp();
 }
}
public class InheritanceSuper{
public static void main(String args[])
{
 Students d=new Students();
 d.stu();
}
}