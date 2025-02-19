package exp5;

public class Sports {
    public static void main(String[] args) {
        Cricket_player cricketPlayer = new Cricket_player("Virat Kohli", 44, "Batsman");
        Football_player footballPlayer = new Football_player("Ronaldo", 30, "Forward");
        Hockey_player hockeyPlayer = new Hockey_player("Krishna Wakhande", 33, "Center");
        
        cricketPlayer.play();
        cricketPlayer.train();
        
        footballPlayer.play();
        footballPlayer.train();
        
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}
