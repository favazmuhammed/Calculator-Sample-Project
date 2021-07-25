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
	boolean isMultipleOperation=false;
	
	
	
	String oldValue;
	
	JFrame jf;
	JLabel displayLabel;
	JButton fiveButton, sixButton, sevenButton, eightButton, nineButton;
	JButton zeroButton, oneButton, twoButton, threeButton, fourButton;
	JButton dotButton, equelButton, clearButton;
	JButton divButton, mulButton, subButton, addButton;
	JButton mplusButton, mminusButton, mrButton;
	
	
	public Calculator(){
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(310, 490);
		jf.setLocation(250, 150);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(10, 10, 270, 80);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(displayLabel);
		
		
		clearButton=new JButton("MC");
		clearButton.setBounds(10, 100, 60, 60);
		clearButton.setBackground(Color.white);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 15));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		mplusButton=new JButton("M+");
		mplusButton.setBounds(80, 100, 60, 60);
		mplusButton.setBackground(Color.white);
		mplusButton.setFont(new Font("Arial", Font.PLAIN, 15));
		mplusButton.addActionListener(this);
		jf.add(mplusButton);
		
		mminusButton=new JButton("M-");
		mminusButton.setBounds(150, 100, 60, 60);
		mminusButton.setBackground(Color.white);
		mminusButton.setFont(new Font("Arial", Font.PLAIN, 15));
		mminusButton.addActionListener(this);
		jf.add(mminusButton);
		
		mrButton=new JButton("MR");
		mrButton.setBounds(220, 100, 60, 60);
		mrButton.setBackground(Color.white);
		mrButton.setFont(new Font("Arial", Font.PLAIN, 15));
		mrButton.addActionListener(this);
		jf.add(mrButton);
		
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(10, 170, 60, 60);
		sevenButton.setBackground(Color.white);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(80, 170, 60, 60);
		eightButton.setBackground(Color.white);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(150, 170, 60, 60);
		nineButton.setBackground(Color.white);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		divButton=new JButton("/");
		divButton.setBounds(220, 170, 60, 60);
		divButton.setBackground(Color.white);
		divButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		
		fourButton=new JButton("4");
		fourButton.setBounds(10, 240, 60, 60);
		fourButton.setBackground(Color.white);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(80, 240, 60, 60);
		fiveButton.setBackground(Color.white);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(150, 240, 60, 60);
		sixButton.setBackground(Color.white);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(220, 240, 60, 60);
		mulButton.setBackground(Color.white);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		
		oneButton=new JButton("1");
		oneButton.setBounds(10, 310, 60, 60);
		oneButton.setBackground(Color.white);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(80, 310, 60, 60);
		twoButton.setBackground(Color.white);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(150, 310, 60, 60);
		threeButton.setBackground(Color.white);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		subButton=new JButton("-");
		subButton.setBounds(220, 310, 60, 60);
		subButton.setBackground(Color.white);
		subButton.setFont(new Font("Arial", Font.PLAIN, 30));
		subButton.addActionListener(this);
		jf.add(subButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(10, 380, 60, 60);
		dotButton.setBackground(Color.white);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(80, 380, 60, 60);
		zeroButton.setBackground(Color.white);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
	
		equelButton=new JButton("=");
		equelButton.setBounds(150, 380, 60, 60);
		equelButton.setBackground(Color.white);
		equelButton.setFont(new Font("Arial", Font.PLAIN, 30));
		equelButton.addActionListener(this);
		jf.add(equelButton);
		
		
		addButton=new JButton("+");
		addButton.setBounds(220, 380, 60, 60);
		addButton.setBackground(Color.white);
		addButton.setFont(new Font("Arial", Font.PLAIN, 30));
		addButton.addActionListener(this);
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
			if(isOperateClicked || isEquelsClicked) {
				displayLabel.setText("0");
				isOperateClicked=false;
				isEquelsClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource()==oneButton){
			if(isOperateClicked || isEquelsClicked ) {
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
				
				isDivClicked=false;
				isMultClicked=false;
				isSubClicked=false;
				isAddClicked=false;
			}
			
			
		}else if(e.getSource()==divButton) {
			isOperateClicked=true;
			if (isAddClicked || isSubClicked || isMultClicked || isDivClicked||isEquelsClicked) {
				isMultipleOperation=true;
			}else {
				isDivClicked=true;
			}
			
			if(isAddClicked) {
				float newValue=Float.parseFloat(displayLabel.getText());
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF+newValue;
				oldValue=Float.toString(result);
				displayLabel.setText(oldValue);
				isAddClicked=false;
				isDivClicked=true;
			}else if(isSubClicked) {
				float newValue=Float.parseFloat(displayLabel.getText());
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF-newValue;
				oldValue=Float.toString(result);
				displayLabel.setText(oldValue);
				isSubClicked=false;
				isDivClicked=true;
			}else if(isMultClicked) {
				float newValue=Float.parseFloat(displayLabel.getText());
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF*newValue;
				oldValue=Float.toString(result);
				displayLabel.setText(oldValue);
				isMultClicked=false;
				isDivClicked=true;
			}else if(isEquelsClicked) {
				oldValue=displayLabel.getText();
				displayLabel.setText(oldValue);
				isEquelsClicked=false;
				isDivClicked=true;
				
			}else{
				if(isMultipleOperation) {
					float newValue=Float.parseFloat(displayLabel.getText());
					float oldValueF=Float.parseFloat(oldValue);
					float result=oldValueF/newValue;
					oldValue=Float.toString(result);
					displayLabel.setText(oldValue);
					isMultipleOperation=false;
					isDivClicked=true;
					
				}else {
					oldValue=displayLabel.getText();
					displayLabel.setText(oldValue+"");	
				}	
			}
			
		}else if(e.getSource()==mulButton) {
			isOperateClicked=true;
			if (isAddClicked || isSubClicked || isMultClicked || isDivClicked||isEquelsClicked) {
				isMultipleOperation=true;
			}else {
				isMultClicked=true;
			}
			
			if(isAddClicked) {
				float newValue=Float.parseFloat(displayLabel.getText());
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF+newValue;
				oldValue=Float.toString(result);
				displayLabel.setText(oldValue);
				isAddClicked=false;
				isMultClicked=true;
			}else if(isSubClicked) {
				float newValue=Float.parseFloat(displayLabel.getText());
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF-newValue;
				oldValue=Float.toString(result);
				displayLabel.setText(oldValue);
				isSubClicked=false;
				isMultClicked=true;
			}else if(isDivClicked) {
				float newValue=Float.parseFloat(displayLabel.getText());
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF/newValue;
				oldValue=Float.toString(result);
				displayLabel.setText(oldValue);
				isDivClicked=false;
				isMultClicked=true;
			}else if(isEquelsClicked) {
				oldValue=displayLabel.getText();
				displayLabel.setText(oldValue);
				isEquelsClicked=false;
				isMultClicked=true;
				
			}else{
				if(isMultipleOperation) {
					float newValue=Float.parseFloat(displayLabel.getText());
					float oldValueF=Float.parseFloat(oldValue);
					float result=oldValueF*newValue;
					oldValue=Float.toString(result);
					displayLabel.setText(oldValue);
					isMultipleOperation=false;
					isMultClicked=true;
					
				}else {
					oldValue=displayLabel.getText();
					displayLabel.setText(oldValue+"");	
				}	
			}
			
		}else if(e.getSource()==subButton) {
			isOperateClicked=true;
		if (isAddClicked || isSubClicked || isMultClicked || isDivClicked||isEquelsClicked) {
			isMultipleOperation=true;
		}else {
			isSubClicked=true;
		}
		
		if(isAddClicked) {
			float newValue=Float.parseFloat(displayLabel.getText());
			float oldValueF=Float.parseFloat(oldValue);
			float result=oldValueF+newValue;
			oldValue=Float.toString(result);
			displayLabel.setText(oldValue);
			isAddClicked=false;
			isSubClicked=true;
		}else if(isMultClicked) {
			float newValue=Float.parseFloat(displayLabel.getText());
			float oldValueF=Float.parseFloat(oldValue);
			float result=oldValueF*newValue;
			oldValue=Float.toString(result);
			displayLabel.setText(oldValue);
			isMultClicked=false;
			isSubClicked=true;
		}else if(isDivClicked) {
			float newValue=Float.parseFloat(displayLabel.getText());
			float oldValueF=Float.parseFloat(oldValue);
			float result=oldValueF/newValue;
			oldValue=Float.toString(result);
			displayLabel.setText(oldValue);
			isDivClicked=false;
			isSubClicked=true;
		}else if(isEquelsClicked) {
			oldValue=displayLabel.getText();
			displayLabel.setText(oldValue);
			isEquelsClicked=false;
			isSubClicked=true;
			
		}else{
			if(isMultipleOperation) {
				float newValue=Float.parseFloat(displayLabel.getText());
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF-newValue;
				oldValue=Float.toString(result);
				displayLabel.setText(oldValue);
				isMultipleOperation=false;
				isSubClicked=true;
				
			}else {
				oldValue=displayLabel.getText();
				displayLabel.setText(oldValue+"");	
			}	
		}
			
		}else if(e.getSource()==addButton) {
			isOperateClicked=true;
			if (isAddClicked || isSubClicked || isMultClicked || isDivClicked||isEquelsClicked) {
				isMultipleOperation=true;
			}else {
				isAddClicked=true;
			}
			
			if(isSubClicked) {
				float newValue=Float.parseFloat(displayLabel.getText());
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF-newValue;
				oldValue=Float.toString(result);
				displayLabel.setText(oldValue);
				isSubClicked=false;
				isAddClicked=true;
			}else if(isMultClicked) {
				float newValue=Float.parseFloat(displayLabel.getText());
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF*newValue;
				oldValue=Float.toString(result);
				displayLabel.setText(oldValue);
				isMultClicked=false;
				isAddClicked=true;
			}else if(isDivClicked) {
				float newValue=Float.parseFloat(displayLabel.getText());
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF/newValue;
				oldValue=Float.toString(result);
				displayLabel.setText(oldValue);
				isDivClicked=false;
				isAddClicked=true;
			}else if(isEquelsClicked) {
				oldValue=displayLabel.getText();
				displayLabel.setText(oldValue);
				isEquelsClicked=false;
				isAddClicked=true;
				
			}else{
				if(isMultipleOperation) {
					float newValue=Float.parseFloat(displayLabel.getText());
					float oldValueF=Float.parseFloat(oldValue);
					float result=oldValueF+newValue;
					oldValue=Float.toString(result);
					displayLabel.setText(oldValue);
					isMultipleOperation=false;
					isAddClicked=true;
					
				}else {
					oldValue=displayLabel.getText();
					displayLabel.setText(oldValue+"");	
				}	
			}
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");	
		}
			
		
		
	}

}
