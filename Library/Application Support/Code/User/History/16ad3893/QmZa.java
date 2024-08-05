class Constructoroverloading {
    String name;
    int rollNo;
    Constructoroverloading()
    {
        System.out.println("no");
    }
    Constructoroverloading(String sname)
    {
        name=sname;
        System.out.println("1"+sname);
    }
    Constructoroverloading(String sname,int id)
    {
        name=sname;
        rollNo=id;
        System.out.println("2"+name+" "+rollNo);
    }
    public static void main(String args[])
    {
        Constructoroverloading c1 =new Constructoroverloading();
        Constructoroverloading c2 =new Constructoroverloading("kamal");
        Constructoroverloading c3 =new Constructoroverloading("kamal",21);
        System.out.println(c1);
        System.out.println(c2.name);
        System.out.println(c3.name);
    }
}
