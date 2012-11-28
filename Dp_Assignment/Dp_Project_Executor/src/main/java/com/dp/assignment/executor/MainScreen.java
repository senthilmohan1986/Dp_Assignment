package com.dp.assignment.executor;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.dp.assignment.abstractFactory.impl.AbstractFactoryExecutorImpl;
import com.dp.assignment.abstractFactory.impl.BuilderExecutorImpl;
import com.dp.assignment.chainOfResp.impl.CorExecutorImpl;
import com.dp.assignment.command.impl.CommandExecutorImpl;
import com.dp.assignment.interfaces.IExecutorPatterns;
import com.dp.assignment.iterator.impl.IteratorExecutorImpl;
import com.dp.assignment.observer.impl.ObserverExecutorImpl;
import com.dp.assignment.observer.impl.StrategyExecutorImpl;

public class MainScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(210, 180, 140));
		frame.setBounds(100, 100, 741, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Observer Pattern\n");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setActionCommand("observer");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 59, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 25, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton, 89, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton, 202, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		rdbtnNewRadioButton.setVerticalAlignment(SwingConstants.TOP);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Iterator Pattern\n");
		rdbtnNewRadioButton_1.setActionCommand("iterator");

		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_1, 0, SpringLayout.WEST, rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JTextPane txtpnChangeGiverAnd = new JTextPane();
		springLayout.putConstraint(SpringLayout.WEST, txtpnChangeGiverAnd, 67, SpringLayout.EAST, rdbtnNewRadioButton_1);
		springLayout.putConstraint(SpringLayout.EAST, txtpnChangeGiverAnd, -127, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_1, 0, SpringLayout.NORTH, txtpnChangeGiverAnd);
		txtpnChangeGiverAnd.setBackground(new Color(255, 235, 205));
		springLayout.putConstraint(SpringLayout.NORTH, txtpnChangeGiverAnd, 114, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnChangeGiverAnd, -387, SpringLayout.SOUTH, frame.getContentPane());
		txtpnChangeGiverAnd.setText("Change Giver and Store Controller objects traverse through \nthe CashStoreItem array in different ways");
		frame.getContentPane().add(txtpnChangeGiverAnd);
		
		JTextArea txtrBasedOnThe = new JTextArea();
		txtrBasedOnThe.setBackground(new Color(255, 235, 205));
		springLayout.putConstraint(SpringLayout.NORTH, txtrBasedOnThe, 3, SpringLayout.NORTH, rdbtnNewRadioButton);
		springLayout.putConstraint(SpringLayout.WEST, txtrBasedOnThe, 0, SpringLayout.WEST, txtpnChangeGiverAnd);
		springLayout.putConstraint(SpringLayout.SOUTH, txtrBasedOnThe, -20, SpringLayout.NORTH, txtpnChangeGiverAnd);
		txtrBasedOnThe.setText("Based on the coin value, Update multiple screens\n");
		frame.getContentPane().add(txtrBasedOnThe);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Builder Pattern");
		rdbtnNewRadioButton_2.setActionCommand("builder");

		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_2, 0, SpringLayout.WEST, rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JTextPane txtpnBuildingComplexUi = new JTextPane();
		springLayout.putConstraint(SpringLayout.WEST, txtpnBuildingComplexUi, 75, SpringLayout.EAST, rdbtnNewRadioButton_2);
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_2, 0, SpringLayout.NORTH, txtpnBuildingComplexUi);
		springLayout.putConstraint(SpringLayout.NORTH, txtpnBuildingComplexUi, 33, SpringLayout.SOUTH, txtpnChangeGiverAnd);
		txtpnBuildingComplexUi.setText("Building complex UI with many user interaction panel");
		txtpnBuildingComplexUi.setBackground(new Color(255, 235, 205));
		frame.getContentPane().add(txtpnBuildingComplexUi);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Command Pattern");
		rdbtnNewRadioButton_3.setActionCommand("command");

		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_3, 0, SpringLayout.WEST, rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JTextPane txtpnSelectedDrinksNeed = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, txtpnSelectedDrinksNeed, 35, SpringLayout.SOUTH, txtpnBuildingComplexUi);
		springLayout.putConstraint(SpringLayout.WEST, txtpnSelectedDrinksNeed, 0, SpringLayout.WEST, txtpnChangeGiverAnd);
		txtpnSelectedDrinksNeed.setText("Available count, dispatch, for selected drink");
		txtpnSelectedDrinksNeed.setBackground(new Color(255, 235, 205));
		frame.getContentPane().add(txtpnSelectedDrinksNeed);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Abstract factory Pattern");
		rdbtnNewRadioButton_4.setActionCommand("abstract");

		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_4, 290, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton_3, -29, SpringLayout.NORTH, rdbtnNewRadioButton_4);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_4, 0, SpringLayout.WEST, rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JTextPane txtpnStartUpOf = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, txtpnStartUpOf, 0, SpringLayout.NORTH, rdbtnNewRadioButton_4);
		springLayout.putConstraint(SpringLayout.WEST, txtpnStartUpOf, 0, SpringLayout.WEST, txtpnChangeGiverAnd);
		txtpnStartUpOf.setText("start up of the application currently expects the initialization \nto be with properties file.");
		txtpnStartUpOf.setBackground(new Color(255, 235, 205));
		frame.getContentPane().add(txtpnStartUpOf);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Strategy Pattern");
		rdbtnNewRadioButton_5.setActionCommand("strategy");

		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_5, 33, SpringLayout.SOUTH, rdbtnNewRadioButton_4);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_5, 0, SpringLayout.WEST, rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JTextPane txtpnApplicationTerminationAction = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, txtpnApplicationTerminationAction, 26, SpringLayout.SOUTH, txtpnStartUpOf);
		springLayout.putConstraint(SpringLayout.WEST, txtpnApplicationTerminationAction, 0, SpringLayout.WEST, txtpnChangeGiverAnd);
		txtpnApplicationTerminationAction.setText("Application termination action is from many end points.");
		txtpnApplicationTerminationAction.setBackground(new Color(255, 235, 205));
		frame.getContentPane().add(txtpnApplicationTerminationAction);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Chain Of Responsibilty");
		rdbtnNewRadioButton_6.setActionCommand("chainOfResponsibility");

		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_6, 38, SpringLayout.SOUTH, rdbtnNewRadioButton_5);
		springLayout.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton_6, 0, SpringLayout.EAST, rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JTextPane txtpnCoinsToBe = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, txtpnCoinsToBe, 0, SpringLayout.NORTH, rdbtnNewRadioButton_6);
		springLayout.putConstraint(SpringLayout.WEST, txtpnCoinsToBe, 0, SpringLayout.WEST, txtpnChangeGiverAnd);
		txtpnCoinsToBe.setText("Coins to be returned to the user in descending order.");
		txtpnCoinsToBe.setBackground(new Color(255, 235, 205));
		frame.getContentPane().add(txtpnCoinsToBe);
		
		JButton btnExecute = new JButton("Execute");
		btnExecute.setBackground(new Color(160, 82, 45));
		springLayout.putConstraint(SpringLayout.SOUTH, btnExecute, -31, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnExecute, -73, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnExecute);
		
		final ButtonGroup groupRadio = new ButtonGroup();
		groupRadio.add(rdbtnNewRadioButton);
		groupRadio.add(rdbtnNewRadioButton_1);
		groupRadio.add(rdbtnNewRadioButton_2);
		groupRadio.add(rdbtnNewRadioButton_3);
		groupRadio.add(rdbtnNewRadioButton_4);
		groupRadio.add(rdbtnNewRadioButton_5);
		groupRadio.add(rdbtnNewRadioButton_6);
		
		btnExecute.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                String actionInvoked = groupRadio.getSelection().getActionCommand();
                IExecutorPatterns patterns = getPattern(actionInvoked);
                if (patterns != null) {
                    patterns.processRequest();
				}else{
					System.out.println("Invalid command .. Check with operator");
				}
                
            }
            
            public IExecutorPatterns getPattern(String patternName){
            	if (patternName.equalsIgnoreCase("observer")) {
					return new ObserverExecutorImpl();
				}else if (patternName.equalsIgnoreCase("abstract")) {
					return new AbstractFactoryExecutorImpl();
				}else if (patternName.equalsIgnoreCase("builder")) {
					return new BuilderExecutorImpl();
				}else if (patternName.equalsIgnoreCase("chainOfResponsibility")) {
					return new CorExecutorImpl();
				}else  if (patternName.equalsIgnoreCase("command")) {
					return new CommandExecutorImpl();
				}else if (patternName.equalsIgnoreCase("iterator")) {
					return new IteratorExecutorImpl();
				}else if (patternName.equalsIgnoreCase("strategy")) {
					return new StrategyExecutorImpl();
				}else{
					return null;
				}
            }
        });      
 

	}
}
