class Thisvariable {
    int rollno;
    String name;
    Thisvariable(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    public static void main(String args[]){
        Thisvariable t=new Thisvariable(30, "kk");
        System.out.println(t.name);
        System.out.println(t.rollno);
    }
}
