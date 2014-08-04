import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;


public class gui {
	public gui(){
		JFrame board = new JFrame();
		board.setResizable(false);
		board.getContentPane().setBackground(Color.WHITE);
		board.setTitle("4 Queen Puzzle");
		board.setSize(355,388);
		board.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel.setIcon(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 12, 84, 84);
		board.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label.setBounds(94, 12, 84, 84);
		board.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("1");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_1.setBounds(176, 12, 84, 84);
		board.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("1");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_2.setBounds(258, 12, 84, 84);
		board.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("1");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_3.setBounds(258, 94, 84, 84);
		board.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("1");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_4.setBounds(176, 94, 84, 84);
		board.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("1");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_5.setBounds(94, 94, 84, 84);
		board.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("1");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_6.setBounds(12, 94, 84, 84);
		board.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("1");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_7.setBounds(258, 176, 84, 84);
		board.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("1");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_8.setBounds(176, 176, 84, 84);
		board.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("1");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_9.setBounds(94, 176, 84, 84);
		board.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("1");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_10.setBounds(12, 176, 84, 84);
		board.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("1");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_11.setBounds(258, 258, 84, 84);
		board.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("1");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_12.setBounds(176, 258, 84, 84);
		board.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("1");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_13.setBounds(94, 258, 84, 84);
		board.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("1");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_14.setBounds(12, 258, 84, 84);
		board.getContentPane().add(label_14);
		
		board.setVisible(true);
	}
}
