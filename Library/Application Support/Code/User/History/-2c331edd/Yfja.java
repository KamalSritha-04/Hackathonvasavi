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
    public static void main(String args[]){
        Thisconstructor t = new Thisconstructor(10,"nn");
    }
}
