import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	
	public Calculator(){
		
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(250, 150);
		
		JLabel displayLabel=new JLabel("Hello");
		displayLabel.setBounds(20, 40, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		JButton sevenButton=new JButton("7");
		sevenButton.setBounds(20, 100, 80, 80);
		sevenButton.setBackground(Color.white);
		
		
		jf.add(sevenButton);
		
		JButton eightButton=new JButton("8");
		eightButton.setBounds(110, 100, 80, 80);
		eightButton.setBackground(Color.white);
		jf.add(eightButton);
		
		JButton nineButton=new JButton("9");
		nineButton.setBounds(200, 100, 80, 80);
		nineButton.setBackground(Color.white);
		jf.add(nineButton);
		
		
		
		JButton fourButton=new JButton("4");
		fourButton.setBounds(20, 195, 80, 80);
		fourButton.setBackground(Color.white);
		jf.add(fourButton);
		
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(110, 195, 80, 80);
		fiveButton.setBackground(Color.white);
		jf.add(fiveButton);
		
		JButton sixButton=new JButton("6");
		sixButton.setBounds(200, 195, 80, 80);
		sixButton.setBackground(Color.white);
		jf.add(sixButton);
		
		
		JButton oneButton=new JButton("1");
		oneButton.setBounds(20, 290, 80, 80);
		oneButton.setBackground(Color.white);
		jf.add(oneButton);
		
		JButton twoButton=new JButton("2");
		twoButton.setBounds(110, 290, 80, 80);
		twoButton.setBackground(Color.white);
		jf.add(twoButton);
		
		JButton threeButton=new JButton("3");
		threeButton.setBounds(200, 290, 80, 80);
		threeButton.setBackground(Color.white);
		jf.add(threeButton);
		
		
		JButton dotButton=new JButton(".");
		dotButton.setBounds(20, 385, 80, 80);
		dotButton.setBackground(Color.white);
		jf.add(dotButton);
		
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(110, 385, 80, 80);
		zeroButton.setBackground(Color.white);
		jf.add(zeroButton);
		
		JButton equelButton=new JButton("=");
		equelButton.setBounds(200, 385, 80, 80);
		equelButton.setBackground(Color.white);
		jf.add(equelButton);
		
		JButton divButton=new JButton("/");
		divButton.setBounds(290, 100, 80, 80);
		divButton.setBackground(Color.white);
		jf.add(divButton);
		
		JButton mulButton=new JButton("x");
		mulButton.setBounds(290, 195, 80, 80);
		mulButton.setBackground(Color.white);
		jf.add(mulButton);
		
		JButton subButton=new JButton("-");
		subButton.setBounds(290, 290, 80, 80);
		subButton.setBackground(Color.white);
		jf.add(subButton);
		
		JButton addButton=new JButton("+");
		addButton.setBounds(290, 385, 80, 80);
		addButton.setBackground(Color.white);
		jf.add(addButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Calculator(); 
		//Calculator c=new Calculator(), c not used so only need new Calculator()
	}

}
