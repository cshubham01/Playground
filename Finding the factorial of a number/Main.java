import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = 1;
    while(n>0)
    {
     temp = temp * n;
     n--; 
    }
    System.out.println(temp);
  }
}