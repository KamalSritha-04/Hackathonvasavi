class Account{
    void display(){
    System.out.println("Main account");
    }
}
class Savings extends Account{
    void display(){
    System.out.println("Savings account");
    int Saving=50000;
    System.out.println("Savings ="+Saving);
    }
}
class Current extends Account{
    void display(){
    System.out.println("Current account");
    int total=100000;
    System.out.println("Total amount="+total);
    }
}
class Customer{
    void display(){
    System.out.println("customer name:kamal");
    System.out.println("customer acno:3321");
    }
}
class Employee{
    void display(){
    System.out.println("Employee name:priya");
    }
}
class Inheritanceaccounts{
    public static void main(String args[]){
        Account a=new Account();
        a.display();
        Savings s=new Savings();
        s.display();
        Current c=new Current();
        c.display();
        Customer c1=new Customer();
        c1.display();
        Employee e=new Employee();
        e.display();
    }
}
