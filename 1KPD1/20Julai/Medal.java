class Medal
{
	public static void main(String args[])
	{
		String kon1="Gamma";
		String kon2="Alpha";
		String kon3="Stigma";
		String kon4="Beta";
		int jum_kon=4;

		int emas1=34;
		int perak1=12;
		int gangsa1=21;
		int jum1=emas1+perak1+gangsa1;

		int emas2=23;
		int perak2=1;
		int gangsa2=32;
		int jum2=emas2+perak2+gangsa2;

		int emas3=23;
		int perak3=1;
		int gangsa3=32;
		int jum3=emas3+perak3+gangsa3;

		int emas4=23;
		int perak4=1;
		int gangsa4=32;
		int jum4=emas4+perak4+gangsa4;

		int jum_pingat=jum1+jum2+jum3+jum4;
		double pur_pingat=jum_pingat;
		double per_pingat=jum_pingat*100/jum_pingat;

		int jum_emas=emas1+emas2+emas3+emas4;
		int jum_perak=emas1+emas2+emas3+emas4;
		int jum_gangsa=emas1+emas2+emas3+emas4;
		double pur_emas=jum_emas/3;
		double pur_perak=jum_perak/3;
		double pur_gangsa=jum_gangsa/3;

		double per_emas=jum_emas*100/jum_pingat;
		double per_perak=jum_perak*100/jum_pingat;
		double per_gangsa=jum_gangsa*100/jum_pingat;

		System.out.println("Kontinjen\tPingat\t\t\t\t\t\tJumlah");
		System.out.println("\t\t\t\tEmas\tPerak\tGangsa");
		System.out.println(kon1+"\t\t"+emas1+"\t\t"+perak1+"\t\t"+gangsa1+"\t\t"+jum1);
		System.out.println(kon2+"\t\t"+emas2+"\t\t"+perak2+"\t\t"+gangsa2+"\t\t"+jum2);
		System.out.println(kon3+"\t\t"+emas3+"\t\t"+perak3+"\t\t"+gangsa3+"\t\t"+jum3);
		System.out.println(kon4+"\t\t"+emas4+"\t\t"+perak4+"\t\t"+gangsa4+"\t\t"+jum4);
		System.out.println("Jum Pingat\t\t"+jum_emas+"\t\t"+jum_perak+"\t\t"+jum_gangsa+"\t\t"+jum_pingat);
		System.out.println("Pur Pingat\t\t"+pur_emas+"\t\t"+pur_perak+"\t\t"+pur_gangsa+"\t\t"+pur_pingat);
		System.out.println("Per Pingat\t\t"+per_emas+"\t\t"+per_perak+"\t\t"+per_gangsa+"\t\t"+per_pingat);
	}
}