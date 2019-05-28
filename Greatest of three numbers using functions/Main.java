import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n1 = in.nextInt();
       int n2 = in.nextInt();
       int n3 = in.nextInt();
       int greatest;
       greatest=great(n1,n2,n3);
       System.out.println(greatest);
	}
   public static int great(int a, int b, int c)
   { int large;
     if(a>b)
       large=a;
      else
       large=b;
     if(c>large)
       large=c;
    return large;
   }
}