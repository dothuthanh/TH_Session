package session.model;

public class MyHouse {
    private int count;
    public MyHouse(){

    }
    public MyHouse(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public  int increment() {
        return count++;
    }
}
