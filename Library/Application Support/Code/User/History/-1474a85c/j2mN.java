class Gradeswitchcase {
    public static void main(String args[]){
        int marks=77;
        if(marks>100){
            System.out.println("please enter corect marks");
        }
        else{
            switch(marks/10){
                case 10:
                break;
                case 9:
                System.out.println("A GRADE");
                break;
                case 8:
                System.out.println("B GRADE");
                break;
                case 7:
                System.out.println("C GRADE");
                break;
                case 6:
                System.out.println("D GRADE");
                break;
                case 5:
                System.out.println("E GRADE");
                break;
                case 4:
                System.out.println("FAIL");
                break;
            }
        }
    }
}
