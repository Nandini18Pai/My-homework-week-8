package poolArea;

/**
 * 1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name
 * width and length both of type double.
 * <p>
 * 1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name
 * width and length both of type double.
 */
public class Rectangle {

    double width;
    double length;

    public Rectangle(double width,double length )
    {
        if (width<0)
        {   this.width =0;

        } else {
            this.width =width;
        }

        if (length<0)
        {   this.length =0;

        } else {
            this.length =width;
        }

    }

        public double getWidth (){


        return width;
        }
        public double getLength (){

        return length;
        }


        public double getArea (){

        return width*length;
        }

}
