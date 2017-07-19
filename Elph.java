import java.io.*;
import java.util.*;
public class Elph
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
ArrayList<Integer> arr = new ArrayList<Integer>();
Integer c = 0,sum = 0;
System.out.println("Enter the number of Elephants");
Integer n = Integer.parseInt(br.readLine());
System.out.println("Enter the weight limit");
Integer w = Integer.parseInt(br.readLine());
Integer a[] = new Integer[n];
System.out.println("Enter the weight of elephants");
for(int i=0;i<n;i++)
{
a[i] = Integer.parseInt(br.readLine());
arr.add(a[i]);
}
Collections.sort(arr);
for(int i=0;i<arr.size();i++)
{
sum += arr.get(i);
if(sum<=w)
c++;
}
System.out.println(c);
}
}
