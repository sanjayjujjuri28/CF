import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }
      ArrayList<Integer>al=new ArrayList<>();
      for(int i=0;i<n;i++){
        if(map.get(arr[i])==1){
           al.add(arr[i]);
        }
        else{
          map.put(arr[i],map.get(arr[i])-1);
        }
      }
      System.out.println(al.size());
      for(int i:al){
        System.out.print(i+" ");
      }
    }
}