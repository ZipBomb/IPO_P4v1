/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Pablo Rey
 */
public class PanelInactive extends javax.swing.JPanel {

    /**
     * Creates new form PanelInactive
     */
    private Ventana v;
    private DatosReserva d;
    
    private final ImageIcon iconoAudioOn;
    private final ImageIcon iconoAudioOff;
    URL urlAudioOn = PanelInactive.class.getResource("/img/audioOn.png");
    URL urlAudioOff = PanelInactive.class.getResource("/img/audioOff.png");
    boolean clicked = true;    
    
    public Ventana getV() {
        return v;
    }

    public void setV(Ventana v) {
        this.v = v;
    }
    
    public PanelInactive(DatosReserva d) {
        initComponents();
        
        iconoAudioOn = new javax.swing.ImageIcon(urlAudioOn);
        iconoAudioOff = new javax.swing.ImageIcon(urlAudioOff);  
        if(d != null)
            this.d = d;
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        audioOn = new javax.swing.JLabel();
        centro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setMaximumSize(new java.awt.Dimension(1280, 800));
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setPreferredSize(new java.awt.Dimension(1280, 800));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("TimeBurner", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("martes 15 de novembro de 2016, 13:45");

        audioOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/audioOn.png"))); // NOI18N
        audioOn.setToolTipText("Activa o desactiva la asistencia por voz");
        audioOn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        audioOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                audioOnMouseClicked(evt);
            }
        });

        centro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desbloquea.png"))); // NOI18N
        centro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                centroMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(619, 619, 619)
                        .addComponent(audioOn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(centro)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(centro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(audioOn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void centroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_centroMouseClicked
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        PanelMain pm = new PanelMain(d);
        pm.setVisible(true);
        pm.setV(this.v);
        this.v.setContentPane(pm);
    }//GEN-LAST:event_centroMouseClicked

    private void audioOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_audioOnMouseClicked
        // TODO add your handling code here:
        if(clicked) {
            audioOn.setIcon(iconoAudioOff);
            clicked = false;
        } else {
            audioOn.setIcon(iconoAudioOn);
            clicked = true;
        }
    }//GEN-LAST:event_audioOnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel audioOn;
    private javax.swing.JLabel centro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}