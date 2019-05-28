import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int size = in.nextInt();
        int arr[]= new int[size];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      int key1=in.nextInt();
      int key2=in.nextInt();
      int key1_index=-1;
      int key2_index=-1;
      
      for(int i=0;i<size;i++)
      {  if(key1==arr[i])
            key1_index=i;
          if(key2==arr[i])
             key2_index=i;
     }
            System.out.println(key1_index);
             System.out.println(key2_index);
      }
    }
