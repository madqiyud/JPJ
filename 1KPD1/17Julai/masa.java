class masa
{
	public static void main(String args[])
	{
		//1hari=24jam, 1jam=60minit, 1minit=60saat
		double mula=8.56; //am
		double akhir=11.05; //am

		double beza_waktu_jam=akhir-mula;//jam
		double convert_to_minit=beza_waktu_jam*60;//minit
		double convert_to_saat=convert_to_minit*60;//saat

		System.out.print("Beza waktu = "+beza_waktu_jam+" jam\nDaripada Jam -> Minit = "+convert_to_minit+" minit\nDaripada Minit -> Saat = "+convert_to_saat+" saat");

	}
}