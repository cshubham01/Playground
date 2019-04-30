import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c= in.nextInt();
    int matrix[][] = new int [r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix[i][j] = in.nextInt();
      }
    }
    for(int k=0;k<c;k++)
    {
      for(int i=0,j=k;j<c;i++,j++)
      System.out.print(matrix[i][j]+" ");
    }
    
  }
}