import ddf.minim.*;  
Minim minim;
AudioSample sound;

int xPosition = 250;
int speed = 6;
int yPosition = 250;

void setup() {
  size(500, 500);
background(0, 0, 0);
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
}

void draw() {
 background(0, 0, 0);
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
      speed = 6; }
  }