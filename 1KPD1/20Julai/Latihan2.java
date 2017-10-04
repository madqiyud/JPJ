class Latihan2
{
	public static void main(String args[])
	{
		int nom1=4;
		int nom2=1;


		System.out.println("nom1 = "+nom1+"\nnom2 = "+nom2);

		if (nom1<nom2) {
			for (int i=nom1;i<nom2 ;i++ ) {
				System.out.println("Nombor "+i+" lebih kecil dari nombor "+nom2);
			}
		}
		else if (nom1>nom2) {
			for (int i=nom2;i<nom1 ;i++ ) {
				System.out.println("Nombor "+nom1+" lebih besar dari nombor "+i);
			}
		}
		else if (nom2==nom1) {
			System.out.println("Nombor "+nom1+" sama dengan nombor "+nom2);
		}

	}
}