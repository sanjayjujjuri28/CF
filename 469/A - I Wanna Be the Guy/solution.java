import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      HashSet<Integer>set=new HashSet<>();
      sc.nextLine();
      int p=sc.nextInt();
      for(int i=0;i<p;i++){
        int k=sc.nextInt();
        set.add(k);
      }
      sc.nextLine();
      int p2=sc.nextInt();
      for(int i=0;i<p2;i++){
        int k=sc.nextInt();
        set.add(k);
      }
 
      boolean check=true;
      for(int i=1;i<=n;i++){
         if(!set.contains(i)){
            check=false;
            break;
         }
      }
      if(check){
         System.out.println("I become the guy.");
      }
      else{
         System.out.println("Oh, my keyboard!" );
      }
    }
}