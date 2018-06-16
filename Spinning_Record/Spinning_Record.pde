int imageAngle = 0;
PImage pictureOfRecord;
import ddf.minim.*;
Minim minim;
AudioPlayer song;


void setup() {
pictureOfRecord= loadImage("record.png");
size(256, 256);
minim = new Minim(this);
song = minim.loadFile("MarioBros.mp3", 512);
song.play();
}



void draw () {
background(255,255,255);
  if(mousePressed) {
rotateImage(pictureOfRecord,imageAngle);
imageAngle = imageAngle + 10;
song.play()
song.pause()
}
image(pictureOfRecord, 0, 0);
}


void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
