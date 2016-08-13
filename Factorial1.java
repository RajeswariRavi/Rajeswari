import java.io.*;
import java.lang.*;
import java.util.*;
class Factorial1
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
long n=sc.nextInt();
long x=Math.abs(n);
long f=1;
for(long i=1;i<=x;i++)
{
 f=f*i;
}
System.out.println("The factorial of the given number is:"+f);
}
}
