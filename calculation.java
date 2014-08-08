import java.awt.Color;

import javax.swing.JLabel;


public class calculation extends Thread{
	JLabel[][] cell = new JLabel[4][4];
	boolean[][] board =new boolean[4][4];
	public void run()
	{
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(board[i][j]==true)
			{
				cell[i][j].setBackground(Color.GREEN);
			}
			else
			{
				cell[i][j].setBackground(Color.RED);
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
}
