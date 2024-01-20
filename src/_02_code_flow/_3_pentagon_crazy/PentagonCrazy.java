package _02_code_flow._3_pentagon_crazy;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class PentagonCrazy {

    public static void main(String[] args) {

        // Create a new Robot
        Robot rob = new Robot();

        // Put the robot's pen down
        rob.penDown();

        // SPEED. Make the robot go at maximum speed (100)
        rob.setSpeed(100);

        // COLOR. Set the pen to a color that you like for the shape
        rob.setPenColor(Color.red);

        // NUMBER OF SIDES. Make an int variable for the number of sides the shape will have.
        int sides = 5;

        // TURN ANGLE. Make another int variable for the angle the robot must turn.
        int angle = 360 / sides;

        // COUNT. Make another int variable to count how many times the loop has repeated
        // Set its start value to zero.
        int count = 0;

        // LOOP. Start a while loop to repeat the DRAW, TURN, and INCREASE COUNT code for each side of the pentagon.
        while (count < 200) {
            rob.move(100); // You can adjust the distance (100) to change the size of the pattern.
            rob.turn(angle + 1);
            count += 1;
        }
        // End the while loop here

        // Now hide the robot so you can see the pattern it has drawn.
        rob.hide();
    }
}
