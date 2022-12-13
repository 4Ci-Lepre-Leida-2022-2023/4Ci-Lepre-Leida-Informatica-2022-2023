/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venditaarticolo;

/**
 *
 * @author leidalepre
 */
public class Articolo {

    private static int codA;
    private double prezzo;
    private String descA;
    
    public Articolo(){
        this.codA ++;
        this.prezzo = 0.0;
        this.descA = "anonimo";
    }
    
   
    public Articolo(int c, double p, String d){
        this.codA ++;
        if(p <0.0){
            this.prezzo = 0.0;
        }else{
            this.prezzo = p;
        }
        
        if(d != null){
            this.descA = d;
        }else{
            this.descA = "anonimo";
        }
    }
    
    @Override
    public String toString(){
        String out = "Articolo: " + "Codice articolo: " + this.codA + "\n" + "Prezzo: " + this.prezzo + "\n" + "Descrizione articolo: " + this.descA + "\n";
        return out;
    }
    
    public void setPrezzo(double prezzo){
        if(prezzo > 0.0){
            this.prezzo = prezzo;
        }
    }
    
    public void setDescA(String descA){
        if(descA != null){
            this.descA = descA;
        }
    }
    
    public int getCodA(){
        return codA;
    }
    
    public double getPrezzo(){
        return prezzo;
    }
    
    public String getDescA(){
        return descA;
    }
    /// NO, IL COSTRUTTORE DI COPIA NON SI FA COSI!!!  (ho aggiornato)
    public Articolo(Articolo a){
        this.prezzo = a.prezzo;
        this.descA = a.descA;
    }
    
    public boolean equals(Articolo a){
        if(this.prezzo == a.prezzo && this.descA.equals(a.descA)){
            return true;
        }
        return false;
    }
}
