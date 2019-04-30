import java.util.Scanner;
class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int base = in.nextInt();
    int exp = in.nextInt();
    System.out.print(power_of_number(base,exp));
  }
  public static int power_of_number(int x, int y)
  {
    int value = 1;
    {
    for(int i=1;i<=y;i++)
    {
      value = value*x;
    }
  }
     return value;
  }
}

