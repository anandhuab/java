import java.io.*;
class students
{
	int roll;
	String name;
	float mark;
	void getdata(int roll,String name,float mark)
	{
	this.roll=roll;
	this.name=name;
	this.mark=mark;
	}
}
interface sports
{
	final int score=10;
	void show();
}
class result extends students implements sports
{ 	public void show()
	{
	System.out.println("roll no.:"+roll);
	System.out.println("name:"+name);
	System.out.println("marks::"+mark);
	System.out.println("core.:"+score);
	}
}
class co3q5
{
	public static void main(String args[])
	{
	int roll=0;
	String name="";
	float mark=0;
	result r=new result();
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	try
	{
	System.out.println("enter rollno.,name,marks:");
	roll=Integer.parseInt(br.readLine());
	name=br.readLine();
	mark=Float.parseFloat(br.readLine());
	}
	catch(IOException e)
	{
	System.out.println(e);
	}
	r.getdata(roll,name,mark);
	r.show();
	}
}	