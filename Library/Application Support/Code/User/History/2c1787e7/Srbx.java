class ThisA {
    int rollno;
    String name;
    ThisA(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    public static void main(String args[]){
        ThisA t=new ThisA(30, "kk");
        System.out.println(t.name);
        System.out.println(t.rollno);
    }
}
