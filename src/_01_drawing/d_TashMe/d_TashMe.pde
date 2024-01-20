// These 2 lines of code create variables to hold your face picture and a mustache.
// You will use these later.
PImage face;
PImage mustache;

void setup() {
  // 2. The code below loads your face picture into the program. 
  //    Make sure the file name is correct for the face image you saved earlier.
  face = loadImage("download (4).jpeg");
  
  // 3. Set the size of the sketch. Make it big enough to show the face you chose.
  size(500, 500);
  
  // 4. Resize the face so it is the same size as the sketch.
  // You can use the 'resize()' method to resize the image.
  // Let's resize the face to the size of the sketch:
  face.resize(200, 200);
  image(face, 150,150);
  // 5. Drag and drop an image with a mustache onto this sketch. 
  //    Try to find one with a transparent background. Use the same idea as in step 1.
  //    Make sure the file name is correct for the mustache image you saved.  
  mustache = loadImage("mustache.png");
  
  // OPTIONAL:
  // If the mustache image is not already in the correct size, you can resize it here.
  // For example, you can resize the mustache to a width of 50 pixels while maintaining the aspect ratio:
  mustache.resize(50, 0);
}

void draw() {
  // 6. DRAW FACE. Use the background() command to make the face the background of the sketch.
  //    Run the program to see if the face is drawn. Get this working before you go on.
  

  // 7. DRAW MUSTACHE. Use the image() command to draw the mustache.
  //    Now, we will use the mouseX and mouseY to position the mustache.
  //    The mustache center will appear where the mouse pointer is.
  //    We'll subtract half of the mustache width and height to adjust the position.
  if (mousePressed) {
     image(mustache, mouseX - mustache.width/2, mouseY - mustache.height/2);
   }

  // OPTIONAL:
  // Add an if statement so the mustache is only drawn when the mouse is clicked.
  // To do this, wrap the image() command inside an if statement:
  // if (mousePressed) {
  //   image(mustache, mouseX - mustache.width/2, mouseY - mustache.height/2);
  // }

  // OPTIONAL:
  // Draw a hat on the sketch when the right mouse button is pressed.
  // Use the following code to draw a hat image (replace "hat.png" with the hat image file name):
  // if (mouseButton == RIGHT) {
  //   PImage hat = loadImage("hat.png");
  //   hat.resize(100, 0); // Resize the hat to a width of 100 pixels while maintaining the aspect ratio.
  //   image(hat, mouseX - hat.width/2, mouseY - hat.height/2);
  // }
}
