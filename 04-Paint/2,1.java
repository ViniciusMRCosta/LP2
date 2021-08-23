//ARQUIVO .PNG  AQUI


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PaintApp {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Rect r1;

    PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Painting Figures");
        this.setSize(350, 350);
        this.r1 = new Rect(50,50, 100,30);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;

    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
	g.setColor(new Color(139,0,139));
	g2d.fillRect(this.x,this.y, this.w,this.h);
	g.setColor(new Color(255,255,0));
        g2d.drawRect(this.x,this.y, this.w,this.h);
	g.setColor(new Color(0,245,255));
	g2d.fillRect(100,150, 50,150);
	g.setColor(new Color(255,0,0));
	g2d.fillRect(150,300, 150,150);
	g.setColor(new Color(255,215,0));
	g2d.fillRect(200,40, 50,50);
	
    }
}
