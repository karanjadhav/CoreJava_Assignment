import java.util.Scanner;

class TemperatureConverter{
	public static void main(String []args){
		System.out.println("Enter Temperature in Fahrenheit : ");
		Scanner sc = new Scanner(System.in);
		float temp = sc.nextFloat();
		float Ctemp = (float) 5*(temp - 32 )/9;
		System.out.println("Temperature in Celsius : "+Ctemp+" C");
		}
}