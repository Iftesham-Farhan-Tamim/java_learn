// package 2D Arrays;

// Creating a 2D Array - with new keyword.
// int[][] marks = new int[3][3];
// ............................................................................................
// public class Arrays{
//     public static void main(String[] args) {
//         int marks[][] = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9},
//         };

//         for(int i=0; i<marks.length; i++) {
//             for(int j=0; j<marks[i].length; j++) {
//                 System.out.print(marks[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// output:
// 1 2 3 
// 4 5 6 
// 7 8 9 
// ............................................................................................
// Taking a matrix as an input and printing its elements.
// import java.util.*;
// public class Arrays {
//   public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int rows = sc.nextInt();
//       int cols = sc.nextInt();

//       int[][] numbers = new int[rows][cols];

//       //input
//       //rows
//       for(int i=0; i<rows; i++) {
//           //columns
//           for(int j=0; j<cols; j++) {
//               numbers[i][j] = sc.nextInt();
//           }
//       }

//       for(int i=0; i<rows; i++) {
//           for(int j=0; j<cols; j++) {
//                   System.out.print(numbers[i][j]+" ");
//               }
//               System.out.println();
//         }
//   }
// }
// ............................................................................................
// Searching for an element x in a matrix.
// import java.util.*;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Input rows and columns
//         int r = sc.nextInt();
//         int c = sc.nextInt();
        
//         int[][] marks = new int[r][c];
        
//         // Input the elements of the matrix
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 marks[i][j] = sc.nextInt();
//             }
//         }
        
//         // Search for the value 'x'
//         System.out.print("Search : ");
//         int x = sc.nextInt();
//         boolean found = false;
        
//         // Search the matrix for 'x'
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 if (marks[i][j] == x) {
//                     found = true;
//                     System.out.println("Found at row: " + i + ", column: " + j);
//                     // Optionally: break out of loops
//                     break;
//                 }
//             }
//             if (found) {
//                 break; // Stop outer loop if found
//             }
//         }
        
//         // Print found or not-found based on search result
//         if (!found) {
//             System.out.print("not-found");
//         } else {
//             System.out.print("found");
//         }

//         sc.close();
//     }
// }
// ............................................................................................
// For a given matrix of N x M, print its transpose.

// Hint: In the transpose of a matrix, rows become columns and columns become rows.
// 1) If you have a matrix of size n x m (where n is the number of rows and m is the number 
// of columns), the transpose of that matrix will have size m x n.
// 2) This means that for every element at position [i][j] in the original matrix, the 
// transposed matrix will have that element at position [j][i].

// import java.util.*;
// public class Arrays {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int m = sc.nextInt();

//       int matrix[][] = new int[n][m];
//       for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//       }

//       System.out.println("The transpose is : ");
//       //To print transpose
//       for(int j=0; j<m ;j++) {
//           for(int i=0; i<n; i++) {
//               System.out.print(matrix[i][j]+" ");
//           }
//           System.out.println();
//       }

//       sc.close();
//    }
// }
// ............................................................................................
// Print the spiral order matrix as output for a given matrix of numbers.

