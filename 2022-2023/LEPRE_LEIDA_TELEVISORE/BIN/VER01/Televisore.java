/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisore;

/**
 *
 * @author 20059
 */
public class Televisore {

    private int pollici;
    private String schermo;
    private String colore;
    private int canale;
    private int volume;
    private int luminos;
    private boolean acceso;
    
    public Televisore(){
        pollici = 0;
        schermo = "anonimo";
        colore = "anonimo";
        canale = 0;
        volume = 0;
        luminos = 0;
        acceso = false;
    }

    public Televisore(int pollici, String schermo, String colore, int canale, int volume, int luminos, boolean accesso) {
        this.pollici = pollici;
        this.schermo = schermo;
        this.colore = colore;
        this.canale = canale;
        this.volume = volume;
        this.luminos = luminos;
        this.acceso = accesso;
    }
    
    @Override
    public String toString() {
        String out = "Il televisore è caratterizzato da: \n" + "Pollici: " + this.pollici + "\n" + "Schermo: " + this.schermo + "\n" + "Colore: " + this.colore + "\n";
        if(this.acceso){
            out += "Il televisore ora è acceso" + "\n";
            out += "Il canale è: " + this.canale + "\n" + "Il volume è a: " + this.volume + "\n" + "La luminosità è a: " + this.luminos + "\n";
        }else{
            out += "Il televisore ora è spento";
        }
        return out;
    }
}