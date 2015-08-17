// Avraham Moryosef
// CS 420
// 6/9/15

package money;

import java.text.DecimalFormat;

public class Monthly_Payment
{
	public static void main(String[] args)
	{
		DecimalFormat twoDigits = new DecimalFormat("0.00");
		
		// input to be hard coded 
		double loan = 82900,
			   apr = 9.5,
			   years = 15;
        
        System.out.println("The loan amount entered was $" + loan);
        
        System.out.println("The APR entered was " + apr + "%");
        
        System.out.println("The number of years entered was " + years);
        
        System.out.println("The monthly payment is $" + 
                twoDigits.format(moPmt(loan, apr, years)));
        
	}
	
	// method to calculate monthly payment
	public static double moPmt(double loan, double apr, double years)
	{
		years = years * 12;
		apr = apr / 100;
		double pow = 1 + (apr / 12);  // pow = power
		
		double pay = loan / (((1 - Math.pow(pow, (-years)))) / (apr / 12));
		
		return pay;
	}
}

