/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package damenalexandrocontocorrente;

/**
 *
 * @author damen.alexandro
 */
public class Propritario {
    private String nome;
    private String cognome;
    /**
     * Metodo che costruisce l'oggetto Proprietario.
     * @param nome Nome del proprietario.
     * @param cognome Cognome del proprietario.
     */
    public Propritario(String nome, String cognome){
        this.nome=nome;
        this.cognome=cognome;
    }
    /**
     * Metodo getter per ottenere il valore dell'attributo nome.
     * @return Nuovo valore di nome.
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Metodo getter per ottenere il valore dell'attributo cognome.
     * @return Nuovo valore di cognome.
     */
    public String getCognome(){
        return this.cognome;
    }
    
}
