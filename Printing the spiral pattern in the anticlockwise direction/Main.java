import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int matrix[][] = new int [n][n];
      int r_min=0,r_max = n-1;
      int c_min=0,c_max =n-1;
      int val =1;
      while((r_min<=r_max)&&(c_min<=c_max))
      {
      for(int i=c_max;i>=c_min;i--)
      {
        matrix[r_min] [i]= val++;
      }
      for(int i=r_min+1;i<=r_max;i++)
      {
        matrix[i][c_min] = val++;
      }
      for(int i=c_min+1;i<c_max;i++)
      {
        matrix[r_max][i] = val++;
      }
      for(int i=r_max;i>r_min;i--)
      {
        matrix[i][c_max] = val++;
      }
        r_min++;
        c_min++;
        r_max--;
        c_max--;
      }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
        
    }
}