/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatoregas;
import java.util.Scanner;
/**
 *
 * @author leidalepre
 */
public class BollettaCalculator {
    private final int VALORE_MAX = 9999; 
    private ContatoreGas cont;
    
    public BollettaCalculator(){
        
    }
    
    public void descrizioneApp(){
        String out = "Il programma calcola la bolletta";
        System.out.println(out);
    }
    
    public void inputDati(){
        Scanner i = new Scanner(System.in);
        String pre = "Inserire il consumo precedente: ";
        System.out.println(pre);
        double consumoPre;
        String att = "Inserire il consumo attuale: ";
        System.out.println(att);
        double consumoAtt;
        consumoPre = i.nextDouble();
        consumoAtt = i.nextDouble();
        cont = new ContatoreGas();
        cont.setConsumoPre(consumoPre);
        cont.setConsumoAtt(consumoAtt);
    }
    
    public void visualizzaRisultati(){
        String out = "Rilevazione precedente: " + cont.rilevazionePrecedente() + "/n" + "Relevazione attuale: " + cont.rilevazioneAttuale() + "/n";
        System.out.println(out);
    }
    
    public void start(){
        descrizioneApp();
        inputDati();
        visualizzaRisultati();
    }
}