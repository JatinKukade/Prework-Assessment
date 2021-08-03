import java.io.*;
import java.util.*;
public class Main
{
public void checkPalindrome(int n)
{
int rem, rev=0,temp;
temp=n;
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(rev==temp)
System.out.println("Number is palindrome");
else
System.out.println("Number is not palindrome");
}
public void printPattern(int n)
{
int i,j;
for(i=n;i>=1;i--)
{
for(j=1;j<=i;j++)
System.out.println("*");
System.out.println("\n");
}
}
public void checkPrimeNumber(int n)
{
int half,i,flag=0;
half=n/2;
for(i=2;i<=half;i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println("Number is prime");
else
System.out.println("Number is not prime");
}
public void printFibonacciSeries(int n)
{
int first=0,second=1,third,i;
for(i=2;i<n;i++)
{
third=first+second;
System.out.println(third);
first=second;
second=third;
}
}
public static void main(String[] args)
{
Main obj= new Main();
int choice,num;
Scanner sc= new Scanner(System.in);
do
{
System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
System.out.println("Enter choice:\n");
choice=sc.nextInt();
System.out.println("Enter Number:\n");
num=sc.nextInt();
switch(choice)
{
case 0: choice=0;
break;
case 1:obj.checkPalindrome(num);
break;
case 2:obj.printPattern(num);
break;
case 3:obj.checkPrimeNumber(num);
break;
case 4:obj.printFibbonacciSeries(num);
break;
default:System.out.println("Invalid Choice\n");
}
}while(choice!=0);
System.out.println("Exited Successfully!!!");
sc.close();
}
}