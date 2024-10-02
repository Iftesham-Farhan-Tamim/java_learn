// package Strings Builder;

// Declaration
// public class Strings{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("hello world");
//         System.out.println(sb);
//     }
// }

// output:
// hello world
// ............................................................................................
// Get A Character from Index
// public class Strings{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("hello");
//      //Set Char
//      System.out.println(sb.charAt(0));
//     }
// }

// output:
// h
// ............................................................................................
// Set a Character at Index
// public class Strings{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("hello");
//         //Get Char
//         sb.setCharAt(0, 'P');
//         System.out.println(sb);
//     }
// }

// output:
// Pello
// ............................................................................................
// Insert a Character at Some Index
// public class Strings {
//    public static void main(String args[]) {
//      StringBuilder sb = new StringBuilder("hello");
//      //Insert char
//      sb.insert(0, 'S');
//      System.out.println(sb);
//    }
// }

// output:
// Shello
// ............................................................................................
// Delete char at some Index
// public class Strings {
//     public static void main(String args[]) {
//       StringBuilder sb = new StringBuilder("hello");
//       //Insert char
//       sb.insert(0, 'S');
//       System.out.println(sb);
 
//       //delete char
//       sb.delete(0, 2);
//       System.out.println(sb);
//     }
// }

// output:
// Shello
// ello
// ............................................................................................
// Append a char (Append means to add something at the end).
// public class Strings {
//     public static void main(String args[]) {
//       StringBuilder sb = new StringBuilder("hello");
//       sb.append(" world");
//       System.out.println(sb); 
//     }
// }
 
// output:
// hello world
// ............................................................................................
// Print Length of String
// public class Strings {
//     public static void main(String args[]) {
//       StringBuilder sb = new StringBuilder("hello");
//       sb.append(" world");
//       System.out.println(sb); 
 
//       System.out.println(sb.length());
//     }
// }

// output:
// hello world
// 11
// ............................................................................................
// Reverse a String (using StringBuilder class) --> O(1) Space Complexity Approach
// public class Strings{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("hello");
        
//         for(int i=0; i<sb.length()/2; i++) {
//             int front = i;
//             int back = sb.length()/2;
            
//             // Store the characters at front and back
//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);

//             // Swap the characters
//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);
//         }
//     }
// }

// output:
// olleh
// ............................................................................................
// Reverse a String (using StringBuilder class) --> O(n) Space Complexity Approach
// public class Strings {
//     public static void main(String[] args) {
//         String original = "hello";
//         StringBuilder reversed = new StringBuilder();

//         // Reverse the string by appending characters to the new StringBuilder
//         for (int i = original.length() - 1; i >= 0; i--) {
//             reversed.append(original.charAt(i));
//         }

//         System.out.print(reversed);
//     }
// }

// output:
// olleh
// ............................................................................................
// public class Strings{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("hello world");
//         System.out.println(sb); // hello world
        
//         // System.out.println(sb.charAt(0));  // h
        
//         // Get Char................
//         // sb.setCharAt(0, 'P');
//         // System.out.println(sb);  // Pello world

//         // Insert char................
//         // sb.insert(0, 'S');
//         // System.out.println(sb); // Shello world
        
//         // Insert char................
//         // sb.insert(0, 'S');
//         // System.out.println(sb); // Shello world


// 	       // delete char................
//         // sb.delete(0, 1);
//         // System.out.println(sb); // ello world
        
        
//         // append a char 
//         // sb.append(" Stark");
//         // System.out.println(sb); // hello world Stark
        
        
//         // sb.append(" Stark");
//         // System.out.println(sb); // hello world Stark
//         // System.out.println(sb.length()); // 17
//     }
// }
