/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contatoregas;

/**
 *
 * @author leidalepre
 */
public class ContatoreGas {

    private double consumoPre;
    private double consumoAtt;
    
    public ContatoreGas(){
        this.consumoPre = 0.0;
        this.consumoAtt = 0.0;
    }
    
    public ContatoreGas(double consumoPre, double consumoAtt){
        if (consumoPre < 0.0){
            this.consumoPre = 0.0;
        }else{
            this.consumoPre = consumoPre;
        }
        
        if (consumoAtt < 0.0){
            this.consumoAtt = 0.0;
        }else{
            this.consumoAtt = consumoAtt;
        }
    }
    
    @Override
    public String toString() {
        String out = "Caratteristiche del contatore: \n" + "Consumo precedente: " + this.consumoPre + "\n" + "Consumo attuale: " + this.consumoAtt + "\n";
        return out;
    }
    
    public void setConsumoPre(double consumoPre) {
        this.consumoPre = consumoPre;
    }
    
    public double getConsumoPre() {
        return consumoPre;
    }
    
    public void setConsumoAtt(double consumoAtt) {
        this.consumoAtt = consumoAtt;
    }
    
    public double getConsumoAtt() {
        return consumoAtt;
    }
    
    public double rilevazionePrecedente(){
        double rivPre;
        rivPre = this.getConsumoPre() * 1.027235;
        return rivPre;
    }
    
    public double rilevazioneAttuale(){
        double rivAtt;
        rivAtt = this.getConsumoAtt() * 1.027235;
        return rivAtt;
    }
}