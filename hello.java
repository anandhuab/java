import java.io.*;
class Sample
{
int a=100,b=200;
	Sample(int a, int b)
	{
	this.a=a;
	this.b=b;
	System.out.println(a+" "+b);
	}

}
class hello
{
	public static void main(String ar[])
	{
	Sample s=new Sample(10,11);
	System.out.println(s.a+" "+s.b);
	}
}