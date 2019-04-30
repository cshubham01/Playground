import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i] = in.nextInt();
    }
    int max =0,index=0;
    for(int i=0;i<n;i++)
    {
      if(a[i] >max)
      {
        max = a[i];
        index = i;
      }
    }
    System.out.print(index);
  }
}