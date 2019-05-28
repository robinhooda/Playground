import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     int sq = square(num);
     System.out.println(sq);
	} 
    public static int square(int n)
    { 
      return n*n;
    }
}