/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transparenttuteanjula;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;

/**
 *
 * @author We
 */
public class TransparentButton extends JButton{
     static float value = 1.0f;
    public TransparentButton(float t) {
        super();
        value=t;
        setOpaque(false); 
    }
    
    public void paint(Graphics g) { 
            Graphics2D g2 = (Graphics2D) g.create(); 
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, value)); 
            super.paint(g2); 
            g2.dispose(); 
        } 
}
