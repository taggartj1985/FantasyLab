package enemies;

public class Dragon extends Enemy{
    public Dragon(String name, int healthPoints){
        super(name, healthPoints);
    }

    public int attack(){
        return 10;
    }
}
