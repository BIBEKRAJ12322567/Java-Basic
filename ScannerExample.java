import java.util.Scanner;

public class ScannerExample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        // System.err.println("Enter your name: ");
        // String name= sc.nextLine();

        // System.out.println("Enter your age");
        // int age =sc.nextInt();

        // System.out.println("What is your gpa: ");
        // double gpa=sc.nextDouble();

        // System.out.println("Are you a student? (true/false): ");
        // boolean isStudent = sc.nextBoolean();

        // System.out.println("Hello " + name);
        // System.out.println("Your age is "+ age);
        // System.out.println("Your gpa is "+ gpa);
        // //System.out.println("Student: "+ isStudent);
          
        // if(isStudent){
        //     System.out.println("You are enrolled as a student");

        // }else{
        //     System.out.println("You are not enrolled as a student");
        // }

        

        //calculate area of a rectangle 
        double width=0;
        double length=0;
        double area=0;

        System.out.println("Enter the width");
        width = sc.nextDouble();
        System.out.println("Enter the length");
        length= sc.nextDouble();
        

        // System.out.println("The area is "+ area + " cm²");
        area= width * length;
        System.out.println("The area is "+ area + " cm²"); 

        sc.close();
    }
    
}
