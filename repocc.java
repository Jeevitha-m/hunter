import java.util.*;
class repocc
{
    public static void main(String args[])
    {
        int arr[]=new int[args.length];
        int flag=0;
        for(int i=0;i<args.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
                if(arr[i]==arr[i+1])
                System.out.print(arr[i]);
                break;
        }
    }
 }
