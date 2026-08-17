import java.util.*;
public class stones{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        int cnt=0;
        for(int i=1;i<n;i++){
           if(str.charAt(i)==str.charAt(i-1)){
              cnt++;
           }
        }
        System.out.println(cnt);
    }
}