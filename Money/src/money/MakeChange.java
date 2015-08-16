// Avraham Moryosef
// CS 420
// 5/31/15

package money;

import javax.swing.JOptionPane;

public class MakeChange
{

	public static void main(String[] args)
	{
		String inputAmount, // dollar amount to change
			   str; // output string
		
		double amount;
		
		int	   dollars, // dollar amount
			   q, // quarters
			   d, // dimes
			   n, // nickels
			   p, // pennies
			   remainder; // modulus			
		
		inputAmount = JOptionPane.showInputDialog ("Enter your dollar amount: ");
		amount = Double.parseDouble(inputAmount);
		remainder = (int) (amount * 100);
		
		dollars = remainder / 100;
		remainder = remainder % 100;
		
		q = remainder / 25;
		remainder = remainder % 25;
		
		d = remainder / 10;
		remainder = remainder % 10;
		
		n = remainder / 5;
		remainder = remainder % 5;
		
		p = remainder;
		
		
		str = "The correct change for $" + amount + " is ";
		
		if(dollars != 0)
		{
		str = str + dollars +
				 (dollars == 1 ? " dollar," : " dollars, ");
		}
		
		if(q != 0)
		{
		 str = str + "\n " + q +  
				 (q == 1 ? " quarter, " : " quarters, ");
		}
		
		if(d != 0)
		{	
		 str = str + d +
				 (d == 1 ? " dime, " : " dimes, ");
		}
		
		if(n != 0)
		{
		 str = str + n + 
				 (n == 1 ? " nickel, " : " nickels, ");
		}
		
		if(p != 0)
		{
		 str = str + p +
				 (p == 1 ? " penny." : " pennies.");
		}
		
		JOptionPane.showMessageDialog(null, str, "Results",
				 JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
