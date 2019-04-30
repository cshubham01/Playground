import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in = new Scanner (System.in);
    int row_size = in.nextInt();
    int column_size = in.nextInt();
    int matrix1 [][] = new int [row_size][column_size];
    for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<column_size;j++)
      {
        matrix1[i][j] = in.nextInt();
      }
    }
    int matrix2 [][] = new int[row_size][column_size];
    for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<column_size;j++)
      {
        matrix2[i][j]= in.nextInt();
      }
    }
    int sum[][] = new int [row_size][column_size];
    for(int i=0;i<sum.length;i++)
    {
      for(int j=0;j<sum[i].length;j++)
      {
        sum[i][j] = matrix1[i][j] - matrix2[i][j];
      }
    }
    for (int i=0;i<sum.length;i++)
    {
      for(int j=0;j<sum[i].length;j++)
      {
        System.out.print(sum[i][j] +" ");
      }
      System.out.println();
    }
  }
}