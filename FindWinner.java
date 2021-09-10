import java.awt.*;
class FindWinner
{
    static void matchIcon(javax.swing.ImageIcon icon)
    {
	if(Va.bt[0].getIcon()==icon && Va.bt[1].getIcon()==icon && Va.bt[2].getIcon()==icon)
	  announceWinner(0,1,2);
	if(Va.bt[3].getIcon()==icon && Va.bt[4].getIcon()==icon && Va.bt[5].getIcon()==icon)
	  announceWinner(3,4,5);
	if(Va.bt[6].getIcon()==icon && Va.bt[7].getIcon()==icon && Va.bt[8].getIcon()==icon)
	  announceWinner(6,7,8);
	if(Va.bt[0].getIcon()==icon && Va.bt[3].getIcon()==icon && Va.bt[6].getIcon()==icon)
	  announceWinner(0,3,6);
	if(Va.bt[1].getIcon()==icon && Va.bt[4].getIcon()==icon && Va.bt[7].getIcon()==icon)
	  announceWinner(1,4,7);
	if(Va.bt[2].getIcon()==icon && Va.bt[5].getIcon()==icon && Va.bt[8].getIcon()==icon)
	  announceWinner(2,5,8);
	if(Va.bt[0].getIcon()==icon && Va.bt[4].getIcon()==icon && Va.bt[8].getIcon()==icon)
	  announceWinner(0,4,8);
	if(Va.bt[2].getIcon()==icon && Va.bt[4].getIcon()==icon && Va.bt[6].getIcon()==icon)
	  announceWinner(2,4,6);
    } 
    private static void announceWinner(int i1,int i2,int i3)
    {
	  Va.bt[i1].setBackground(Color.yellow);
	  Va.bt[i2].setBackground(Color.yellow);
	  Va.bt[i3].setBackground(Color.yellow);
	  Va.msg.setText(Va.player+" player is winner...");
	  Va.msg.setForeground(Color.green);
	  Va.reset.setEnabled(true);
	  Va.winnerfound=true;
    }
}