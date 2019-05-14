import java.util.Scanner;

public class assignpoly {
    public static void checkPalindrome(String s) {

        String reverse = new StringBuffer(s).reverse().toString();


        if (s.equals(reverse)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }

    }
    public static void main (String[] args)
            throws java.lang.Exception
    {
        System.out.println("Enter a string");

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        checkPalindrome(s);
    }
}
