class circle
{
	double radius;
	circle(double radius)
	{
		this.radius=radius;
	}
	double bmi()
	{
		double area=(3.14*radius*radius);
		return area;
	}
	double cir()
	{
	    double perimeter=2*3.14*radius;
		return perimeter;
	}
}
class circles
{
	public static void main(String args[])
	{
		circle ptobj = new circle(450);
		double bmiarea=ptobj.bmi();
		double cirperimeter=ptobj.cir();
		System.out.println("The area is: "+bmiarea);
		System.out.println("The circumference is: "+cirperimeter);
	}
}