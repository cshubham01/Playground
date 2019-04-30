import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int [n];
      for(int i=0;i<n;i++)
      {
        a[i] = in.nextInt();
      }
      boolean is_ = true;
      for(int i=0;i<n;i++)
      {
        if(a[i] != a[n-i-1])
        {
          is_ = false;
        }
      }
      if(is_ == true)
      {
       System.out.print("Yes");
      }
       else
      {
        System.out.print("No");
      }
                           
                             
                           
          
      
    }
}