class Thismethod {
    void display(){
        System.out.println("display method");
    }
    void show(){
        this.display();
        System.out.println("show method");
    }
    public static void main(String args[]){
        Thismethod t=new Thismethod();
        t.show();
    }
}
