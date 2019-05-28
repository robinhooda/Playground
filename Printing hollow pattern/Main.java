import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
       
       for(int i=1;i<=n;i++) // for each row
       { 
         for (int k=1;k<=n;k++) // for printing star
         { if((k==1 || k==n) || ( i==1 || i==n))
             System.out.print("*");
           else
             System.out.print(" ");
         }
          System.out.print("\n");
        
	}
}
}