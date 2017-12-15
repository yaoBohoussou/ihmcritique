/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be_syscr;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author ybohouss
 */
public class Jframe_BE extends javax.swing.JFrame {

    /**
     * Creates new form Jframe_BE
     */
    public Jframe_BE() {
        initComponents();
        angledialMouseListener = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e))
                {
                    if(angle > minAngle)
                    {
                        System.out.println("ANGLE CHANGED TO THE LEFT");
                        angle_dial.click_gauche(Math.PI/20);
                        decrementerValeurAngle();
                        angle_screen.setText(Double.toString(angle));
                    } 
                    else
                    {
                       JOptionPane jop1 = new JOptionPane();
                       jop1.showMessageDialog(null, "Vous avez atteint la borne minimale de variation de l'angle", "Attention", JOptionPane.WARNING_MESSAGE);  
                    }
                }
                else 
                {                                      
                    if(angle < maxAngle)
                    {
                         System.out.println("ANGLE CHANGED TO THE RIGHT");
                        angle_dial.click_droit(Math.PI/20);
                        incrementerValeurAngle();
                        angle_screen.setText(Double.toString(angle));
                    }
                    else
                    {
                         JOptionPane jop1 = new JOptionPane();
                         jop1.showMessageDialog(null, "Vous avez atteint la borne maximale de variation de l'angle", "Attention", JOptionPane.WARNING_MESSAGE);  
                    
                    }

                } 
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        mode_dial.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e))
                {
                    System.out.println("MODE CHANGED TO THE LEFT");
                    mode_dial.click_gauche(2*Math.PI/5);
                    changeMode(true);
                }           
                else 
                {
                    System.out.println("MODE CHANGED TO THE RIGHT");
                    mode_dial.click_droit(2*Math.PI/5);
                    changeMode(false);                    
                } 
                    
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });      
    }

    /*Boolean gauche : true if click gauche , false sinon*/
    private void changeMode(Boolean gauche)
    {
        if(gauche)
        {
            switch (dial2States)
            {
                case WXON:
                    dial2States = BoutonDialStates.OFF;
                    wxon_screen.setBackground(Color.GRAY);
                    off_screen.setBackground(Color.WHITE);
                    break;
                case OFF :
                    dial2States = BoutonDialStates.STDBY;
                    off_screen.setBackground(Color.GRAY);
                    stdby_screen.setBackground(Color.WHITE);
                    break;
                case STDBY:
                    dial2States = BoutonDialStates.WXA;
                    stdby_screen.setBackground(Color.GRAY);
                    wxa_screen.setBackground(Color.WHITE);
                    break;
                case WXA:
                    dial2States = BoutonDialStates.TST;
                    wxa_screen.setBackground(Color.GRAY);
                    tst_screen.setBackground(Color.WHITE);
                    break;
                case TST:
                    dial2States = BoutonDialStates.WXON;
                    tst_screen.setBackground(Color.GRAY);
                    wxon_screen.setBackground(Color.WHITE);
                    break;
            }
        }
        else
        {
            switch (dial2States)
            {
                case WXON:
                    dial2States = BoutonDialStates.TST;
                    wxon_screen.setBackground(Color.GRAY);
                    tst_screen.setBackground(Color.WHITE);
                    break;
                case OFF :
                    dial2States = BoutonDialStates.WXON;
                    off_screen.setBackground(Color.GRAY);
                    wxon_screen.setBackground(Color.WHITE);
                    break;
                case STDBY:
                    dial2States = BoutonDialStates.OFF;
                    stdby_screen.setBackground(Color.GRAY);
                    off_screen.setBackground(Color.WHITE);
                    break;
                case WXA:
                    dial2States = BoutonDialStates.STDBY;
                    wxa_screen.setBackground(Color.GRAY);
                    stdby_screen.setBackground(Color.WHITE);
                    break;
                case TST:
                    dial2States = BoutonDialStates.WXA;
                    tst_screen.setBackground(Color.GRAY);
                    wxa_screen.setBackground(Color.WHITE);
                    break;
            }
        }
    }
    
    private void incrementerValeurAngle()
    {
        angle = angle + 0.2;
        angle = (double) Math.round(angle * 100) / 100;
    }
    
    private void decrementerValeurAngle()
    {
        angle = angle - 0.2;
        angle = (double) Math.round(angle * 100) / 100;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        tiltangle_frame = new javax.swing.JInternalFrame();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mode_panel = new javax.swing.JPanel();
        manualMode_radioB = new javax.swing.JRadioButton();
        autoMode_radioB = new javax.swing.JRadioButton();
        panel_editangle = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        angle_screen = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        angle_dial = new be_syscr.BoutonDial();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        stab_screen = new javax.swing.JPanel();
        onStab_radioB = new javax.swing.JRadioButton();
        offStab_radioB = new javax.swing.JRadioButton();
        managemode_frame = new javax.swing.JInternalFrame();
        mode_dial = new be_syscr.BoutonDial();
        jPanel1 = new javax.swing.JPanel();
        wxon_screen = new javax.swing.JPanel();
        wxon_label = new javax.swing.JLabel();
        tst_screen = new javax.swing.JPanel();
        tst_label = new javax.swing.JLabel();
        wxa_screen = new javax.swing.JPanel();
        wxa_label = new javax.swing.JLabel();
        stdby_screen = new javax.swing.JPanel();
        stdby_label = new javax.swing.JLabel();
        off_screen = new javax.swing.JPanel();
        off_label = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tiltangle_frame.setTitle("MANAGE TILT ANGLE");
        try {
            tiltangle_frame.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        tiltangle_frame.setVisible(true);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MODE");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mode_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup2.add(manualMode_radioB);
        manualMode_radioB.setText("Manual");
        manualMode_radioB.setToolTipText("");
        manualMode_radioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualMode_radioBActionPerformed(evt);
            }
        });

        buttonGroup2.add(autoMode_radioB);
        autoMode_radioB.setSelected(true);
        autoMode_radioB.setText("Auto");
        autoMode_radioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoMode_radioBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mode_panelLayout = new javax.swing.GroupLayout(mode_panel);
        mode_panel.setLayout(mode_panelLayout);
        mode_panelLayout.setHorizontalGroup(
            mode_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mode_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(mode_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(autoMode_radioB)
                    .addComponent(manualMode_radioB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mode_panelLayout.setVerticalGroup(
            mode_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mode_panelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(manualMode_radioB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autoMode_radioB)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mode_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mode_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_editangle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        angle_screen.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
        angle_screen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angle_screen.setText("50 . 00");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(angle_screen, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(angle_screen, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EDIT ANGLE");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );

        angle_dial.setEnabled(false);

        javax.swing.GroupLayout angle_dialLayout = new javax.swing.GroupLayout(angle_dial);
        angle_dial.setLayout(angle_dialLayout);
        angle_dialLayout.setHorizontalGroup(
            angle_dialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        angle_dialLayout.setVerticalGroup(
            angle_dialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_editangleLayout = new javax.swing.GroupLayout(panel_editangle);
        panel_editangle.setLayout(panel_editangleLayout);
        panel_editangleLayout.setHorizontalGroup(
            panel_editangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editangleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_editangleLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(angle_dial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_editangleLayout.setVerticalGroup(
            panel_editangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editangleLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(angle_dial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STABILIZATION");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        stab_screen.setBackground(java.awt.Color.gray);
        stab_screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(onStab_radioB);
        onStab_radioB.setSelected(true);
        onStab_radioB.setText("On");
        onStab_radioB.setToolTipText("");
        onStab_radioB.setEnabled(false);
        onStab_radioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onStab_radioBActionPerformed(evt);
            }
        });

        buttonGroup1.add(offStab_radioB);
        offStab_radioB.setText("Off");
        offStab_radioB.setToolTipText("");
        offStab_radioB.setEnabled(false);
        offStab_radioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offStab_radioBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stab_screenLayout = new javax.swing.GroupLayout(stab_screen);
        stab_screen.setLayout(stab_screenLayout);
        stab_screenLayout.setHorizontalGroup(
            stab_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stab_screenLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(stab_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offStab_radioB)
                    .addComponent(onStab_radioB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stab_screenLayout.setVerticalGroup(
            stab_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stab_screenLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(onStab_radioB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(offStab_radioB)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(stab_screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stab_screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tiltangle_frameLayout = new javax.swing.GroupLayout(tiltangle_frame.getContentPane());
        tiltangle_frame.getContentPane().setLayout(tiltangle_frameLayout);
        tiltangle_frameLayout.setHorizontalGroup(
            tiltangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tiltangle_frameLayout.createSequentialGroup()
                .addGroup(tiltangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_editangle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tiltangle_frameLayout.setVerticalGroup(
            tiltangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tiltangle_frameLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panel_editangle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        managemode_frame.setTitle("MANAGE MODE");
        managemode_frame.setVisible(true);

        javax.swing.GroupLayout mode_dialLayout = new javax.swing.GroupLayout(mode_dial);
        mode_dial.setLayout(mode_dialLayout);
        mode_dialLayout.setHorizontalGroup(
            mode_dialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        mode_dialLayout.setVerticalGroup(
            mode_dialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        wxon_screen.setBackground(java.awt.Color.white);
        wxon_screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        wxon_screen.setPreferredSize(new java.awt.Dimension(80, 100));

        wxon_label.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        wxon_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wxon_label.setText("WXON");

        javax.swing.GroupLayout wxon_screenLayout = new javax.swing.GroupLayout(wxon_screen);
        wxon_screen.setLayout(wxon_screenLayout);
        wxon_screenLayout.setHorizontalGroup(
            wxon_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wxon_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        wxon_screenLayout.setVerticalGroup(
            wxon_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wxon_label, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        tst_screen.setBackground(java.awt.Color.gray);
        tst_screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tst_screen.setPreferredSize(new java.awt.Dimension(80, 100));

        tst_label.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        tst_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tst_label.setText("TST");

        javax.swing.GroupLayout tst_screenLayout = new javax.swing.GroupLayout(tst_screen);
        tst_screen.setLayout(tst_screenLayout);
        tst_screenLayout.setHorizontalGroup(
            tst_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tst_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        tst_screenLayout.setVerticalGroup(
            tst_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tst_label, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        wxa_screen.setBackground(java.awt.Color.gray);
        wxa_screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        wxa_screen.setPreferredSize(new java.awt.Dimension(80, 100));

        wxa_label.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        wxa_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wxa_label.setText("WXA");

        javax.swing.GroupLayout wxa_screenLayout = new javax.swing.GroupLayout(wxa_screen);
        wxa_screen.setLayout(wxa_screenLayout);
        wxa_screenLayout.setHorizontalGroup(
            wxa_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wxa_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        wxa_screenLayout.setVerticalGroup(
            wxa_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wxa_label, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        stdby_screen.setBackground(java.awt.Color.gray);
        stdby_screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        stdby_screen.setPreferredSize(new java.awt.Dimension(75, 100));

        stdby_label.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        stdby_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stdby_label.setText("STDBY");

        javax.swing.GroupLayout stdby_screenLayout = new javax.swing.GroupLayout(stdby_screen);
        stdby_screen.setLayout(stdby_screenLayout);
        stdby_screenLayout.setHorizontalGroup(
            stdby_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stdby_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        stdby_screenLayout.setVerticalGroup(
            stdby_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stdby_label, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        off_screen.setBackground(java.awt.Color.gray);
        off_screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        off_screen.setPreferredSize(new java.awt.Dimension(75, 100));

        off_label.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        off_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        off_label.setText("OFF");

        javax.swing.GroupLayout off_screenLayout = new javax.swing.GroupLayout(off_screen);
        off_screen.setLayout(off_screenLayout);
        off_screenLayout.setHorizontalGroup(
            off_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(off_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        off_screenLayout.setVerticalGroup(
            off_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(off_label, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(wxon_screen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tst_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wxa_screen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stdby_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(off_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(off_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(stdby_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tst_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(wxa_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(wxon_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("WXON");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TST");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("WXA");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("STDBY");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("OFF");

        javax.swing.GroupLayout managemode_frameLayout = new javax.swing.GroupLayout(managemode_frame.getContentPane());
        managemode_frame.getContentPane().setLayout(managemode_frameLayout);
        managemode_frameLayout.setHorizontalGroup(
            managemode_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managemode_frameLayout.createSequentialGroup()
                .addGroup(managemode_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managemode_frameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(managemode_frameLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(managemode_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(managemode_frameLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mode_dial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(managemode_frameLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel13)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel12)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managemode_frameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(189, 189, 189))
        );
        managemode_frameLayout.setVerticalGroup(
            managemode_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managemode_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managemode_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managemode_frameLayout.createSequentialGroup()
                        .addGroup(managemode_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mode_dial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(managemode_frameLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(60, 60, 60)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managemode_frameLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(70, 70, 70)))
                .addGroup(managemode_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(managemode_frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiltangle_frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tiltangle_frame)
                    .addComponent(managemode_frame))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manualMode_radioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualMode_radioBActionPerformed
        // TODO add your handling code here:
        /*DEGRISER FENETRE STABILISATION*/
        stab_screen.setBackground(degriserColor);
        onStab_radioB.setEnabled(true);
        offStab_radioB.setEnabled(true);
    }//GEN-LAST:event_manualMode_radioBActionPerformed

    private void onStab_radioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onStab_radioBActionPerformed
        // TODO add your handling code here:
        //GRISER ANGLE
        angle_dial.setEnabled(false);
        angle_dial.removeMouseListener(angledialMouseListener);
        //DEGRISER FENETRE MODE
        mode_panel.setBackground(degriserColor);
        autoMode_radioB.setEnabled(true);
        manualMode_radioB.setEnabled(true);
    }//GEN-LAST:event_onStab_radioBActionPerformed

    private void autoMode_radioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoMode_radioBActionPerformed
        // TODO add your handling code here:
        /*GRISER FENETRE STABILISATION*/
        stab_screen.setBackground(griserColor);
        onStab_radioB.setEnabled(false);
        offStab_radioB.setEnabled(false);
    }//GEN-LAST:event_autoMode_radioBActionPerformed

    private void offStab_radioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offStab_radioBActionPerformed
        // TODO add your handling code here:
        //GRISER FENETRE MODE
        mode_panel.setBackground(griserColor);
        autoMode_radioB.setEnabled(false);
        manualMode_radioB.setEnabled(false);
        //DEGRISER ANGLE
        angle_dial.setEnabled(true);
        angle_dial.addMouseListener(angledialMouseListener);
    }//GEN-LAST:event_offStab_radioBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jframe_BE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_BE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_BE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_BE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Jframe_BE().setVisible(true);
            }
        });
    }
    
   
    private BoutonDialStates dial2States = BoutonDialStates.WXON;
    private MouseListener angledialMouseListener;
    private double angle = 50.00;
    private double minAngle = 50.00;
    private double maxAngle = 60.00;
    private Color degriserColor = UIManager.getColor ( "Panel.background" );
    private Color griserColor = Color.GRAY;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private be_syscr.BoutonDial angle_dial;
    private javax.swing.JLabel angle_screen;
    private javax.swing.JRadioButton autoMode_radioB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JInternalFrame managemode_frame;
    private javax.swing.JRadioButton manualMode_radioB;
    private be_syscr.BoutonDial mode_dial;
    private javax.swing.JPanel mode_panel;
    private javax.swing.JRadioButton offStab_radioB;
    private javax.swing.JLabel off_label;
    private javax.swing.JPanel off_screen;
    private javax.swing.JRadioButton onStab_radioB;
    private javax.swing.JPanel panel_editangle;
    private javax.swing.JPanel stab_screen;
    private javax.swing.JLabel stdby_label;
    private javax.swing.JPanel stdby_screen;
    private javax.swing.JInternalFrame tiltangle_frame;
    private javax.swing.JLabel tst_label;
    private javax.swing.JPanel tst_screen;
    private javax.swing.JLabel wxa_label;
    private javax.swing.JPanel wxa_screen;
    private javax.swing.JLabel wxon_label;
    private javax.swing.JPanel wxon_screen;
    // End of variables declaration//GEN-END:variables
}
