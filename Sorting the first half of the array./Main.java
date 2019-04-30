import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int array[] = new int[n];
    for(int i=0;i<n;i++)
    {
      array[i] = in.nextInt();
    }
    for(int i=0;i<n/2;i++)
    {
      for(int j=i+1;j<n/2;j++)
      {
        if(array[i] > array[j])
        {
          int temp = array[j];
          array[j] = array[i];
          array[i] = temp;
        }
      }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(array[i]+" ");
    }
  }
}