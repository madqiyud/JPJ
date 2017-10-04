class Latihan1
{
	public static void main(String args[])
	{
		int nom1=4;
		int nom2=1;


		System.out.println("nom1 = "+nom1+"\nnom2 = "+nom2);

		if (nom1<nom2) {
			System.out.println("Nombor "+nom1+" adalah lagi kecil dari nombor "+nom2);
		}
		else if (nom1>nom2) {
			System.out.println("Nombor "+nom1+" adalah lagi besar dari nombor "+nom2);
		}
		else if (nom2==nom1) {
			System.out.println("Nombor "+nom1+" adalah sama dengan nombor "+nom2);
		}

	}
}