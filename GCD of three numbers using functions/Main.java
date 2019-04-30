import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int result = gcd_of_numbers(a,b);
      System.out.print(gcd_of_numbers(result,c));
    }
  public static int gcd_of_numbers(int a,int b)
  {
    int min_element = 0, gcd=0;
    if(a<b)
    {
      min_element=a;
    }
    else
    {
    min_element=b;
    }
    while(min_element>=1)
    {
      if(a%min_element==0&&b%min_element==0)
      {
       return min_element;
      }
      min_element--;
    }
    return 0;
	}
}