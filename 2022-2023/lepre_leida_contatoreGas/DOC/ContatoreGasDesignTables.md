|Design Document: ContatoreGas |
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| ContatoreGas() | public | costruttore di default |
| ContatoreGas() | public | costruttore parametrizzato |
| toString() | public | ritorna una stringa rappresentativa dell'oggetto |
| setConsumoPre() | public | setta la variabile "consumoPre" |
| getConsumoPre() | public | restituisce la variabile "consumoPre" |
| setConsumoAtt() | public | setta la variabile "consumoAtt" |
| getConsumoAtt() | public | restituisce la variabile "consumoAtt" |
| rilevazionePrecedente() | public | ritorna il calcolo della bolletta precedente |
| rilevazioneAttuale() | public | ritorna il calcolo della bolletta attuale |

|Design Document: BollettaCalculator|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| BellettaCalculator() | public | costruttore |
| descrizioneApp() | public | stampa una stringa che spiega cosa fa il programma |
| inputDati() | public | prende in input i dati |
| visualizzaRisultati() | public | visualizza i risultati |
| start() | public | esegue i metodi |

|Design Document: BollettaTest|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| main | public | crea un oggetto di tipo ContatoreGas ed esegue il metodo start() |
