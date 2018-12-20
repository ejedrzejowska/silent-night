package carol;

public class Main {
    public static int DEFAULT_VELOCITY = 70;
    public static int DEFAULT_TEMPO = 100;

    public static void main(String[] args) {

            Player player = new Player(DEFAULT_TEMPO, DEFAULT_VELOCITY);

            new Thread(() -> player.start()).start();

            new Thread(() -> player.start2()).start();

    }
}
