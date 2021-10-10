import java.io.*;
class First
{
	void firstdisplay()
	{
	Final f=new Final();
	f.finaldisplay();
	}
}
class Final 
{
	void finaldisplay()
	{
	System.out.println("Welcome");
	}
}

class display
{
	public static void main(String ar[])
	{
	First fi=new First();
	fi.firstdisplay();
	}
}