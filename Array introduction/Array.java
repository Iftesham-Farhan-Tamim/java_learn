// Creating an Array (method 1) - with new keyword
// public class Array {
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 97;
//         marks[1] = 98;
//         marks[2] = 95;

//         System.out.print(marks[1]);
//     }
// }

// output:
// 98
// ............................................................................................
// Creating an Array (method 2)
// public class Array{
//     public static void main(String[] args) {
//         // int[] marks = new int[]{95, 96, 97, 98};
//         int[] marks = {95, 96, 97, 98};
        
//         System.out.print(marks[2]);
//     }
// }

// output:
// 97
// ............................................................................................
// import java.util.*;
// public class Array{
//     public static void main(String[] args) {
//         int[] arr = {95, 96, 97, 98};       
//         System.out.println(Arrays.toString(arr));  // New method for accessing an array
//     }
// }

// output:
// [95, 96, 97, 98]
// ............................................................................................
// public class Array{
//     public static void main(String[] args) {
//         int[] arr = {95, 96, 97, 98};
        
//         for(int i=0; i<arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

// output:
// 95
// 96
// 97
// 98
// ............................................................................................
// Taking an array as an input and printing its elements.
// import java.util.*;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int size = sc.nextInt();
//         int[] arr = new int[size];
        
//         for(int i=0; i<size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         sc.close();
//     }
// }
// ............................................................................................
// Take an array of names as input from the user and print them on the screen.
// import java.util.*;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
        
//         String[] name = new String[size];
        
//         for(int i=0; i<size; i++) {
//             name[i] = sc.next();
//         }
        
//         for(int i=0; i<name.length; i++) {
//             System.out.println("name " + (i+1) +" is : " + name[i]);

//         }
//         sc.close();
//     }
// }
// ............................................................................................
// Take an array as an input from the user. Search for a given number x 
// and print the index at which it occurs.

// import java.util.*;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
        
//         for(int i=0; i<size; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         System.out.print("enter a number you want to search : ");
//         int x = sc.nextInt();
        
//         for(int i=0; i<arr.length; i++) {
//             if(x==arr[i]) {
//                 System.out.print("Position : " + i);
//             }
//         }
//         sc.close();
//     }
// }
// ............................................................................................
// Find the maximum & minimum number in an array of integers. 
// import java.util.*;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
        
//         int[] arr = new int[size];
        
//         for(int i=0; i<size; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
        
//         for(int i=0; i<arr.length; i++) {
//             if(max<arr[i]) {
//                 max=arr[i];
//             }
//         }
        
//         for(int i=0; i<arr.length; i++) {
//             if(min>arr[i]) {
//                 min=arr[i];
//             }
//         }
        
//         System.out.println("Max : " + max);
//         System.out.println("Min : " + min);

//         sc.close();
//     }
// }
// ............................................................................................
// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//      {3, 4, 6, 2} is not sorted in ascending order.
// import java.util.*;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
        
//         int[] arr = new int[size];
        
//         for(int i=0; i<size; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         boolean check = true;
        
//         for(int i=0; i<arr.length-1; i++) {
//             if(arr[i] > arr[i+1]) {
//                 check=false;
//             }
//         }
        
//         if(check) {
//             System.out.print("yes");
//         } else {
//             System.out.print("No");
//         }
//     }
// }
