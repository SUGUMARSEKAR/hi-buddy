import java.io.*;
import java.util.*;
public class Main12
{
public static void main(String args[])throws IOException
{
Scanner s = new Scanner(System.in);
Integer n = s.nextInt();
ArrayList<Integer> list= new ArrayList<Integer>();
Integer[] ar = new Integer[n];
for(int i=0;i<n;i++)
{
ar[i] = s.nextInt();
list.add(ar[i]);
}
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);
System.out.println("Enter the Nth height you want :");
Integer k = s.nextInt();
for(int i=0;i<n;i++)
{
if(k == i)
{
System.out.println(list.get(i-1));
break;
}
}
}
}
