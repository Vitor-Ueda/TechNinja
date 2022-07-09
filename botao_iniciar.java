import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class botao_iniciar extends Actor
{
    public botao_iniciar()
    {
        //Definindo a escala de tamanho desejada para o botão
        GreenfootImage img = getImage();
        img.scale(600, 200);
        setImage(img);
    }
    
    public void act() //Define aquilo que objeto (Actor) faz
    {
        //migrar para a fase se o botão for clicado
        if(Greenfoot.mouseClicked(this))
        {
            fase1 f1 = new fase1();  //criando uma instância para a fase1
            Greenfoot.setWorld(f1);  //Chamando o jogo  
        }
    }
}
