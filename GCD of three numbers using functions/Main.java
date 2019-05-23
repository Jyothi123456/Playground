import java.util.Scanner;
public class Main{
  public static int gcd(int x,int y){
   int rem;
    while(x!=0){
      rem=y%x;
        y=x;
      x=rem;
    }
    return y;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
     int d= gcd(a,b);
      int e=gcd(d,c);
      System.out.println(e);
	}
}