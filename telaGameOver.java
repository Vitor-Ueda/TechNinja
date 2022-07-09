import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
public class telaGameOver extends World
{
    //Declarando o botão
    private botao_voltar button_return;
    public telaGameOver()
    {    
        super(1200, 700, 1);
        
        //Inserindo a imagem de fundo fase1
        GreenfootImage bg = new GreenfootImage("images\\tela_game_over.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        //Instanciândo o botão voltar
        button_return = new botao_voltar();
        
        //Adicionando botão voltar
        this.addObject(button_return, 380, 500);
    }  
}
