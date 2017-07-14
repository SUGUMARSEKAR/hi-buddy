import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner s = new Scanner(System.in);
ArrayList<Integer> arr = new ArrayList<Integer>();
Integer n = s.nextInt();
Integer a[] = new Integer[n];
for(int i=0;i<n;i++)
{
a[i] = s.nextInt();
if(a[i] == i)
{
arr.add(i);
}
}
System.out.print(arr);
}
}
