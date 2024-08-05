class Employee{
    void computeSalary(){
        System.out.println("in base class");
    }
}
class Manager extends Employee{
    void computeSalary(){
        //super.computeSalary();
        System.out.println("in subclass");
    }
}
class Dynamicmethoddispatch {
    public static void main(String args[]){
        Manager obj=new Manager();
        obj.computeSalary();
        Employee obj1=new Employee();
        obj1.computeSalary();
        Employee obj2=new Manager();//upcasting
        obj2.computeSalary();
    }
}
