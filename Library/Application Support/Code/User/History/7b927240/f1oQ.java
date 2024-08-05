class Staticblock {
    static{
        System.out.println("statement in static block");
    }
    void display(){
        System.out.println("printed uding display function");
    }
    public static void main(String args[]){
        Staticblock s =new Staticblock();
        System.out.println("printed using object");
        s.display();
    }
}
