import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0;
      int last_digit = n % 10;
      while (n >= 10)
      {
        n = n / 10;
      }
      int first_digit = n % 10;
      sum = first_digit + last_digit;
      System.out.println(sum);
      
      
	}
}