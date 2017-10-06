
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher extends JFrame implements ActionListener {
	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	public ColorTeacher() {

		add(panel);
		setVisible(true);
		panel.add(yellow, BorderLayout.WEST);
		panel.add(red, BorderLayout.WEST);
		panel.add(blue, BorderLayout.WEST);
		panel.add(green, BorderLayout.WEST);
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		red.setBackground(Color.red);
		red.setOpaque(true);
		blue.setBackground(Color.blue);
		blue.setOpaque(true);
		green.setBackground(Color.GREEN);
		green.setOpaque(true);
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		pack();
	}

	public static void main(String[] args) {
		ColorTeacher coTea = new ColorTeacher();

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        if (e.getSource() == yellow) {
        	speak("yellow");
        }
        else if (e.getSource() == red) {
        	speak("red");
        }
        else if (e.getSource() == blue) {
        	speak("blue");
        }
        else if (e.getSource() == green) {
        	speak("green");
        }
    }

	

}
