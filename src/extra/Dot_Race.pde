int x=10;
boolean soundPlayed = false;
void setup() {
    size(800, 200);
}

void draw(){
background(0,0,255);

    //3. make it a nice color
fill(255,0,0);
    //4. if the mouse is pressed...
if (mousePressed){
    //5. ... change the X co-ordinate so that the dot moves to the right
x=x+10;
}
    //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
    ellipse(x,50,100,100);
    //6. Make your dot move really fast so that it can win the race 
        //(you have to figure out what part of your code to change)
    //7. Use this method to play a ding when your dot crosses the finish line. 
import ddf.minim.*;
if(x==800){
  playSound();
}
}
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
       AudioSample sound = minim.loadSample("Screaming.wav");
        sound.trigger();
        soundPlayed = true;
    }
}