import java.io.*;
import java.util.*;
class subset
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int flag=0,count=0;
int arr1[]=new int[a];
int arr2[]=new int[b];
for(int i=0;i<a;i++)
arr1[i]=s.nextInt();
for(int i=0;i<b;i++)
arr2[i]=s.nextInt();
if(a<b)
{
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
if(arr1[i]==arr2[j])
{
flag=1;
count++;
}
}
if(flag==0)
{
System.out.println("Not a Subset");
break;
}
flag=0;
}
if(count==a)
System.out.println("Subset");
}
else
System.out.println("Not a Subset");
}}
