import java.util.*;
 
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String s2=sc.nextLine();
       String s3=sc.nextLine();
 
       int arr[]=new int[26];
       for(int i=0;i<s1.length();i++){
           int indx=s1.charAt(i)-'A';
           arr[indx]++;
       }
       for(int i=0;i<s2.length();i++){
           int indx=s2.charAt(i)-'A';
           arr[indx]++;
       }
       for(int i=0;i<s3.length();i++){
           int indx=s3.charAt(i)-'A';
           arr[indx]--;
       }
       boolean check=true;
       for(int i=0;i<arr.length;i++){
          if(arr[i]!=0){
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