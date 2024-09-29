// package Functions & Methods;

// public class Functions {
//     public static void sum(int a, int b) {
//               int sum = a + b;
//               System.out.println(sum);
//           }
          
//           public static void main(String[] args) {
//               int a = 10;
//               int b = 20;
//               sum(a, b); // Function Call
        
//           }
// }
// ............................................................................................
// Make a function to check if a number is prime or not.
// import java.util.Scanner;
// public class Functions {
    
//     // Function to check if a number is prime
//     public static boolean isPrime(int n) {
//         // Handle edge cases
//         if (n <= 1) {
//             return false; // 0 and 1 are not prime
//         }
//         if (n == 2) {
//             return true; // 2 is the only even prime number
//         }
//         if (n % 2 == 0) {
//             return false; // Any even number other than 2 is not prime
//         }
        
//         // Check divisibility for numbers up to sqrt(n)
//         for (int i = 3; i <= Math.sqrt(n); i += 2) {
//             if (n % i == 0) {
//                 return false; // Found a divisor, so n is not prime
//             }
//         }
        
//         return true; // No divisors found, so n is prime
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
        
//         // Check if the number is prime and print the result
//         if (isPrime(num)) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
        
//         sc.close(); // Close the scanner
//     }
// }
// ............................................................................................
// Make a function to check if a number is prime or not.
// import java.util.Scanner;
// public class Functions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input the number to check for primality
//         int n = sc.nextInt();
//         int count = 0;

//         // Loop to find divisors up to the square root of the number
//         for (int i = 1; i * i <= n; i++) {
//             System.out.println(i);
//             if (n % i == 0) {
//                 count++; // Increment count for divisor i
//                 if (n / i != i) { // If divisors are different, count both
//                     count++;
//                 }
//             }
//         }
//         System.out.println("count " + count);

//         // Check if the count of divisors is exactly 2 (prime numbers have 2 divisors: 1 and itself)
//         if (count == 2) {
//             System.out.println("true"); // The number is prime
//         } else {
//             System.out.println("false"); // The number is not prime
//         }

//         sc.close(); // Close the scanner
//     }
// }
// ............................................................................................
// Write a function that calculates the Greatest Common Divisor of 2 numbers (Subtraction-based Euclidean Algorithm)
// public class Functions {
//     public static int GCD(int a, int b) {

//         while(a != b) {
//             if(a>b) {
//                 a=a-b;
//             } else {
//                 b=b-a;
//             }
//         }
//         return b;
//     }
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 6;
//         int result=GCD(a, b);
//         System.out.println("GCD is : " + result);
//     }
// }

// output:
// GCD is : 2
// ............................................................................................
// Write a function that calculates the Greatest Common Divisor of 2 numbers. (Modulus-based Euclidean Algorithm)
// import java.util.*;
// public class Functions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter two number : ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         while(a%b!=0) {
//             int r = a%b;
//             a=b;
//             b=r;
//         }
//         System.out.print(b);

//         sc.close();
//     }
// }
// ............................................................................................
// Make a function to check if a number is prime or not.
import java.util.*;
public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        
        // Special case for 1 (not prime)
        if (n <= 1) {
            System.out.println("false");
            return;
        }

        // Special case for 2 (smallest prime number)
        if (n == 2) {
            System.out.println("true");
            return;
        }

        // Check divisors up to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("false"); // Not a prime number
                return; // Early exit if a divisor is found
            }
        }

        // If no divisors are found, the number is prime
        System.out.println("true");

        
    }
}
