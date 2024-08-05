class Gradeifelse {
    public static void main(String args[]){
        int marks=92;
        if(marks>=90 && marks<=100){
            System.out.println("A GRADE");
        }
        else if(marks>=80 && marks<90){
            System.out.println("B GRADE");
        }
        else if(marks>=70 && marks<80){
            System.out.println("C GRADE");
        }
        else if(marks>=60 && marks<70){
            System.out.println("D GRADE");
        }
        else if(marks>=50 && marks<60){
            System.out.println("E GRADE");
        }
        else if(marks>=0 && marks<50){
            System.out.println("FAIL");
        }
        else {
            System.out.println("Wrong Input!!Please Enter Right Marks");
        }
    }
}
