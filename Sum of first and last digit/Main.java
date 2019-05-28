import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int first_digit;
      int last_digit;
      first_digit=num;
      while(first_digit>=10)
        first_digit=first_digit/10;
      last_digit=num%10;
      System.out.println(first_digit+last_digit);
        
	}
}