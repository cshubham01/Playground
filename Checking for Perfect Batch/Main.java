import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a [] = new int [n];
    for(int i=0;i<n;i++)
    {
      a[i] = in.nextInt();
    }
    boolean is_perfect = false;
    int int_sum = (a[0] + a[1] + a[2]);
    for(int i=3;i<n;i=i+3)
    {
      int cur_sum = (a[i] + a[i+1] +a[i+2]);
      if(int_sum != cur_sum)
      {
        is_perfect = true;
      }
    }
    if(is_perfect == false)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
  }
}