package map;

import java.util.ArrayList;
import java.util.Collections;

public class Room {
    private ArrayList<Exit> exits;

    public Room(){
        this.exits = new ArrayList<Exit>();
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public int numberofExits(){
        return this.exits.size();
    }

    public void findExit(){
        this.exits = new ArrayList<Exit>();
        for(Exits : randomNumber()){
            this.exits.add(new Exit(randomNumber));
        }
    }

    public void shuffleExits(){
        Collections.shuffle(this.exits);
    }
}
