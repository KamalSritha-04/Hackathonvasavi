class Employee{
    void computeSalary(){
        System.out.println("in base class");
    }
}
class Manager extends Employee{
    void computeSalary(){
        super.computeSalary();
        System.out.println("in child class");
    }
}
class Dynamicmethoddispatch {
    public static void main(String args[]){
        Manager obj=new Manager();
        obj.computeSalary();
    }
}
