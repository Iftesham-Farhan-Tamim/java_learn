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
// Time complexity: O(N2) 

// ............................................................................................