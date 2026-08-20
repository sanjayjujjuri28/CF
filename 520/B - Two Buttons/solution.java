import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        int cnt = 0;
 
        while (m > n) {
 
            if (m % 2 == 1) {
                m++;
            } else {
                m /= 2;
            }
 
            cnt++;
        }
 
        cnt += n - m;
 
        System.out.println(cnt);
    }
}