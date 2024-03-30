
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package suracraftshooting;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
 
 
import javax.swing.ImageIcon;

/**
 *
 * @author ALMWUSHOOR
 */

public class Craft {
    private int x, y;
    private int Dx, Dy;
    private Image image;
    private int width, height;
    private boolean visible;
    private ArrayList<Missile> missiles;
    private ArrayList<Missile1> missiles2;
    static int c =0;

    public Craft() {
        ImageIcon i = new ImageIcon("C:\\Users\\sura\\Downloads\\f2.png");
        image = i.getImage();
        width = image.getWidth(null);
        height = image.getHeight(null);
        x = 100;
        y = 100;
        visible = true;
        missiles = new ArrayList<>();
        missiles2 = new ArrayList<>();
    }
    
public void move(){
    x += Dx;
    y += Dy;
    
    if(x<0)
    x=0;
    
     if(y<0)
    y=0;
    
      if(x>919)
    x=919;
    
     if(y>606)
    y=606;
    
}
    public int getx(){
        return x;
    }
    
     public int gety(){
        return y;
    }
    
   public Image getImage(){
       return image;
   }
   
   public ArrayList<Missile> getMissiles() {
    return missiles;
   }
 public ArrayList<Missile1> getMissiles2() {
    return missiles2;
   }
     public void setVisible(boolean visible) {
       this.visible = visible;
      }

    public boolean isVisible() {
       return visible;
    } 

   public Rectangle getBounds() {
       return new Rectangle(x, y, width, height);
    }

    public void fire() {
        missiles.add(new Missile(x + width, y + height/2));
    }
 public void fire2() {
        missiles2.add(new Missile1(x + width, y + height/2));
    }
   
   
 public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    if (key == KeyEvent.VK_LEFT) {
        Dx = -1;
    }
    if (key == KeyEvent.VK_RIGHT) {
        Dx = 1;
    }
    if (key == KeyEvent.VK_UP) {
        Dy = -1;
    }
    if (key == KeyEvent.VK_DOWN) {
        Dy = 1;
    }
    if (key == KeyEvent.VK_SPACE) {
        fire();
        c++;
    }
    if (key == KeyEvent.VK_0) {
        fire2();
        c++;
    }
}

     public void keyReleased(KeyEvent e){
   int key=e.getKeyCode();
       if (key == KeyEvent.VK_LEFT) {
           Dx=0;    
       }
       if (key == KeyEvent.VK_RIGHT) {
           Dx=0;    
       }
       if (key == KeyEvent.VK_UP) {
           Dy=0;    
       }
       if (key == KeyEvent.VK_DOWN) {
           Dy=0;    
       }
   }
    
}
