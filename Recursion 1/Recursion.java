// package Recursion 1;

// Print numbers from 5 to 1.
// public class Recursion{
//     public static void printNumbers(int n) {
//         if(n == 0) {
//             return;
//         }
//             System.out.println(n);
//             printNumbers(n-1);
//         }
    
//     public static void main(String[] args) {
//         // int n = 5;
//         printNumbers(5);
//     }
// }

// output:
// 5
// 4
// 3
// 2
// 1
// ............................................................................................
// Print numbers from 1 to 5.
// public class Recursion{
//     public static void printNumbers(int n) {
//         if(n == 6) {
//             return;
//         }
//         System.out.println(n);
//         printNumbers(n+1);
//     }
    
//     public static void main(String[] args) {
//         printNumbers(1);
//     }
// }

// output:
// 1
// 2
// 3
// 4
// 5
// ............................................................................................
// Print the sum of first n natural numbers.
// public class Recursion {
//     public static void printSum(int n, int sum) {
//         if(n == 0) {
//             System.out.println(sum);
//             return;
//         }
        
//         sum += n;
//         printSum(n-1, sum);
//     }
        
//     public static void main(String args[]) {
//         printSum(5, 0);
//     }
// }

// output:
// 15
// ............................................................................................
// Print factorial of a number n.
// public class Recursion {
//     public static void printFactorial(int n, int fact) {
//         if(n == 0) {
//             System.out.println(fact);
//             return;
//         }

//         fact *= n;
//         printFactorial(n-1, fact);
//     }
//     public static void main(String args[]) {
//         printFactorial(5, 1);
//     }
// }

// output:
// 120
// ............................................................................................
// Print the fibonacci sequence till nth term.
// public class Recursion {
//     public static void printFactorial(int a, int b, int n) {
//         if(n == 0) {
//         return;
//     }

//     System.out.println(a);
//         printFactorial(b, a+b, n-1);
//     }

//     public static void main(String args[]) {
//         printFactorial(0, 1, 5);
//     }
// }

// output:
// 0
// 1
// 1
// 2
// 3
// ............................................................................................
// Print x^n (with stack height = n)
public class Recursion {
    public static int printPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
    
        int x_ = printPower(x, n-1);
        int xn = x * x_;
        return xn;
    }
    public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }
}

// output:
// 32