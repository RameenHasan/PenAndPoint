public class Main {
    public static void main(String[] args){
       point p1 = new point(5,5);
       point p2 = new point(5,5);
        System.out.println("p1 = " +p1);
        System.out.println("p2 = " +p2);
       p1.set(5,5);
       p2.set(5,5);

       point R1 = p1.add(p2);
       System.out.println("after adding q to p:\np = " +R1);
        System.out.println("\np1 = " +p1);
        System.out.println("p2 = " +p2);

       pen picasso = new pen(0,0);
       picasso.moveTo(p1);
       picasso.lineTo(p2);

    }
}