import java.io.*;
import java.lang.*;
import java.util.*;
class ReverseString
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string to be reversed:");
String s=sc.nextLine();
StringBuffer s1=new StringBuffer(s);
s1.reverse();
System.out.print("The reversed string is:");
System.out.println(s1);
}
}