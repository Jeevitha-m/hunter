import java.io.*;
import java.util.*;
class wordreverse
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String arr[]=str.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        System.out.print(arr[i]+" ");
    }
}
