import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int column = in.nextInt();
    int matrix [][] = new int[row][column];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<column;j++)
      {
        matrix[i][j] = in.nextInt();
      }
    }
    int transpose[][] = new int[column][row];
    for(int i=0;i<transpose.length;i++)
    {
      for(int j=0;j<transpose[i].length;j++)
      {
        transpose[j][i] = matrix[i][j];
      }
    }
    for(int i=0;i<transpose.length;i++)
    {
      for(int j=0;j<transpose[i].length;j++)
      {
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }
  }
}