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
        System.out.println("2"+sname+" "+id);
    }
    public static void main(String args[])
    {
        Constructoroverloading c1 =new Constructoroverloading();
        Constructoroverloading c2 =new Constructoroverloading("kamal");
        Constructoroverloading c3 =new Constructoroverloading("kamal",21);
    }
}
