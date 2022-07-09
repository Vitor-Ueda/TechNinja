import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pena extends Actor
{
    public pena()
    {
       ////Insere a pena e seu tamanho
       GreenfootImage image = getImage();
       image.scale(60,60);
       setImage(image);
    }
    public void act()
    {
        boolean toque = this.isTouching(ninja.class);
       if (toque == true) 
       {
         placar p = fase1.getPlacar();
         p.ganharPonto();
         //Greenfoot.delay(45);  //atraso proposital - em quadros
       } 
       
       //Adiciona movimentação para a pena
        setLocation(getX(), getY()+5);
        
        //Se tocar na borda ele mova para a localização 0
        if(isAtEdge())
        {
            setLocation(Greenfoot.getRandomNumber(1200), 0);
        }
    }
}
