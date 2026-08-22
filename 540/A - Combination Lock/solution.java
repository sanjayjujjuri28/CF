import java.util.*;
 
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int ans=0;
        for(int i=0;i<n;i++){
             int num1=s1.charAt(i)-'0';
             int num2=s2.charAt(i)-'0';
             int fdiff=Math.abs(num1-num2);
             int sdiff=Math.abs(num1-9)+num2+1;
             int tdiff=Math.abs(9-num2)+num1+1;
             int min=Math.min(sdiff,tdiff);
             ans+=Math.min(fdiff,min);
        }   
        System.out.println(ans);
    }
}