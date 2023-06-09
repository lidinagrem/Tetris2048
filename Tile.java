import java.awt.Color; // the color type used in StdDraw
import java.awt.Font; // the font type used in StdDraw
import java.util.Random; // for random events


// A class used for modeling numbered tiles as in 2048
public class Tile {
   
   // Data fields: class variables

   private static double boundaryThickness = 0.004;                        // the value of the boundary thickness (for the boundaries around the tiles)
   private static Font font = new Font("Arial", Font.PLAIN, 14); // the font used for displaying the tile number
   Point position;        // position of tile
   
   // Data fields: instance variables

   public int number;            // the number on the tile
   private Color backgroundColor; // background (tile) color
   private Color foregroundColor; // foreground (number) color
   private Color boxColor;        // box (boundary) color
   
   // Methods
 
   // The default constructor that creates a tile with 2 or 4 as the number on it
   public Tile() {
      
      this.position = new Point(); // sets the position of the point 
      this.position.x = 0; // sets the position of x to 0
      this.position.y = 0; // sets the position of y to 0

      int[] num_list = {2, 4}; // value array
      int x = num_list[new Random().nextInt(num_list.length)]; // sets the value of x with random either 2 or 4
      
      // properties of the tile with value 2
      if(x == 2){
         this.number = 2;
         this.backgroundColor = new Color(255,194,205);
         this.foregroundColor = new Color(0, 100, 200);
         this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 4
      else 
         this.number = 4;
         this.backgroundColor = new Color(255,147,172);
         this.foregroundColor = new Color(0, 100, 200);
         this.boxColor = new Color(0, 100, 200);

     
   }
   // A method to get the properties of the tiles from value 4 to 8192
   public void mergedTile(int value){

      // properties of the tile with value 4
      if(value == 4){
         this.number = 4;
         this.backgroundColor = new Color(255,147,172);
         this.foregroundColor = new Color(0, 100, 200);
         this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 8
      else if(value == 8){
         this.number = 8;
         this.backgroundColor = new Color(255,98,137);
         this.foregroundColor = new Color(0, 100, 200);
         this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 16
      else if(value == 16){
      this.number = 16;
      this.backgroundColor = new Color(252,52,104);
      this.foregroundColor = new Color(0, 100, 200);
      this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 32
      else if(value == 32){
      this.number = 32;
      this.backgroundColor = new Color(255,8,74);
      this.foregroundColor = new Color(0, 100, 200);
      this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 64
      else if(value == 64){
      this.number = 64;
      this.backgroundColor = new Color(90,188,216);
      this.foregroundColor = new Color(0, 100, 200);
      this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 128
      else if(value == 128){
      this.number = 128;
      this.backgroundColor = new Color(116,204,244);
      this.foregroundColor = new Color(0, 100, 200);
      this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 256
      else if(value == 256){
      this.number = 256;
      this.backgroundColor = new Color(28,163,236);
      this.foregroundColor = new Color(0, 100, 200);
      this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 512
      else if(value == 512){
      this.number = 512;
      this.backgroundColor = new Color(35,137,218);
      this.foregroundColor = new Color(0, 100, 200);
      this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 1024
      else if(value == 1024){
      this.number = 1024;
      this.backgroundColor = new Color(15,94,156);
      this.foregroundColor = new Color(0, 100, 200);
      this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 2048
      else if(value == 2048){
      this.number = 2048;
      this.backgroundColor = new Color(255,179,138);
      this.foregroundColor = new Color(0, 100, 200);
      this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 4096
      else if(value == 4096){
      this.number = 4096;
      this.backgroundColor = new Color(255,146,72);
      this.foregroundColor = new Color(0, 100, 200);
      this.boxColor = new Color(0, 100, 200);
      }
      // properties of the tile with value 8192
      else if(value == 8192){
      this.number = 8192;
      this.backgroundColor = new Color(255,103,0);
      this.foregroundColor = new Color(0, 100, 200);
      this.boxColor = new Color(0, 100, 200);
      }
   }

   // a method for drawing the tile
   public void draw(Point position) {

      // the default value for the side length (sLength) is 1
      double sLength = 1;

      // draw the tile as a filled square
      StdDraw.setPenColor(backgroundColor);
      StdDraw.filledSquare(position.getX(), position.getY(), sLength / 2);
      
      // draw the bounding box around the tile as a square
      StdDraw.setPenColor(boxColor);
      StdDraw.setPenRadius(boundaryThickness);
      StdDraw.square(position.getX(), position.getY(), sLength / 2);
      StdDraw.setPenRadius(); // reset the pen radius to its default value
      
      // draw the number on the tile
      StdDraw.setPenColor(foregroundColor);
      StdDraw.setFont(font);
      StdDraw.text(position.getX(), position.getY(), "" + number);
   }
}