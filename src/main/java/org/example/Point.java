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

    //Burada da sadece constructorda verilen x ve y kullanılarak 0 noktasına olan uzaklığı hesaplanıyor.
    public double distance()
    {
        double result = ((this.x-0)*(this.x-0))+((this.y-0)*(this.y-0));
        return Math.sqrt(result);
    }

    //Burada argüman olarak gelen pnin x ve y değerleri kullanılarak ve bu sınıfın x ve y değerleri
    //kullanılarak distance hesaplanıyor.
    public double distance(Point p)
    {
       return distance(p.getX(),p.getY());
    }

    //Burada da argüman olarak verilen ve constructor anında verilmiş olan x ve y değerleri kullanılarak
    //distance hesaplanıyor.
    public double distance(int a, int b)
    {
        double result = (((a-x)*(a-x))+((b-y)*(b-y)));
        return Math.sqrt(result);
    }
}
