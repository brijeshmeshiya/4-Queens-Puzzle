import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class gui {
		JLabel[][] cell = new JLabel[4][4];
	public gui(){
		JFrame board = new JFrame();
		board.setResizable(false);
		board.getContentPane().setBackground(Color.WHITE);
		board.setTitle("4 Queen Puzzle");
		board.setSize(355,425);
		board.getContentPane().setLayout(null);
		
		cell[0][0] = new JLabel("1");
		cell[0][0].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[0][0].setHorizontalAlignment(SwingConstants.CENTER);
		cell[0][0].setBounds(12, 12, 84, 84);
		board.getContentPane().add(cell[0][0]);
		
		cell[0][1] = new JLabel("1");
		cell[0][1].setHorizontalAlignment(SwingConstants.CENTER);
		cell[0][1].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[0][1].setBounds(94, 12, 84, 84);
		board.getContentPane().add(cell[0][1]);
		
		cell[0][2] = new JLabel("1");
		cell[0][2].setHorizontalAlignment(SwingConstants.CENTER);
		cell[0][2].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[0][2].setBounds(176, 12, 84, 84);
		board.getContentPane().add(cell[0][2]);
		
		cell[0][3] = new JLabel("1");
		cell[0][3].setHorizontalAlignment(SwingConstants.CENTER);
		cell[0][3].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[0][3].setBounds(258, 12, 84, 84);
		board.getContentPane().add(cell[0][3]);
		
		cell[1][0] = new JLabel("1");
		cell[1][0].setHorizontalAlignment(SwingConstants.CENTER);
		cell[1][0].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[1][0].setBounds(258, 94, 84, 84);
		board.getContentPane().add(cell[1][0]);
		
		cell[1][1] = new JLabel("1");
		cell[1][1].setHorizontalAlignment(SwingConstants.CENTER);
		cell[1][1].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[1][1].setBounds(176, 94, 84, 84);
		board.getContentPane().add(cell[1][1]);
		
		cell[1][2] = new JLabel("1");
		cell[1][2].setHorizontalAlignment(SwingConstants.CENTER);
		cell[1][2].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[1][2].setBounds(94, 94, 84, 84);
		board.getContentPane().add(cell[1][2]);
		
		cell[1][3] = new JLabel("1");
		cell[1][3].setHorizontalAlignment(SwingConstants.CENTER);
		cell[1][3].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[1][3].setBounds(12, 94, 84, 84);
		board.getContentPane().add(cell[1][3]);
		
		cell[2][0] = new JLabel("1");
		cell[2][0].setHorizontalAlignment(SwingConstants.CENTER);
		cell[2][0].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[2][0].setBounds(258, 176, 84, 84);
		board.getContentPane().add(cell[2][0]);
		
		cell[2][1] = new JLabel("1");
		cell[2][1].setHorizontalAlignment(SwingConstants.CENTER);
		cell[2][1].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[2][1].setBounds(176, 176, 84, 84);
		board.getContentPane().add(cell[2][1]);
		
		cell[2][2] = new JLabel("1");
		cell[2][2].setHorizontalAlignment(SwingConstants.CENTER);
		cell[2][2].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[2][2].setBounds(94, 176, 84, 84);
		board.getContentPane().add(cell[2][2]);
		
		cell[2][3] = new JLabel("1");
		cell[2][3].setHorizontalAlignment(SwingConstants.CENTER);
		cell[2][3].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[2][3].setBounds(12, 176, 84, 84);
		board.getContentPane().add(cell[2][3]);
		
		cell[3][0] = new JLabel("1");
		cell[3][0].setHorizontalAlignment(SwingConstants.CENTER);
		cell[3][0].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[3][0].setBounds(258, 258, 84, 84);
		board.getContentPane().add(cell[3][0]);
		
		cell[3][1] = new JLabel("1");
		cell[3][1].setHorizontalAlignment(SwingConstants.CENTER);
		cell[3][1].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[3][1].setBounds(176, 258, 84, 84);
		board.getContentPane().add(cell[3][1]);
		
		cell[3][2] = new JLabel("1");
		cell[3][2].setHorizontalAlignment(SwingConstants.CENTER);
		cell[3][2].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[3][2].setBounds(94, 258, 84, 84);
		board.getContentPane().add(cell[3][2]);
		
		cell[3][3] = new JLabel("1");
		//JLabel label_14 = new JLabel("1");
		cell[3][3].setHorizontalAlignment(SwingConstants.CENTER);
		cell[3][3].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[3][3].setBounds(12, 258, 84, 84);
		board.add(cell[3][3]);
		
		final Button button = new Button("Start");
		button.setName("Start");
		button.setBounds(135, 360, 88, 25);
		board.getContentPane().add(button);
		
		// Listener
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// start calculation
				if(button.getLabel().equalsIgnoreCase("start")==true){
					button.setLabel("Stop");
				}
				else{
					button.setLabel("Start");
				}
			}
		});
		
		board.setVisible(true);
	}
	public void calculation(){
		// To calculate solution
	}
}
