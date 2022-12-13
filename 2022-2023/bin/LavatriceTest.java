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
        
        System.out.println("Marca prima lavatrice: " + n1.getMarca());
        System.out.println("Marca seconda lavatrice: " + n2.getMarca()+"\n");
        
        System.out.println("Modello prima lavatrice: " + n1.getModello());
        System.out.println("Modello seconda lavatrice: " + n2.getModello()+"\n");
        
        System.out.println("Prezzo prima lavatrice: " + n1.getPrezzo());
        System.out.println("Prezzo seconda lavatrice: " + n2.getPrezzo()+"\n");
        
        System.out.println("Programma prima lavatrice: " + n1.getProgramma());
        System.out.println("Programma seconda lavatrice: " + n2.getProgramma()+"\n");
        
        System.out.println("Temperatura prima lavatrice: " + n1.getTemperatura());
        System.out.println("Temperatura seconda lavatrice: " + n2.getTemperatura()+"\n");
        
        System.out.println("Giri centrifuga prima lavatrice: " + n1.getGiriCentrifuga());
        System.out.println("Giri centrifuga seconda lavatrice: " + n2.getGiriCentrifuga()+"\n");
        
        System.out.println("Kg prima lavatrice: " + n1.getKg());
        System.out.println("Kg seconda lavatrice: " + n2.getKg()+"\n");
        
        System.out.println("Tempo prima lavatrice: " + n1.getTempo());
        System.out.println("Tempo seconda lavatrice: " + n2.getTempo()+"\n");
        
        
        if(n1.getAcceso() == true){
            System.out.println("La prima lavatrice è accesa");
        }else{
            System.out.println("La prima lavatrice è spenta\n");
        }
        
        if(n2.getAcceso() == true){
            System.out.println("La seconda lavatrice è accesa");
        }else{
            System.out.println("La seconda lavatrice è spenta\n");
        }
        
    }
    
}