
//     import java.util.Random;

// public class randomclass{
//     public static void main(String[] args) {

//         Random random = new Random();

//         int number1;
//         int number2;
//         int number3;

//         number1 = random.nextInt(1, 7);  // 1 to 6
//         number2 = random.nextInt(1, 7);  // 1 to 6
//         number3 = random.nextInt(1, 7);  // 1 to 6

//         System.out.println(number1);
//         System.out.println(number2);
//         System.out.println(number3);
//     }
// }



//     import java.util.Random;

// public class randomclass {
//     public static void main(String[] args) {

//         Random random = new Random();

//         double number;

//         number = random.nextDouble();

//         System.out.println(number);
//     }
// }

// import java.util.Random;

// public class randomclass {
//     public static void main(String[] args) {

//         Random random = new Random();

//         boolean isHeads;

//         isHeads = random.nextBoolean();

//         if (isHeads) {
//             System.out.println("HEADS");
//         } else {
//             System.out.println("TAILS");
//         }
//     }
// }

import java.util.Random;


public class randomclass{
    public static void main(String[]args){
        Random random =new Random();

        int number1;
        int number2;
        int number3;

        number1=random.nextInt(1,100);
        number2=random.nextInt(50,99);
        number3=random.nextInt(89,99);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


    }
}