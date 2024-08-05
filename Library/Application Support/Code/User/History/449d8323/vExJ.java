class University{
    void display(){
        System.out.println("hi");
    }
}
class Student extends University{
    int id=21;
    String i="kamal";
    //System.out.println("details")
    void show(){
    System.out.println(id);
    System.out.println(i);
    super.display();
    }
}
class Supermethod{
    public static void main(String args[]){
        Student s=new Student();
        s.show();
    }
}
