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
 void stu(){
 System.out.println("students");
 }
}
public class Inheritance{
public static void main(String args[])
{
 Students d=new Students();
 d.display();
 d.emp();
 d.stu();
}
}
