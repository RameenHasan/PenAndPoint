public class pen extends point{
    pen(int x, int y){
        super(x,y);
    }

    public void moveTo(point p){
        System.out.println("Moving to " +p);
    }
    public void lineTo(point R){
        System.out.println("Line to " +R);
    }
}