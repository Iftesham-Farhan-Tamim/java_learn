// ---------> (i++)/(j++)
// <--------- (i--)/(j--)


// package Sorting in Java | Bubble Sort, Selection Sort & Insertion Sort;

// 1) Bubble Sort
// Idea: if arr[i] > arr[i+1] swap them. To place the element in their 
// respective position, we have to do the following operation N-1 times. 
// Time Complexity: O(N^2)

// public class Sorting {
//     public class Main {
//         public static void main(String[] args) {
//             int arr[] = { 5, 3, 1, 7 };

//             for (int i = 0; i < arr.length - 1; i++) {
//                 for (int j = 0; j < arr.length - i - 1; j++) {
//                     if (arr[j] > arr[j + 1]) {
//                         int temp = arr[j];
//                         arr[j] = arr[j + 1];
//                         arr[j + 1] = temp;
//                     }
//                 }
//             }

//             for (int i = 0; i < arr.length; i++) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
// }

// output:
// 1 3 5 7 
// ............................................................................................
// Selection Sort
// Idea: The inner loop selects the minimum element in the unsorted array 
// and places the elements in increasing order. 
// Time complexity: O(N^2) 

// public class Sorting{
//     public static void main(String[] args) {
//         int arr[] = {7, 8, 1, 3, 2};
//         for(int i=0; i<arr.length-1; i++) {
//           int smallest = i;
//           for(int j=i+1; j<arr.length; j++) {
//               if(arr[j] < arr[smallest]) {
//                   smallest = j;
//               }
//           }
        
//           //swap
//           int temp = arr[smallest];
//           arr[smallest] = arr[i];
//           arr[i] = temp;
//       }
       
       
//       for(int i=0; i<arr.length; i++) {
//           System.out.print(arr[i]+" ");
//       }
       
//       System.out.println();
//     }
// }
// ............................................................................................
// Insertion Sort
// Idea: Take an element from the unsorted array, place it in its corresponding 
// position in the sorted part, and shift the elements accordingly. 
// Time Complexity: O(N^2) 

// public class Sorting{
//     public static void InsertionSort(int[] a) {
//         int n = a.length;
//         for(int i = 1; i<n; i++) {
//             int j = i;
            
//             while(j>0 && a[j] < a[j-1]) {
//                 // swap
//                 int temp = a[j];
//                 a[j] = a[j-1];
//                 a[j-1] = temp;
//                 j--;
//             }
//         }
//     }
    
//     public static void main(String[] args) {
//         int a[] = {8,3,6,5,4,2};
//         InsertionSort(a);
//         // for(int val : a) {
//         //     System.out.print(val + " ");
//         // }
//         for(int i=0; i<a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }

// output:
// 2 3 4 5 6 8
// ............................................................................................
// Insertion Sort
// Simple way

// public class Sorting{
//     public static void main(String[] args) {
//         int a[] = {8,3,6,5,4,2};
        
//         for(int i=1; i<a.length; i++) {
//             int j = i;
            
//             while(j>0 && a[j-1] > a[j]) {
//                 // swap
//                 int temp = a[j-1];
//                 a[j-1] = a[j];
//                 a[j] = temp;
//                 j--;
//             }
//         }
        
//         for(int i=0; i<a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }

// output:
// 2 3 4 5 6 8