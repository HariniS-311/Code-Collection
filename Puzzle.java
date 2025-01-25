import java.util.Scanner;
class Puzzle
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the mysterious number 1: ");
int a = sc.nextInt();
System.out.println("Enter the mysterious number 2 : ");
int b  = sc.nextInt();
if(a > b)
{
System.out.println("The greatest number is : " + a);
}
else if (b>a)
{
System.out.println("The greatest number is: "+ b);
}
else
{
System.out.println("a and b are equal");
}
}
}
