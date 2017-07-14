import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner s = new Scanner(System.in);
//Integer x = null;
Integer n = s.nextInt();
Integer a[] = new Integer[n];
ArrayList<Integer> arr = new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
a[i] = s.nextInt();
arr.add(a[i]);
}
Collections.sort(arr);
for(int i=0;i<arr.size()-1;i++)
{
if(arr.get(i)== arr.get(i+1))
{
System.out.print(a[i]);
break;
}
}
}
}
