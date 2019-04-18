package com.restaurant.Restaurant;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import java.awt.TextField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseMotionAdapter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.MouseEvent;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OO_Restaurant extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Tax;
	private JTextField textField_SubTotal;
	private JTextField textField_Total;
	private JTextField textField_FrenchFry;
	private JTextField textField_ChickenFry;
	private JTextField textField_GarlicChicken;
	private JTextField textField_TotalCostOfItems;
	private JTextField textField_CostOfDrinks;
	private JTextField textField_CostOfMeals;
	private JTextField textField_FrideRice;
	private JTextField textField_ChickenBurger;
	private JTextField textField_MilkShake;
	private JTextField textField_VanillaMilkShake;
	private JTextField textField_ChocolateMilkShake;
	private JTextField textField_StoberryMilkShake;
	private JTextField textField_ColdChocolateCoffee;

	/**
	 * Launch the application.
	 * 
	 * @throws UnsupportedLookAndFeelException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}

		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(OO_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
			// TODO: handle exception
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(OO_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
			// TODO: handle exception
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(OO_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
			// TODO: handle exception
		}
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new OO_Restaurant().setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OO_Restaurant() {
		JFrame frame;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 491);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setForeground(Color.DARK_GRAY);
		panel.setBorder(new LineBorder(new Color(220, 20, 60), 8));
		panel.setBounds(10, 11, 754, 83);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel RMSicon = new JLabel("");
		RMSicon.setBounds(47, 11, 60, 61);
		panel.add(RMSicon);
		RMSicon.setIcon(new ImageIcon("G:\\Naztech\\java\\Restaurant\\Restaurant\\image\\RMSI.png"));

		JLabel RMS = new JLabel(" Restaurant Management System");
		RMS.setBounds(100, 0, 583, 72);
		RMS.setBackground(new Color(0, 255, 255));
		RMS.setHorizontalAlignment(SwingConstants.CENTER);
		RMS.setFont(new Font("Tahoma", Font.BOLD, 35));
		RMS.setForeground(new Color(0, 255, 255));
		panel.add(RMS);

		final JPanel panel_Meals = new JPanel();
		panel_Meals.setBackground(new Color(175, 238, 238));
		panel_Meals.setForeground(new Color(175, 238, 238));
		panel_Meals.setBorder(new LineBorder(new Color(175, 238, 238), 8));
		panel_Meals.setBounds(10, 105, 250, 164);
		contentPane.add(panel_Meals);
		panel_Meals.setLayout(null);

		JLabel lblGarlicChicken = new JLabel("Garlic Chicken");
		lblGarlicChicken.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGarlicChicken.setBounds(22, 35, 149, 14);
		panel_Meals.add(lblGarlicChicken);

		JLabel lblChickenFry = new JLabel("Chicken Fry");
		lblChickenFry.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChickenFry.setBounds(22, 60, 149, 14);
		panel_Meals.add(lblChickenFry);

		JLabel lblFrenchFry = new JLabel("French Fry");
		lblFrenchFry.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFrenchFry.setBounds(22, 83, 149, 14);
		panel_Meals.add(lblFrenchFry);

		textField_FrenchFry = new JTextField();
		textField_FrenchFry.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_FrenchFry.setText("0");
		textField_FrenchFry.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FrenchFry.setColumns(10);
		textField_FrenchFry.setBounds(181, 81, 46, 20);
		panel_Meals.add(textField_FrenchFry);

		textField_ChickenFry = new JTextField();
		textField_ChickenFry.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ChickenFry.setText("0");
		textField_ChickenFry.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_ChickenFry.setColumns(10);
		textField_ChickenFry.setBounds(181, 54, 46, 20);
		panel_Meals.add(textField_ChickenFry);

		textField_GarlicChicken = new JTextField();
		textField_GarlicChicken.setHorizontalAlignment(SwingConstants.CENTER);
		textField_GarlicChicken.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_GarlicChicken.setText("0");
		textField_GarlicChicken.setColumns(10);
		textField_GarlicChicken.setBounds(181, 29, 46, 20);
		panel_Meals.add(textField_GarlicChicken);

		JLabel lblMeals = new JLabel("Meals");
		lblMeals.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMeals.setBounds(93, 11, 46, 14);
		panel_Meals.add(lblMeals);

		JLabel lblFrideRice = new JLabel("Fride Rice");
		lblFrideRice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFrideRice.setBounds(22, 108, 149, 14);
		panel_Meals.add(lblFrideRice);

		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChickenBurger.setBounds(22, 133, 149, 14);
		panel_Meals.add(lblChickenBurger);

		textField_FrideRice = new JTextField();
		textField_FrideRice.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_FrideRice.setText("0");
		textField_FrideRice.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FrideRice.setColumns(10);
		textField_FrideRice.setBounds(181, 106, 46, 20);
		panel_Meals.add(textField_FrideRice);

		textField_ChickenBurger = new JTextField();
		textField_ChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_ChickenBurger.setText("0");
		textField_ChickenBurger.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ChickenBurger.setColumns(10);
		textField_ChickenBurger.setBounds(181, 131, 46, 20);
		panel_Meals.add(textField_ChickenBurger);

		final JPanel panel_Drinks = new JPanel();
		panel_Drinks.setBackground(new Color(175, 238, 238));
		panel_Drinks.setForeground(new Color(175, 238, 238));
		panel_Drinks.setBorder(new LineBorder(new Color(175, 238, 238), 8));
		panel_Drinks.setBounds(270, 105, 234, 158);
		contentPane.add(panel_Drinks);
		panel_Drinks.setLayout(null);

		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDrinks.setBounds(74, 11, 46, 14);
		panel_Drinks.add(lblDrinks);

		textField_MilkShake = new JTextField();
		textField_MilkShake.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_MilkShake.setText("0");
		textField_MilkShake.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MilkShake.setColumns(10);
		textField_MilkShake.setBounds(169, 25, 46, 20);
		panel_Drinks.add(textField_MilkShake);

		textField_VanillaMilkShake = new JTextField();
		textField_VanillaMilkShake.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_VanillaMilkShake.setText("0");
		textField_VanillaMilkShake.setHorizontalAlignment(SwingConstants.CENTER);
		textField_VanillaMilkShake.setColumns(10);
		textField_VanillaMilkShake.setBounds(169, 50, 46, 20);
		panel_Drinks.add(textField_VanillaMilkShake);

		textField_ChocolateMilkShake = new JTextField();
		textField_ChocolateMilkShake.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_ChocolateMilkShake.setText("0");
		textField_ChocolateMilkShake.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ChocolateMilkShake.setColumns(10);
		textField_ChocolateMilkShake.setBounds(169, 77, 46, 20);
		panel_Drinks.add(textField_ChocolateMilkShake);

		textField_StoberryMilkShake = new JTextField();
		textField_StoberryMilkShake.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_StoberryMilkShake.setText("0");
		textField_StoberryMilkShake.setHorizontalAlignment(SwingConstants.CENTER);
		textField_StoberryMilkShake.setColumns(10);
		textField_StoberryMilkShake.setBounds(169, 102, 46, 20);
		panel_Drinks.add(textField_StoberryMilkShake);

		textField_ColdChocolateCoffee = new JTextField();
		textField_ColdChocolateCoffee.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_ColdChocolateCoffee.setText("0");
		textField_ColdChocolateCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ColdChocolateCoffee.setColumns(10);
		textField_ColdChocolateCoffee.setBounds(169, 127, 46, 20);
		panel_Drinks.add(textField_ColdChocolateCoffee);

		JLabel lblColdChocolateCoffee = new JLabel("Cold Chocolate Coffee");
		lblColdChocolateCoffee.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblColdChocolateCoffee.setBounds(10, 129, 149, 14);
		panel_Drinks.add(lblColdChocolateCoffee);

		JLabel lblStoberryMilkShake = new JLabel("Stoberry Milk Shake");
		lblStoberryMilkShake.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStoberryMilkShake.setBounds(10, 104, 149, 14);
		panel_Drinks.add(lblStoberryMilkShake);

		JLabel lblChocolateMilkShake = new JLabel("Chocolate Milk Shake");
		lblChocolateMilkShake.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChocolateMilkShake.setBounds(10, 79, 136, 14);
		panel_Drinks.add(lblChocolateMilkShake);

		JLabel lblVanila = new JLabel("Vanilla Milk Shake");
		lblVanila.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVanila.setBounds(10, 56, 136, 14);
		panel_Drinks.add(lblVanila);

		JLabel lblMilkShake = new JLabel("Milk Shake");
		lblMilkShake.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMilkShake.setBounds(10, 31, 136, 14);
		panel_Drinks.add(lblMilkShake);

		JPanel panel_ReceiptTextField = new JPanel();
		panel_ReceiptTextField.setForeground(new Color(175, 238, 238));
		panel_ReceiptTextField.setBackground(new Color(175, 238, 238));
		panel_ReceiptTextField.setBorder(new LineBorder(new Color(175, 238, 238), 8));
		panel_ReceiptTextField.setBounds(514, 105, 250, 329);
		contentPane.add(panel_ReceiptTextField);
		panel_ReceiptTextField.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(96, 89, -76, 79);
		panel_ReceiptTextField.add(textArea);
		
		final JTextArea textArea_Receipt = new JTextArea();
		textArea_Receipt.setBackground(new Color(175, 238, 238));
		textArea_Receipt.setForeground(new Color(0, 0, 0));
		textArea_Receipt.setWrapStyleWord(true);
		textArea_Receipt.setLineWrap(true);
		textArea_Receipt.setBounds(10, 11, 230, 307);
		panel_ReceiptTextField.add(textArea_Receipt);

		final JPanel panel_cost = new JPanel();
		panel_cost.setBackground(new Color(175, 238, 238));
		panel_cost.setForeground(new Color(175, 238, 238));
		panel_cost.setBorder(new LineBorder(new Color(175, 238, 238), 8));
		panel_cost.setBounds(10, 274, 250, 100);
		contentPane.add(panel_cost);
		panel_cost.setLayout(null);

		JLabel lblCostOfMeals = new JLabel("Cost of Meals");
		lblCostOfMeals.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCostOfMeals.setBounds(20, 16, 102, 14);
		panel_cost.add(lblCostOfMeals);

		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCostOfDrinks.setBounds(20, 41, 102, 14);
		panel_cost.add(lblCostOfDrinks);

		JLabel lblTotalCostOfItems = new JLabel("Total Cost of Items");
		lblTotalCostOfItems.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalCostOfItems.setBounds(20, 64, 126, 14);
		panel_cost.add(lblTotalCostOfItems);

		textField_TotalCostOfItems = new JTextField();
		textField_TotalCostOfItems.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_TotalCostOfItems.setColumns(10);
		textField_TotalCostOfItems.setBounds(156, 62, 77, 20);
		panel_cost.add(textField_TotalCostOfItems);

		textField_CostOfDrinks = new JTextField();
		textField_CostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_CostOfDrinks.setColumns(10);
		textField_CostOfDrinks.setBounds(156, 39, 77, 20);
		panel_cost.add(textField_CostOfDrinks);

		textField_CostOfMeals = new JTextField();
		textField_CostOfMeals.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_CostOfMeals.setColumns(10);
		textField_CostOfMeals.setBounds(156, 14, 77, 20);
		panel_cost.add(textField_CostOfMeals);

		final JPanel panel_total = new JPanel();
		panel_total.setBackground(new Color(175, 238, 238));
		panel_total.setForeground(new Color(175, 238, 238));
		panel_total.setBorder(new LineBorder(new Color(175, 238, 238), 8));
		panel_total.setBounds(270, 274, 234, 100);
		contentPane.add(panel_total);
		panel_total.setLayout(null);

		textField_SubTotal = new JTextField();
		textField_SubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_SubTotal.setBounds(115, 38, 98, 20);
		textField_SubTotal.setColumns(10);
		panel_total.add(textField_SubTotal);

		textField_Tax = new JTextField();
		textField_Tax.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_Tax.setBounds(115, 13, 98, 20);
		panel_total.add(textField_Tax);
		textField_Tax.setColumns(10);

		textField_Total = new JTextField();
		textField_Total.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_Total.setColumns(10);
		textField_Total.setBounds(115, 61, 98, 20);
		panel_total.add(textField_Total);

		JLabel TaxLabel = new JLabel("Vat");
		TaxLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		TaxLabel.setBounds(23, 16, 46, 14);
		panel_total.add(TaxLabel);

		JLabel SubTotalLabel = new JLabel("SubTotal");
		SubTotalLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		SubTotalLabel.setBounds(23, 41, 64, 14);
		panel_total.add(SubTotalLabel);

		JLabel TotalLabel = new JLabel("Total");
		TotalLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		TotalLabel.setBounds(23, 64, 46, 14);
		panel_total.add(TotalLabel);

		JPanel panel_batton = new JPanel();
		panel_batton.setBackground(new Color(175, 238, 238));
		panel_batton.setForeground(new Color(175, 238, 238));
		panel_batton.setBorder(new LineBorder(new Color(175, 238, 238), 8));
		panel_batton.setBounds(10, 385, 494, 49);
		contentPane.add(panel_batton);
		panel_batton.setLayout(null);

		JButton btnTotal = new JButton("Total");
		btnTotal.setBackground(new Color(0,139,139));
		btnTotal.setForeground(new Color(250,0,0));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SubClass_Child ItemCost = new SubClass_Child();

				double iTax, iSubTotal, iTotal;

				ItemCost.GarlicChicken = ItemCost.pGarlicChicken
						* Double.parseDouble(textField_GarlicChicken.getText());
				ItemCost.ChickenFry = ItemCost.pChickenFry * Double.parseDouble(textField_ChickenFry.getText());
				ItemCost.FrenchFry = ItemCost.pFrenchFry * Double.parseDouble(textField_FrenchFry.getText());
				ItemCost.FrideRice = ItemCost.pFrideRice * Double.parseDouble(textField_FrideRice.getText());
				ItemCost.ChickenBurger = ItemCost.pChickenBurger
						* Double.parseDouble(textField_ChickenBurger.getText());

				ItemCost.MilkShake = ItemCost.pMilkShake * Double.parseDouble(textField_MilkShake.getText());
				ItemCost.VanillaMilkShake = ItemCost.pVanillaMilkShake
						* Double.parseDouble(textField_VanillaMilkShake.getText());
				ItemCost.ChocolateMilkShake = ItemCost.ChocolateMilkShake
						* Double.parseDouble(textField_ChocolateMilkShake.getText());
				ItemCost.StoberryMilkShake = ItemCost.StoberryMilkShake
						* Double.parseDouble(textField_StoberryMilkShake.getText());
				ItemCost.ColdChocolateCoffee = ItemCost.pColdChocolateCoffee
						* Double.parseDouble(textField_ColdChocolateCoffee.getText());

				iSubTotal = ItemCost.GetAmount();
				iTax = ItemCost.cFindTax(iSubTotal);
				iTotal = iSubTotal + iTax;

				String SubToTal = String.format("%.2f/=", iSubTotal);
				textField_SubTotal.setText(SubToTal);

				String Tax = String.format("%.2f/=", iTax);
				textField_Tax.setText(Tax);

				String ToTal = String.format("%.2f/=", iTotal);
				textField_Total.setText(ToTal);
				
				String Meal = String.format("%.2f/=", ItemCost.Meals);
				textField_CostOfMeals.setText(Meal);
				
				String Drink = String.format("%.2f/=", ItemCost.Drinks);
				textField_CostOfDrinks.setText(Drink);
				
				String ToTalCost = String.format("%.2f/=", ItemCost.TotalofMade);
				textField_TotalCostOfItems.setText(ToTalCost);
				
			}
		});
		btnTotal.setBounds(10, 13, 75, 23);
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_batton.add(btnTotal);

		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.setForeground(new Color(255, 0, 0));
		btnReceipt.setBackground(new Color(0, 128, 128));
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int refs = 1325 + (int)(Math.random()*4238);
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("dd-mm-yyyy");
				tDate.format(timer.getTime());
				
				String a = ("Restaurant Management Systems\n" + "Reference:\t"+refs+
						"\n===========================\n"+
						"Meals:\t\t"+textField_CostOfMeals.getText()+"\n"+
						"Drinks:\t\t"+textField_CostOfDrinks.getText()+"\n"+
						"Cost of Items:\t"+textField_TotalCostOfItems.getText()+"\n"+
						"==========================="+
						"\nVat:\t\t"+textField_Tax.getText()+
						"\nSubTotal:\t"+textField_SubTotal.getText()+
						"\nTotal:\t\t"+textField_Total.getText()+
						"\n=========================="+
						"\nDate: "+ tDate.format(timer.getTime())+
						"\tTime: "+ tTime.format(timer.getTime())+
						"\n\tThank You"
						);
				textArea_Receipt.append(a);
			
			}
		});
		btnReceipt.setBounds(180, 13, 87, 23);
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_batton.add(btnReceipt);

		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(0, 128, 128));
		btnReset.setForeground(new Color(255, 0, 0));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField cleartext = null;

				for (Component c : panel_Drinks.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("0");

					}
				}

				for (Component c : panel_Meals.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("0");

					}
				}

				for (Component c : panel_cost.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("");

					}
				}

				for (Component c : panel_total.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("");

					}
				}

				textArea_Receipt.setText(null);
			}
		});
		btnReset.setBounds(95, 13, 75, 23);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_batton.add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setBackground(new Color(0, 128, 128));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SubClass_Child iExit = new SubClass_Child();
				iExit.iExitSystem();
			}
		});
		btnExit.setBounds(420, 13, 64, 23);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_batton.add(btnExit);
		
		JButton btnPrintReceipt = new JButton("Print Receipt");
		btnPrintReceipt.setBackground(new Color(0, 128, 128));
		btnPrintReceipt.setForeground(new Color(255, 0, 0));
		btnPrintReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textArea_Receipt.print();
				}catch (Exception exc) {
					// TODO: handle exception
				}
			}
		});
		btnPrintReceipt.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPrintReceipt.setBounds(285, 13, 125, 23);
		panel_batton.add(btnPrintReceipt);
	}
}
