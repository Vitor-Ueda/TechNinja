import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class maquina_escrever extends Actor
{
    private maquina_escrever maquina_escrever;
    public maquina_escrever() 
    {
        //Insere a maquina de escrever e seu tamanho
       GreenfootImage image = getImage();
       image.scale(60,60);
       setImage(image);
    }
    
    public void act()
    {
        //Se ninja tocar em maquina de escrever perde um ponto e atualiza o placar
        boolean toque = this.isTouching(ninja.class);
        if (toque == true) 
        {
            placar p = fase1.getPlacar();
            p.perderPonto();
        }   
        //Adiciona movimentação para a maquina de escrever
        setLocation(getX(), getY()+5);
        
        //Se tocar na borda ele mova para a localização 0
        if(isAtEdge())
        {
            setLocation(Greenfoot.getRandomNumber(1200), 0);
        }
    }
}
