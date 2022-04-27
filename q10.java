import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0; 
        for (int index = 0; index < n+1; index++) {
            if(index%2!=0){
                System.out.println(index);
                sum+=index;
            }
        }
        System.out.println("sum is "+sum);
    }
}
