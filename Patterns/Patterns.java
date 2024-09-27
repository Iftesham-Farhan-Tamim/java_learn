
// public class Patterns{
//     public static void main(String[] args) {
//         int n = 4;
//         // int num;
        
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println("");
//         }
//     }
// }

// output:
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4 


// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }

// output:
// * * * * 
// * * * * 
// * * * * 
// * * * * 


// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i=0; i<n; i++) {
//             char ch = 'A';
//             for(int j=0; j<n; j++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println("");
//         }
//     }
// }

// output:
// ABCD
// ABCD
// ABCD
// ABCD


// public class Patterns {
//     public static void main(String[] args) {
//         int n = 3;
//         int num = 1;
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println(" ");
//         }
//         System.out.print("After pattern: " + num);
//     }
// }

// output
// 1 2 3 
// 4 5 6 
// 7 8 9 
// After pattern: 10


// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int num = 1;
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<i+1; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }

// output:
// * 
// * * 
// * * * 
// * * * * 


// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<i+1; j++) {
//                 System.out.print(i+1 + " ");

//             }
//             System.out.println("");
//         }
//     }
// }

// output:
// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int num = 1;
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<i+1; j++) {
//                 System.out.print(num + " ");
//             }
//             num++;
//             System.out.println("");
//         }
//     }
// }

// output:
// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i=0; i<n; i++) {
//             for(int j=1; j<=i+1; j++) {
//                 System.out.print(i+1);
//             }
//             System.out.println("");
//         }
//     }
// }

// output:
// 1
// 22
// 333
// 4444


// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         char ch = 'A';
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<i+1; j++) {
//                 System.out.print(ch+ " ");
//             }
//             ch++;
//             System.out.println("");
//         }
//     }
// }

// output:
// A 
// B B 
// C C C 
// D D D D 

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int num;
        
//         for(int i=0; i<n; i++) {
//             num = 1;
//             for(int j=0; j<i+1; j++) {
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println("");
//         }
//     }
// }

// output: 
// 1
// 12
// 123
// 1234

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i=0; i<n; i++) {
//             for(int j=1; j<=i+1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println("");
//         }
//     }
// }

// output:
// 1
// 12
// 123
// 1234

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i=0; i<n; i++) {
//             for(int j=1; j<=i+1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println("");
//         }
//     }
// }

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
        
//         for(int i=n; i>0; i--) {
//             System.out.print(i + " ");
//         }
//     }
// }

// output:
// 5 4 3 2 1

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i=0; i<n; i++) {
//             for(int j=i+1; j>0; j--) {
//                 System.out.print(j + " ");
//             }
//             System.out.println("");
//         }
//     }
// }

// output:
// 1 
// 2 1 
// 3 2 1 
// 4 3 2 1 

// Exception 
// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i=n; i>0; i--) {
//             for(int j=i; j>0; j--) {
//                 System.out.print(i + " ");
//             }
//             System.out.println("");
//         }
//     }
// }

// output:
// 4 4 4 4 
// 3 3 3 
// 2 2 
// 1 


// // Floyd's triangle patters
// public class Patterns {
//     public static void main(String[] agrs) {
//         int n = 4;
//         int num = 1;
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<i+1; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println("");
//         }
//         System.out.print("Last num is : " + num);
//     }
// }

// output:
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// Last num is : 11

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4; 
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n-i-1; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i+1; j++) {
//                 System.out.print(j);
//             }
//             for(int j=i; j>0; j--) {
//                 System.out.print(j);
//             }
        
//             System.out.println("");
//         } 
        
//     }
// }

// output:
//    1
//   121
//  12321
// 1234321


// // Hollow Diamond Patterns
// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i=0; i<n; i++) {
//             //spaces
//             for(int j=0; j<n-i-1; j++) {
//                 System.out.print(" ");
//             }
            
//             System.out.print("*");
            
//             if(i !=0) {
//                 //spaces
//                 for(int j=0; j<2*i-1; j++) {
//                     System.out.print(" ");
//                 }
//                 System.out.print("*");
//             }
            
//             System.out.println("");
//         }
        
//         // bottom
//         for(int i=0; i<n-1; i++) {
//             //spaces
//             for(int j=0; j<i+1; j++) {
//                 System.out.print(" ");
//             }
            
//             System.out.print("*");
            
//             if(i != n-2) {
//                 //spaces
//                 for(int j=0; j<2*(n-i)-5; j++) {
//                     System.out.print(" ");
//                 }
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

//output:



// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n-i-1; j++) {
//                 System.out.print(" ");
//             }
            
//             for(int j=i+1; j>=1; j--) {
//                 System.out.print(j);
//             }
            
//             for(int j=1; j<=i; j++) {
//                 System.out.print(j+1);
//             }
//             System.out.println();
//         }
//     }
// }

// output
//    1
//   212
//  32123
// 4321234


// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int num = 1;
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n-i-1; j++) {
//                 System.out.print(" ");
//             }
            
//             for(int j=1; j<=i+1; j++) {
//                 System.out.print(num + " ");
//             }
//             num++;
//             System.out.println();
//         }
//     }
// }

// output
//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 


// public class Patterns {
//     public static void main(String args[]) {
//         int n = 5;
//         int m = 4;

//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 if(i == 0 || i == n-1 || j == 0 || j == m-1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// output
// ****
// *  *
// *  *
// *  *
// ****

// public class Patterns {
//     public static void main(String args[]) {
//         int n = 5;

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 if((i+j) % 2 == 0) {
//                     System.out.print(1+" ");
//                 } else {
//                     System.out.print(0+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// output
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 










