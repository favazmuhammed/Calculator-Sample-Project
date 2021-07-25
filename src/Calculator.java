import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	
	boolean isOperateClicked=false;
	boolean isAddClicked=false;
	boolean isSubClicked=false;
	boolean isMultClicked=false;
	boolean isDivClicked=false;
	boolean isEquelsClicked=false;
	
	
	String oldValue;
	
	JFrame jf;
	JLabel displayLabel;
	JButton fiveButton, sixButton, sevenButton, eightButton, nineButton;
	JButton zeroButton, oneButton, twoButton, threeButton, fourButton;
	JButton dotButton, equelButton, clearButton;
	JButton divButton, mulButton, subButton, addButton;
	
	
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
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(290, 195, 80, 80);
		mulButton.setBackground(Color.white);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		subButton=new JButton("-");
		subButton.setBounds(290, 290, 80, 80);
		subButton.setBackground(Color.white);
		subButton.setFont(new Font("Arial", Font.PLAIN, 40));
		subButton.addActionListener(this);
		jf.add(subButton);
		
		addButton=new JButton("+");
		addButton.setBounds(290, 385, 80, 80);
		addButton.setBackground(Color.white);
		addButton.setFont(new Font("Arial", Font.PLAIN, 40));
		addButton.addActionListener(this);
		jf.add(addButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(380, 385, 120, 80);
		clearButton.setBackground(Color.white);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
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
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("0");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource()==oneButton){
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("1");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()==twoButton) {
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("2");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()==threeButton) {
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("3");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if(e.getSource()==fourButton) {
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("4");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()==fiveButton) {
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("5");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()==sixButton) {
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("6");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource()==sevenButton) {
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("7");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}else if(e.getSource()==eightButton) {
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("8");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}else if(e.getSource()==nineButton) {
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("9");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
			
		}else if(e.getSource()==equelButton) {
			isEquelsClicked=true;
			float newValue=Float.parseFloat(displayLabel.getText());
			float oldValueF=Float.parseFloat(oldValue);
			
			if(isAddClicked) {
				float result = newValue+oldValueF;
				displayLabel.setText(result+"");
				isAddClicked=false;
			}else if(isSubClicked) {
				float result = oldValueF-newValue;
				displayLabel.setText(result+"");
				isSubClicked=false;
			}else if(isMultClicked){
				float result = oldValueF * newValue;
				displayLabel.setText(result+"");
				isMultClicked=false;
			}else if(isDivClicked) {
				
				if(newValue==0) {
					displayLabel.setText("Syntax Error!!!");
					
				}else {
					float result = oldValueF / newValue;
					displayLabel.setText(result+"");
					isDivClicked=false;
				}	
			}
			
		}else if(e.getSource()==divButton) {
			isOperateClicked=true;
			isDivClicked=true;
			oldValue=displayLabel.getText();
			
		}else if(e.getSource()==mulButton) {
			isOperateClicked=true;
			isMultClicked=true;
			oldValue=displayLabel.getText();
			
		}else if(e.getSource()==subButton) {
			isOperateClicked=true;
			isSubClicked=true;
			oldValue=displayLabel.getText();
			
		}else if(e.getSource()==addButton) {
			isOperateClicked=true;
			isAddClicked=true;
			oldValue=displayLabel.getText();
			
			
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");	
		}
		
		
		
		
		
	}

}
