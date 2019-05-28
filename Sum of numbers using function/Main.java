import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     int sum = sum_of_number(num);
     System.out.println(sum);
	} 
    public static int sum_of_number(int n)
    { int sum=0;
      while(n>0)
      { sum=sum+n;
       n=n-1;
      }
      return sum;
    }
}