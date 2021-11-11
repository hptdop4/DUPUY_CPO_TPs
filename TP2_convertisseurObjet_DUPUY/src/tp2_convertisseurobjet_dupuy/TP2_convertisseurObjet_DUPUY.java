/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_dupuy;

/**
 *
 * @author ROXANA
 */
public class TP2_convertisseurObjet_DUPUY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur conversion1 = new Convertisseur ();
        conversion1.CelciusVersKelvin(0);
        Convertisseur conversion2 = new Convertisseur ();
        conversion2.KelvinVersCelcius(0);
        System.out.println(conversion1) ;
        System.out.println(conversion2) ;


        
    }
    
}
