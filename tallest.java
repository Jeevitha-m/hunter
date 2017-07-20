import java.io.*;
import java.util.*;
class tallest
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int arr[]=new int[50];
        for(int i=0;i<arr.length;i++)
        arr[i]=s.nextInt();
        Arrays.sort(arr);
        System.out.print(arr[arr.length-5]+" "+arr[arr.length-(k)]);
        
    
    }
    }
