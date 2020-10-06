class asg3 {
	public static void main(String args[])
	{
		int x=5,y,z;
		y = x*x + 3*x -7;
		System.out.println("Y = " + y);
		y = x++ + ++x;
		System.out.println("X = " + x +" & Y = " + y);
		z = x++ - --y - --x + x++;
		System.out.println("X = " + x +" & Y = " + y + " & Z = " + z);

		boolean a= true, b= false, c;
		c = a && b || !(a||b);
		System.out.println("Z = " + c);
	}
}