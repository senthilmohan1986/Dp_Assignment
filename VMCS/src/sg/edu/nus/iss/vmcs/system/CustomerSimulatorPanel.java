package sg.edu.nus.iss.vmcs.system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import sg.edu.nus.iss.vmcs.customer.CoinReceiver;
import sg.edu.nus.iss.vmcs.customer.ObserverLabel;
import sg.edu.nus.iss.vmcs.store.Coin;

public class CustomerSimulatorPanel extends JPanel{

	public CustomerSimulatorPanel(final CoinReceiver sub) {
		
		
		
        JLabel label1, label2;
        
        JPanel chummaPanel =  new ObserverLabel("Invalid label", sub) {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void update(boolean status, Coin o) {
				if(status == true){
					System.out.println("success");
					this.getLabel().setBackground(Color.orange);
					this.getLabel().setText("Success");
					this.getLabel().setOpaque(true);
					
					//this.getParent().setBackground(Color.ORANGE);
				//	add(this.getLabel());
					this.getParent().repaint();
				}
				
			}
		};
        
        JButton button = new JButton("Enter Value");
        button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sub.ReceiveCoin(35.0);
			}
		});
        
      /*  label.setName("Invalid Coin");
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setBackground(Color.orange);
		label.setOpaque(true);*/
		

        label1 = new JLabel("Image and Text",
                            JLabel.CENTER);
        //Set the position of its text, relative to its icon:
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setBackground(Color.darkGray);
        label1.setOpaque(true);
        //Create the other labels.
        label2 = new JLabel("Text-Only Label");

        //Create tool tips, for the heck of it.
     //   label1.setToolTipText("A label containing both image and text");
      //  label2.setToolTipText("A label containing only text");

        //Add the labels.
        add(label1);
        add(label2);
        add(chummaPanel);
        add(button);
	}
	
	public void display() {
		JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("SwingLabelDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
      // this.setOpaque(true); //content panes must be opaque
        frame.setContentPane(this);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
}
