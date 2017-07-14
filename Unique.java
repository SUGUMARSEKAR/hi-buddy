import java.io.*;
import java.util.*;
public class Main12
{
public static void main(String args[])throws IOException
{int i;
Scanner s = new Scanner(System.in);
Integer n = s.nextInt();
Integer a[] = new Integer[n];
ArrayList<Integer> arr = new ArrayList<Integer>();
ArrayList<Integer> arr1 = new ArrayList<Integer>();
ArrayList<Integer> arr2 = new ArrayList<Integer>();
for(i=0;i<n;i++)
{
a[i] = s.nextInt();
arr.add(a[i]);
}
Collections.sort(arr);
System.out.println(arr);

for(i=0;i<arr.size()-1;i++)
{
if(arr.get(i) == arr.get(i+1))
{
	if(!arr1.contains(arr.get(i)))
		arr1.add(arr.get(i));
}
else{
	if(!arr1.contains(arr.get(i)))
		arr2.add(arr.get(i));}
}
arr2.add(arr.get(i));

//System.out.println(arr1);
System.out.println(arr2);
}
}
