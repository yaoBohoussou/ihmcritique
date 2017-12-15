/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be_syscr;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.lang.Math.*;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import javax.swing.SwingUtilities;

/**
 *
 * @author martinie
 */
public class BoutonDial extends javax.swing.JPanel {

    
    private LinkedList<BoutonDialStates> stateOrder;
    private int stateIndex;
    private double theta = -Math.PI/2;

    /**
     * Creates new form Ampoule
     */
    public BoutonDial() {
        initComponents();
        stateOrder = new LinkedList<>();
        stateOrder.add(BoutonDialStates.WXON);
        stateOrder.add(BoutonDialStates.TST);
        stateOrder.add(BoutonDialStates.STDBY);
        stateOrder.add(BoutonDialStates.WXA);
        stateOrder.add(BoutonDialStates.OFF);
        stateIndex = 0;
        //this.addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.DARK_GRAY);
        g.fillOval(0, 0, getWidth(), getHeight());
        
        /*cursor*/
        int x_centre = getWidth()/2;
        int y_centre = getHeight()/2;
        
        double norm =  0.75 * getHeight()/2;
        int newNorm = (int)norm;
        int diameter_curs = getHeight()/10;
        int x_cursor = (int) (newNorm * cos(theta)) + x_centre -diameter_curs/2;
        int y_cursor = (int) (newNorm * sin(theta)) + y_centre -diameter_curs/2;
        /*System.out.println("norm = "+norm+ " newNorm = "+newNorm+ " theta = "+theta+" x_cursor = " + x_cursor + " y_cursor = "+y_cursor);
        
        System.out.println("cos(theta) = "+ ((int) cos(theta)));*/
        
        g.setColor(Color.BLACK);
        g.fillOval(x_cursor, y_cursor, diameter_curs, diameter_curs);              
    }

    public void click_droit(double angleAvance) {
        //theta = theta+2*Math.PI/5;
        theta = theta+angleAvance;
        repaint();
    }

    public void click_gauche(double angleAvance) {
        //theta = theta-2*Math.PI/5;
        theta = theta-angleAvance;
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}