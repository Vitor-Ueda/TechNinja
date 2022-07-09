import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class fase1 extends World
{
    //Atributos da classe
    public ninja ninja_parado;
    public static placar plc;
    public static tempo tmp;
    public static GreenfootSound musicaFundo;
 
    public fase1()
    {  
        super(1200, 700, 1);
        
        //Inserindo a imagem de fundo fase1
        GreenfootImage bg = new GreenfootImage("images\\cyberpunk.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        //Instancia o ninja e o placar
        criarComponentes();
    }
    
    public void act()
    {
        if((Greenfoot.getRandomNumber(5000) <= 40) && (Greenfoot.getRandomNumber(5000) <= 45))
        {
            //Adiciona maquina de escrever de maneira aleatoria
            addObject(new maquina_escrever(), Greenfoot.getRandomNumber(1100), 0);
        }
        
        if((Greenfoot.getRandomNumber(5000) <= 30) && (Greenfoot.getRandomNumber(5000) > 40))
        {
            //Adiciona celular de maneira aleatoria
            addObject(new televisao(), Greenfoot.getRandomNumber(1100), 0);
        }
        
        if((Greenfoot.getRandomNumber(5000) <= 20) && (Greenfoot.getRandomNumber(5000) > 30))
        {
            //Adiciona celular de maneira aleatoria
            addObject(new celular(), Greenfoot.getRandomNumber(1100), 0);
        }
        
        if((Greenfoot.getRandomNumber(5000) <= 10) && (Greenfoot.getRandomNumber(5000) > 20))
        {
            //Adiciona pena de maneira aleatoria
            addObject(new pena(), Greenfoot.getRandomNumber(1100), 0);
        }
    }
    
    //Inserindo os Actors dentro da fase1
    public void criarComponentes()
    {
        //Instanciando ninja
        ninja_parado = new ninja();
        
        //Instanciando Placar
        plc = new placar();
        //Instanciando Tempo
        tmp = new tempo();
        
        //Inserindo ninja
        this.addObject(ninja_parado, 80, 600);
        //Inserindo placar
        this.addObject(plc, 50,20);
        //Inserindo Tempo
        this.addObject(tmp, 70, 50);
        
        //Coloca musica
        //musicaFundo = new GreenfootSound("sounds\\som_fundo_principal.wav");
        //Faz um loop na música
        //musicaFundo.playLoop();
    }
    
    //retornando o valor de placar para o fase
    public static placar getPlacar()
    {
        return plc;
    }
    //retornando o tempo
    public static tempo getTempo()
    {
        return tmp;
    }
    
    
}
