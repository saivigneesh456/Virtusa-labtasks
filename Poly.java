package labtasks;

class Polys {
	void draw()
	{
	System.out.println("Shape draw()");
	}
	void erase()

	{
	System.out.println ("Shape erase()");
	}
	}
	class Circle extends Polys
	{
	void draw()
	{
	System.out.println("Circle draw()");
	}
	void erase()
	{
	System.out.println ("Circle erase()");
	}
	}
	class Triangle extends Polys
	{
	void draw()
	{
	System.out.println("Triangle erase()");
	}
	}
	class Square extends Polys
	{
	void draw()
	{
	System.out.println("Square draw()");
	}
	void erase()
	{
	System.out.println ("Square erase()");
	}
	}
	public class Poly
	{
	public static Polys randshape()
	{
	switch((int)(Math.random()*3))
	{
	case 0: return new Circle();
	case 1: return new Square();
	case 2: return new Triangle();
	default : System.out.println("default");
	return new Polys();
	}
	}
	public static void main (String arg[])
	{
	Polys s[] = new Polys [9];
	for(int i = 0;i< s.length; i++) s[i] = randshape(); for(int i= 0;i < s.length; i++) s[i].draw();
	}
}
