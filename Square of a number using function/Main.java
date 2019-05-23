import java.util.Scanner;
class Main
{
 public static int square(int x){
    int z;
    z=x*x;
return z;
 }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=square(a);
      a=b;
      System.out.println(a);
	} 
}