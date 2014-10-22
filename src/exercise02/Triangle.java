package exercise02;

public class Triangle implements Polygon{

	private Point p1;
	private Point p2;
	private Point p3;
	
	Triangle(Point p1, Point p2, Point p3)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}


	Point p1()
	{
		return p1;
	}
	Point p2()
	{
		return p2;
	}
	Point p3()
	{
		return p3;
	}
	
	
	public static void main(String[] args) {
		
		Point p1 = new Point(0, 1);
		Point p2 = new Point(8, 4);
		Point p3 = new Point(9, 6);
		
		Triangle t1 = new Triangle(p1, p2, p3);
		System.out.println(t1.area());
        System.out.println(t1.perimeter());
		
		
	}


	@Override
	public Point[] allVertexes() {
		
		Point[] vertexes = new Point[4];
         
		vertexes[0] = p1;
        vertexes[1] = p2;
        vertexes[2] = p3;
        vertexes[3] = p1;
        return vertexes;
	}


	@Override
	public double perimeter() {
		double sum =  allVertexes()[0].distance(allVertexes()[1]) + allVertexes()[1].distance(allVertexes()[2]) + allVertexes()[2].distance(allVertexes()[3]);
        return sum;
	}


	@Override
	public double area() {
		 double s = (perimeter())/2;
         double area = Math.sqrt(s * (s-allVertexes()[0].distance(allVertexes()[1]))*(s-allVertexes()[1].distance(allVertexes()[2]))*(s-allVertexes()[2].distance(allVertexes()[3])));
         return area;
	}


	@Override
	public void move(double dx, double dy) {
		 
		this.p1 = p1.moved(dx, dy);
        this.p2 = p2.moved(dx, dy);
        this.p3 = p3.moved(dx, dy);
		
	}
}
