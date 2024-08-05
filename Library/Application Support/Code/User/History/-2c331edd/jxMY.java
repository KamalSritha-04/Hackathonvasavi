class Thisconstructor {
    int rollno;
    String name;
    Thisconstructor(){
        System.out.println(rollno+" "+name);
    }
    Thisconstructor(int no,String sname){
        this();
        rollno=no;
        name=sname;
        System.out.println(rollno+" "+name);
    }
    void show(){

    }
    public static void main(String args[]){
        Thisconstructor t= new Thisconstructor(10,"nn");
        t.rollno;
    }
}