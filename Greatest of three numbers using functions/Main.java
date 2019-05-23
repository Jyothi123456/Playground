import java.util.Scanner;
class Main{
  public static int greater(int x,int y){
    if(x>y){
      return x;
    }
    else{
      return y;
    }}
 
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
     int d= greater(a,b);
      int e=greater(d,c);
      System.out.println(e);
	}
}