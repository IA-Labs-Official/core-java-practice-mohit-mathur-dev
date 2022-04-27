import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first double value");
        double a = sc.nextDouble();
        System.out.println("Enter another double value");
        double b = sc.nextDouble();
        if(a>0.0 && a<1.0 && b>0.0 && b<1.0){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
    
}
