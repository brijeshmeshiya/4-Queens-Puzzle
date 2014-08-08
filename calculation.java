import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class calculation extends Thread{
	JLabel[][] cell = new JLabel[4][4];
	int[][] board =new int[4][4];
	public void run()
	{
	for(int i=0;i<4;i++)
	{
	for(int j=0;j<4;j++)
	{
		board[i][j]=3;
	}
	}
	while(true){
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(board[i][j]==1)
			{
				cell[i][j].setBackground(Color.GREEN);
				cell[i][j].setIcon(null);
			}
			else if(board[i][j]==0)
			{
				cell[i][j].setBackground(Color.RED);
				cell[i][j].setIcon(null);
			}
			else if(board[i][j]==2)
			{
				cell[i][j].setIcon(new ImageIcon("/home/brijesh/Desktop/queen-resized.png"));
			}
			else if(board[i][j]==3)
			{
				cell[i][j].setBackground(null);
				cell[i][j].setIcon(null);
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		}
	try {
		sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}}
}
