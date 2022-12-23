/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavatrice;

/**
 *
 * @author 20059
 */
public class LavatriceTest {
    
    public static void main(String[] args) {
        
        String marca;
        String modello;
        double prezzo;
        int programma;
        int temperatura;
        int giriCentrifuga;
        int kg;
        boolean acceso;
        double tempo;
    
        Lavatrice n1 = new Lavatrice("Samsung", "L530", 330.50);
        Lavatrice n2 = new Lavatrice("Samsung", "L300", 100.40);
        
        System.out.println(n1 + "\n");
        System.out.println(n2 + "\n");
    }
    
}