/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.ControladorPrincipal;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author franc
 */
public class vistaMenu extends javax.swing.JFrame {

    /**
     * Creates new form vistaPrincipal
     */
    public vistaMenu() {
        initComponents();
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
        perfilBT = new javax.swing.JButton();
        batallaBT = new javax.swing.JButton();
        torneoBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" MENU");

        perfilBT.setText("Perfil");

        batallaBT.setText("Batalla");

        torneoBT.setText("Torneo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(torneoBT)
                    .addComponent(batallaBT)
                    .addComponent(perfilBT)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(437, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(perfilBT)
                .addGap(18, 18, 18)
                .addComponent(batallaBT)
                .addGap(18, 18, 18)
                .addComponent(torneoBT)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batallaBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton perfilBT;
    private javax.swing.JButton torneoBT;
    // End of variables declaration//GEN-END:variables
    
    public JButton getBoton1(){
        return this.perfilBT;
    }
    public JButton getBoton2(){
        return this.batallaBT;
    }
    public JButton getBoton3(){
        return this.torneoBT;
    }
    public void agregarListener(ActionListener al){
        this.perfilBT.addActionListener(al);
        this.batallaBT.addActionListener(al);
        this.torneoBT.addActionListener(al);
    }
}
