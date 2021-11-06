/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_dupuy;

/**
 *
 * @author ROXANA
 */
public class TP2_Bieres_DUPUY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // AVANT LA MISE EN PLACE DU CONSTRUCTEUR
     /*  BouteilleBiere uneBiere = new BouteilleBiere() ;
       uneBiere.nom = "Cuvée des trolls";
       uneBiere.degreAlcool = 7.0 ;
       uneBiere.brasserie = "Dubuisson";
       uneBiere.ouverte = false;
       uneBiere.lireEtiquette();
       
       BouteilleBiere deuxiemeBiere = new BouteilleBiere ();
       deuxiemeBiere.nom = "Leffe";
       deuxiemeBiere.degreAlcool = 6.6 ;
       deuxiemeBiere.brasserie = "Abbaye de Leffe";
       
       deuxiemeBiere.lireEtiquette();
    }*/
    
     //APRES LA MISE EN PLACE DU CONSTRUCTEUR
     BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
     uneBiere.lireEtiquette ();
     BouteilleBiere deuxiemeBiere = new BouteilleBiere ("Desperardos", 5.0, "Mont Blanc");
     deuxiemeBiere.lireEtiquette ();
     BouteilleBiere troisiemeBiere = new BouteilleBiere ("Guiness", 6.2, "La Taverne");
     troisiemeBiere.lireEtiquette ();
     BouteilleBiere quatriemeBiere = new BouteilleBiere ("Heineken", 7.4, "Le Gapiand");
     quatriemeBiere.lireEtiquette ();
}
