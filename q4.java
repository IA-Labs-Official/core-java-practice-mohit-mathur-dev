import java.util.*;
public class q4 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 to 1000");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        if (num>0 && num<1000) {
            for (int i = 0; i < num+1; i++) {
                sum+=i;
            }
            System.out.println("The total addition is "+sum);

        } else {
            System.out.println("Enter valid number");
        }
    }
}
