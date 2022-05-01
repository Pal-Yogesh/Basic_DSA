import java.util.Scanner;

public class Quick_Sort {
    int partition(int a[], int start, int end) {
        int pivot = a[end];
        int pindex = start;
        for (int i = start; i < end - 1; i++) {
            if (a[i] <= pivot) {
                int t = a[pindex];
                a[pindex] = a[i];
                a[i] = t;
            }
        }
        int t = a[pindex];
        a[pindex] = a[end];
        a[end] = t;
        return (pindex);
    }

    void quick1(int a[], int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quick1(a, start, p - 1);
            quick1(a, p + 1, end);
        }
    }
}
class quick
{
    public static void main(String[] args)
    {
            int a[], n, i;
            Scanner sc = new Scanner(System.in);
            System.out.println("How many elements you wn=ant to enter :");
            n = sc.nextInt();
            a = new int[n];
            for (i = 0; i < n; i++)
                a[i] = sc.nextInt();

            Quick_Sort q1 = new Quick_Sort();
            q1.quick1(a, 0, n - 1);
            for (i = 0; i < n; i++)
                System.out.println(a[i] + " ");
    }
}

