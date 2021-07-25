import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equelButton;
	JButton divButton;
	JButton mulButton;
	JButton subButton;
	JButton addButton;
	
	public Calculator(){
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(250, 150);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(20, 20, 540, 60);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(20, 100, 80, 80);
		sevenButton.setBackground(Color.white);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(110, 100, 80, 80);
		eightButton.setBackground(Color.white);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(200, 100, 80, 80);
		nineButton.setBackground(Color.white);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		
		
		fourButton=new JButton("4");
		fourButton.setBounds(20, 195, 80, 80);
		fourButton.setBackground(Color.white);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(110, 195, 80, 80);
		fiveButton.setBackground(Color.white);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(200, 195, 80, 80);
		sixButton.setBackground(Color.white);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		
		oneButton=new JButton("1");
		oneButton.setBounds(20, 290, 80, 80);
		oneButton.setBackground(Color.white);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(110, 290, 80, 80);
		twoButton.setBackground(Color.white);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(200, 290, 80, 80);
		threeButton.setBackground(Color.white);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(20, 385, 80, 80);
		dotButton.setBackground(Color.white);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(110, 385, 80, 80);
		zeroButton.setBackground(Color.white);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equelButton=new JButton("=");
		equelButton.setBounds(200, 385, 80, 80);
		equelButton.setBackground(Color.white);
		equelButton.setFont(new Font("Arial", Font.PLAIN, 40));
		equelButton.addActionListener(this);
		jf.add(equelButton);
		
		divButton=new JButton("/");
		divButton.setBounds(290, 100, 80, 80);
		divButton.setBackground(Color.white);
		divButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(290, 195, 80, 80);
		mulButton.setBackground(Color.white);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(mulButton);
		
		subButton=new JButton("-");
		subButton.setBounds(290, 290, 80, 80);
		subButton.setBackground(Color.white);
		subButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(subButton);
		
		addButton=new JButton("+");
		addButton.setBounds(290, 385, 80, 80);
		addButton.setBackground(Color.white);
		addButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(addButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Calculator(); 
		//Calculator c=new Calculator(), c not used so only need new Calculator()
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==zeroButton) {
			displayLabel.setText("0");	
		}else if(e.getSource()==oneButton){
			displayLabel.setText("1");
		}else if(e.getSource()==twoButton) {
			displayLabel.setText("2");
		}else if(e.getSource()==threeButton) {
			displayLabel.setText("3");
		}else if(e.getSource()==fourButton) {
			displayLabel.setText("4");
		}else if(e.getSource()==fiveButton) {
			displayLabel.setText("5");
		}else if(e.getSource()==sixButton) {
			displayLabel.setText("6");
		}else if(e.getSource()==sevenButton) {
			displayLabel.setText("7");
		}else if(e.getSource()==eightButton) {
			displayLabel.setText("8");
		}else if(e.getSource()==nineButton) {
			displayLabel.setText("9");
		}else if(e.getSource()==dotButton) {
			
		}else if(e.getSource()==equelButton) {
			
		}else if(e.getSource()==divButton) {
			
		}else if(e.getSource()==mulButton) {
			
		}else if(e.getSource()==subButton) {
			
		}else if(e.getSource()==addButton) {
			
		}
		
		
		
		
		
		
	}

}
