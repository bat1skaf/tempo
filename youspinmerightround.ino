#include <Servo.h> 

Servo myservo;

void setup() 
{ 
  myservo.attach(7);  // set servo to mid-point
} 

void loop() {
  myservo.write(0);
  delay(700);
  myservo.write(180);
  delay(700);
  myservo.write(90);
  delay(700);
} 
