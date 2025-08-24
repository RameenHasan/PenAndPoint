public class point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public point add(point p1) {
        int x2 = this.getX() + p1.getX();
        int y2 = this.getY() + p1.getY();
        return new point(x2, y2);

    }

    public String toString() {
        return "(" + x + " , " + y + ")";
    }


}