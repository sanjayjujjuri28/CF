import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       int home[]=new int[n];
       HashMap<Integer,Integer>guest=new HashMap<>();
       for(int i=0;i<n;i++){
           home[i]=sc.nextInt();
          int k=sc.nextInt();
          guest.put(k,guest.getOrDefault(k,0)+1);
       }
       int ans=0;
       for(int i=0;i<n;i++){
          ans+=guest.getOrDefault(home[i],0);
       }
       System.out.println(ans);
    }
}