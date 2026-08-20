import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long ans = n;
        for (int i = 1; i < n; i++) {
            ans += (long) (n - i) * i;
        }
        
        System.out.println(ans);
    }
}