import java.util.Scanner;

public class EvenNumTest{

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }

        return false;
    }


    public static void main(String[] args){

        System.out.println("enter a number");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(isEven(n));

    }





}