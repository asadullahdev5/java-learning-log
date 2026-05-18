import java.util.Scanner;
class Student{
    int id;
    String name;
    float marks;

    Student (int id, String name , float marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void displayStudent (){
        System.out.println("ID" + id);
        System.out.println("NAME: " + name);
        System.out.println("MARKS" + marks);
        System.out.println();
    }
}



class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Student [] Students = new Student [5];

        int count = 0;
        
        while (true) { 
        System.out.println("===========STUDENT MANAGEMENT SYSTEM===============");
        System.out.println("1) ADD STUDENT");    
        System.out.println("2) DISPLAY STUDENT");    
        System.out.println("3) SEARCH STUDENT");    
        System.out.println("4) EXIT"); 
        
        System.out.println("ENTER CHOICE: ");
        int choice = input.nextInt();

        }


    }
}
