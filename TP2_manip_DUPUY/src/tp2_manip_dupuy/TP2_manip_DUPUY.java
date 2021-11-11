/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_dupuy;

/**
 *
 * @author ROXANA
 */
public class TP2_manip_DUPUY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette (500);
        Tartiflette assiette2 = new Tartiflette (700);
        Tartiflette assiette3 = assiette2;
        
        System.out.println("nb de calories de Assiette 2 : " + 
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + 
        assiette3.nbCalories) ;
        
       //Moussaka assiette666 = assiette1 ;
       //Moussaka assiette667 = new Tartiflette() ;
       //Ces deux lignes ne sont pas correctes : la première car la class tartiflette ne peut pas être convertie en Moussaka.
       
       Moussaka []tableau;
       tableau = new Moussaka [10];
       tableau[0] = new Moussaka (6);
       tableau[1] = new Moussaka (11);
       tableau[2] = new Moussaka (3);
       tableau[3] = new Moussaka (35);
       tableau[4] = new Moussaka (27);
       tableau[5] = new Moussaka (118);
       tableau[6] = new Moussaka (8);
       tableau[7] = new Moussaka (456);
       tableau[8] = new Moussaka (2);
       tableau[9] = new Moussaka (70);
       tableau[10] = new Moussaka (7);
    }
    
}
// Question 4 : assiette 2 et assiette3 référence la même tartiflette car elles affichent le même nombre de calories.
// Si je change le nombre pour l'assiette 2, le nombre pour la n°3 change lui aussi.
// Question 6 : une référence objet qui annonce référencer un type d’objet ne peut pas en référencer un autre qui n’a aucun rapport.