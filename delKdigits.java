import java.io.*;
import java.util.*;
public class Git
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
ArrayList<String> arr = new ArrayList<String>();
String x = br.readLine();
Integer k = Integer.parseInt(br.readLine());
Integer cnt = x.length()-k;
for(int i=0;i<x.length()-cnt;i++)
{
arr.add(x.substring(i,cnt));
cnt++;
}
System.out.println(arr);
System.out.println("Minimum after deleting "+k+" digits "+Collections.min(arr));
}
}
