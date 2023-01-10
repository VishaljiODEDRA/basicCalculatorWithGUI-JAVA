
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CalculatorGUI extends JFrame implements ActionListener {
	
	private JLabel numberOne = new JLabel("Enter number 1:");
	private JTextField amountOne = new JTextField(5);
	private JLabel numberTwo = new JLabel("Enter number 2:");
	private JTextField amountTwo = new JTextField(5);
	private JButton addtion = new JButton("+");
	private JButton substraction = new JButton("-");
	private JButton multiplication = new JButton("*");
	private JButton division = new JButton("/");
	private JLabel result = new JLabel("Result");


	private JPanel topPanel = new JPanel();

	Calculator calculator = new Calculator();

	public CalculatorGUI() {

		setTitle("Simple Calculator");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(850, 80);
		setLocationRelativeTo(null);
		
		addtion.addActionListener(this);
		substraction.addActionListener(this);
		multiplication.addActionListener(this);
		division.addActionListener(this);

		topPanel.add(numberOne);
		topPanel.add(amountOne);
		topPanel.add(numberTwo);
		topPanel.add(amountTwo);
		topPanel.add(addtion);
		topPanel.add(substraction);
		topPanel.add(multiplication);
		topPanel.add(division);
		topPanel.add(result);

		add(BorderLayout.NORTH, topPanel);
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		try {

			String amount1 = amountOne.getText();
			Double dAmount1 = Double.parseDouble(amount1);
			String amount2 = amountTwo.getText();
			Double dAmount2 = Double.parseDouble(amount2);

			if (e.getSource() == addtion) {
				calculator.addition(dAmount1, dAmount2);
			} else if (e.getSource() == substraction) {
				calculator.substracton(dAmount1, dAmount2);
			} else if (e.getSource() == multiplication) {
				calculator.multiplication(dAmount1, dAmount2);
			} else if (e.getSource() == division) {
				if (dAmount2 == 0) {
					JOptionPane.showMessageDialog(null, "Can not divide by 0 !", "Inane warning",
							JOptionPane.ERROR_MESSAGE);
				} else {
					calculator.division(dAmount1, dAmount2);
				}
			}

			result.setText("Result = " + calculator.getRes());

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "The Amount You Entered isn't Acceppted!", "Inane warning",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
