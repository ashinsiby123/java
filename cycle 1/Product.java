public class Product
{
int pcode;
int price;
String pname;


void getData(int p1,String p2,int p3)
{
	pcode = p1;
	pname = p2;
	price = p3;
}

public static void main(String[]args)
{
	System.out.println("Name	 : Ashin Siby");
	System.out.println("Reg no      : SJC 22MCA-2014");
	System.out.println("Course Code : 20MCA132");
	System.out.println("Date	 : 24/03/2023");
	int smallest;
	Product obj1 = new Product();
	Product obj2 = new Product();
	Product obj3 = new Product();
	
	obj1.getData(1,"dell",50000);
	obj2.getData(2,"apple",90000);
	obj3.getData(3,"hp",45000);
	
	if(obj1.price<obj2.price && obj1.price<obj3.price)
	{
	smallest = obj1.price;	
	}
	else if(obj2.price<obj3.price)
	{
	smallest = obj2.price;
	}
	else
	{
	smallest = obj3.price;
	}
	System.out.println("Smallest Price - > "+smallest);
}
}
