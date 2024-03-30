/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suracraftshooting;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author mohammad
 */
public class Missile {
    private int x,y;
    private int width,height;
    private Image image;
    private boolean visible;
    private int board_width=850,missile_speed=2;
    
    public Missile(int x, int y) {
        ImageIcon i = new ImageIcon("C:\\Users\\sura\\Downloads\\m.png");
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
        x += missile_speed;
        if (x > board_width) {
            visible = false;
        }
    }
}
