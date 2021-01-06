import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Dimension;

public class renderer {
    
    private static Frame frame;
    private static Canvas canvas;

    private static int canvasWidth = 0;
    private static int canvasHeight = 0;

    public static void init(){
        frame = new Frame();
        canvas = new Canvas();
        
        canvas.setPreferredSize(new Dimension(canvasWidth, canvasHeight));

        frame.add(canvas);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    };

};
