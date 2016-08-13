import java.io.*;
import java.lang.*;
import java.util.*;
class Factorial
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int n=sc.nextInt();
int x=Math.abs(n);
int f=1;
for(int i=1;i<=x;i++)
{
 f=f*i;
}
System.out.println("The factorial of the given number is:"+f);
}
}
