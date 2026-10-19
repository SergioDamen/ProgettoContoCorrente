/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package damenalexandrocontocorrente;

/**
 *
 * @author damen.alexandro
 */
    public class ContoCorrente {
    private Propritario proprietario;
    private float flous;
    /**
     * Metodo che costruisce l'oggetto ContoCorrente.
     * Chiamata il costruttore per creare l'oggetto Proprietario utilizzato come attributo.
     * @param flous Somma di denaro del conto corrente.
     */
    public ContoCorrente(int flous){
        this.proprietario= new Propritario("Marco", "Rossi");
        this.flous= flous;
    }
    /**
     * Controlla se il prelievo e' possibile.
     * @param quantita Quantita di saldo da togliere al saldo di ContoCorente(flous).
     * @return Booleana che mi dice se il prelievo e' possibile.
     */
    public boolean canPrelievo(int quantita){
        if(quantita<=this.flous){
            return true;
        }
        return false;
    }
    /**
     * Esegue la sottrazione al saldo di ContoCorrente(fluos).
     * @param quantita Quantita di saldo da togliere al saldo di ContoCorente(flous).
     */
    public void Prelievo(int quantita){
        this.flous-=quantita;
    }
    /**
     * Esugue l'addizione al saldo di ContoCorrente(flous).
     * @param quantita Quantita di saldo da aggiungere al saldo di ContoCorente(flous).
     */
    public void Deposito(int quantita){
        this.flous+=quantita;
    }
    /**
     * Metodo toString usato per stampare le informazioni di dell'oggetto ContoCorrente.
     * @return Stringa che mi dice le informazioni dell'ogetto ContoCorrente.
     */
    public String toString(){
        return "Nome: " + proprietario.getNome() + "\nCognome: " + proprietario.getCognome() + "\nSaldo: " + this.flous;
    }
}
