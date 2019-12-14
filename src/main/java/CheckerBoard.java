
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class CheckerBoard extends Application {

    /**
     * Draws a CheckerBoard.  The parameters width and height give the size
     * of the drawing area, in pixels.  
     */

    public void drawPicture(GraphicsContext g, int width, int height) {

        int row; // A checkerboard contains 8 rows and 8 columns of squares:
        int column;
        int x, y; // Top-left corner of square

        for (row = 0; row < 8; row++) {
            for (column = 0; column < 8; column++) {
                x = column*50; //The top of the first row of squares is at y=0. Since each square is 50 pixels high
                y = row*50; //  the y value at the top of each row is given by y = row*50
                if ( (row%2) == (column%2) )  /* a square is green if row and col are either both even or both odd. */
                    g.setFill(Color.WHITE);
                else
                    g.setFill( Color.GREEN );
                g.fillRect(x, y, 50, 50); //g.fillRect(x,y,w,h)
            }
        }

    } // end drawPicture()

    //------ Set up Canvas ------
    public void start(Stage stage) {
        int width = 400;   // The width of the image.
        int height = 400;  // The height of the image.
        Canvas canvas = new Canvas(width,height);
        drawPicture(canvas.getGraphicsContext2D(), width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Checkers"); // STRING APPEARS IN WINDOW TITLEBAR!
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }

} // end CheckerBoard