import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class botao_voltar extends Actor
{
    //Declarando o clique do botao e World
    public botao_voltar()
    {
        //Definindo a escala de tamanho desejada para o botão
        GreenfootImage img = getImage();
        img.scale(200, 300);
        setImage(img);
    }
    public void act() //Define aquilo que objeto (Actor) faz
    {        
        //migrar para a tela inicial se o botão for clicado
        if(Greenfoot.mouseClicked(this))
        {
            tela_inicial tela = new tela_inicial();  //criando uma instância do mundo tela_inicial
            Greenfoot.setWorld(tela);   //Chamando a tela_inicial
        }
    }  
}
