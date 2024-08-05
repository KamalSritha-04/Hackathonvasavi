class Commandlinearguments {
    public static void main(String args[]){
        String Name= (args[0]);
        String CollegeName= (args[1]);
        int Rollno=Integer.parseInt(args[2]);
        float CGPA=Float.parseFloat(args[3]);
        System.out.println(Name);
        System.out.println(CollegeName);
        System.out.println(Rollno);
        System.out.println(CGPA);
    }
}
