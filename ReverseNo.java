import java.io.*;
import java.lang.*;
import java.util.*;
class ReverseNo
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to be reversed:");
int n=sc.nextInt();
int a,s=0;
while(n!=0)
{
a=n%10;
s=(s*10)+a;
n=n/10;
}
System.out.println(s);
}
}



