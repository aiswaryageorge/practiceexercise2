import java.util.Scanner;

public class StringRev {


    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }

    public static void main(String[] args) {

        System.out.println("Enter a String");

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println(reverseString(str));


    }
}
