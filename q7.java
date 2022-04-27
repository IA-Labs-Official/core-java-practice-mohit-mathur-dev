import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        System.out.println("Enter Third number");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("First is largest");
            }
        }
        else{
            if (b>c) {
                System.out.println("Second is largest");
            } else {
                System.out.println("Third is largest");
            }
        }

    }
}
