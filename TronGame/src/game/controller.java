package game;


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class controller implements KeyListener{
	

	char x1KeyPressed;
	
	char x2KeyPressed;

	char gentilKey;
	
	char mechantKey;
	
	int gentilCases=0;
	
	int mechantCases=0;
	

	

	public controller(int vitesse) {
		
		Fenetre Fenetre = new Fenetre();
		
		
		Fenetre.addKeyListener(this);
		
		Fenetre.getContentPane().setBackground(Color.white);
		

		
		this.x1KeyPressed = '0';
		
		
		while (Fenetre.getPan().isBoom1()==false && Fenetre.getPan().isBoom2()==false) {
			
			
			if (this.x1KeyPressed != '0' || this.x2KeyPressed != '0') {
				
				if(this.x1KeyPressed=='d' && ( Fenetre.getPan().getPosX()+5 < Fenetre.getPan().getWidth()-50 ) ) {

		      int x = Fenetre.getPan().getPosX(), y = Fenetre.getPan().getPosY();

		      x=x+vitesse;

		      
		      Fenetre.getPan().setPosX(x);
		      
		      Fenetre.getPan().setPosY(y);
		      
		      Fenetre.getPan().setDirectionGentil(0);
		      
		      Fenetre.getPan().getPosXTrace()[this.gentilCases]=x;
		      Fenetre.getPan().getPosYTrace()[this.gentilCases]=y;
		    

		      this.gentilCases++;	
		      
		      Fenetre.getContentPane().repaint();  

		      try {

		        Thread.sleep(10);

		      } catch (InterruptedException e) {

		        e.printStackTrace();

		      }
		      
		      
			}
				else if(this.x1KeyPressed=='q' && ( Fenetre.getPan().getPosX()-5 > 0 ) ) {

				      int x = Fenetre.getPan().getPosX(), y = Fenetre.getPan().getPosY();

				      x=x-vitesse;

				      
				      Fenetre.getPan().setPosX(x);
				      
				      Fenetre.getPan().setPosY(y);
				      
				      Fenetre.getPan().setDirectionGentil(1);
				      
				      Fenetre.getPan().getPosXTrace()[this.gentilCases]=x;
				      Fenetre.getPan().getPosYTrace()[this.gentilCases]=y;
				      

				      this.gentilCases++;

				      Fenetre.getContentPane().repaint();  

				      try {

				        Thread.sleep(10);

				      } catch (InterruptedException e) {

				        e.printStackTrace();

				      }
				      
				      
					}
				
				else if(this.x1KeyPressed=='z' && ( Fenetre.getPan().getPosY()-5 > 0 )) {

				      int x = Fenetre.getPan().getPosX(), y = Fenetre.getPan().getPosY();

				      y=y-vitesse;

				      
				      Fenetre.getPan().setPosX(x);
				      
				      Fenetre.getPan().setPosY(y);
				      
				      Fenetre.getPan().setDirectionGentil(2);
				      
				      Fenetre.getPan().getPosXTrace()[this.gentilCases]=x;
				      Fenetre.getPan().getPosYTrace()[this.gentilCases]=y;
				      

				      this.gentilCases++;

				      Fenetre.getContentPane().repaint();  

				      try {

				        Thread.sleep(10);

				      } catch (InterruptedException e) {

				        e.printStackTrace();

				      }
				      
				      
					}
				
				else if(this.x1KeyPressed=='s' && ( Fenetre.getPan().getPosY()+5 < Fenetre.getPan().getHeight()-50 )) {

				      int x = Fenetre.getPan().getPosX(), y = Fenetre.getPan().getPosY();

				      y=y+vitesse;

				      
				      Fenetre.getPan().setPosX(x);
				      
				      Fenetre.getPan().setPosY(y);

				      Fenetre.getPan().setDirectionGentil(3);
				      
				      Fenetre.getPan().getPosXTrace()[this.gentilCases]=x;
				      Fenetre.getPan().getPosYTrace()[this.gentilCases]=y;
				      

				      this.gentilCases++;

				      Fenetre.getContentPane().repaint();  

				      try {

				        Thread.sleep(10);

				      } catch (InterruptedException e) {

				        e.printStackTrace();

				      }
				      
				      
					}
				
				else {
					
					try {

				        Thread.sleep(10);

				      } catch (InterruptedException e) {

				        e.printStackTrace();

				      }
					
				}
				
				
				
				
				
				
				
				
				
				if(this.x2KeyPressed=='6' && ( Fenetre.getPan().getPosX2()+5 < Fenetre.getPan().getWidth()-50 ) ) {

				      int x = Fenetre.getPan().getPosX2(), y = Fenetre.getPan().getPosY2();

				      x=x+vitesse;

				      
				      Fenetre.getPan().setPosX2(x);
				      
				      Fenetre.getPan().setPosY2(y);
				      
				      Fenetre.getPan().setDirectionMechant(0);
				      
				      Fenetre.getPan().getPosXTrace2()[this.mechantCases]=x;
				      Fenetre.getPan().getPosYTrace2()[this.mechantCases]=y;
				      

				      this.mechantCases++;
				  
				      Fenetre.getContentPane().repaint();  

				      try {

				        Thread.sleep(10);

				      } catch (InterruptedException e) {

				        e.printStackTrace();

				      }
				      
				      
					}
						else if(this.x2KeyPressed=='4' && ( Fenetre.getPan().getPosX2()-5 > 0 ) ) {

						      int x = Fenetre.getPan().getPosX2(), y = Fenetre.getPan().getPosY2();

						      x=x-vitesse;

						      
						      Fenetre.getPan().setPosX2(x);
						      
						      Fenetre.getPan().setPosY2(y);
						      
						      Fenetre.getPan().setDirectionMechant(1);
						      
						      Fenetre.getPan().getPosXTrace2()[this.mechantCases]=x;
						      Fenetre.getPan().getPosYTrace2()[this.mechantCases]=y;
		
						      this.mechantCases++;

						      Fenetre.getContentPane().repaint();  

						      try {

						        Thread.sleep(10);

						      } catch (InterruptedException e) {

						        e.printStackTrace();

						      }
						      
						      
							}
						
						else if(this.x2KeyPressed=='8' && ( Fenetre.getPan().getPosY2()-5 > 0 )) {

						      int x = Fenetre.getPan().getPosX2(), y = Fenetre.getPan().getPosY2();

						      y=y-vitesse;

						      
						      Fenetre.getPan().setPosX2(x);
						      
						      Fenetre.getPan().setPosY2(y);

						      Fenetre.getPan().setDirectionMechant(2);
						      
						      Fenetre.getPan().getPosXTrace2()[this.mechantCases]=x;
						      Fenetre.getPan().getPosYTrace2()[this.mechantCases]=y;
						      
	
						      this.mechantCases++;

						      Fenetre.getContentPane().repaint();  

						      try {

						        Thread.sleep(10);

						      } catch (InterruptedException e) {

						        e.printStackTrace();

						      }
						      
						      
							}
						
						else if(this.x2KeyPressed=='2' && ( Fenetre.getPan().getPosY2()+5 < Fenetre.getPan().getHeight()-50 )) {

						      int x = Fenetre.getPan().getPosX2(), y = Fenetre.getPan().getPosY2();

						      y=y+vitesse;

						      
						      Fenetre.getPan().setPosX2(x);
						      
						      Fenetre.getPan().setPosY2(y);

						      Fenetre.getPan().setDirectionMechant(3);
						      
						      Fenetre.getPan().getPosXTrace2()[this.mechantCases]=x;
						      Fenetre.getPan().getPosYTrace2()[this.mechantCases]=y;
						      

						      this.mechantCases++;
						      
						      

						      Fenetre.getContentPane().repaint();  

						      try {

						        Thread.sleep(10);

						      } catch (InterruptedException e) {

						        e.printStackTrace();

						      }
						      
						      
							}
						
						else {
							
							try {

						        Thread.sleep(10);

						      } catch (InterruptedException e) {

						        e.printStackTrace();

						      }
							
						}
				
				

			}
			
			

			else {
				
				try {

			        Thread.sleep(10);

			      } catch (InterruptedException e) {

			        e.printStackTrace();

			      }
				
			}


			}
		
		if(Fenetre.getPan().isBoom1() && Fenetre.getPan().isBoom2()){
		
		Fenetre.getPan().setText("EGALITE");

			
		}
		else if(Fenetre.getPan().isBoom1()){
			
			Fenetre.getPan().setText("VICTOIRE DU MECHANT");

				
		}
		else if(Fenetre.getPan().isBoom2()){
			
			Fenetre.getPan().setText("VICTOIRE DU GENTIL");

				
			}
		
		
		Fenetre.getContentPane().repaint();  
		
		

		  }


	@Override
	public void keyPressed(KeyEvent e) {

		
		if (e.getKeyChar()=='d' || e.getKeyChar()=='q' || e.getKeyChar()=='z' || e.getKeyChar()=='s') {
			
			this.x1KeyPressed = e.getKeyChar();
			
		}
		
		if (e.getKeyChar()=='6' || e.getKeyChar()=='4' || e.getKeyChar()=='2' || e.getKeyChar()=='8') {
			
			this.x2KeyPressed = e.getKeyChar();
			
		}
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("RELEASED");
		
		if (e.getKeyChar()=='d' || e.getKeyChar()=='q' || e.getKeyChar()=='z' || e.getKeyChar()=='s') {
			
			this.x1KeyPressed = '0';
			
		}
		
		if (e.getKeyChar()=='6' || e.getKeyChar()=='4' || e.getKeyChar()=='2' || e.getKeyChar()=='8') {
			
			this.x2KeyPressed = '0';
			
		}
		

		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}       
		
		

	
	
	}

