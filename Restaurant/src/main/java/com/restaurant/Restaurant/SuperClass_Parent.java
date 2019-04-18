package com.restaurant.Restaurant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SuperClass_Parent {

	public double GarlicChicken;
	public double ChickenFry;
	public double FrenchFry;
	public double FrideRice;
	public double ChickenBurger;

	public double MilkShake;
	public double VanillaMilkShake;
	public double ChocolateMilkShake;
	public double StoberryMilkShake;
	public double ColdChocolateCoffee;

	public double Meals;
	public double Drinks;
	public double TotalofMade;

	public double AllTotalofMade;

	public double GetAmount() {
		Meals = GarlicChicken + ChickenFry + FrenchFry + FrideRice + ChickenBurger;
		Drinks = MilkShake + VanillaMilkShake + ChocolateMilkShake + StoberryMilkShake + ColdChocolateCoffee;
		TotalofMade = Meals + Drinks;
		AllTotalofMade = TotalofMade;
		return AllTotalofMade;
	}

	private JFrame frame;

	public void iExitSystem() {
		frame = new JFrame("Exit");

		if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Restaurant Management Systems",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}
	}

	public double pGarlicChicken = 110.0;
	public double pChickenFry = 90.0;
	public double pFrenchFry = 60.0;
	public double pFrideRice = 250.0;
	public double pChickenBurger = 180.0;

	public double pMilkShake = 110.0;
	public double pVanillaMilkShake = 120.0;
	public double pChocolateMilkShake = 140.0;
	public double pStoberryMilkShake = 150.0;
	public double pColdChocolateCoffee = 130.0;

	public double mcTax = 0.85;
	
	public Double cFindTax (double cAmount) {
		double FindTax = cAmount - (cAmount * mcTax);
		return FindTax;
	}
}
















