public class asg63 {
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("D://sample.txt");
		String str = "hello tthis is sample";
		byte b[] = str.getBytes();
		f.write(b);
		int count = 0;
		FileInputStream if1 = new FileInputStream("D://sample.txt");
		
		int  i = if1.read();
		while (i != -1) {
			System.out.print((char) i);
			if((char)i == 't')
			{
				count++;
			}
			i=if1.read();
		}
		System.out.println();
		System.out.println("Total count of 't':"+count);
	}
}