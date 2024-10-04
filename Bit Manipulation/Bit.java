// package Bit Manipulation;

// unary operator 
// Pre Increment (++a)
// public class Bit {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;

//         b=a++;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// output:
// 11
// 10
// ............................................................................................
// Post Increment (a++)
// public class Bit{
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;

//         b=++a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// output:
// 11
// 11
// ............................................................................................
// Get Bit
// Get the 3rd bit(position = 3) of a number n. (n=0101
// 1) Bit Mask: 1<<i
// 2) Operation: AND

// public class Bit{
//     public static void main(String[] args) {
//         int n = 5;  // 0 1 0 1
//         int pos = 2;
//         int bitMask = 1 << pos;

//         if((bitMask & n) == 0) {
//             System.out.println("bit was zero");
//         } else {
//             System.out.println("bit was one");
//         }
//     }
// }

// output:
// bit was one
// ............................................................................................
// Set Bit
// Set the 2nd bit (position = 1) of a number n. (n = 0 1 0 1)
// 1) Bit Mask: 1<<i
// 2) Operation: OR

// public class Bit{
//     public static void main(String[] args) {
//         int n = 5;  // 0 1 0 1
//         int pos = 1;
//         int bitMask = 1<<pos;

//         int newNumber = bitMask | n;
//         System.out.println(newNumber);
//     }
// }

// output:
// 7
// ............................................................................................
// Clear Bit
// Clear the 3rd bit (position = 2) of a number n. (n = 0 1 0 1)
// 1) Bit Mask: 1<<i;
// 2) Operation: AND with NOT

// public class Bit{
//     public static void main(String[] args) {
//         int n = 5;  // 0 1 0 1
//         int pos = 2;
//         int bitMask = 1<<pos;
//         int notBitMask = ~(bitMask);

//         int newNumber = notBitMask & n;
//         System.out.println(newNumber);
//     }
// }

// output:
// 1
// ............................................................................................
// Update Bit
// Update the 2nd bit (position=1) of a number n to 1 (n = 0 1 0 1)

// For:0
// 1) Bit Mask: 1<<i
// 2) Operation: AND with NOT (get)

// For:1
// 1) Bit Mask: 1<<i
// 2) Operation: OR (set)

import java.util.*;
public class Bit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // open = 1: set open = 0: clear
        int n=5;  // 0 1 0 1 --> 0 1 1 1 --> dec 7
        int pos = 1;
        int bitMask = 1<<pos;

        if(oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

        sc.close();
    }
}

// input:
// 1

// output:
// 7
// ............................................................................................

// ............................................................................................

// ............................................................................................

// ............................................................................................

// ............................................................................................

// ............................................................................................



