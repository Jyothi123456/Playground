import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       
      Scanner sc=new Scanner(System.in);
      int arrsize=sc.nextInt();
      int arr[]= new int[arrsize];
      for(int in=0;in<=arrsize-1;in++){
        arr[in]=sc.nextInt();
    }
   int   lar=arr[0];
      for(int i=1;i<arrsize;i++){
        if(arr[i]>=lar){
          lar=arr[i];
}}
      System.out.println(lar);   
    }
}