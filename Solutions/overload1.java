import java.util.*; // importing package

public class overload1 {

    public void series(int x, int n) {

        int sum = 0 ;

        for(int i=1 ; i<=n ; i++) {
            sum += Math.pow(x,i);

        }

        System.out.println("The sum of series is : "+sum);
    }

    public void series(int p) {

        System.out.println("The series are as follow : 0, 7, 26, 63 ...");

        for(int i=1 ; i<=p ; i++) {
            System.out.print((i * i * i) - 1+" ");
        }
        System.out.println();
    }

    public void series() {

        double sum=0 ;
        for(int i=2 ; i<=10 ; i++) {
            sum = sum + (1.0/i);
        }

        System.out.println("Sum = "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        overload1 obj = new overload1();

        obj.series(2,2);
        obj.series(10);
        obj.series();
    }
}