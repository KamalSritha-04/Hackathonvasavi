class Staticfeild {
    int rollno;
    String name;
    static String college="cvr";
    Staticfeild(int id,String sname){
        rollno=id;
        name=sname;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
    public static void main(String args[]){
        static Staticfeild s1 =new Staticfeild(90,"qq");
        static Staticfeild s2 =new Staticfeild(70,"rr");
        s1.display();
        s2.display();
    }
}
