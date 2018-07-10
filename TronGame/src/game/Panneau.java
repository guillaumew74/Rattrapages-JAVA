package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Panneau extends JPanel {

  private int posX = 0;

  private int posY = 150;
  
  private Image imageGentil;
  
  private int directionGentil=0;
  
  private int posXTrace[] = new int[10000];
  
  private int posYTrace[] = new int[10000];
  
  
  
  private int posX2 = 400;

  private int posY2 = 150;
  
  private Image imageMechant;
  
  private int directionMechant=0;
  
  private int posXTrace2[] = new int[10000];
  
  private int posYTrace2[] = new int[10000];

  
  private boolean boom1 = false;
  
  private boolean boom2 = false;


  private boolean doOnce = false;


  private String text;


 

public void paintComponent(Graphics g){
	
	JLabel label1 = new JLabel();
    label1.setText(text);
    label1.setBounds(0, 0, 500, 50);
    label1.setFont(new Font("Arial", 0, 30));
    
    add(label1);
	
	if (doOnce == false) {
	
	Arrays.fill(posXTrace2, -100);
	Arrays.fill(posYTrace2, -100);
	
	Arrays.fill(posXTrace, -100);
	Arrays.fill(posYTrace, -100);
	
	doOnce = true;

	
	}
	  
	  super.paintComponent(g);

	  try {
		  
		  switch (this.directionGentil) {
		case 0:
			this.imageGentil = ImageIO.read(new File("images/motoGentilDroite.png"));
			break;
		case 1:
			this.imageGentil = ImageIO.read(new File("images/motoGentilGauche.png"));
			break;
		case 2:
			this.imageGentil = ImageIO.read(new File("images/motoGentilHaut.png"));
			break;
		case 3:
			this.imageGentil = ImageIO.read(new File("images/motoGentilBas.png"));
			break;
		

		default:
			this.imageGentil = ImageIO.read(new File("images/motoGentilDroite.png"));
			break;
		}
		  

		  switch (this.directionMechant) {
			case 0:
				this.imageMechant = ImageIO.read(new File("images/motoMechantDroite.png"));
				break;
			case 1:
				this.imageMechant = ImageIO.read(new File("images/motoMechantGauche.png"));
				break;
			case 2:
				this.imageMechant = ImageIO.read(new File("images/motoMechantHaut.png"));
				break;
			case 3:
				this.imageMechant = ImageIO.read(new File("images/motoMechantBas.png"));
				break;
			

			default:
				this.imageMechant = ImageIO.read(new File("images/motoMechantDroite.png"));
				break;
			}
			  
		  
	      
		  Image traceGentil = ImageIO.read(new File("images/traceGentil.png"));
		  
		  Image traceMechant = ImageIO.read(new File("images/traceMechant.png"));
	      

	
		  
		  
		  for (int i=0; i<this.posXTrace.length; i++) {
			  
			  
				  
				  g.drawImage(traceGentil, this.posXTrace[i]+25, this.posYTrace[i]+25, this);
				  

				  
				  
				  
				  
				  
				  switch (this.directionMechant) {
					case 0:
						if( ((posX2 <= posXTrace2[i]-5 && posX2 >= posXTrace2[i]-15) && (posY2 <= posYTrace2[i]+15 && posY2 >= posYTrace2[i]-15)) ) {

							boom2=true;
						}
						break;
					case 1:
						if( ((posX2 <= posXTrace2[i]+15 && posX2 >= posXTrace2[i]+5) && (posY2 <= posYTrace2[i]+15 && posY2 >= posYTrace2[i]-15)) ) {

							boom2=true;
						}
						
						break;
					case 2:
						if( ((posX2 <= posXTrace2[i]+15 && posX2 >= posXTrace2[i]-15) && (posY2 <= posYTrace2[i]+15 && posY2 >= posYTrace2[i]+5)) ) {
							
							boom2=true;
						}
						
						break;
					case 3:
						if( ((posX2 <= posXTrace2[i]+15 && posX2 >= posXTrace2[i]-15) && (posY2 <= posYTrace2[i]-5 && posY2 >= posYTrace2[i]-15)) ) {
							
							boom2=true;
						}
						
						break;
					

					default:
						
						break;
					}
				  
				  
				  
				   if( ((posX2 <= posXTrace[i]+10 && posX2 >= posXTrace[i]-10) && (posY2 <= posYTrace[i]+10 && posY2 >= posYTrace[i]-10))  ){
					  
					  boom2=true;
				  }
				   
				   
				   
				   
				   
				   
				   switch (this.directionGentil) {
					case 0:
						if( ((posX <= posXTrace[i]-5 && posX >= posXTrace[i]-15) && (posY <= posYTrace[i]+15 && posY >= posYTrace[i]-15)) ) {
							
							boom1=true;
						}
						break;
					case 1:
						if( ((posX <= posXTrace[i]+15 && posX >= posXTrace[i]+5) && (posY <= posYTrace[i]+15 && posY >= posYTrace[i]-15)) ) {
							
							boom1=true;
						}
						
						break;
					case 2:
						if( ((posX <= posXTrace[i]+15 && posX >= posXTrace[i]-15) && (posY <= posYTrace[i]+15 && posY >= posYTrace[i]+5)) ) {
							
							boom1=true;
						}
						
						break;
					case 3:
						if( ((posX <= posXTrace[i]+15 && posX >= posXTrace[i]-15) && (posY <= posYTrace[i]-5 && posY >= posYTrace[i]-15)) ) {
							
							boom1=true;
						}
						
						break;
					

					default:
						
						break;
					}
				   
				   
				   
				   
				   
				   
				  
				   if ((posX <= posXTrace2[i]+10 && posX >= posXTrace2[i]-10) && (posY <= posYTrace2[i]+10 && posY >= posYTrace2[i]-10))   {
					  
					  boom1=true;
				  }
				   
				  
			  
		  }
		  
		  
		  
		  for (int i=0; i<this.posXTrace2.length; i++) {
			  
			  
			  
			  g.drawImage(traceMechant, this.posXTrace2[i]+25, this.posYTrace2[i]+25, this);
			  

			  
			  
			  
		  
	  }
		  
		  if (boom1 && boom2) {
			  
		  }
		  

		  
		  
	      
	      g.drawImage(imageGentil, posX, posY, this);
	      
	      g.drawImage(imageMechant, posX2, posY2, this);

	

	    } catch (IOException e) {

	      e.printStackTrace();

	    }                

	  
  }



public String getText() {
	return text;
}


public void setText(String text) {
	this.text = text;
}



public boolean isBoom1() {
	return boom1;
}




public void setBoom1(boolean boom1) {
	this.boom1 = boom1;
}




public boolean isBoom2() {
	return boom2;
}




public void setBoom2(boolean boom2) {
	this.boom2 = boom2;
}

public int[] getPosXTrace2() {
	return posXTrace2;
}


public void setPosXTrace2(int[] posXTrace2) {
	this.posXTrace2 = posXTrace2;
}


public int[] getPosYTrace2() {
	return posYTrace2;
}


public void setPosYTrace2(int[] posYTrace2) {
	this.posYTrace2 = posYTrace2;
}



public int[] getPosXTrace() {
	return posXTrace;
}


public void setPosXTrace(int[] posXTrace) {
	this.posXTrace = posXTrace;
}


public int[] getPosYTrace() {
	return posYTrace;
}


public void setPosYTrace(int[] posYTrace) {
	this.posYTrace = posYTrace;
}


public int getDirectionGentil() {
	return directionGentil;
}


public void setDirectionGentil(int directionGentil) {
	this.directionGentil = directionGentil;
}


public int getDirectionMechant() {
	return directionMechant;
}


public void setDirectionMechant(int directionMechant) {
	this.directionMechant = directionMechant;
}



  public int getPosX2() {
	return posX2;
}


public void setPosX2(int posX2) {
	this.posX2 = posX2;
}


public int getPosY2() {
	return posY2;
}


public void setPosY2(int posY2) {
	this.posY2 = posY2;
}


public Image getImageMechant() {
	return imageMechant;
}


public void setImageMechant(Image imageMechant) {
	this.imageMechant = imageMechant;
}


public Image getImageGentil() {
	return imageGentil;
}


public void setImageGentil(Image imageGentil) {
	this.imageGentil = imageGentil;
}


public int getPosX() {

    return posX;

  }


  public void setPosX(int posX) {

    this.posX = posX;

  }


  public int getPosY() {

    return posY;

  }


  public void setPosY(int posY) {

    this.posY = posY;

  }        

}