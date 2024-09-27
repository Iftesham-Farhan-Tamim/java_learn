// For Loop
// public class Loops {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 20; i++) {
//             // System.out.println(i);  // Print the current value of i
//             System.out.print(i + " ");  // Print the current value of i
//         }
//     }
// }
// ............................................................................................
// While Loop
// public class Loops {
//     public static void main(String[] args) {
//         int i = 0;  // Initialize i to 0
//         while(i <= 20) {  // Check if i is less than or equal to 20
//             System.out.println(i);  // Print the value of i
//             i++;  // Increment i
//         }
//     }
// }
// ............................................................................................
// Do-While Loop
// public class Loops {
//     public static void main(String[] args) {
//         int i = 0;  // Initialize i to 0
//         do {
//             System.out.println(i);  // Print the value of i
//             i++;  // Increment i
//         } while(i <= 20);  // Loop continues while i is less than or equal to 20
//     }
// }
// ............................................................................................
// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i;

//         do {
//             System.out.print("Enter a number : ");
//             i = sc.nextInt();

//             if(i >= 1) {    
//                 if(i % 2 == 0) {
//                     System.out.println("Even number");
//                 } else {
//                     System.out.println("Odd number");
//                 }
//             }
//         } while(i != 0);
//         System.out.println("Program stopped.");
//     }
// }
// ............................................................................................
// Print all even numbers till n.
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         // int age = sc.nextInt()
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 == 0) {
//                 System.out.println("Even numbers are : " + i);
//             }
//         }

//         sc.close();
//     }
// }
// ............................................................................................
// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i;

//         do {
//             System.out.print("Enter 1 to input marks or 0 to stop: ");
//             i = sc.nextInt();

//             if (i == 1) {
//                 System.out.print("Enter student's marks (out of 100): ");
//                 int marks = sc.nextInt();

//                 if (marks >= 90) {
//                     System.out.println("--> This is Good");
//                 } else if (marks >= 60) {
//                     System.out.println("--> This is also Good");
//                 } else if (marks >= 0) {
//                     System.out.println("--> This is Good as well");
//                 } else {
//                     System.out.println("--> Invalid number");
//                 }
//             } 
//         } while (i != 0);

//         sc.close();
//     }
// }
// ............................................................................................
// public class Loops {
//     public static void main(String[] args){
//         int n = 3;
//         int num = 1;

//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }

//             System.out.println("");
//         }
//     }
// }

// output :
// 1 2 3 
// 4 5 6 
// 7 8 9 
// ............................................................................................
// public class Loops {
//     public static void main(String[] args) {
//         int n = 4;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < i + 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// output:
// *
// **
// ***
// ****
// ............................................................................................
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number : ");
//         float n = sc.nextFloat();
       
//         System.out.print("Enter a number : ");
//         float m = sc.nextFloat();
        
        
//         float sum = n+m;
//         float Subtraction = n-m;
//         float Multiplication = n*m;
//         float Division = n/m;
//         float Modulo = n%m;
        
//         System.out.println("Sum : " + sum);
//         System.out.println("Subtraction : " + Subtraction);
//         System.out.println("Multiplication : " + Multiplication);
//         System.out.println("Division : " + Division);
//         System.out.println("Modulo : " + Modulo);
        
//         sc.close();
//     }
// }
// ............................................................................................
// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in) ;
        
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
        
//         switch(n) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             default:
//                 System.out.println("Sunday");
//         }
//         sc.close();
        
//     }
// }
// ............................................................................................
// a program to print Fibonacci series
// public class Loops{
//     public static void main(String[] args) {
//         int a=0, b=1, c;
//         int n=10;
        
//         System.out.println(a + "\n" + b);
        
//         if(n>0) {
//             for(int i=1; i<=n; i++) {
//                 c=a+b;
//                 System.out.println(c);
//                 a=b;
//                 b=c;
//             }
//         } else{
//             System.out.print("invalid number");
//         }
//     }
// }
// ............................................................................................
// a program to print Fibonacci series
// public class Loops{
//     public static void main(String[] args) {
//        int a=0, b=1, c;
//        int n=8;
       
//        for(int i=0; i<n; i++) {
//            System.out.println(a);
           
//            c=a+b;
//            a=b;
//            b=c;
//        }
//     }
// }
