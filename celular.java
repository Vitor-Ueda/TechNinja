import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class celular extends Actor
{
    public celular()
    {
        //Insere o celular e seu tamanho
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
       
    public void act()
    {   
        //Se ninja tocar em celular ganha um ponto e atualiza o placar
        boolean toque = this.isTouching(ninja.class);
        if (toque == true)
        {
            placar p = fase1.getPlacar();
            p.ganharPonto();
            //Greenfoot.delay(45);
        }
        //Adiciona movimentação para o celular
        setLocation(getX(), getY()+5);
    
        //Se tocar na borda ele mova para a localização 0
        if(isAtEdge())
        {
            setLocation(Greenfoot.getRandomNumber(1200), 0);
        }
    }
}
