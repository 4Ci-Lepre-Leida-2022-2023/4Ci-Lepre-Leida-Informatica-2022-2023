/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20059
 */
package frigorifero;
public class FrigoriferoTest {
    
    public static void main(String[] args) {
        
        String marca;
        String modello;
        int litriFrigo;
        int litriFrizer;
        double prezzo;
        boolean acceso;
        int consumokwat;
        int temperaturaFrigo;
        int temperaturaFrizer;
        
        
        Frigorifero f1 = new Frigorifero("Samsung", "FR2016", 300);
        Frigorifero f2 = new Frigorifero("Apple", "iFridge", 5000);
        
        System.out.println(f1 + "\n");
        System.out.println(f2 + "\n");
        
    }
}
