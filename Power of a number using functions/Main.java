import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
	    int exponent = in.nextInt();
	    System.out.print(power_of_a_number(base, exponent));// function call
	}
    
	public static int power_of_a_number(int base, int exponent)
	{
	    int power = 1;
	   for(int i=1;i<=exponent;i++)
	    {
	        power = power * base;
	       
	    }
	    return power;
	}

}