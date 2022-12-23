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
       
        
        Televisore t1 = new Televisore(10, "plasma", "a colori", 4, 15, 50, false);
        Televisore t2 = new Televisore(5, "plasma", "a colori", 4, 15, 50, true);
       
        System.out.println(t1 + "\n");
        System.out.println(t2 + "\n");
    }
}