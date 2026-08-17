import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      HashSet<Character>set=new HashSet<>();
      for(int i=0;i<str.length();i++){
        set.add(str.charAt(i));
      }
      if(set.size()%2!=0){
        System.out.println("IGNORE HIM!");
      }
      else{
        System.out.println("CHAT WITH HER!");
      }
    }
}