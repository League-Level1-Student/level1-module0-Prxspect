
void setup() {
  
  size(500, 500);
background(0, 0, 0);

}

void draw() {
  
  fill(#DAB4F5);
  ellipse(getWormX(0),getWormY(0),30,60);
  
  fill(#552A31);
  ellipse(getWormX(50),getWormY(50),30,60);
 
  fill(#F4F507);
  ellipse(getWormX(100),getWormY(100),30,60);
  
  fill(#CE34BC);
  ellipse(getWormX(150),getWormY(150),30,60);
 
  fill(#2518C4); 
  ellipse(getWormX(200),getWormY(200),30,60);
 
  fill(#07F5DF);
  ellipse(getWormX(250),getWormY(250),30,60);
  
  fill(#42F507);
  ellipse(getWormX(300),getWormY(300),30,60);
  
  fill(#F55307);
  ellipse(getWormX(350),getWormY(350),30,60);
  
  fill(#95B49B);
  ellipse(getWormX(400),getWormY(400),30,60);
  
  fill(#FFFFFF);
  ellipse(getWormX(450),getWormY(450),30,60);
  
  fill(#FF0000);
  ellipse(getWormX(500),getWormY(500),30,60);
  
  
  
  
  
  makeMagical();
  
  
  
}

float frequency = .012;
float noiseInterval = 400;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}