import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int count=0,max_count=0;
        int temp[] = new int[n];
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
         if(a[i]==a[j])
         {
           count++;
         }
        }
          if(a[i] ==0 || a[i]== a[n-1])
          {
           temp[i]=count;
            count=0;
          }
        }
        for(int i=0;i<n;i++)
        {
          if(temp[i]>max_count)
          {
            max_count = temp[i];
          }
        }
        System.out.print(max_count);
    
      
}
}