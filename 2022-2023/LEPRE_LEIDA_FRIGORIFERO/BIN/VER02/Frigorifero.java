/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frigorifero;

/**
 *
 * @author 20059
 */
public class Frigorifero {

    private String marca;
    private String modello;
    private int litriFrigo;
    private int litriFrizer;
    private double prezzo;
    private boolean acceso;
    private int consumokwat;
    private int temperaturaFrigo;
    private int temperaturaFrizer;
    
    public Frigorifero(){
        this.marca = "anonimo";
        this.modello = "anonimo";
        this.litriFrigo = 0;
        this.litriFrizer = 0;
        this.prezzo = 0.0;
        this.acceso = false;
        this.consumokwat = 0;
        this.temperaturaFrigo = 0;
        this.temperaturaFrizer = 0;
    }
    
    public Frigorifero(String m, String mod, double p){
       if(m != null){
           this.marca = m;
       }else{
           this.marca = "anonimo";
       }
       
       if(mod != null){
           this.modello = mod;
       }else{
           this.modello = "anonimo";
       }
       if(p < 0.0){
           this.prezzo = 0.0;
       }else{
           this.prezzo = p;
       }
       
       this.litriFrigo = 0;
       this.litriFrizer = 0;
       this.acceso = false;
       this.consumokwat = 0;
       this.temperaturaFrigo = 0;
       this.temperaturaFrizer = 0;
   }

    @Override
    public String toString() {
         String out = "Caratteristiche del frigorifero: \n" + "Marca: " + this.marca + "\n" + "Modello: " + this.modello + "\n" + "Prezzo: " + this.prezzo + "\n";
         if(this.acceso){
         	out += "Il frigorifero ora è acceso" + "\n";
         	out += "Litri frigo: " + this.litriFrigo + "\n" + "Litri frizer: " + this.litriFrizer + "\n" + "Consumo kwat: " + this.consumokwat + "\n" + "Temperatura frigo: " + this.temperaturaFrigo + "\n" + "Temperatura Frizer: " + this.temperaturaFrizer + "\n";
         }else{
         	out += "Il frigorifero ora è spento";
         }
         return out;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setLitriFrigo(int litriFrigo) {
        if(litriFrigo > 0){
            this.litriFrigo = litriFrigo;
        }
    }

    public void setLitriFrizer(int litriFrizer) {
        if(litriFrizer > 0){
            this.litriFrizer = litriFrizer;
        }
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = false;
    }

    public void setConsumokwat(int consumokwat) {
        if(consumokwat > 0){
            this.consumokwat = consumokwat;
        }
    }

    public void setTemperaturaFrigo(int temperaturaFrigo) {
        if(temperaturaFrigo > 0){
            this.temperaturaFrigo = temperaturaFrigo;
        }
    }

    public void setTemperaturaFrizer(int temperaturaFrizer) {
        if(temperaturaFrizer > 0){
            this.temperaturaFrizer = temperaturaFrizer;
        }
    }
}