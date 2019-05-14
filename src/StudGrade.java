import java.util.Scanner;

public class StudGrade {

    public static void main(String[] args) {

        int n, temp, sum = 0, avg = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students :");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the student grades : ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ",");
        }

        System.out.println(a[n - 1]);

        for (int i = 0; i <= n - 1; i++) {
            sum = sum + a[i];
            avg = sum / n;
        }

        System.out.println("The average is " + avg);

        System.out.println("the minimum is " + a[n - 1]);
        System.out.println("the maximum is " + a[0]);

    }
}
