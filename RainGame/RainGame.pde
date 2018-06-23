int yPosition = 20;
int xPosition = 250;
int score = 0;

void setup() {
size (500,500);   
}



void draw() {
  background(255,255,255);
  
  fill(#03DBFF);
stroke(#01090A);
ellipse(xPosition, yPosition, 25, 25);
yPosition = yPosition + 7;

if (yPosition > 500) {
  checkCatch();
  xPosition = (int) random(width);
  yPosition = 20; }

fill(#E7F534);
stroke(#FF0F2B);
rect(mouseX, 450, 50, 50);

fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}


void checkCatch(){
     if (xPosition > mouseX && xPosition < mouseX+50)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); 
   } 