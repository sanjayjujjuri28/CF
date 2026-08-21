import java.util.*;
 
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        sc.nextLine();
       HashMap<String,Integer>map=new HashMap<>();
       while(n>0){
          String str=sc.nextLine();
          if(!map.containsKey(str)){
             map.put(str,1);
             System.out.println("OK");
          }
          else{
             StringBuilder sb = new StringBuilder(str);
             sb.append(map.get(str));
             map.put(str,map.get(str)+1);
             String s = sb.toString();
             map.put(s,1);
             System.out.println(s);
          }
          n--;
       }
 
    }
}