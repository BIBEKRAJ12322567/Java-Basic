import java.util.Scanner;

public class ifelse {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int age ;
        String name;
        boolean isStudent;


 System.out.println("Enter your name: ");
         name=sc.nextLine();

System.out.println("Enter your age: ");
         age=sc.nextInt();

System.out.println("Are you a student (true/false) : ");
         isStudent=sc.nextBoolean();            


    //group1
    
        if(name.isEmpty()){
            System.out.println("You have not enter your name yet");
        }else{
            System.out.println("Hello " + name);
        }

        
        
        
        //gropu2
       

        if(age>=65){
            System.out.println("You are an senior");
        }
        else if(age>=18){
            System.out.println("You are a adult");

        }
        else if(age<0){
            System.out.println("You have not been born");

        }
        else if(age == 0){
            System.out.println("You are a baby");

        }
            else{
            System.out.println("You are a child");
        }


        //group 3
        if(isStudent){
            System.out.println("You are a Student");
        }
        else{
            System.out.println("You are not a Student");
            
        }
        sc.close();
    }
    
}
