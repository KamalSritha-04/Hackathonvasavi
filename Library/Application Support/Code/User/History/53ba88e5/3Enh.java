class Employee{
    void computeSalary(){
        int salary=500000;
        System.out.println("salary:"+salary);
        System.out.println("in base class");
    }
}
class Manager extends Employee{
    void computeSalary(){
        int salary=800000;
        System.out.println("salary:"+salary);
        System.out.println("in subclass");
    }
}
class Dynamicmethoddispatch {
    public static void main(String args[]){
        Manager obj=new Manager();
        obj.computeSalary();
        Employee obj1=new Employee();
        obj1.computeSalary();
        // Employee obj2=new Manager();//upcasting
        // obj2.computeSalary();
    }
}
