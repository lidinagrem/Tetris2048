// A class for modeling a point as a location in 2D space

public class Point {
   
   // data fields
   double x; // coordinates in 2D space (specified in integer precision)
   double y;

   // default constructor that initializes both x and y data fields as zero
   public Point() {
      x = y = 0;
   }

   // a constructor that creates a point at a given location (x, y)
   public Point(Double x, double y) {
      this.x = x;
      this.y = y;
   }

   // getter method for the x coordinate of this point
   public double getX() {
      return x;
   }

   // getter method for the y coordinate of this point
   public double getY() {
      return y;
   }

   // setter method for the x coordinate of this point
   public void setX(double x) {
      this.x = x;
   }

   // setter method for the y coordinate of this point
   public void setY(double y) {
      this.y = y;
   }

   // moves this point by dx along the x axis and by dy along the y axis
   public void translate(double dx, double dy) {
      x += dx;
      y += dy;
   }

   // moves this point to a given location (x, y)
   public void move(double x, double y) {
      this.x = x;
      this.y = y;
   }
}