package exp5;

public class Player {
    public String name;
    public int age;
    public String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void play() {
        System.out.println(name + " is playing in position: " + position);
    }

    public void train() {
        System.out.println(name + " is training hard to improve skills.");
    }
}
class Cricket_player extends Player{
    public Cricket_player(String name, int age, String position){
        super(name, age, position);
    }
}
class Football_player extends Player{
    public Football_player(String name, int age, String position){
        super(name, age, position);
    }
}
class Hockey_player extends Player{
    public Hockey_player(String name, int age, String position){
        super(name, age, position);
    }
}
