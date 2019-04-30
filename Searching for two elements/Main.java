import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[]= new int[size];
      int value_is= 1;
      for(int i=0;i<size;i++)
      {
        arr[i]= in.nextInt();
      }
      int search_ele_1=in.nextInt();
      int search_ele_2=in.nextInt();
      for(int i=0;i<size;i++)
      {
        if(search_ele_1==arr[i])
           {
             System.out.println(i);
             value_is= 0;
          
           }
      }  
      if(value_is == 1)
           {
             System.out.println(-1);
           }
    
      for(int i=0;i<size;i++)
      {
        if(search_ele_2==arr[i])
        {
          System.out.println(i);
          value_is= 1;
        }
      }
       if(value_is==0)
        {
          System.out.println(-1);
        }
        
      
    }
                                
                               
             
    
}