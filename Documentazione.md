CLASSE ContoCorrente

ATTRIBUTI

- proprietario (Propritario): oggetto della classe Propritario che contiene il nome e il cognome del proprietario del conto corrente.
- flous (float): rappresenta la somma di denaro presente nel conto corrente, cioè il saldo.

METODI

- ContoCorrente(int flous): costruttore che crea un oggetto ContoCorrente, inizializza l'oggetto Propritario con nome e cognome e assegna al saldo il valore ricevuto come parametro.
- canPrelievo(int quantita): controlla se è possibile effettuare un prelievo verificando che la quantità richiesta sia minore o uguale al saldo. Restituisce true se il prelievo è possibile, altrimenti false.
- Prelievo(int quantita): sottrae dal saldo la quantità di denaro indicata.
- Deposito(int quantita): aggiunge al saldo la quantità di denaro indicata.
- toString(): restituisce una stringa contenente il nome, il cognome del proprietario e il saldo del conto corrente.


CLASSE Propritario

ATTRIBUTI

- nome (String): rappresenta il nome del proprietario del conto corrente.
- cognome (String): rappresenta il cognome del proprietario del conto corrente.

METODI

- Propritario(String nome, String cognome): costruttore che crea un oggetto Propritario assegnando i valori ricevuti ai rispettivi attributi.
- getNome(): restituisce il valore dell'attributo nome.
- getCognome(): restituisce il valore dell'attributo cognome.
