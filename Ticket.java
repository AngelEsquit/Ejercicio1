import java.util.Random;

public class Ticket {
    private int num;
    Random random = new Random();

    public void setNum() {
        this.num = random.nextInt(15000) + 1;
    }

    public int getNum() {
        return num;
    }
}