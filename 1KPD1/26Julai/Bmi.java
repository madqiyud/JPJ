import java.util.Scanner;

class Bmi
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Sila Masukkan berat anda :");
		double berat = input.nextDouble();

		System.out.println("Sila Masukkan tinggi anda :");
		double tinggi = input.nextDouble();


		double bmi = berat / (tinggi*tinggi);
		
		System.out.println("BMI anda ialah : "+bmi);



	}
}