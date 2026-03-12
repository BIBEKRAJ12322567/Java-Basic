import java.util.Scanner;

public class math {

    public static void main(String[]args){


        // System.out.println(Math.PI);
        // System.out.println(Math.E);
        // System.out.println(Math.TAU);

        //  double result;

        // result=Math.pow(2,4);
        // result=Math.sqrt(121);
        // result=Math.abs(-10);
        // result=Math.round(3.34);
        // result=Math.ceil(3.14);
        // result=Math.floor(4.99);
        // result=Math.max(10,20);
        // result=Math.min(10,20);

        //System.out.println(result);
        
        
      /////Example//////
      
      


        // //HYPOTENUSE C= Math.sqrt(a^2 + b^2)

        // Scanner sc=new Scanner(System.in);

        // double a;
        // double b;
        // double c;
        // System.out.println("Enter the Length of side A: ");
        // a=sc.nextDouble();

        // System.out.println("Enter the length of side B: ");
        // b=sc.nextDouble();

        // c=Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
        // System.out.println("The length of Hypotenuse C is : "+ c +"cm");



        // sc.close();

  
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference = %.1f\n" , circumference);
        System.out.printf("Area = %.1f\n" , area);
        System.out.printf("Volume of Sphere = %.1f\n" , volume);
        scanner.close();



    }
    
}
