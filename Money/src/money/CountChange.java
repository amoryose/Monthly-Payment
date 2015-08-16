// Avraham Moryosef
// CS 420
// 5/31/15

package money;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CountChange
{
	public static void main(String[] args)
	{
		DecimalFormat twoDigits = new DecimalFormat("0.00");
		
		String inputPenny,
			   inputNickel,
			   inputDime,
			   inputQuarter,
			   str;
		
		double p, // penny
			   n, // nickel
			   d, // dime
			   q, // quarter
			   dollar; // dollar amount
		
		inputPenny = JOptionPane.showInputDialog ("Enter the number of pennies: ");
		p = Double.parseDouble(inputPenny);		
		
		inputNickel = JOptionPane.showInputDialog ("Enter the number of nickels: ");
		n = Double.parseDouble(inputNickel);
				
		inputDime = JOptionPane.showInputDialog ("Enter the number of dimes: ");
		d = Double.parseDouble(inputDime);
				
		inputQuarter = JOptionPane.showInputDialog ("Enter the number of quarters: ");
		q = Double.parseDouble(inputQuarter);
				
		dollar = (p + n*5 + d*10 + q*25) / 100.0;
		 
		 str = "The total value of " + Math.round(p) + 
				 (p == 1 ? " penny," : " pennies,");
		 
		 str = str + "\n " + (int)n + 
				 (n == 1 ? " nickel," : " nickels,");
		 
		 str = str + " " + (int)d +
				 (d == 1 ? " dime," : " dimes,");
		 
		 str = str + " and " + (int)q + 
				 (q == 1 ? " quarter" : " quarters");
		 
		 str = str + " is $" + twoDigits.format(dollar);
		
		 JOptionPane.showMessageDialog(null, str, "Results",
				 JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);		

	}
}
