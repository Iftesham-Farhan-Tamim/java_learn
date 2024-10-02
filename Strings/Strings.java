// String Declaration.
// public class Strings{
//     public static void main(String[] args) {
//         String name = "hello";
//         System.out.println(name);;
//     }
// }

// output:
// hello
// ............................................................................................
// Taking Input from users.
// import java.util.*;
// public class Strings{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name);
//     }
// }
// ............................................................................................
// Concatenation (Joining 2 strings).
// public class Strings{
//     public static void main(String[] args) {
//         String firstName = "hello";
//         String secondName = "world";

//         String fullName = firstName + " " + secondName;
//         System.out.println(fullName);
//     }
// }

// output:
// hello world
// ............................................................................................
// Print length of a String.
// public class Strings{
//     public static void main(String[] args) {
//         String firstName = "hello";
//         String secondName = "world";

//         String fullName = firstName + " " + secondName; // 1 extra length for " "
//         System.out.println(fullName.length());
//     }
// }

// output:
// 11
// ............................................................................................
// Access characters of a string.
// public class Strings{
//     public static void main(String[] args) {
//         String firstName = "hello";
//         String secondName = "world";

//         String fullName = firstName + " " + secondName;

//         for(int i=0; i<fullName.length(); i++) {
//             System.out.print(fullName.charAt(i)+ " "); // 1 extra space for " "
//        }
//     }
// }

// output:
// h e l l o   w o r l d
// ............................................................................................
// Compare 2 strings (appropriate way to compair two strings)
// public class Strings {
//     public static void main(String[] args) {
//         String n1 = "hello";
//         String n2 = "world";
        
//         if(n1.equals(n2)) {
//             System.out.print("yes");
//         } else {
//             System.out.print("no");
//         }
//     }
// }

// output:
// no
// ............................................................................................
// Compare 2 strings (inappropriate way to compair & always shows no despite of being yes).
// public class Strings{
//     public static void main(String[] args) {
        
//         if(new String("hello") == new String("hello")) {
//              System.out.print("yes");
//          } else {
//              System.out.print("no");
//          }
//     }
// }

// output:
// no
// ............................................................................................
// Substring (The substring of a string is a subpart of it).
// public class Strings{
//     public static void main(String[] args) {
//         String name = "helloworld";
//         System.out.print(name.substring(0, 4));  // from 0 to 3
//     }
// }

// output:
// hell
// ............................................................................................
// ParseInt Method of Integer class.
// public class Strings{
//     public static void main(String[] args) {
//         String str = "123";
//         int number = Integer.parseInt(str);
//         System.out.print(number);
//     }
// }

// output:
// 123
// ............................................................................................
// ToString Method of String class
// public class Strings {
//     public static void main(String args[]) {
//         int number = 123;
//         String str = Integer.toString(number);
//         System.out.println(str.length());
//         System.out.print(str);
//     }
// }
  
// output:
// 3
// 123
// ............................................................................................
// Take an array of Strings input from the user & find the cumulative (combined) 
// length of all those strings.

// import java.util.*;
// public class Strings{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String arr[] = new String[size];
//         int toLength = 0;
        
//         for(int i=0; i<size; i++) {
//             arr[i] = sc.next();
//             toLength += arr[i].length();
//         }
        
//         System.out.print(toLength);
//     }
// }

// ............................................................................................
// Input a string from the user. Create a new string called ‘result’ in which 
// you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

// import java.util.*;
// public class Strings{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String result = "";
        
//         for(int i=0; i<str.length(); i++) {
//             if(str.charAt(i) == 'e') {
//                 result += 'i';
//             } else {
//                 result += str.charAt(i);
//             }
//         }
        
//         System.out.println(result);
//         System.out.print(result.charAt(2));
//     }
// }

// ............................................................................................
// Input an email from the user. You have to create a username from the email by 
// deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “helloworld@gmail.com” ; username = “helloworld” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

// import java.util.*;
// public class Strings {
//   public static void main(String args[]) {
//      Scanner sc = new Scanner (System.in);
//      String email = sc.next();
//      String userName = "";

//      for(int i=0; i<email.length(); i++) {
//       if(email.charAt(i) == '@') {
//         break;
//       } else {
//          userName += email.charAt(i);
//       }
//      }

//      System.out.println(userName);
//   }
// }

