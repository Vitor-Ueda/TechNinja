import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
public class tempo extends Actor
{
    //declara a variavel tempo
    public int tempo = 5000;
    
    public void act()
    {
        //Diminuir o tempo
        tempo--;
        
        //metodo conta tempo
        contadorTempo();
        //se tempo for tempo=0 encerra o game
        if(tempo == 0)
        {
            encerraJogo();
        }
    }
    
    //Colocando o contador de tempo no canto superior esquerdo da cor amarela
    public void contadorTempo()
    {
        setImage(new GreenfootImage("Tempo: " + tempo, 25, Color.YELLOW, new Color(0,0,0,0)));
    }
    
    //Instancia a tela de fim de jogo caso o tempo acabe
    public void encerraJogo()
    {
        Greenfoot.setWorld(new telaGameOver());
    }
}
