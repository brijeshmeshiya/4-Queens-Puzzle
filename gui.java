import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Label;


public class gui {
		JLabel[][] cell = new JLabel[4][4];
		JFrame board = new JFrame();
		int flag;
	public gui(){
		
		board.setResizable(false);
		board.getContentPane().setBackground(Color.WHITE);
		board.setTitle("4 Queen Puzzle");
		board.setSize(355,425);
		board.getContentPane().setLayout(null);
		
		cell[0][0] = new JLabel("");
		cell[0][0].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[0][0].setHorizontalAlignment(SwingConstants.CENTER);
		cell[0][0].setBounds(12, 12, 84, 84);
		//board.getContentPane().add(cell[0][0]);
		
		cell[0][1] = new JLabel("");
		cell[0][1].setHorizontalAlignment(SwingConstants.CENTER);
		cell[0][1].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[0][1].setBounds(94, 12, 84, 84);
		//board.getContentPane().add(cell[0][1]);
		
		cell[0][2] = new JLabel("");
		cell[0][2].setHorizontalAlignment(SwingConstants.CENTER);
		cell[0][2].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[0][2].setBounds(176, 12, 84, 84);
	//	board.getContentPane().add(cell[0][2]);
		
		cell[0][3] = new JLabel("");
		cell[0][3].setHorizontalAlignment(SwingConstants.CENTER);
		cell[0][3].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[0][3].setBounds(258, 12, 84, 84);
		//board.getContentPane().add(cell[0][3]);
		
		cell[1][0] = new JLabel("");
		cell[1][0].setHorizontalAlignment(SwingConstants.CENTER);
		cell[1][0].setBorder(new LineBorder(new Color(0, 0, 0), 2));
	//	board.getContentPane().add(cell[1][0]);
		
		cell[1][1] = new JLabel("");
		cell[1][1].setHorizontalAlignment(SwingConstants.CENTER);
		cell[1][1].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		//board.getContentPane().add(cell[1][1]);
		
		cell[1][2] = new JLabel("");
		cell[1][2].setHorizontalAlignment(SwingConstants.CENTER);
		cell[1][2].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		//board.getContentPane().add(cell[1][2]);
		
		cell[1][3] = new JLabel("");
		cell[1][3].setHorizontalAlignment(SwingConstants.CENTER);
		cell[1][3].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		//board.getContentPane().add(cell[1][3]);
		
		cell[1][3].setBounds(258, 94, 84, 84);
		cell[1][0].setBounds(12, 94, 84, 84);
		cell[1][1].setBounds(94, 94, 84, 84);
		cell[1][2].setBounds(176, 94, 84, 84);
		
		cell[2][0] = new JLabel("");
		cell[2][0].setHorizontalAlignment(SwingConstants.CENTER);
		cell[2][0].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		//board.getContentPane().add(cell[2][0]);
		
		cell[2][1] = new JLabel("");
		cell[2][1].setHorizontalAlignment(SwingConstants.CENTER);
		cell[2][1].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		//board.getContentPane().add(cell[2][1]);
		
		cell[2][2] = new JLabel("");
		cell[2][2].setHorizontalAlignment(SwingConstants.CENTER);
		cell[2][2].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		//board.getContentPane().add(cell[2][2]);
		
		cell[2][3] = new JLabel("");
		cell[2][3].setHorizontalAlignment(SwingConstants.CENTER);
		cell[2][3].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		//board.getContentPane().add(cell[2][3]);
		
		cell[2][3].setBounds(258, 176, 84, 84);
		cell[2][2].setBounds(176, 176, 84, 84);
		cell[2][1].setBounds(94, 176, 84, 84);
		cell[2][0].setBounds(12, 176, 84, 84);
		
		
		cell[3][0] = new JLabel("");
		cell[3][0].setHorizontalAlignment(SwingConstants.CENTER);
		cell[3][0].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		//board.getContentPane().add(cell[3][0]);
		
		cell[3][1] = new JLabel("");
		cell[3][1].setHorizontalAlignment(SwingConstants.CENTER);
		cell[3][1].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		//board.getContentPane().add(cell[3][1]);
		
		cell[3][2] = new JLabel("");
		cell[3][2].setHorizontalAlignment(SwingConstants.CENTER);
		cell[3][2].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		//board.getContentPane().add(cell[3][2]);
		
		cell[3][3] = new JLabel("");
		cell[3][3].setHorizontalAlignment(SwingConstants.CENTER);
		cell[3][3].setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cell[3][3].setBackground(Color.GREEN);
		//board.getContentPane().add(cell[3][3]);
		
		cell[3][3].setBounds(258, 258, 84, 84);
		cell[3][2].setBounds(176, 258, 84, 84);
		cell[3][1].setBounds(94, 258, 84, 84);
		cell[3][0].setBounds(12, 258, 84, 84);
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				board.getContentPane().add(cell[i][j]);
			}
		}
		
		final Button button = new Button("Start");
		button.setName("Start");
		button.setBounds(135, 360, 88, 25);
		board.getContentPane().add(button);
		
		
		
		// Listener
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// start calculation
				
				if(button.getLabel().equalsIgnoreCase("start")==true){
					System.out.println("Started");
					boolean[][] square=new boolean[4][4];
					int[][] position = new int[4][2];
					int row=4,column=row;
					find_queen(square,0,row,row,position);
					button.setLabel("Stop");
					flag=0;
				}
				else{
					button.setLabel("Start");
				}
			}
		});
		
		board.setVisible(true);
	}
	public void find_queen(boolean chess[][],int current,int row,int queen,int[][] position){
		// To calculate solution
		int i,j,k;
		//System.out.println(position);
		boolean[][] temp = new boolean[10][10];
		if(queen<0 || current>row)
			return;
		if(queen==0)
		{
			//System.out.println("Got Solution");
			if(flag==0){
				for(int x=0;x<4;x++)
					cell[position[x][0]][position[x][1]].setIcon(new ImageIcon("/home/brijesh/Desktop/queen-resized.png"));
				flag=1;
			}
			//System.out.println(position);
			return;
		}
		//System.out.println("Executing "+queen);
		for(i=0;i<row;i++)
		{
			if(chess[current][i]==false)
			{
				this.sleep(10);
				cell[current][i].repaint();
				board.repaint();
				position[current][0]=current;
				position[current][1]=i;
				//print(chess,row,"Original : ");
				transform(temp,chess,current,i,row);
				//print(temp,row,"Modified : ");
//				find_queen(temp,current+1,row,queen-1,position+"("+(i)+","+(current)+") ");
				find_queen(temp,current+1,row,queen-1,position);

			}
		}
		
	}
	
	private void sleep(int i) {
		for(float j=0;j<i*100000;)
		{
			j=(float) (j+0.1);
		}
	}
	
	public void transform(boolean[][] temp, boolean[][] chess, int r,int c, int row) {
		int i,j,k;
		for(i=0;i<row;i++)
			for(j=0;j<row;j++)
			{
				temp[i][j]=chess[i][j];
				if(i==r || j==c)
					temp[i][j]=true;
				else if(Math.abs(r-i)==Math.abs(c-j))
					temp[i][j]=true;
				if(temp[i][j]==true)
					cell[i][j].setBackground(Color.RED);
				else
					cell[0][0].setBackground(Color.green);
				cell[0][0].repaint();
			}
		return;
	}
	
	public void print(boolean[][] temp,int row,String msg)
	{
		int i,j;
		System.out.println(msg);
		for(i=0;i<row;i++)
		{
			for(j=0;j<row;j++)
			{
				if(temp[i][j]==true)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
		System.out.println();
		}
	}
}
