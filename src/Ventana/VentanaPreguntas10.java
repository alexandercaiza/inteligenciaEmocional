/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Clases.Cuestionario;
import Clases.Validacion;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class VentanaPreguntas10 extends javax.swing.JFrame {

    public int valorPasado;
    Cuestionario cuestionarioDiez;
    Validacion validar;
    public VentanaPreguntas10() {
        initComponents();
        this.setLocationRelativeTo(this);
        cargarRadioBotones();

    }
    
    public VentanaPreguntas10(int valorPasado) {
        this.valorPasado = valorPasado;
        initComponents();
        this.setLocationRelativeTo(this);
        cargarRadioBotones();
        cargarClases(this.valorPasado);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/test.png")));

    }
    
    public void cargarClases(int valorPasado){
    cuestionarioDiez = new Cuestionario(valorPasado);
    validar = new Validacion();
    
    }

    public void cargarRadioBotones() {
        cargarRadioPregunta19();
        cargarRadioPregunta20();
        cargarRadioPregunta21();

    }

    public void cargarRadioPregunta19() {
        ButtonGroup grupoPregunta19 = new ButtonGroup();
        grupoPregunta19.add(radioNuncaPregunta28);
        grupoPregunta19.add(radioVecesPregunta28);
        grupoPregunta19.add(radioSiemprePregunta28);

    }

    public void cargarRadioPregunta20() {
        ButtonGroup grupoPregunta20 = new ButtonGroup();
        grupoPregunta20.add(radioNuncaPregunta29);
        grupoPregunta20.add(radioVecesPregunta29);
        grupoPregunta20.add(radioSiemprePregunta29);

    }

    public void cargarRadioPregunta21() {
        ButtonGroup grupoPregunta21 = new ButtonGroup();
        grupoPregunta21.add(radioNuncaPregunta30);
        grupoPregunta21.add(radioVecesPregunta30);
        grupoPregunta21.add(radioSiemprePregunta30);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        panelDerecho = new javax.swing.JPanel();
        labelPregunta10 = new javax.swing.JLabel();
        btnSiguiente10 = new javax.swing.JButton();
        panelPregunta30 = new javax.swing.JPanel();
        radioNuncaPregunta30 = new javax.swing.JRadioButton();
        radioVecesPregunta30 = new javax.swing.JRadioButton();
        radioSiemprePregunta30 = new javax.swing.JRadioButton();
        labelPregunta30 = new javax.swing.JLabel();
        panelPregunta29 = new javax.swing.JPanel();
        labelPregunta29 = new javax.swing.JLabel();
        radioNuncaPregunta29 = new javax.swing.JRadioButton();
        radioVecesPregunta29 = new javax.swing.JRadioButton();
        radioSiemprePregunta29 = new javax.swing.JRadioButton();
        panelPregunta28 = new javax.swing.JPanel();
        labelDosPregunta28 = new javax.swing.JLabel();
        radioNuncaPregunta28 = new javax.swing.JRadioButton();
        radioVecesPregunta28 = new javax.swing.JRadioButton();
        radioSiemprePregunta28 = new javax.swing.JRadioButton();
        labelPregunta28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(1400, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        panelLateral.setBackground(new java.awt.Color(162, 179, 139));

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelPrincipal.add(panelLateral, gridBagConstraints);

        panelDerecho.setBackground(new java.awt.Color(228, 233, 190));
        panelDerecho.setLayout(new java.awt.GridBagLayout());

        labelPregunta10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPregunta10.setText("PREGUNTAS DEL TEST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(labelPregunta10, gridBagConstraints);

        btnSiguiente10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSiguiente10.setText("Siguiente");
        btnSiguiente10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 40;
        panelDerecho.add(btnSiguiente10, gridBagConstraints);

        panelPregunta30.setBackground(new java.awt.Color(250, 253, 214));
        panelPregunta30.setPreferredSize(new java.awt.Dimension(625, 170));
        panelPregunta30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioNuncaPregunta30.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioNuncaPregunta30.setText("Nunca");
        radioNuncaPregunta30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuncaPregunta30ActionPerformed(evt);
            }
        });
        panelPregunta30.add(radioNuncaPregunta30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        radioVecesPregunta30.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioVecesPregunta30.setText("Algunas veces");
        radioVecesPregunta30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVecesPregunta30ActionPerformed(evt);
            }
        });
        panelPregunta30.add(radioVecesPregunta30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        radioSiemprePregunta30.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioSiemprePregunta30.setText("Siempre");
        radioSiemprePregunta30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiemprePregunta30ActionPerformed(evt);
            }
        });
        panelPregunta30.add(radioSiemprePregunta30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        labelPregunta30.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelPregunta30.setText("30. Tengo las ideas muy claras sobre lo que quiero.");
        panelPregunta30.add(labelPregunta30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(panelPregunta30, gridBagConstraints);

        panelPregunta29.setBackground(new java.awt.Color(250, 253, 214));
        panelPregunta29.setPreferredSize(new java.awt.Dimension(625, 170));
        panelPregunta29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPregunta29.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelPregunta29.setText("29. Cuando alguien se muestra muy nervioso/a o exaltado/a lo calmo y tranquilizo. ");
        panelPregunta29.add(labelPregunta29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, -1));

        radioNuncaPregunta29.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioNuncaPregunta29.setText("Nunca");
        radioNuncaPregunta29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuncaPregunta29ActionPerformed(evt);
            }
        });
        panelPregunta29.add(radioNuncaPregunta29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        radioVecesPregunta29.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioVecesPregunta29.setText("Algunas veces");
        radioVecesPregunta29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVecesPregunta29ActionPerformed(evt);
            }
        });
        panelPregunta29.add(radioVecesPregunta29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        radioSiemprePregunta29.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioSiemprePregunta29.setText("Siempre");
        radioSiemprePregunta29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiemprePregunta29ActionPerformed(evt);
            }
        });
        panelPregunta29.add(radioSiemprePregunta29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(panelPregunta29, gridBagConstraints);

        panelPregunta28.setBackground(new java.awt.Color(250, 253, 214));
        panelPregunta28.setPreferredSize(new java.awt.Dimension(625, 170));
        panelPregunta28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDosPregunta28.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelDosPregunta28.setText("     cumplir y qué no me será posible hacer.");
        panelPregunta28.add(labelDosPregunta28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 600, -1));

        radioNuncaPregunta28.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioNuncaPregunta28.setText("Nunca");
        radioNuncaPregunta28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuncaPregunta28ActionPerformed(evt);
            }
        });
        panelPregunta28.add(radioNuncaPregunta28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        radioVecesPregunta28.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioVecesPregunta28.setText("Algunas veces");
        radioVecesPregunta28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVecesPregunta28ActionPerformed(evt);
            }
        });
        panelPregunta28.add(radioVecesPregunta28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        radioSiemprePregunta28.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioSiemprePregunta28.setText("Siempre");
        radioSiemprePregunta28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiemprePregunta28ActionPerformed(evt);
            }
        });
        panelPregunta28.add(radioSiemprePregunta28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        labelPregunta28.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelPregunta28.setText("28. Soy una persona realista, con los ofrecimientos que hago, sabiendo qué cosa puedo ");
        panelPregunta28.add(labelPregunta28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(panelPregunta28, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelPrincipal.add(panelDerecho, gridBagConstraints);

        jScrollPane1.setViewportView(panelPrincipal);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguiente10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente10ActionPerformed
         if(!validar.preguntaUno || !validar.preguntaDos || !validar.preguntaTres ){
             JOptionPane.showMessageDialog(null, "Por favor, seleccione todas las preguntas");
        
        
        }
        else {
         cuestionarioDiez.retornarSubtotal();
        cuestionarioDiez.retornarTotal();
        
//        JOptionPane.showMessageDialog(null, "El subtotal es "+cuestionarioDiez.retornarSubtotal() );
//        JOptionPane.showMessageDialog(null, "El subtotal es "+cuestionarioDiez.retornarTotal() );
        VentanaPreguntas11 ventanaOnce = new VentanaPreguntas11(cuestionarioDiez.retornarTotal());
        ventanaOnce.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnSiguiente10ActionPerformed

    private void radioNuncaPregunta28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuncaPregunta28ActionPerformed
        if(radioNuncaPregunta28.isSelected() == true){
            cuestionarioDiez.setValorPreguntaUno(new Cuestionario().asignarValorNunca());
            validar.preguntaUno = true;
            //JOptionPane.showMessageDialog(null, "El valor de la pregunta uno es " + cuestionarioDiez.getValorPreguntaUno());
        
        }
    }//GEN-LAST:event_radioNuncaPregunta28ActionPerformed

    private void radioVecesPregunta28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVecesPregunta28ActionPerformed
          if(radioVecesPregunta28.isSelected() == true){
            cuestionarioDiez.setValorPreguntaUno(new Cuestionario().asignarValorAlgunasVeces());
            validar.preguntaUno = true;
            //JOptionPane.showMessageDialog(null, "El valor de la pregunta uno es " + cuestionarioDiez.getValorPreguntaUno());
        
        }
    }//GEN-LAST:event_radioVecesPregunta28ActionPerformed

    private void radioSiemprePregunta28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiemprePregunta28ActionPerformed
          if(radioSiemprePregunta28.isSelected() == true){
            cuestionarioDiez.setValorPreguntaUno(new Cuestionario().asignarValorSiempre());
            validar.preguntaUno = true;
            //JOptionPane.showMessageDialog(null, "El valor de la pregunta uno es " + cuestionarioDiez.getValorPreguntaUno());
        
        }
    }//GEN-LAST:event_radioSiemprePregunta28ActionPerformed

    private void radioNuncaPregunta29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuncaPregunta29ActionPerformed
      if(radioNuncaPregunta29.isSelected() == true){
          cuestionarioDiez.setValorPreguntaDos(new Cuestionario().asignarValorNunca());
          validar.preguntaDos = true;
          //JOptionPane.showMessageDialog(null, "El valor de la pregunta dos es "+ cuestionarioDiez.getValorPreguntaDos());
      
      }
    }//GEN-LAST:event_radioNuncaPregunta29ActionPerformed

    private void radioVecesPregunta29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVecesPregunta29ActionPerformed
         if(radioVecesPregunta29.isSelected() == true){
          cuestionarioDiez.setValorPreguntaDos(new Cuestionario().asignarValorAlgunasVeces());
          validar.preguntaDos = true;
          //JOptionPane.showMessageDialog(null, "El valor de la pregunta dos es "+ cuestionarioDiez.getValorPreguntaDos());
      
      }
    }//GEN-LAST:event_radioVecesPregunta29ActionPerformed

    private void radioSiemprePregunta29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiemprePregunta29ActionPerformed
         if(radioSiemprePregunta29.isSelected() == true){
          cuestionarioDiez.setValorPreguntaDos(new Cuestionario().asignarValorSiempre());
          validar.preguntaDos = true;
          //JOptionPane.showMessageDialog(null, "El valor de la pregunta dos es "+ cuestionarioDiez.getValorPreguntaDos());
      
      }
    }//GEN-LAST:event_radioSiemprePregunta29ActionPerformed

    private void radioNuncaPregunta30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuncaPregunta30ActionPerformed
        if(radioNuncaPregunta30.isSelected() == true){
            cuestionarioDiez.setValorPreguntaTres(new Cuestionario().asignarValorNunca());
            validar.preguntaTres = true;
            //JOptionPane.showMessageDialog(null, "El valor de la pregunta tres es "+ cuestionarioDiez.getValorPreguntaTres());
            
        
        }
    }//GEN-LAST:event_radioNuncaPregunta30ActionPerformed

    private void radioVecesPregunta30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVecesPregunta30ActionPerformed
         if(radioVecesPregunta30.isSelected() == true){
            cuestionarioDiez.setValorPreguntaTres(new Cuestionario().asignarValorAlgunasVeces());
            validar.preguntaTres = true;
            //JOptionPane.showMessageDialog(null, "El valor de la pregunta tres es "+ cuestionarioDiez.getValorPreguntaTres());
            
        
        }
    }//GEN-LAST:event_radioVecesPregunta30ActionPerformed

    private void radioSiemprePregunta30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiemprePregunta30ActionPerformed
         if(radioSiemprePregunta30.isSelected() == true){
            cuestionarioDiez.setValorPreguntaTres(new Cuestionario().asignarValorSiempre());
            validar.preguntaTres = true;
           // JOptionPane.showMessageDialog(null, "El valor de la pregunta tres es "+ cuestionarioDiez.getValorPreguntaTres());
            
        
        }
    }//GEN-LAST:event_radioSiemprePregunta30ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPreguntas10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPreguntas10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDosPregunta28;
    private javax.swing.JLabel labelPregunta10;
    private javax.swing.JLabel labelPregunta28;
    private javax.swing.JLabel labelPregunta29;
    private javax.swing.JLabel labelPregunta30;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelPregunta28;
    private javax.swing.JPanel panelPregunta29;
    private javax.swing.JPanel panelPregunta30;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton radioNuncaPregunta28;
    private javax.swing.JRadioButton radioNuncaPregunta29;
    private javax.swing.JRadioButton radioNuncaPregunta30;
    private javax.swing.JRadioButton radioSiemprePregunta28;
    private javax.swing.JRadioButton radioSiemprePregunta29;
    private javax.swing.JRadioButton radioSiemprePregunta30;
    private javax.swing.JRadioButton radioVecesPregunta28;
    private javax.swing.JRadioButton radioVecesPregunta29;
    private javax.swing.JRadioButton radioVecesPregunta30;
    // End of variables declaration//GEN-END:variables
}
