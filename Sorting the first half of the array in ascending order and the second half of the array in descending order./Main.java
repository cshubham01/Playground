import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<n;i++)
    {
      arr[i] = in.nextInt();
    }
    for(int i=0;i<n/2;i++)
    {
      for(int j=i;j<n/2;j++)
      {
        if(arr[i]>arr[j])
        {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] =temp;
        }
      }
    }
      for(int i=n/2;i<n;i++)
      {
        for(int j=i;j<n;j++)
        {
          if(arr[i]<arr[j])
          {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
      }
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
  }
}