public class Demo {
    private int x,y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Demo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void show(){
        System.out.println(x+","+y);
    }
}
