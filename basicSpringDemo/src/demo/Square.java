package demo;


public class Square {
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	
	public Point getA() {
		return a;
	}


	public void setA(Point a) {
		this.a = a;
	}


	public Point getB() {
		return b;
	}


	public void setB(Point b) {
		this.b = b;
	}


	public Point getC() {
		return c;
	}


	public void setC(Point c) {
		this.c = c;
	}


	public Point getD() {
		return d;
	}


	public void setD(Point d) {
		this.d = d;
	}


	public void draw()
	{
		System.out.println("Point a="+getA().getX()+", "+getA().getY());
		System.out.println("Point b="+getB().getX()+", "+getB().getY());
		System.out.println("Point c="+getC().getX()+", "+getC().getY());
		System.out.println("Point d="+getD().getX()+", "+getD().getY());
	}
	

}
