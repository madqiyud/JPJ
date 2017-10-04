import java.util.Scanner;
import javax.swing.JOptionPane;
class prompt
{
	public static void main(String args[])
	{
		int a=1+(int)(Math.random()*10);
		int guess=0;
		int count=0;

		while(guess!=a)
		{
			guess=Integer.parseInt(JOptionPane.showInputDialog("TEKA NOMBOR 1-9 !! \nMasukkan nombor tekaan anda"));
			count++;
			if (guess>a) {
				JOptionPane.showInputDialog(null,"Nombor ke bawah sedikit");
			}
			else if(guess<a)
			{
				JOptionPane.showInputDialog(null,"Nombor ke depan sedikit");
			}
		}

		JOptionPane.showInputDialog(null,"TAHNIAH!! \nTekaan  nombor anda tepat dengan "+count+" cubaan");

	}
}