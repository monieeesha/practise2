import java.util.*;
public class program5 {


    public static int isMax(int a[],int n) {

        int max = a[0];
        for (int k = 0; k < n; k++) {
            if (a[k] > max) {
                max = a[k];
            }
        }
        return max;
    }

    public static int isMin(int a[],int n) {


        int min = a[0];
        for (int y = 0; y < n; y++) {
            if (a[y] < min) {
                min = a[y];
            }
        }
        return min;
    }

    public static float isAvg(int a[],int n) {

          int sum=0;
          float avg;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }

        avg = sum / n;
        return avg;
    }


    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of students");
        int n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("enter the marks of each student ");
        for (int i = 0; i < n; i++) {

            int x = scan.nextInt();
            a[i] = x;
        }


        int m = isMax( a,n);
        int c = isMin( a,n);
        float average = isAvg( a,n);


        System.out.println("maximum is"+m);
        System.out.println("minimum is"+c);
        System.out.println("average is"+average);

    }
}
