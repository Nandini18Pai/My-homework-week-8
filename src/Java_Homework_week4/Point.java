package Java_Homework_week4;

public class Point {
    int x;
    int y;
     Point(){

     }
   Point(int x,int y) {
       this.x = x;
       this.y = y;
   }

    public int getX (){
         return x;
    }
    public int getY (){
        return y;
    }

    public void  setX (int x){
        this.x = x;
    }
    public void  setY (int y){
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((this.x - 0)*(this.x - 0) + (this.y - 0) * (this.y - 0));
    }
    public double distance(int x, int y){
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y) * (this.y - y));
    }
    public double distance(Point a){
        return Math.sqrt((this.x - a.x)*(this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(first));
        System.out.println("distance(2,2)= " + second.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}







