import java.io.*;
public class Main {
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Integer count = 0;
String x = br.readLine();
x = x.toLowerCase();
if(x.matches("[a-b]"))
System.out.println("Pangram");
else
System.out.println("Not pangram");
}
}
