import java.util.*;

public class buubleint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Enter the Elements.");

        for(int i=0 ; i<10 ; i++) {
            a[i] = sc.nextInt();
        }

        for(int i=0 ; i<a.length - 1 ; i++) {
            for(int j=0 ; j<a.length - i - 1 ; j++) {
                if(a[j] < a[j+1]) {
                    int temp;
                    temp = a[j] ;
                    a[j] = a[j+1] ;
                    a[j+1] = temp ;
                }
            }
        }

        for(int i=0 ; i<10 ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}