/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package venditaarticolo;
import java.util.Scanner;

/**
 *
 * @author leidalepre
 */
public class VenditaArticolo {
    
    private Articolo a1 = new Articolo();
    private Scanner sca = new Scanner(System.in);
    
    public void run(){
        getInput();
        elaborazione();
        displayOutput();
        descrizione();
    }
    
    private void getInput(){
        System.out.println("Inserire la descrizione: ");
        a1.setDescA(sca.next());
        System.out.println("Inserire il prezzo: ");
        a1.setPrezzo(sca.nextDouble());
    }
    
    private void elaborazione(){
        System.out.println("Sto elaborando");
    }
    
    private void displayOutput(){
        System.out.println(a1.toString());
    }
    
    private void descrizione(){
        System.out.println("Vendo articolo.");
    }
}