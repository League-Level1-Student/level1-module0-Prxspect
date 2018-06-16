int score = 0;
int yPosition = 20;
void setup() {
size (500,500);   

}


void draw() {
  background(255,255,255);
 for (int i=0; i<50; i++) {
  fill(#03DBFF);
stroke(#01090A);
ellipse(250, yPosition, 25, 25);
 }
yPosition = yPosition + 7;
fill(#E7F534);
stroke(#FF0F2B);
rect(mouseX, 450, 50, 50);

}


void checkCatch(int x){
     if (x > mouseX && x < mouseX+50)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }
