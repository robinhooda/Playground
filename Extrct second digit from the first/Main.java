import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int second_digit;
      
      second_digit = num;
      while (second_digit>=100)
        second_digit = second_digit/10;
      second_digit  =second_digit%10;
      
      System.out.println(second_digit);
        
	}
}