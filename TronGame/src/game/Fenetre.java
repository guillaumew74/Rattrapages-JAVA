package game;

import java.awt.Dimension; 

import javax.swing.JFrame;
import javax.swing.JLabel;

 

/**
 * @author guillaume
 *
 */
public class Fenetre extends JFrame{
	


  private Panneau pan = new Panneau();
  


public Panneau getPan() {
	return pan;
}


public void setPan(Panneau pan) {
	this.pan = pan;
}


// creation de la fenetre de jeu


public Fenetre(){        

    this.setTitle("TRON");

    this.setSize(600, 400);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLocationRelativeTo(null);

    this.setContentPane(pan);

    this.setVisible(true);
    
    
    


  }


     

}