package affiche;
import sary.*;
import terrain.*;
import javax.swing.*;
import java.awt.*;
import listener.*;
public class Affiche extends JFrame
{
    Joueur jr1;
    Joueur jr2;
    Baolina ball;

    public void setJr1(Joueur k)
    {
        this.jr1=k;
    }
    public void setJr2(Joueur k)
    {
        this.jr2=k;
    }
    public Joueur getJr1()
    {
        return this.jr1;
    }
    public Joueur getJr2()
    {
        return this.jr2;
    }
    public void setBall(Baolina j)
    {
        this.ball=j;
    }
    public Baolina getBall()
    {
        return this.ball;
    }
    public Affiche(Joueur a,Joueur b,Baolina c)
    {
        this.setJr1(a);
        this.setJr2(b);
        this.setBall(c);
    }
    public void affiche()
    {
        JFrame structure=new JFrame();
        structure.setSize(500,500);
        structure.setLocationRelativeTo(null);
        
        JPanel conteneur = new JPanel( new GridLayout(1,2));
        
        JLabel score1=new JLabel("0");
        JLabel score2=new JLabel("0");

        Terrain kianja=new Terrain(score1,score2,this.jr1,this.jr2,this.ball);
        conteneur.add(kianja);
        Clavierb cavs=new Clavierb(kianja);
        structure.addKeyListener(cavs);
        
        JPanel soratra=new JPanel();
        JLabel soratra1=new JLabel("Voalohany");
        JLabel soratra2=new JLabel("Faharoa");
        
        soratra.add(soratra1);
        soratra.add(score2);
        soratra.add(soratra2);
        
        soratra.add(score1);
        conteneur.add(soratra);
        
        Clavier mieno=new Clavier(kianja);
        structure.addKeyListener(mieno);
        structure.add(conteneur);

        structure.setVisible(true);
    }
}