package sary;
import terrain.*;
public class Baolina
{
    int xbol;
    int ybol;
    boolean pare;

    public void setPare(boolean b)
    {
        this.pare=b;
    }
    public boolean getPare()
    {
        return this.pare;
    }
    public void setXbol(int a)
    {
        this.xbol=a;
    }
    public int getXbol()
    {
        return this.xbol;
    }
    public void setYbol(int a)
    {
        this.ybol=a;
    }
    public int getYbol()
    {
        return this.ybol;
    }
    public Baolina(int a,int b)
    {
        xbol=a;
        ybol=b;
    }
    public void miakatra(Terrain kianja)
    {
        if(this.ybol>=0)
        {
            this.setYbol(this.getYbol()-5);
        }
    }
    public void midina(Terrain kianja,Joueur j)
    {
        j.setSolotena(false);
        if(this.ybol<=kianja.getHeight())
        {
            this.setYbol(this.getYbol()+1);
        }
    }
    public void diagodroite(Terrain kianja,Joueur j)
    {
        j.setSolotena(false);
        if(this.ybol<=kianja.getHeight() && this.xbol<=kianja.getWidth())
        { 
            if(this.pare==false)
            {
                this.setXbol(this.xbol+1);
                this.setYbol(this.ybol+1);
            }
            if(this.xbol+1+20==kianja.getWidth())
            {
                this.pare=true;
            }
            if(this.pare==true)
            {
                this.setXbol(this.xbol-1);
                this.setYbol(this.ybol+1);
            }
        }
    }
    public void diagogauche(Terrain kianja,Joueur j)
    {
        j.setSolotena(false);
        if(this.xbol>=0 && this.ybol<=kianja.getHeight())
        {
            if(this.pare==false)
            {
                this.setXbol(this.xbol-1);
                this.setYbol(this.ybol+1);
            }
            if(this.xbol-1==0)
            {
                this.pare=true;
            }
            if(this.pare==true)
            {
                this.setXbol(this.xbol+1);
                this.setYbol(this.ybol+1);
            }
        }
    }

    public void normal(Terrain kianja,Joueur j) //rehefa mivoaka
    {
        this.xbol=j.getLarge()+150/2-20/2;
        this.ybol=50;
        j.setSolotena(true);
        j.setPoint(j.getPoint()+1);
        
        System.out.println(j.getPoint()+"point j2");

    }
    
    public void verification(Terrain kianja,Joueur j1) //verification hoe tafiditra
    {
        if(this.ybol<=50 && this.xbol<=j1.getLarge()+150 && this.xbol>=j1.getLarge())
        {
            kianja.setHaut(false);
            kianja.setDroite2(false);
            kianja.setGauche2(false);
            kianja.setHaut2(false);
            j1.setSolotena(true);
        }
        if(this.ybol<=0)
        {
            this.normal(kianja,j1);   
        }
    }

    public void normal2(Terrain kianja,Joueur j)
    {
        this.xbol=j.getLarge()+150/2-20/2;
        this.ybol=kianja.getHeight()-50-20;
        j.setSolotena(true);
        j.setPoint(j.getPoint()+1);
        System.out.println(j.getPoint()+"point j1");
    }

    public void verification2(Terrain kianja,Joueur j1) //verification hoe tafiditra
    {
        
        if(this.ybol>=kianja.getHeight()-50-20 && this.xbol<=j1.getLarge()+150 && this.xbol>=j1.getLarge())
        {
            kianja.setHaut(false);
            kianja.setDroite(false);
            kianja.setGauche(false);
            kianja.setBas(false);
            j1.setSolotena2(true);
        }
        if(this.ybol>=kianja.getHeight())
        {
            this.normal2(kianja,j1);   
        }
    }

    public void Hdiagodroite(Terrain kianja,Joueur j)
    {
        j.setSolotena2(false);
        if(this.ybol>=0 && this.xbol<=kianja.getWidth())
        { 
            if(this.pare==false)
            {
                this.setXbol(this.xbol+1);
                this.setYbol(this.ybol-1);
            }
            if(this.xbol+1+20==kianja.getWidth())
            {
                this.pare=true;
            }
            if(this.pare==true)
            {
                this.setXbol(this.xbol-1);
                this.setYbol(this.ybol-1);
            }
        }
    }
    public void Hdiagogauche(Terrain kianja,Joueur j)
    {
        j.setSolotena2(false);
        if(this.xbol>=0 && this.ybol>=0)
        {
            if(this.pare==false)
            {
                this.setXbol(this.xbol-1);
                this.setYbol(this.ybol-1);
            }
            if(this.xbol-1==0)
            {
                this.pare=true;
            }
            if(this.pare==true)
            {
                this.setXbol(this.xbol+1);
                this.setYbol(this.ybol-1);
            }
        }
    }

    public void haut(Terrain kianja,Joueur j)
    {
        j.setSolotena2(false);
        if(this.ybol>=0)
        {
            this.setYbol(this.getYbol()-1);
        }
    }
} 