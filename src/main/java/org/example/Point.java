package org.example;

public class Point {
   private int x;
   private int y;

   public Point(int x, int y)
   {
       this.x = x;
       this.y = y;
   }

   public int getX()
   {
       return  x;
   }

   public void setX(int x)
   {
       this.x = x;
   }

   public int getY()
   {
       return y;
   }

    public void setY(int y) {
        this.y = y;
    }

    public double distance()
    {
        double result = ((this.x-0)*(this.x-0))+((this.y-0)*(this.y-0));
        return Math.sqrt(result);
    }

    public double distance(Point p)
    {
       return distance(p.getX(),p.getY());
    }

    public double distance(int a, int b)
    {
        double result = (((a-x)*(a-x))+((b-y)*(b-y)));
        return Math.sqrt(result);
    }
}
