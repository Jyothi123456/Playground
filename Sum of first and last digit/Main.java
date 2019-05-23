import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int last,first,s,n,rev=0,r;
      last=a % 10;
      while(a>0){
        r=a % 10;
        rev=rev * 10 + r;
        a=a / 10;
       	}
      first=rev % 10;
      s=first+last;
      System.out.println(s);
	}
}