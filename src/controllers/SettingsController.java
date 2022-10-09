
package controllers;

import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import views.SystemView;

/**
 *
 * @author Asus
 */
public final class SettingsController implements MouseListener{
    
    private final SystemView view;
    
    
    
    public SettingsController(SystemView view){
        this.view=view;
        listener();
    }
    
    public void listener(){
        this.view.jLabelCategories.addMouseListener(this);
        this.view.jLabelCustomers.addMouseListener(this);
        this.view.jLabelEmployes.addMouseListener(this);
        this.view.jLabelProducts.addMouseListener(this);
        this.view.jLabelPurchase.addMouseListener(this);
        this.view.jLabelReports.addMouseListener(this);
        this.view.jLabelSettings.addMouseListener(this);
        this.view.jLabelSuppliers.addMouseListener(this);
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        e.getComponent().setForeground(Color.BLACK);
        SwingUtilities.getAncestorOfClass(JPanel.class,e.getComponent()).setBackground(new Color(158,203,247));
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        e.getComponent().setForeground(Color.WHITE);
        SwingUtilities.getAncestorOfClass(JPanel.class,e.getComponent()).setBackground(new Color(104,163,222));
    }

}
