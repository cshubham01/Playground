import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int result = greatest_number(a,b);
      System.out.print(greatest_number(result,c));
    }
  public static int greatest_number(int a, int b)
  {
    int greatest = 0;
     if(a>b)
     {
       greatest=a;
     }
    else
    {
      greatest=b;
    }
    return greatest;
	}
}