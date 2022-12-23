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
        
        
        System.out.println("Marca primo frigorifero: " + f1.getMarca());
        System.out.println("Marca secondo frigorifero: " + f2.getMarca()+"\n");
        
        System.out.println("Modello primo frigorifero: " + f1.getModello());
        System.out.println("Modello secondo frigorifero: " + f2.getModello()+"\n");
        
        System.out.println("Litri primo frigorifero: " + f1.getLitriFrigo());
        System.out.println("Litri secondo frigorifero: " + f2.getLitriFrigo()+"\n");
        
        System.out.println("Litri primo frizer: " + f1.getLitriFrizer());
        System.out.println("Litri secondo frizer: " + f2.getLitriFrizer()+"\n");
        
        System.out.println("Prezzo primo frigorifero: " + f1.getPrezzo());
        System.out.println("Prezzo secondo frigorifero: " + f2.getPrezzo()+"\n");
        
        System.out.println("Consumo kwat primo frigorifero: " + f1.getConsumokwat());
        System.out.println("Consumo kwat secondo frigorifero: " + f2.getConsumokwat()+"\n");
        
        System.out.println("Temperatura primo frigorifero: " + f1.getTemperaturaFrigo());
        System.out.println("Temperatura secondo frigorifero: " + f2.getTemperaturaFrigo()+"\n");
        
        System.out.println("Temperatura primo frizer: " + f1.getTemperaturaFrizer());
        System.out.println("Temperatura secondo frizer: " + f2.getTemperaturaFrizer()+"\n");
        
        
        if (f1.getAcceso() == true) {
            System.out.println("Il primo frigorifero è acceso");
        } else {
            System.out.println("Il primo frigorifero è spento");
        }
       
        if (f2.getAcceso() == true) {
            System.out.println("Il secondo frigorifero è acceso");
        } else {
            System.out.println("Il secondo frigorifero è spento\n");
        }
    }
}
