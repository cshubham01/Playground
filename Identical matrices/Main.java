import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner in= new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix1 [][] = new int [r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix1[i][j] = in.nextInt();
      }
    }
    int matrix2 [][] = new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix2[i][j] = in.nextInt();
      }
    }
    boolean is = true;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(matrix1[i][j]!=matrix2[i][j])
        {
          is = false;
        }
      }
    }
      if(is == true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
  }
}