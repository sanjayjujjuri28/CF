import java.util.*;
 
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       HashMap<String,String>map=new HashMap<>();
       int n=sc.nextInt();
       int m=sc.nextInt();
       sc.nextLine();
       while(m>0){
          String s1=sc.next();
          String s2=sc.next();
          sc.nextLine();
          if(s1.length()<=s2.length()){
            map.put(s1,s1);
          }
          else if(s1.length()>s2.length()){
            map.put(s1,s2);
          }
          m--;
       }
       while(n>0){
         String s=sc.next();
         System.out.print(map.get(s)+" ");
         n--;
       }
       
    }
}