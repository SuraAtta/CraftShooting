/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suracraftshooting;

import javax.swing.JFrame;

/**
 *
 * @author ALMWUSHOOR
 */
public class suraCraftShooting extends JFrame {

    public suraCraftShooting(){
        add(new Board());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1000,700);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args) {
      suraCraftShooting maryamcraftshooting=new suraCraftShooting();
    }
  
}
