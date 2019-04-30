import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int [n];
    for (int i=0;i<n;i++)
    {
      a[i] = in.nextInt();
    }
    int running_sum =a[0];
    int sum = a[0];
    for(int i=1;i<n;i++)
    {
      if(a[i]>a[i-1])
      {
        running_sum = running_sum + a[i];
      }
      else
      {
        running_sum = + a[i];
      }
    }
    if(running_sum < sum)
    {
      running_sum = sum;
    }
    System.out.print(running_sum);
  }
}