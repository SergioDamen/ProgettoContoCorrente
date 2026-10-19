/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package damenalexandrocontocorrente;

/**
 *
 * @author damen.alexandro
 */
import java.util.Scanner;
public class DamenAlexandroContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
        ContoCorrente c1 = new ContoCorrente(100000);
        int scelta, quantita;
        boolean continua=true;
        
        do{
            System.out.print("Inserisci azione(1->Prelievo | 2->Deposito |3->Mostra informazioni | 4->Esci): ");
            scelta = input.nextInt();
            

            switch(scelta){
                case 1:
                    System.out.print("Inserire quantita' del prelievo: ");
                    quantita = input.nextInt();
                    if (c1.canPrelievo(quantita)){
                        c1.Prelievo(quantita);
                    }else{
                        System.out.println("Prelievo non possibile, saldo insufficente.");
                    }
                    
                    break;
                case 2:
                    System.out.print("Inserire quantita' del deposito: ");
                    quantita = input.nextInt();
                    c1.Deposito(quantita);
                    break;
                case 3:
                    System.out.println(c1.toString());
                    break;
                case 4:
                    continua=false;
                    break;
                default:
                    System.out.println("Azione non diponibile");
                    continua=true;
            }
        }while(continua);
    }
}
