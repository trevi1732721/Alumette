import java.util.Scanner;

/**
 * Created by TreVi1732721 on 2018-01-15.
 */
public class main {
    public static void main(String[] args) {
        //jeu des Allumette
        String[] joueurs = new String[2];
        int nbTours = 0;
        byte retrait;
        boolean continuer = true;
        boolean choix = true;
        byte choix1 = 0

        if(choix1 == 1){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Joueur 1, quel est votre nom?");
        joueurs[0] = sc.nextLine();
        System.out.println(" Joueur 2, quel est votre nom?");
        joueurs[1] = sc.nextLine();
        while (continuer) {
            int nbAllumette = (int) (Math.random() * 80) + 20;
            String joueur0 = " ";
            String joueur1 = " ";
            byte premier = (byte) (Math.random() * 2);
            while (nbAllumette > 0) {
                if (nbTours == 0) {
                    nbTours = nbTours + premier;
                }
                    choix= true;
                if (nbTours % 2 == 0) {
                    while (choix) {
                        System.out.println(joueurs[0] + ", combien d'allumette voulez vous retirer?(un, deux ou trois)\n IL y as " + nbAllumette + " Alumettes..." );
                        retrait = sc.nextByte();
                        if (retrait == 1 || retrait == 2 || retrait == 3) {
                            choix = false;
                            nbAllumette = nbAllumette-retrait;
                            joueur0 += retrait + ", ";
                            nbTours = nbTours+1;
                        }
                    }
                }
                else if (nbTours % 2 == 1) {
                    choix = true;
                    while (choix) {
                        System.out.println(joueurs[1] + ", combien d'allumette voulez vous retirer?(un, deux ou trois)\n IL y as " + nbAllumette + " Alumettes...");
                        retrait = sc.nextByte();
                        if (retrait == 1 || retrait == 2 || retrait == 3) {
                            choix = false;
                            nbAllumette = nbAllumette-retrait;
                            joueur1 += retrait + ", ";
                            nbTours = nbTours+1;
                        }
                    }
                }
                }
            System.out.println(joueurs[nbTours % 2] + " gagne la partie!, \n Résumé de la partie (coups jouées dans l'ordre...)");
            System.out.println(joueurs[0] + " :" + joueur0);
            System.out.println(joueurs[1] + " :" + joueur1);
            choix = true;
            while (choix) {
                System.out.println("voulez vous continuer à jouer? \n 1- Oui\n 2- Non");
                nbTours = sc.nextInt();
                if (nbTours == 2) {
                    continuer = false;
                    choix = false;
                } else if (nbTours == 1) {
                    choix = false;
                }
            }

        }
    }
    else if(choix1==2){
            Scanner sc = new Scanner(System.in);
            System.out.println(" Joueur 1, quel est votre nom?");
            joueurs[0] = sc.nextLine();
            while (continuer) {
                int nbAllumette = (int) (Math.random() * 80) + 20;
                String joueur0 = " ";
                String joueur1 = " ";
                byte premier = (byte) (Math.random() * 2);
                while (nbAllumette > 0) {
                    if (nbTours == 0) {
                        nbTours = nbTours + premier;
                    }
                    choix= true;
                    if (nbTours % 2 == 0) {
                        while (choix) {
                            System.out.println(joueurs[0] + ", combien d'allumette voulez vous retirer?(un, deux ou trois)\n IL y as " + nbAllumette + " Alumettes..." );
                            retrait = sc.nextByte();
                            if (retrait == 1 || retrait == 2 || retrait == 3) {
                                choix = false;
                                nbAllumette = nbAllumette-retrait;
                                joueur0 += retrait + ", ";
                                nbTours = nbTours+1;
                            }
                        }
                    }
                    else if (nbTours % 2 == 1) {
                        choix = true;
                        while (choix) {

                        }
                    }
                }
                System.out.println(joueurs[nbTours % 2] + " gagne la partie!, \n Résumé de la partie (coups jouées dans l'ordre...)");
                System.out.println(joueurs[0] + " :" + joueur0);
                System.out.println(joueurs[1] + " :" + joueur1);
                choix = true;
                while (choix) {
                    System.out.println("voulez vous continuer à jouer? \n 1- Oui\n 2- Non");
                    nbTours = sc.nextInt();
                    if (nbTours == 2) {
                        continuer = false;
                        choix = false;
                    } else if (nbTours == 1) {
                        choix = false;
                    }
                }

            }
        }
    }
}
