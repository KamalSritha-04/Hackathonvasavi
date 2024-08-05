class Commandlinearguments {
    public static void main(String args[]){
        String Name= (args[1]);
        String CollegeName= (args[2]);
        int Rollno=Integer.parseInt(args[3]);
        float CGPA=Float.parseFloat(args[4]);
        System.out.println(Name);
        System.out.println(CollegeName);
        System.out.println(Rollno);
        System.out.println(CGPA);
    }
}
