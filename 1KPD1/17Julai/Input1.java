import  java.util.Scanner;
class inputjejari
{
    public static void main(String args[])
    { 
		Scanner input = new Scanner(System.in);//

		System.out.print("Masukkan Nilai Jejari Bulatan : ");
		double jejari = input.nextDouble();
		double luas = jejari*jejari*3.14159;
	
		System.out.println("Luas bagi bulatan yang mempunyai jejari "+jejari+" adalah "+luas);

    }
}