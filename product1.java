/*lowest of three number*/
import java.io.*;
import java.lang.*;

public class product1
	{
	int pcode;
	String pname;
	int price;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	

	public void getdata()
		{
		try
			{
			System.out.println("enter pcode,price,pname::");
			pcode=Integer.parseInt(br.readLine());
			price=Integer.parseInt(br.readLine());
			pname=br.readLine();
			}
		catch(IOException e)
			{
			System.out.println(e);
			}
		}
	public void show()
		{
		System.out.println("pcode:"+pcode);
		System.out.println("pname:"+pname);
		System.out.println("price:"+price);
		}

	static void compare(product1 p1,product1 p2,product p3)
		{
		System.out.println("The product with lowest price:");
		if(p1.price<p2.price && p2.price< p3.price)
		{
		p1.show();
		}
		else if(p2.price<p1.price && p2.price< p3.price)
		{
		p2.show();
		}
		else
		{
		p3.show();
		}
		}
		
		public static void main(String[] args)throws IOException
		{
		product1 p1= new product1();
		product1 p2= new product1();
		product1 p3= new product1();
		p1.getdata();
		p2.getdata();
		p3.getdata();
		p1.show();
		p2.show();
		p3.show();
		compare(p1,p2,p3);
		}
	}
