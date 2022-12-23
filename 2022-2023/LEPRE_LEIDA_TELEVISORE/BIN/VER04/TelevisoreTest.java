/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisore;

/**
 *
 * @author 20059
 */
public class TelevisoreTest {
    
    public static void main(String[] args) {
       
        int pollici;
        String schermo;
        String colore;
        int canale;
        int volume;
        int luminos;
        boolean acceso;
       
        
        Televisore t1 = new Televisore(10, "plasma", "a colori", 4, 15, 50, true);
        Televisore t2 = new Televisore(5, "plasma", "a colori", 4, 15, 50, false);
       
        System.out.println(t1 + "\n");
        System.out.println(t2 + "\n");
        
        
        System.out.println("Pollici primo televisore: " + t1.getPollici());
        System.out.println("Pollici secondo televisore: " + t2.getPollici()+"\n");

        System.out.println("Schermo primo televisore: " + t1.getSchermo());
        System.out.println("Schermo secondo televisore: " + t2.getSchermo()+"\n");
       
        System.out.println("Colore primo televisore: " + t1.getColore());
        System.out.println("Colore secondo televisore: " + t2.getColore()+"\n");
        
        System.out.println("Canale primo televisore: " + t1.getCanale());
        System.out.println("Canale secondo televisore: " + t2.getCanale()+"\n");
       
        System.out.println("Volume primo televisore: " + t1.getVolume());
        System.out.println("Volume secondo televisore: " + t2.getVolume()+"\n");
       
        System.out.println("Luminosità primo televisore: " + t1.getLuminos());
        System.out.println("Luminosità secondo televisore: " + t2.getLuminos()+"\n");
        
        
        if (t1.getAcceso() == true) {
            System.out.println("Televisore n1 acceso");
        } else {
            System.out.println("Televisore n1 spento");
        }
       
        if (t2.getAcceso() == true) {
            System.out.println("Televisore n2 acceso");
        } else {
            System.out.println("Televisore n2 spento\n");
        }
        
        
        
        t1.aumentaCanale();
        System.out.println("\nIl numero del canale è aumentato di 1: " + t1.getCanale());
       
        t1.diminuisciCanale();
        System.out.println("Il numero del canale è diminuito di 1: " + t1.getCanale());
        
        
        
        t1.aumentaVolume();
        System.out.println("\nIl volume è aumentato di 1: " + t1.getVolume());
       
        t1.diminuisciVolume();
        System.out.println("Il volume è diminuito di 1: " + t1.getVolume());
        
        
        
        t1.aumentaLuminos();
        System.out.println("\nLa luminosità è aumentata di 1: " + t1.getLuminos());
       
        t1.diminuisciLuminos();
        System.out.println("La luminosità è diminuita di 1: " + t1.getLuminos() +"\n");

		t1.toString();
		System.out.println("Il toString della prima televisione è: \n" + t1.toString() +"\n");   
		
		t2.toString();
		System.out.println("Il toString della seconda televisione è: \n" + t2.toString() +"\n"); 
    }
}