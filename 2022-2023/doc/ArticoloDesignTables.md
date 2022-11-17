|Design Document: Articolo|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| Articolo | public | Costruttore di default |
| Articolo | public | Costruttore parametrizzato |
| Articolo | public | Costruttore di copia |
| toString | public | Restituisce la stringa dell'oggetto |
| setDescrizione | public | Imposta "descrizione" |
| setPrezzo | public | Imposta "prezzo" |
| getDescrizione | public | Ottiene "descrizione" |
| getPrezzo | public | Ottiene "prezzo" |
| getCodA | public | Ottiene "codA" |
| equals | public | Ritorna true se gli oggetti sono uguali sennò ritorna false |

|Design Document: VenditaArticolo|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| Vendita | public | Classe costruttrice |
| start | public | Esegue i metodi e avvia il programma |
| describeProgram | private | Stampa la descrizione del programma |
| getInput | private | Chiede gli input e imposta le variabili |
| computing | private | Visualizza la stringa |
| displayOutput | private | Visualizza il toString() |

|Design Document: The ControlVendita Class|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| main | public | Crea un oggetto di tipo vendita ed esegue il metodo start |