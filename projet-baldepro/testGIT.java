import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PremiereFenetre {
	public static void main (String[] args){
	JFrame fenetre = new JFrame ("Premiere fenetre");

    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.setSize(200,200);

	////////////////////////    /* AFFICHAGE DES CINQ BOUTONS */    ///////////////////////////////////////////////////
	
	fenetre.getContentPane().setLayout(new BorderLayout());
	JButton north = new JButton("north");
	JButton south = new JButton("south");
	JButton west = new JButton("west");
	JButton east = new JButton("east");
	JButton center = new JButton("center");

	fenetre.getContentPane().add(north,BorderLayout.NORTH);
	fenetre.getContentPane().add(south,BorderLayout.SOUTH);
	fenetre.getContentPane().add(west,BorderLayout.WEST);
	fenetre.getContentPane().add(east,BorderLayout.EAST);
	fenetre.getContentPane().add(center,BorderLayout.CENTER);
	
	fenetre.setVisible (true);


////////////////////////    /* AFFICHAGE DU BOUTON OK QUI REAGIT EN CHANGANT LE TEXTE */    ///////////////////////////////////////////////////

///MASQUE EN ATTENDANT

	/*fenetre.getContentPane().setLayout(new FlowLayout() );

	final JLabel label = new JLabel("Hello World!");
	fenetre.getContentPane().add(label);
	JButton bouton = new JButton("OK");
	fenetre.getContentPane().add(bouton);
	
	bouton.addActionListener (new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setText("Bouton cliqué");
			
		}
	
		
	});
	
	fenetre.setVisible(true);*/
	
	}
}