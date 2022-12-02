package sary;
import terrain.*;
import javax.swing.*;
import java.awt.*;

public class Joueur extends JPanel
{
    int large;
    int hauteur;
    boolean solotena;
    boolean solotena2;
    int point;

    public void setPoint(int a)
    {
        this.point=a;
    }
    public int getPoint()
    {
        return this.point;
    }
    public void setSolotena2(boolean y)
    {
        this.solotena2=y;
    }
    public boolean getSolotena2()
    {
        return this.solotena2;
    }
    public void setHauteur(int a)
    {
        if(a>=0)
        {
            this.hauteur=a;
        }
    }
    public int getHauteur()
    {
        return this.hauteur;
    }
    public void setLarge(int a)
    {
        if(a>=0)
        {
            this.large=a;
        }
    }
    public int getLarge()
    {
        return this.large;
    }
    public void setSolotena(boolean a)
    {
        this.solotena=a;
    }
    public boolean getSolotena()
    {
        return this.solotena;
    }
    public Joueur(int d,int a,int b)
    {
        this.setPoint(d);
        this.setLarge(a);
        this.setHauteur(b);
    }
    public void droite(Terrain kianja)
    {
        if(this.large<=kianja.getWidth()-150)
        {
            this.setLarge(this.getLarge()+5);
        }
    }
    public void gauche(Terrain kianja)
    {
        if(this.large>=0)
        {
            this.setLarge(this.getLarge()-5);
        }
    }
}