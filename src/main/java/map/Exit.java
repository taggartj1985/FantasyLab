package map;

public enum Exit {
    North(1),
    East(2),
    South(3),
    West(4);


    private final int value;
    Exit(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
