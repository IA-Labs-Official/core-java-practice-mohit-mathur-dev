import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive");
        }
        else if(a==0){
            System.out.println("ZERO");
        }
        else{
            System.out.println("Negative");
        }

    }
}
