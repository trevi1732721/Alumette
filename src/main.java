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
        boolean jouer= true;
        byte choix1 = 0;
        Scanner sc = new Scanner(System.in);

        while(jouer){
        System.out.println("Quel est le mode de jeu?\n1- Joueur  VS Joueur\n2- Joueur  VS Ordinnateur ");
        choix1 = sc.nextByte();

        switch(choix1){
            case 1://fine its done
                System.out.println(" Joueur 1, quel est votre nom?");
                joueurs[0] = sc.next();
                System.out.println(" Joueur 2, quel est votre nom?");
                joueurs[1] =sc.next();
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
                                else{
                                    System.out.print("choix invalide\n");
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
                                else{
                                    System.out.print("choix invalide\n");
                                }
                            }
                        }
                    }
                    System.out.println(joueurs[nbTours % 2] + " gagne la partie!, \n Résumé de la partie (coups jouées dans l'ordre...)");
                    System.out.println(joueurs[0] + " :" + joueur0);
                    System.out.println(joueurs[1] + " :" + joueur1);
                    choix = true;
                    while (choix) {
                        System.out.println("voulez vous continuer à jouer? \n 1- Oui\n 2- Non, je veux changer de mode");
                        nbTours = sc.nextInt();
                        if (nbTours == 2) {
                            continuer = false;
                            choix = false;
                        }
                        else if (nbTours == 1) {
                            choix = false;
                        }
                        else{
                                System.out.print("choix invalide\n");
                            }
                    }

                }
                break;
            case 2:
                System.out.println(" Joueur 1, quel est votre nom?");
                joueurs[0] = sc.next();
                continuer = true;
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
                            if((nbAllumette-2)%4 == 0){
                                nbAllumette= nbAllumette-1;
                                --nbTours;
                            }
                            else if((nbAllumette-3)%4 == 0) {
                                nbAllumette = nbAllumette-2;
                                --nbTours;
                            }
                            else if((nbAllumette-4)%4 == 0) {
                                nbAllumette = nbAllumette-3;
                                --nbTours;
                            }
                        }
                    }
                    System.out.println(joueurs[nbTours % 2] + " gagne la partie!, \n Résumé de la partie (coups jouées dans l'ordre...)");
                    System.out.println(joueurs[0] + " :" + joueur0);
                    System.out.println(joueurs[1] + " :" + joueur1);
                    choix = true;
                    while (choix) {
                        System.out.println("voulez vous continuer à jouer? \n 1- Oui\n 2- Non, je veux changer de mode");
                        nbTours = sc.nextInt();
                        if (nbTours == 2) {
                            continuer = false;
                            choix = false;
                        }
                        else if(nbTours == 1) {
                            choix = false;
                        }
                        else{
                            System.out.println("choix invalide\n");
                        }
                    }
                }
                    break;
                default:
                System.out.print("choix invalide\n");
                break;

                }
                System.out.print("voulez-vous quitter le programe?\n 1- Oui\n 2- Non");
            nbTours = sc.nextInt();
            if (nbTours == 2) {
                jouer = false;
            }
            else if(nbTours == 1) {
                choix=false;
            }
            else {
                System.out.println("choix invalide\n");
            }
        }
    }
    }


