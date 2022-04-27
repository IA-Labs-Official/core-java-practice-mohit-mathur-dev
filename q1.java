import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        int a = sc.nextInt();
        System.out.println("Enter second no.");
        int b = sc.nextInt();        
        System.out.println("Enter third no.");
        int c = sc.nextInt();        
        System.out.println("Enter fourth no.");
        int d = sc.nextInt();
        if(a==b&& b==c&&c==d){
            System.out.println("All Equal");
        }
        else{
            System.out.println("not equal");
        }
    }
    
}
