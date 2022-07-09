import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class tela_inicial extends World
{
    private botao_iniciar button_initial;
    public tela_inicial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        
        GreenfootImage bg = new GreenfootImage("images\\tela_inicial.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        button_initial = new botao_iniciar();
        
        this.addObject(button_initial, 600, 500);
    }
}
