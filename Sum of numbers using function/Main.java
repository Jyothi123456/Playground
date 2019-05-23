import java.util.Scanner;
class Main{
   public static int sum(int x){
     int sum=0;
for (int c = 1; c <= x; c++)
  {
   sum = sum + c;
  }
 return sum;
 }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sum(a);
      a=b;
      System.out.println(a);
	}
}