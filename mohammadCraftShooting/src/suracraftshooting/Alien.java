package suracraftshooting;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Alien {
    private int x, y;
    private int width, height;
    private Image image;
    private boolean visible;
    private int board_width = 850;

    public Alien(int x, int y) {
        ImageIcon i = new ImageIcon("C:\\Users\\sura\\Downloads\\f.png");
        image = i.getImage();
        visible = true;
        width = 27;
        height = 18;
        this.x = x;
        this.y = y;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public void move() {
        x-=1;
        if (x < 0) {
            x=700;
        }
    }
}
