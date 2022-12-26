/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venditaarticolo;

import java.util.Scanner;

/**
 *
 * @author leidalepre
 */
public class VenditaTest {
   
    public static void main(String[] args){
        
        int codA;
        double prezzo;
        String descA;
        
        int i1;
        double i2;
        String i3;
        
        Articolo a1 = new Articolo(2892, 34.56, "bello");
        Articolo a2 = new Articolo(3039, 10.4, "bellissimo");
        Articolo a3 = new Articolo(a1);
        
        Scanner s1 = new Scanner(System.in);
        
        System.out.println(a1.toString());
        
        System.out.println(a1);
        System.out.println(a2 + "\n");// non deve fare questo la classe che contiene il main
        
        System.out.println("Inserire codice: ");
        i1 = s1.nextInt();
        
        System.out.println("Inserire prezzo: ");
        i2 = s1.nextDouble();
        
        System.out.println("Inserire descrizione: ");
        i3 = s1.next();
        
        
        System.out.println("Inserire codice: " + i1);
        System.out.println("Inserire prezzo: " + i2);
        System.out.println("Inserire descrizione: " + i3);
        
    
        //System.out.println("Codice primo articolo: " + a1.getCodA());
        //System.out.println("Codice secondo articolo: " + a2.getCodA()+"\n");
        
        //System.out.println("Prezzo primo articolo: " + a1.getPrezzo());
        //System.out.println("Prezzo secondo articolo: " + a2.getPrezzo()+"\n");
        
        //System.out.println("Descrizione primo articolo: " + a1.getDescA());
        //System.out.println("Descrizione secondo articolo: " + a2.getDescA()+"\n");
        
        System.out.println(a3);
        
    }
}
