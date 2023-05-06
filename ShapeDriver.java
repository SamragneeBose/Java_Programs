class Shape
{
	int r;
	float area;
	void area1(int r)
	{
		this.r=r;
		area=r*r*3.141f;
		System.out.println(area);
	}
	float area2(int r)
	{
		this.r=r;
		area=r*r*3.141f;
		return area;
	}
}
public class ShapeDriver {

	public static void main(String[] args) {
		int r=5;
		Shape s1=new Shape();
		s1.area1(r);
		float ar=s1.area2(r);
		System.out.println(ar);
	}

}
