import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class televisao extends Actor
{
   public televisao()
   {
       ////Insere a televisao e seu tamanho
       GreenfootImage image = getImage();
       image.scale(50,50);
       setImage(image);
   }
   public void act()
   {
       //Se ninja tocar em televisão ganha um ponto e atualiza o placar
       boolean toque = this.isTouching(ninja.class);
       if (toque == true) 
       {
         placar p = fase1.getPlacar();
         p.ganharPonto();
         //Greenfoot.delay(45);  //atraso proposital - em quadros
       }
       
       //Adiciona movimentação para a televisão
        setLocation(getX(), getY()+5);
        
        //Se tocar na borda ele mova para a localização 0
        if(isAtEdge())
        {
            setLocation(Greenfoot.getRandomNumber(1200), 0);
        }
   }
}
