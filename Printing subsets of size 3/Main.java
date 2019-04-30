import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int a[] = new int [n];
      for(int i=0;i<n;i++)
      {
        a[i] = in.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          for(int m=j+1;m<n;m++)
          {
            
            System.out.print("("+a[i]+", "+a[j]+", "+a[m]+") ");
          }
        }
        if(i<=n-2)
        {
        System.out.print("\n");
        }
      }
    }
}