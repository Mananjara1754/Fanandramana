package listener;
 import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import terrain.*;
import sary.*;
public class Clavierb implements KeyListener
{
    Terrain kianja;

    public void setKianja(Terrain a)
    {   
        this.kianja=a;
    }

    public Terrain getKianja()
    {
        return this.kianja;
    }
    public Clavierb(Terrain ok)
    {
        this.setKianja(ok);
    }
    public void keyTyped(KeyEvent e)
    {}
    public void keyPressed(KeyEvent e)
    {
        if(this.kianja.getJr2().getSolotena2()==false)
        {
            if(e.getKeyCode()==68)
            {
                this.kianja.getJr2().droite(this.kianja);
                this.kianja.repaint();
                System.out.println(this.kianja.getJr2().getLarge());
            }
            if(e.getKeyCode()==65)
            {
                this.kianja.getJr2().gauche(this.kianja);
                this.kianja.repaint();
                System.out.println(this.kianja.getJr2().getLarge());
            }
        }
        if(this.kianja.getJr2().getSolotena2()==true)
        {
            if(e.getKeyCode()==68)
            {
                this.kianja.setDroite2(true); 
                this.kianja.getBall().setPare(false);
            }
            if(e.getKeyCode()==65)
            {
                this.kianja.setGauche2(true);
                this.kianja.getBall().setPare(false);
            }
            if(e.getKeyCode()==87)
            {
                this.kianja.setHaut2(true);
                this.kianja.getBall().setPare(false);
            }
        }
    }
    public void keyReleased(KeyEvent e)
    {}
}