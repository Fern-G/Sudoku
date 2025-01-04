package sudokuProj;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Media {
	
	//private JFrame window;
	
	public Media() {
		JFrame frame = new JFrame(); // creates the window
		JButton button = new JButton("grid1");
		
		JPanel panel = new JPanel(); //creates panel to add stuff
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));// border of panel
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		
		frame.add(panel, BorderLayout.CENTER);//adding the panel
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closing window
		frame.setTitle("Sudoku");
		frame.pack();// for window to match size
		frame.setVisible(true);
		
		ImageIcon image = new ImageIcon("icon.png");
		frame.setIconImage(image.getImage());
	}
}
