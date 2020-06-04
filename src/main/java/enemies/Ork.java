package enemies;

public class Ork extends Enemy{
    public Ork(String name, int healthPoints){
        super(name, healthPoints);
    }

    public int attack(){
        return 1;
    }
}
