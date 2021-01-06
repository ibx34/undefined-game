package owo.graphics;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import owo.main.owo;

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
        
        frame.addWindowListener(new WindowAdapter() {
        	public void windowClosing (WindowEvent e) {
        		owo.quit();
        	};
        });
        frame.setVisible(true);
    }

};