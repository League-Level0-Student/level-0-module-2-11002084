  // 4. create three integer variables to  
    //    represent the x, y, and the size of the ellipse
   int x=250; 
   int y=250;
   int size=50;
    
    void setup() {
      //1. set the size of your sketch
    size(500,500);
    }
    
    void draw() {
      //2. set the background color of your sketch
       background(255,0,0);
      //3. draw an ellipse. Make sure it fits in the window.
      ellipse(x,y,size,size);
      //5. use the variables created in step 4 to in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      int distance;
      //6b. use the getDistance method to initialize your varible
     distance=getDistance(mouseX,mouseY,x,y);
      //    use the mouse's x and y and the x and y of your ellipse 
     
      //7. print the distance variable
    println(distance);
      
      //8a. make an if statement to check if the distance variable
      //   is greater than negative half the size of the ellipse,
      //   and less than positive half the size of the ellipse.
if(distance>-size/2 && distance<size/2){
      
        //8b.  set the x and y of the ellipse to a random location on the window
       int random=(int)random(500);
       int random2=(int)random(500);
       ellipse (random,random2,50,50);
}
       
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(x2 * x2 + y2 * y2) - (int)Math.sqrt(x1 * x1 + y1 * y1);
    }
    