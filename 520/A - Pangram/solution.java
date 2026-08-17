import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      String str=sc.nextLine();
      if(n<26){
        System.out.println("NO");
      }
      else{
      int temp[]=new int[26];
      for(int i=0;i<n;i++){
         int cindx=(int)str.charAt(i);
         if(cindx>=65 && cindx<=90){
            cindx-='A';
         }
         else{
            cindx-='a';
         }
         temp[cindx]+=1;
      }
      boolean check=true;
      for(int i=0;i<26;i++){
         if(temp[i]==0){
           check=false;
           break;
         }
      }
      if(check){
         System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
     }
    }
}