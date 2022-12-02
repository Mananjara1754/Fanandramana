package terrain;
import sary.*;
import javax.swing.*;
import java.awt.*;

public class Terrain extends JPanel
{
    int x=0;
    int y=0;
    int width=800;
    int height=900;
    
    Joueur jr1;
    Joueur jr2;
    Baolina ball;
    boolean haut;
    boolean gauche;
    boolean droite;
    boolean bas;
    boolean droite2;
    boolean gauche2;
    boolean haut2;
    JLabel wrt1;
    JLabel wrt2;

    public void setWrt1(JLabel h)
    {
        this.wrt1=h;
    }
    public JLabel getWrt1(JLabel h)
    {
        return this.wrt1;
    }
    public void setWrt2(JLabel h)
    {
        this.wrt2=h;
    }
    public JLabel getWrt2(JLabel h)
    {
        return this.wrt2;
    }

    public void setHaut2(boolean g)
    {
        this.haut2=g;
    }
    public boolean getHaut2()
    {
        return this.haut2;
    }
    public void setGauche2(boolean g)
    {
        this.gauche2=g;
    }
    public boolean getGauche2()
    {
        return this.gauche2;
    }

    public void setDroite2(boolean k)
    {
        this.droite2=k;
    }
    public boolean getDroite2()
    {
        return this.droite2;
    }
    public void setBas(boolean j)
    {
        this.bas=j;
    }
    public boolean getBas()
    {
        return this.bas;
    }
    public void setDroite(boolean k)
    {
        this.droite=k;
    }
    public boolean getDroite()
    {
        return this.droite;
    }
    public void setGauche(boolean g)
    {
        this.gauche=g;
    }
    public boolean getGauche()
    {
        return this.gauche;
    }
    public void setHaut(boolean g)
    {
        this.haut=g;
    }
    public boolean getHaut()
    {
        return this.haut;
    }
    public void setX(int a)
    {
        this.x=a;
    }
    public int getX()
    {
        return this.x;
    }
    public void setY(int a)
    {
        this.y=a;
    }
    public int getY()
    {
        return this.y;
    }
    public void setWidth(int a)
    {
        if(a>=0)
        {
            this.width=a;
        }
    }
    public int getWidth()
    {
        return this.width;
    }
    public void setHeight(int a)
    {
        if(a>=0)
        {
            this.height=a;
        }
    }
    public int getHeight()
    {
        return this.height;
    }
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

    public Terrain(JLabel k,JLabel kk,Joueur jr1,Joueur jr2,Baolina b)
    {
        this.setWrt1(k);
        this.setWrt2(kk);
        this.setJr1(jr1);
        this.setJr2(jr2);
        this.setBall(b);

        jr1.setLarge(jr1.getWidth()/2-150/2);
        jr1.setHauteur(0);
        jr2.setLarge(jr2.getWidth()/2-150/2);
        jr2.setHauteur(jr2.getHeight()-150);
        System.out.println(this.haut + "testtttttttt ohhhhhhhhhhhhhhh");

    }

    public void paint(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillRect(this.x,this.y,this.width,this.height);
        g.setColor(Color.BLACK);
        
        g.drawLine(this.x,this.height/2,this.width,this.height/2);
        g.fillRect(this.jr1.getLarge(),this.jr1.getHauteur(),150,50);
        g.fillRect(this.jr2.getLarge(),this .jr2.getHauteur(),150,50);
        g.setColor(Color.BLUE);
        g.fillOval(this.ball.getXbol(),this.ball.getYbol(),25,25);
        
        if(this.bas==true)
        {
            this.ball.midina(this,this.jr1);
            this.ball.verification2(this,this.jr2);
            this.wrt1.setText(String.valueOf(this.jr1.getPoint()));
            try
            {
                Thread.sleep(1);
            }
            catch(Exception p){}        
        }
        if(this.haut==true)
        {   
            this.ball.miakatra(this);
            this.ball.verification(this,this.jr1);
            this.wrt2.setText(String.valueOf(this.jr2.getPoint()));
            try
            {
                Thread.sleep(1);
            }
            catch(Exception p){}          
        }
        if(this.gauche==true && this.haut==false)
        {
            this.ball.diagogauche(this,this.jr1);
            this.ball.verification2(this,this.jr2);
            this.wrt1.setText(String.valueOf(this.jr1.getPoint()));
            try
            {
                Thread.sleep(1);
            }
            catch(Exception p){}          
        }
        if(this.gauche==false && this.haut==false && this.droite==true)
        {
            this.ball.diagodroite(this,this.jr1);
            this.ball.verification2(this,this.jr2);
            this.wrt1.setText(String.valueOf(this.jr1.getPoint()));
            try
            {
                Thread.sleep(1);
            }
            catch(Exception p){}     
        }
        if(this.droite2==true)
        {
            this.ball.Hdiagodroite(this,this.jr2);
            this.ball.verification(this,this.jr1);
            this.wrt2.setText(String.valueOf(this.jr2.getPoint()));
            try
            {
                Thread.sleep(1);
            }
            catch(Exception p){}    
        }
        if(this.gauche2==true && this.droite2==false)
        {
            this.ball.Hdiagogauche(this,this.jr2);
            this.ball.verification(this,this.jr1);
            this.wrt2.setText(String.valueOf(this.jr2.getPoint()));
            try
            {
                Thread.sleep(1);
            }
            catch(Exception p){} 
        }
        if(this.haut2==true)
        {
            this.ball.haut(this,this.jr2);
            this.ball.verification(this,this.jr1);
            this.wrt2.setText(String.valueOf(this.jr2.getPoint()));
            try
            {
                Thread.sleep(1);
            }
            catch(Exception p){} 
        }
        if(this.ball.getYbol()>=0 && this.ball.getYbol()<this.getHeight())
        {
            repaint();
        }
    }
}