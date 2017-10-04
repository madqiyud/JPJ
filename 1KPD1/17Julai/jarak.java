class jarak
{
	public static void main(String args[])
	{
		//seorang lelaki berjalan dengan kelajuan 0.5 m/s selama sejam, berapa jarak lelaki ini berjalan? 
		//jarak=kelajuan*masa
		//m/s = meter/second

		int waktu_berjalan=1;//jam mean kene tuka kepada second dlu sbb m/s
		double kelajuan=0.5; // meter per second

		//1jam=60minit, 1minit=60saat
		int masa=waktu_berjalan*60*60;//1jam*60minit*60saat

		double jarak=kelajuan*masa;

		System.out.print("Jarak lelaki comel ini berjalan dengan kelajuan "+kelajuan+" m/s ialah "+jarak+" meter");

	}
}