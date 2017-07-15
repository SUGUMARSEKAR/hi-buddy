import java.io.*;
import java.util.*;
public class Main12
{
public static void main(String args[])throws IOException
{int i;
Scanner s = new Scanner(System.in);
Integer flag = 1,count=0;
Integer n = s.nextInt();
Integer a[] = new Integer[n];
ArrayList<Integer> arr = new ArrayList<Integer>();
ArrayList<Integer> brr = new ArrayList<Integer>();
for(i=0;i<n;i++)
{
a[i] = s.nextInt();
arr.add(a[i]);
}
Integer n1 = s.nextInt();
Integer b[] = new Integer[n1];
for(i=0;i<n1;i++)
{
b[i] = s.nextInt();
brr.add(b[i]);
}
//Collections.sort(arr);
System.out.println(arr);
System.out.println(brr);

for(i=0;i<brr.size();i++)
{
     if(arr.contains(brr.get(i)))
    	 count = count+1;
}
if(count == brr.size())
System.out.print("B is subset of A");
else 
System.out.print("B is not a subset of A");
}
}
