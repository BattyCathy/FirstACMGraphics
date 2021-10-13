import acm.program.GraphicsProgram;
import acm.graphics.GLabel;
import acm.graphics.GLine;
import java.awt.Color;
public class HelloWorld extends GraphicsProgram
{
    public void run()
    {
        // Creates new label with defined placement and text
        GLabel helloLabel = new GLabel("Hello World", 50, 60);

        // Adds label to our view
        add(helloLabel);

        // Sets label color to green
        helloLabel.setColor(Color.GREEN);

        // Sets font to Helvetica
        helloLabel.setFont("Helvetica-28");

        // Creates new GLine starting at coordinates (30, 50) and ending at coordinates (130, 100)
        GLine line = new GLine(30, 50, 130, 100);

        // Adds new GLine to our view
        add(line);

        // Creates a new horizontal GLine from (50, 75) to (100, 75)
        GLine horiz = new GLine(50, 75, 100, 75);

        // Sets line color to red
        horiz.setColor(Color.red);

        // Adds GLine to view
        add(horiz);

        // Creates vertical GLine
        GLine vert = new GLine(100, 50, 100, 250);

        // Adds vertical GLine to our view
        add(vert);

        // Creating a tic tac toe grid

        GLine line1 = new GLine(30, 60, 120, 60);
        add(line1);
        GLine line2 = new GLine(30, 90, 120, 90);
        add(line2);
        GLine line3 = new GLine(60, 30, 60, 120);
        add(line3);
        GLine line4 = new GLine(90, 30, 90, 120);
        add(line4);

        // Creating a colored rectangle

        // Creates blue line on top of rectangle
        GLine blueTop = new GLine(200, 200, 400, 200);
        blueTop.setColor(Color.BLUE);
        add(blueTop);

        // Creates red line on right of rectangle
        GLine greenRight = new GLine(400, 200, 400, 500);
        greenRight.setColor(Color.RED);
        add(greenRight);

        // Creates pink line across the bottom
        GLine pinkBottom = new GLine(200, 500, 400, 500);
        pinkBottom.setColor(Color.PINK);
        add(pinkBottom);

        // Creates cyan line on the left
        GLine cyanLeft = new GLine(200, 200, 200, 500);
        cyanLeft.setColor(Color.CYAN);
        add(cyanLeft);

    }
    public static void main(String[] args)
    {
        HelloWorld world = new HelloWorld();
        world.start();
    }
}
