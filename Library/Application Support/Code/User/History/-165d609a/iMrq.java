class Account{
    void display(){
    System.out.println("Main account");
    System.out.println("account holder details and savings");
    }
}
class Savings extends Account{
    void m1(){
    System.out.println("Savings account");
    int Saving=50000;
    System.out.println("Savings ="+Saving);
    }
}
class Current extends Account{
    void m2(){
    System.out.println("Current account");
    int total=200000;
    System.out.println("Total amount="+total);
    }
    public static void main(String args[]){
        Account a=new Account();
        a.display();
        Savings s=new Savings();
        s.m1();
        Current c=new Current();
        c.m2();
    }
}