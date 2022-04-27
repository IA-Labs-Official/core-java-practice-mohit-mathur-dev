import java.util.*;
import java.lang.Math;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        int a = sc.nextInt();
        System.out.println("Enter second no.");
        int b = sc.nextInt();
        System.out.println("Sum: "+(a+b));
        System.out.println("difference: "+(a-b));
        System.out.println("product: "+(a*b));
        System.out.println("average: "+(a+b)/2);
        System.out.println("maximum: "+(((a>b)?a:b)));
        System.out.println("maximum: "+(((a<b)?a:b)));
        System.out.println("distance: "+Math.abs(a-b));

    }
}
