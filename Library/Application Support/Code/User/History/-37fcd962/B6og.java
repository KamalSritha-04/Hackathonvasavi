class Passingobjects
{
    int num;
    String name;
    static void passingobject(Passingobjects p)
    {
            p.num=3321;
            p.name="kamal";
    }
    public static void main(String args[])
    {
            Passingobjects s=new Passingobjects();
            s.num=21;
            s.name="nn";
            passingobject(s);
            System.out.println(s.num);
            System.out.println(s.name);
    }
}