// import java.util.*;

//     public class Variables {
//         public static void main(String args[]) {
//          Scanner sc = new Scanner(System.in); // Create Scanner object to read input

//          System.out.print("Please enter your age: ");
//          int age = sc.nextInt(); // Reading user input as an integer

//          // Checking age condition
//          if (age > 18) {
//              System.out.println("Adult");
//          } else {
//              System.out.println("Not Adult");
//          }

//          sc.close(); // Closing the Scanner object to prevent resource leaks

//     }
// }



// import java.util.*;

// public class Conditions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int x = sc.nextInt();

//         if (x % 2 == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }


//         sc.close();
//     }
// }



// import java.util.*;

// public class Conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number a : ");
//         int a = sc.nextInt();

//         System.out.print("Enter number b : ");
//         int b = sc.nextInt();

//         if(a == b) {
//             System.out.println("Equal");
//         } else {
//             if(a > b) {
//                 System.out.println("a is greater");
//                 System.out.println("b is lesser");
//             } else {
//                 System.out.println("a is lesser");
//                 System.out.println("b is greater");
//             }
//         }


//         sc.close();
//     }
// }



// import java.util.*;

// public class Conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a button : ");
//         int button = sc.nextInt();

//         // if(button == 1) {
//         //     System.out.println("Hello");
//         // } else if(button == 2) {
//         //     System.out.println("Namaste");
//         // } else if (button == 3) {
//         //     System.out.println("Bonjour");
//         // } else {
//         //     System.out.println("Invalid Button");
//         // }


//         switch(button) {
//             case 1: 
//                 System.out.println("Hello");
//                 break;
//             case 2: 
//                 System.out.println("Namaste");
//                 break;
//             case 3: 
//                 System.out.println("Bonjour");
//                 break;
//             default: 
//                 System.out.println("Invalid Button");
//         }


//         sc.close();
//     }
// }