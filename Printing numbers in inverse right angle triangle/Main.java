import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
         int n = in.nextInt();
      for(int i=n;i>=1;i--)
      { int num=i;
        for(int j=1;j<=i;j++)
        { 
           System.out.print(num);
          num=num-1;
        }
        System.out.print("\n");
      }
      
	}
}