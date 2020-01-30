package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestApp extends Frame implements ActionListener{

	Label lbNumber, lbResult;
	Button cmdSquare, cmdCube;
	TextField txtNumber, txtResult;
	public void TestApp()
	{
		lbNumber= new Label("Number");
		lbResult = new Label("Result");
		txtNumber = new TextField(10);
		txtResult = new TextField(10);
		cmdSquare = new Button("Square");
		cmdCube = new Button("Cube");
		
		this.setResizable(false);
		txtResult.setEditable(false);
		cmdSquare.addActionListener(this);
		cmdCube.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(lbNumber);add(txtNumber);
		add(lbResult);add(txtResult);
		add(cmdSquare);add(cmdCube);
		
		setSize(200,200);
		setVisible(true);		
		
	}
	public static void main(String args[])
	{
		new TestApp();
	}
	public void actionPerformed(ActionEvent e)
	{
		double num=Double.parseDouble(txtNumber.getText());
		double result=0.0;
		if(e.getSource()==cmdSquare)
			result=num*num;
		else
			result=num*num*num;
		
		txtResult.setText(Double.toString(result));
	}
}
