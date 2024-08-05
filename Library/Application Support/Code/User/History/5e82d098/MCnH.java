class MethodOverloading {
    static void display(int a){
        System.out.println("1 parameter:"+a);
    }
    static void display(int a,int b){
        System.out.println("2 parameters:"+a+" "+b);
    }
    static void display(int a,double b){
        System.out.println("2 parameters of type int and double:"+a+" "+b);
    }
    static void display(double a,int b){
        System.out.println("2 parameters of type double and int:"+a+" "+b);
    }
    public static void main(String args[])
    {
        display(20);
        display(10,20);
        display(100.5,10);
        display(25,200.0);
    }
}
