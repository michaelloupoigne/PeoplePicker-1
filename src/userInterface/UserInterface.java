/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author localwsp
 */
public class UserInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voulez-vous charger un fichier (L) ou rechercher des données (S) ? ");
        String rep = sc.next();
        switch (rep) {
            case "L": {
                // ReadFileUsingJFileChooser.main(args);
                break;
            }
            case "S": {
                System.out.println(
                        "Sur quoi voulez vous faire la recherche? (1: Prenom, 2:Nom, 3: Telephone");
                int reponse = sc.nextInt();
                UISearch.searchTrav(reponse);
            }
        }

    }
}