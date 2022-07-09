import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

public class placar extends Actor
{
    public int pontos;
     
    public placar() 
    {
        pontos = 0;
        atualizarPlacar();
    }
    public void atualizarPlacar() 
    {
        //Inseri o Score na tela
        setImage(new GreenfootImage("Score: " + pontos, 25, Color.YELLOW, new Color(0,0,0,0)));
    }    
     
    public void perderPonto()
    {
        pontos--;
        atualizarPlacar();
    }

    public void ganharPonto() 
    {
        pontos++;
        atualizarPlacar();
    }

    public int getPonto() 
    {
        return pontos;
    }
}
