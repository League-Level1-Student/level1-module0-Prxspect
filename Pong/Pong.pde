PImage backgroundImage;

import ddf.minim.*;  
Minim minim;
AudioSample sound;

int xPosition = 250;
int speed = 6;
int yPosition = 250;
int paddleX = mouseX;
int paddleY = 470;
int paddleLength = 70;


void setup() {
  
 size(500, 500);
background(0, 0, 0);

minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);

backgroundImage = loadImage("image.jpg");
}

void draw() {
image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
  
  
 fill(255, 255, 255);
stroke(255, 0, 0);
ellipse(xPosition, yPosition, 30, 30);

xPosition = xPosition + speed;
yPosition = yPosition - speed;

if (xPosition < 15) {
  speed = 6; }
if (xPosition > 485) {
  speed = -6; }
  
 if (yPosition < 15) {
    speed = -6; }
 if (yPosition > 485) {
     sound.trigger();    
     speed = 6; }
     
 rect(paddleX, paddleY, paddleLength, 5); }
 

 boolean intersects(int xPosition, int yPosition, int paddleX, int paddleY, int paddleLength) {
     if (yPosition > paddleY && xPosition > paddleX && xPosition < paddleX + paddleLength)
          return true;
     else 
          return false;

     
 }