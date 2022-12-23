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
public class Lavatrice {

   private String marca;
   private String modello;
   private double prezzo;
   private int programma;
   private int temperatura;
   private int giriCentrifuga;
   private int kg;
   private boolean acceso;
   private double tempo;
   
   public Lavatrice(){
       this.marca = "anonimo";
       this.modello = "anonimo";
       this.prezzo = 0.0;
       this.programma = 0;
       this.temperatura = 0;
       this.giriCentrifuga = 0;
       this.kg = 0;
       this.acceso = false;
       this.tempo = 0.0;
   }
   
   public Lavatrice(String m, String mod, double p){
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
       
       this.programma = 0;
       this.temperatura = 0;
       this.giriCentrifuga = 0;
       this.kg = 0;
       this.acceso = false;
       this.tempo = 0.0;
   }
   
    @Override
    public String toString() {
    	String out = "La lavatrice è caratterizzata da: \n" + "Marca: " + this.marca + "\n" + "Modello: " + this.modello + "\n" + "Prezzo: " + this.prezzo + "\n";
    	if(this.acceso){
    		out += "è accesa" + "\n";
    		out += "Il programma è: " + this.programma + "\n" + "La temperatura è: " + this.temperatura + "\n" + "Giri Centrifuga: " + this.giricentrifuga + "\n" + "I kg sono: " + this.kg + "\n" + "Il tempo è: " + this.tempo + "\n";
    	}else{
    		out += "è spenta";
    	}
    	return out;
    }
}