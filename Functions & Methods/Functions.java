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



import java.util.Scanner;

public class Functions {
    
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // Any even number other than 2 is not prime
        }
        
        // Check divisibility for numbers up to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // Found a divisor, so n is not prime
            }
        }
        
        return true; // No divisors found, so n is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Check if the number is prime and print the result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        sc.close(); // Close the scanner
    }
}



