/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import control.Empresa;
import control.MyJFrame;

/**
 *
 * @author dam
 */
public class VtnControl extends MyJFrame {

    PanelAltaClientes panelAlta;
    PanelAlquilerSala panelAlquiler;
    Empresa miEmpresa;
    
    public VtnControl() {
        miEmpresa=new Empresa();
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuAlta = new javax.swing.JMenuItem();
        mnuAlquiler = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestión de alquileres");
        setMinimumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Opciones");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnuAlta.setText("Alta de clientes");
        mnuAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAlta);

        mnuAlquiler.setText("Alquiler de salas");
        mnuAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAlquilerActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAlquiler);

        mnuConsulta.setText("Consulta");
        jMenu1.add(mnuConsulta);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        btnCerrar.setText("Cerrar aplicacion");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jMenu2.add(btnCerrar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mnuAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaActionPerformed
        cerrarPaneles();
        panelAlta=new PanelAltaClientes(miEmpresa);
        this.getContentPane().add(panelAlta);
        pack();
    }//GEN-LAST:event_mnuAltaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        cierre();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cierre();
    }//GEN-LAST:event_formWindowClosing

    private void mnuAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAlquilerActionPerformed
        cerrarPaneles();
        panelAlquiler=new PanelAlquilerSala(miEmpresa);
        this.getContentPane().add(panelAlquiler);
        pack();
    }//GEN-LAST:event_mnuAlquilerActionPerformed

    private void cerrarPaneles(){
        try{
            this.remove(panelAlta);
        }catch(Exception ex){
            
        }try{
            this.remove(panelAlquiler);
        }catch(Exception ex){
            
        }
    }
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
            java.util.logging.Logger.getLogger(VtnControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCerrar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAlquiler;
    private javax.swing.JMenuItem mnuAlta;
    private javax.swing.JMenuItem mnuConsulta;
    // End of variables declaration//GEN-END:variables
}
