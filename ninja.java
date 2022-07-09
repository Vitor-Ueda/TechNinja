import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ninja extends Actor
{
    public ninja() 
    {
       //Insere o ninja e seu tamanho
       GreenfootImage image = getImage();
       image.scale(100,100);
       setImage(image);
    }
    public void act()
    {
        setImage("images\\ninja.png");
        
        //Se a tecla esquerda for apertada move o ninja para a esquerda, se chegar até a borda ele não ultrapassará
        if (Greenfoot.isKeyDown("left") && (this.getX()-10 <= this.getWorld().getWidth())&&
        (this.getX()-10 >= 40))
        { 
            setImage("images\\ninja_esquerda.png");
            setLocation(getX()-10,getY());
        }
        
        //Se a tecla esquerda for apertada move o ninja para a esquerda, se chegar até a borda ele não ultrapassará
        if (Greenfoot.isKeyDown("right") && !(this.getX()+50 >= this.getWorld().getWidth())) 
        { //->
            setImage("images\\ninja_direita.png");
            setLocation(getX()+10,getY());
        }
        
        //Se a tecla esquerda for apertada move o ninja para a esquerda, se chegar até a borda ele não ultrapassará
        //if (Greenfoot.isKeyDown("up") && !(this.getX() >= this.getWorld().getWidth()))
        //{
        //    setLocation(getX(),getY()-10);
    
        
        //Se a tecla esquerda for apertada move o ninja para a esquerda, se chegar até a borda ele não ultrapassará
        //if (Greenfoot.isKeyDown("down")) 
        //{
        //    setLocation(getX(),getY()+10);
        //}
          
        //Faz com que o objeto maquina de escrever suma ao ninja toca-la
        Actor maquina_escrever;
        maquina_escrever = getOneIntersectingObject(maquina_escrever.class);
        if(maquina_escrever != null)
        {
            World f1;
            f1 = getWorld();
            f1.removeObject(maquina_escrever);
            placar x = fase1.getPlacar(); 
            x.perderPonto();
        }
        
         //Faz com que o objeto televisao suma ao ninja toca-la
        Actor televisao;
        televisao = getOneIntersectingObject(televisao.class);
        if(televisao != null)
        {
            World f1;
            f1 = getWorld();
            f1.removeObject(televisao);
            placar x = fase1.getPlacar(); 
            x.ganharPonto();
        }
        
        //Faz com que o objeto celular suma ao ninja toca-la
        Actor celular;
        celular = getOneIntersectingObject(celular.class);
        if(celular != null)
        {
            World f1;
            f1 = getWorld();
            f1.removeObject(celular);
            placar x = fase1.getPlacar(); 
            x.ganharPonto();
        }
        
        //Faz com que o objeto pena suma ao ninja toca-la
        Actor pena;
        pena = getOneIntersectingObject(pena.class);
        if(pena != null)
        {
            World f1;
            f1 = getWorld();
            f1.removeObject(pena);
            placar x = fase1.getPlacar();
            x.perderPonto();
        }
    }
}
        
    
