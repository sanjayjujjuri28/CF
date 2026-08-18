import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n<0){
       n=n*-1;
      int fdig=n%10;
      n=n/10;
      int sdig=n%10;
      n=n/10;
      int fans=(n*10)+fdig;
      int sans=(n*10)+sdig;
         if(fans!=0){
          fans*=-1;
         }
         if(sans!=0){
          sans*=-1;
         }
      System.out.println(Math.max(fans,sans));
      }
      else{
        System.out.println(n);
      }
    }
}