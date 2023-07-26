package package_graphics; 

interface pk
{
	public float sqAr(int s);
	public float reAr(int l, int b);
}

public class pk_graphics implements pk
{
	public float sqAr(int s)
	{
		return s*s;
	}

	public float reAr(int l, int b)
	{
		return l*b;
	}
}
