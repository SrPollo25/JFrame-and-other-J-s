package vista;

import control.Biblioteca;
import control.MyJFrame;

/**
 *
 * @author dam
 */
public class VtnOperaciones extends MyJFrame {

    Biblioteca miEmpresa;
    PanelUsuarioH panelAlta;
    PanelPrestamo panelPrestamo;
    

    public VtnOperaciones(Biblioteca miEmpresa) {

        this.miEmpresa = miEmpresa;
        centrar();
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuOperaciones = new javax.swing.JMenu();
        mnuAltaUsuario = new javax.swing.JMenuItem();
        mnuPrestamo = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();
        mnuDesconectar = new javax.swing.JMenuItem();
        mnuFin = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GESTION ACADEMICA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        mnuOperaciones.setText("Operaciones");
        mnuOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOperacionesActionPerformed(evt);
            }
        });

        mnuAltaUsuario.setText("Alta de usuario");
        mnuAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaUsuarioActionPerformed(evt);
            }
        });
        mnuOperaciones.add(mnuAltaUsuario);

        mnuPrestamo.setText("Presamo de libro");
        mnuPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrestamoActionPerformed(evt);
            }
        });
        mnuOperaciones.add(mnuPrestamo);

        jMenuBar1.add(mnuOperaciones);

        mnuSalir.setText("Salir");

        mnuDesconectar.setText("Deconectar");
        mnuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDesconectarActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuDesconectar);

        mnuFin.setText("Fin de la app");
        mnuFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFinActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuFin);

        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * FINZALIZA LA APLICICION LO DE SYSTEM.EXIT ES PARA LIBERAR LA MEMORIA
     *
     * @param evt
     */
    private void mnuFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFinActionPerformed
        cierre();
    }//GEN-LAST:event_mnuFinActionPerformed
    /**
     * VUELVE A LA VENTANA DE PEDIR DATOS
     *
     * @param evt
     */
    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
        new VntInicio(miEmpresa).setVisible(true);
        this.dispose();
        this.pack();
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void mnuAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaUsuarioActionPerformed
        eliminarPanel();
        panelAlta=new PanelUsuarioH(miEmpresa);
        this.getContentPane().add(panelAlta);
        pack();
        
    }//GEN-LAST:event_mnuAltaUsuarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cierre();
    }//GEN-LAST:event_formWindowClosing

    private void mnuOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOperacionesActionPerformed
       
        
    }//GEN-LAST:event_mnuOperacionesActionPerformed

    private void mnuPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrestamoActionPerformed
         eliminarPanel();
        panelPrestamo=new PanelPrestamo(miEmpresa);
        this.getContentPane().add(panelPrestamo);
        pack();
    }//GEN-LAST:event_mnuPrestamoActionPerformed

    /**
     * METODO QUE EVITA QUE SALGAN 300 VENTANAS SEGUN VAYAMOS USANDO LA
     * APLICACION
     */

    public void eliminarPanel() {
        try{
            this.remove(panelAlta);
        }catch(Exception ex){
            
        }
        try{
            this.remove(panelPrestamo);
        }catch(Exception ex){
            
        }
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuAltaUsuario;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenuItem mnuFin;
    private javax.swing.JMenu mnuOperaciones;
    private javax.swing.JMenuItem mnuPrestamo;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables

}