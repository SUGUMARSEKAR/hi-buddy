import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String x = br.readLine();
Integer k = Integer.parseInt(br.readLine());
Integer n=Integer.parseInt(x);
int l=x.length();
int a[]=new int[l];
for(int i=0;i<l;i++){
	a[i]=n%10;
	n=n/10;
	}
Arrays.sort(a);
for(int i=0;i<l-k;i++)
System.out.print(a[i]);
}
}
