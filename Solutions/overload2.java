import java.util.*; // importing package

public class overload2 {

    // new method for volume of sphere
    public double volume(double R) {
        double volume ;
        volume = (4.0/3.0) * (22.0/7.0) * Math.pow(R,3);
        System.out.println("The Volume of sphere is : "+volume);
        return volume ;
    }

    // new method for volume of clyinder
    public double volume(double H, double R) {
        double volume ;
        volume = (22.0/7.0) * Math.pow(R,2) * H ;
        System.out.println("The Volume of Clyinder is : "+volume);
        return volume ;
    }

    // new method for volume of cuboid
    public double volume(double L, double B, double H) {
        double volume ;
        volume = L * B * H ;
        System.out.println("The Volume of Cuboid is : "+volume);
        return volume ;
    }

    public static void main(String[] args) {
        // creating scanner class for input
        Scanner sc = new Scanner(System.in);
        // object creation for calling methods
        overload2 obj = new overload2();

        obj.volume(7);
        obj.volume(10,7);
        obj.volume(10, 5, 8);
    }
}