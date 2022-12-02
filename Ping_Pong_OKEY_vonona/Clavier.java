package listener;
 import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import terrain.*;
import sary.*;
public class Clavier implements KeyListener
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
    public Clavier(Terrain ok)
    {
        this.setKianja(ok);
    }
    public void keyTyped(KeyEvent e)
    {}
    public void keyPressed(KeyEvent e)
    {
        //System.out.println(e.getKeyCode());
        if(this.kianja.getJr1().getSolotena()==false)
        {
            if(e.getKeyCode()==39)
            {
                this.kianja.getJr1().droite(this.kianja);
                this.kianja.repaint();
                System.out.println(this.kianja.getJr1().getLarge());
            }
            if(e.getKeyCode()==37)
            {
                this.kianja.getJr1().gauche(this.kianja);
                this.kianja.repaint();
                System.out.println(this.kianja.getJr1().getLarge());
            }
        }
        if(this.kianja.getJr1().getSolotena()==true)
        {
            if(e.getKeyCode()==37)
            {
                this.kianja.setGauche(true); 
                this.kianja.getBall().setPare(false);
            }
            if(e.getKeyCode()==39)
            {
                this.kianja.setDroite(true);
                this.kianja.getBall().setPare(false);
            }
            if(e.getKeyCode()==40)
            {
                this.kianja.setBas(true);
                this.kianja.getBall().setPare(false);
            }
        }
        
        if(e.getKeyCode()==32)
        {
               this.kianja.setHaut(true);       
        }
    }

    public void keyReleased(KeyEvent e)
    {
        
    }
}