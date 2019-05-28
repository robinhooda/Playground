import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=1;i<=n;i++) // for each row
        { 
          for (int k=1;k<=n;k++) 
           { if(i%2==1)
              {  if(k==n)
                   System.out.print(i+1); 
                 else 
                   System.out.print(i); 
              }
             else
              {  if(k==1)
                    System.out.print(i+1); 
                 else 
                    System.out.print(i); 
               }
             }
             System.out.print("\n");
          }
}
}