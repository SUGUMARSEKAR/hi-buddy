import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner s = new Scanner(System.in);
Integer m[][] = new Integer[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
m[i][j] = s.nextInt();
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
    System.out.print(m[i][j]+" ") ;
}
System.out.println();
}
System.out.println("");
for(int i=0;i<=4;i++)
{
if(m[i][i]+m[i][i+1] == m[i][i+2])
{
System.out.print(m[i][i]+"+"+m[i][i+1]+"="+m[i][i+2]);
break;
}
}
}
}
