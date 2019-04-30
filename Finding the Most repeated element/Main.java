import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int [n];
    int temp[]= new int [n];
    int count = 1;
    for(int i=0;i<n;i++)
    {
      a[i] = in.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
        {
          count++;
        }
      }
      temp[i]=count;
      count=1;
    }
    int max = 0;
    for(int i=0;i<n;i++)
    {
      if(temp[i]>temp[max])
      {
        max =i;
      }
    }
    System.out.print(a[max]);
      
        
        
  }
}