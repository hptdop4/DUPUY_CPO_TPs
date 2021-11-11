/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dupuy;

/**
 *
 * @author ROXANA
 */
public class Voiture {
    String modele ;
    String marque ;
    int puissanceCV ;
    Personne Proprietaire ;
    
    
public Voiture(String unModele, String uneMarque, int unePuissanceCV, Personne NULL) {
 modele = unModele;
 marque = uneMarque;
 puissanceCV = unePuissanceCV;
 Proprietaire = NULL;
 
  }        

@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = modele + marque ;
return chaine_a_retourner;
}

}
