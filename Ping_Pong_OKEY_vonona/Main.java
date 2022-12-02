package main;
import sary.*;
import terrain.*;
import affiche.*;
public class Main
{
    public static void main(String args[])
    {
        Joueur jean1=new Joueur(0,325,0);
        Joueur jean2=new Joueur(0,325,850);
        Baolina b=new Baolina(400,435);
        
        Affiche show=new Affiche(jean1,jean2,b);
        show.affiche();    

    }
}