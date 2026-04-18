//length() method
//This method provides the total count of characters in the string.
  
public class Main {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println("Length of the string:"+ s.length());
    }
}
//Output
Length of the string: 13


//charAt() method
//This method returns the character at ith index.

  public class Main {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println("The character at ith index: "+ s.charAt(7));
    }
}
//output
The character at ith index: W
  

//substring() method
//This method return the substring from the ith index character to end.

  public class Main {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println("The substring from the ith index character to end: " + s.substring(7));
    }
}
//output
The substring from the ith index character to end: World!

  
//toUppercase() and toLowercase()
//This method return the uppercase and lowercase of the given input string.


public class Main{
    public static void main(String[] args) {
        String str = "Welcome To The World";  
        System.out.println("Uppercase of the string: " + str.toUpperCase());
         System.out.println("Lowercase of the string: " + str.toLowerCase());
    }
}
//output
Uppercase of the string:WELCOME TO THE WORLD
Lowercase of the string: welcome to the world

//concat() method
//This method appends the given string to the end of the current string. 

public class Main {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println("Concated string are: "+ s.concat("Welcome to the java programming"));
    }
}
//Output
Concated string are : Hello, World! Welcome to the java programming
