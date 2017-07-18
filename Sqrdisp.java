import java.io.*;
import java.util.*;
public class Sqrdisp
{
public static void main(String args[])throws IOException
{
	int i,j;
Scanner s = new Scanner(System.in);
Integer n = s.nextInt();
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++){
		if((i!=0 && i!=n-1) && (j==0 || j==n-1))
			System.out.print("* ");
		else if(i!=0 && i!=n-1)
			System.out.print("  ");
		else
			System.out.print("* ");
	}
	System.out.println();
}
}
}
