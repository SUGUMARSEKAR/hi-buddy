import java.io.*;
import java.util.*;
public class Git
{
public static void main(String args[])throws IOException
{
Scanner s = new Scanner(System.in);
Integer n = s.nextInt();
Integer[] a = new Integer[n];
ArrayList<Integer> list = new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
a[i] = s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i]-a[j] == 9)
{
	list.add(a[i]);
	list.add(a[j]);
}
}
}
System.out.print(list);
}
}
