import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = in.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      int val = 0;
      for(int j=i+1;j<n;j++)
      {
        if((arr[i]<arr[j])&&(arr[j]>val))
        {
          System.out.println(arr[i]+","+arr[j]);
          val = arr[j];
        }
      }
    }
  }
}