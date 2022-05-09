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
public class VentanaPreguntas14 extends javax.swing.JFrame {

    public int valorPasado;
    Cuestionario cuestionarioCatorce;
    Validacion validar;

    public VentanaPreguntas14() {
        initComponents();
        this.setLocationRelativeTo(this);
        cargarRadioBotones();

    }

    public VentanaPreguntas14(int valorPasado) {
        this.valorPasado = valorPasado;
        initComponents();
        this.setLocationRelativeTo(this);
        cargarRadioBotones();
        cargarClases(this.valorPasado);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/test.png")));

    }

    public void cargarClases(int valorPasado) {
        cuestionarioCatorce = new Cuestionario(valorPasado);
        validar = new Validacion();

    }

    public void cargarRadioBotones() {
        cargarRadioPregunta19();
        cargarRadioPregunta20();
        cargarRadioPregunta21();

    }

    public void cargarRadioPregunta19() {
        ButtonGroup grupoPregunta19 = new ButtonGroup();
        grupoPregunta19.add(radioNuncaPregunta40);
        grupoPregunta19.add(radioVecesPregunta40);
        grupoPregunta19.add(radioSiemprePregunta40);

    }

    public void cargarRadioPregunta20() {
        ButtonGroup grupoPregunta20 = new ButtonGroup();
        grupoPregunta20.add(radioNuncaPregunta41);
        grupoPregunta20.add(radioVecesPregunta41);
        grupoPregunta20.add(radioSiemprePregunta41);

    }

    public void cargarRadioPregunta21() {
        ButtonGroup grupoPregunta21 = new ButtonGroup();
        grupoPregunta21.add(radioNuncaPregunta42);
        grupoPregunta21.add(radioVecesPregunta42);
        grupoPregunta21.add(radioSiemprePregunta42);

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
        labelPregunta14 = new javax.swing.JLabel();
        btnSiguiente14 = new javax.swing.JButton();
        panelPregunta42 = new javax.swing.JPanel();
        radioNuncaPregunta42 = new javax.swing.JRadioButton();
        radioVecesPregunta42 = new javax.swing.JRadioButton();
        radioSiemprePregunta42 = new javax.swing.JRadioButton();
        labelPregunta42 = new javax.swing.JLabel();
        panelPregunta41 = new javax.swing.JPanel();
        labelPregunta41 = new javax.swing.JLabel();
        radioNuncaPregunta41 = new javax.swing.JRadioButton();
        radioVecesPregunta41 = new javax.swing.JRadioButton();
        radioSiemprePregunta41 = new javax.swing.JRadioButton();
        panelPregunta40 = new javax.swing.JPanel();
        radioNuncaPregunta40 = new javax.swing.JRadioButton();
        radioVecesPregunta40 = new javax.swing.JRadioButton();
        radioSiemprePregunta40 = new javax.swing.JRadioButton();
        labelPregunta40 = new javax.swing.JLabel();

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

        labelPregunta14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPregunta14.setText("PREGUNTAS DEL TEST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(labelPregunta14, gridBagConstraints);

        btnSiguiente14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSiguiente14.setText("Siguiente");
        btnSiguiente14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente14ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 40;
        panelDerecho.add(btnSiguiente14, gridBagConstraints);

        panelPregunta42.setBackground(new java.awt.Color(250, 253, 214));
        panelPregunta42.setPreferredSize(new java.awt.Dimension(625, 170));
        panelPregunta42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioNuncaPregunta42.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioNuncaPregunta42.setText("Nunca");
        radioNuncaPregunta42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuncaPregunta42ActionPerformed(evt);
            }
        });
        panelPregunta42.add(radioNuncaPregunta42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        radioVecesPregunta42.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioVecesPregunta42.setText("Algunas veces");
        radioVecesPregunta42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVecesPregunta42ActionPerformed(evt);
            }
        });
        panelPregunta42.add(radioVecesPregunta42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        radioSiemprePregunta42.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioSiemprePregunta42.setText("Siempre");
        radioSiemprePregunta42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiemprePregunta42ActionPerformed(evt);
            }
        });
        panelPregunta42.add(radioSiemprePregunta42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        labelPregunta42.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelPregunta42.setText("42. Me responsabilizo de las cosas que hago.");
        panelPregunta42.add(labelPregunta42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(panelPregunta42, gridBagConstraints);

        panelPregunta41.setBackground(new java.awt.Color(250, 253, 214));
        panelPregunta41.setPreferredSize(new java.awt.Dimension(625, 170));
        panelPregunta41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPregunta41.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelPregunta41.setText("41. Soy capaz de verme a mí mismo desde la perspectiva de los otros. ");
        panelPregunta41.add(labelPregunta41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, -1));

        radioNuncaPregunta41.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioNuncaPregunta41.setText("Nunca");
        radioNuncaPregunta41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuncaPregunta41ActionPerformed(evt);
            }
        });
        panelPregunta41.add(radioNuncaPregunta41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        radioVecesPregunta41.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioVecesPregunta41.setText("Algunas veces");
        radioVecesPregunta41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVecesPregunta41ActionPerformed(evt);
            }
        });
        panelPregunta41.add(radioVecesPregunta41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        radioSiemprePregunta41.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioSiemprePregunta41.setText("Siempre");
        radioSiemprePregunta41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiemprePregunta41ActionPerformed(evt);
            }
        });
        panelPregunta41.add(radioSiemprePregunta41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(panelPregunta41, gridBagConstraints);

        panelPregunta40.setBackground(new java.awt.Color(250, 253, 214));
        panelPregunta40.setPreferredSize(new java.awt.Dimension(625, 170));
        panelPregunta40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioNuncaPregunta40.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioNuncaPregunta40.setText("Nunca");
        radioNuncaPregunta40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuncaPregunta40ActionPerformed(evt);
            }
        });
        panelPregunta40.add(radioNuncaPregunta40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        radioVecesPregunta40.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioVecesPregunta40.setText("Algunas veces");
        radioVecesPregunta40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVecesPregunta40ActionPerformed(evt);
            }
        });
        panelPregunta40.add(radioVecesPregunta40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        radioSiemprePregunta40.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioSiemprePregunta40.setText("Siempre");
        radioSiemprePregunta40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiemprePregunta40ActionPerformed(evt);
            }
        });
        panelPregunta40.add(radioSiemprePregunta40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        labelPregunta40.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelPregunta40.setText("40. Identifico las emociones que expresa la gente a mi alrededor. ");
        panelPregunta40.add(labelPregunta40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(panelPregunta40, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelPrincipal.add(panelDerecho, gridBagConstraints);

        jScrollPane1.setViewportView(panelPrincipal);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguiente14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente14ActionPerformed
        if (!validar.preguntaUno || !validar.preguntaDos || !validar.preguntaTres) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione todas las preguntas");

        } else {
            cuestionarioCatorce.retornarSubtotal();
            cuestionarioCatorce.retornarTotal();

//            JOptionPane.showMessageDialog(null, "El subtotal es " + cuestionarioCatorce.retornarSubtotal());
//            JOptionPane.showMessageDialog(null, "El total es " + cuestionarioCatorce.retornarTotal());
            VentanaPreguntas15 ventanaQuince = new VentanaPreguntas15(cuestionarioCatorce.retornarTotal());
            ventanaQuince.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSiguiente14ActionPerformed

    private void radioNuncaPregunta40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuncaPregunta40ActionPerformed
        if (radioNuncaPregunta40.isSelected() == true) {
            cuestionarioCatorce.setValorPreguntaUno(new Cuestionario().asignarValorNunca());
            validar.preguntaUno = true;
           // JOptionPane.showMessageDialog(null, "El valor de la pregunta uno es " + cuestionarioCatorce.getValorPreguntaUno());

        }
    }//GEN-LAST:event_radioNuncaPregunta40ActionPerformed

    private void radioVecesPregunta40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVecesPregunta40ActionPerformed
        if (radioVecesPregunta40.isSelected() == true) {
            cuestionarioCatorce.setValorPreguntaUno(new Cuestionario().asignarValorAlgunasVeces());
            validar.preguntaUno = true;
            //JOptionPane.showMessageDialog(null, "El valor de la pregunta uno es " + cuestionarioCatorce.getValorPreguntaUno());

        }
    }//GEN-LAST:event_radioVecesPregunta40ActionPerformed

    private void radioSiemprePregunta40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiemprePregunta40ActionPerformed
        if (radioSiemprePregunta40.isSelected() == true) {
            cuestionarioCatorce.setValorPreguntaUno(new Cuestionario().asignarValorSiempre());
            validar.preguntaUno = true;
           // JOptionPane.showMessageDialog(null, "El valor de la pregunta uno es " + cuestionarioCatorce.getValorPreguntaUno());

        }
    }//GEN-LAST:event_radioSiemprePregunta40ActionPerformed

    private void radioNuncaPregunta41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuncaPregunta41ActionPerformed
        if (radioNuncaPregunta41.isSelected() == true) {
            cuestionarioCatorce.setValorPreguntaDos(new Cuestionario().asignarValorNunca());
            validar.preguntaDos = true;
          //  JOptionPane.showMessageDialog(null, "EL valor de la pregunta dos es " + cuestionarioCatorce.getValorPreguntaDos());

        }
    }//GEN-LAST:event_radioNuncaPregunta41ActionPerformed

    private void radioVecesPregunta41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVecesPregunta41ActionPerformed
        if (radioVecesPregunta41.isSelected() == true) {
            cuestionarioCatorce.setValorPreguntaDos(new Cuestionario().asignarValorAlgunasVeces());
            validar.preguntaDos = true;
         //   JOptionPane.showMessageDialog(null, "EL valor de la pregunta dos es " + cuestionarioCatorce.getValorPreguntaDos());

        }
    }//GEN-LAST:event_radioVecesPregunta41ActionPerformed

    private void radioSiemprePregunta41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiemprePregunta41ActionPerformed
        if (radioSiemprePregunta41.isSelected() == true) {
            cuestionarioCatorce.setValorPreguntaDos(new Cuestionario().asignarValorSiempre());
            validar.preguntaDos = true;
           // JOptionPane.showMessageDialog(null, "EL valor de la pregunta dos es " + cuestionarioCatorce.getValorPreguntaDos());

        }
    }//GEN-LAST:event_radioSiemprePregunta41ActionPerformed

    private void radioNuncaPregunta42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuncaPregunta42ActionPerformed
        if (radioNuncaPregunta42.isSelected() == true) {
            cuestionarioCatorce.setValorPreguntaTres(new Cuestionario().asignarValorNunca());
            validar.preguntaTres = true;
           // JOptionPane.showMessageDialog(null, "El valor de la pregunta tres es " + cuestionarioCatorce.getValorPreguntaTres());

        }
    }//GEN-LAST:event_radioNuncaPregunta42ActionPerformed

    private void radioVecesPregunta42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVecesPregunta42ActionPerformed
        if (radioVecesPregunta42.isSelected() == true) {
            cuestionarioCatorce.setValorPreguntaTres(new Cuestionario().asignarValorAlgunasVeces());
            validar.preguntaTres = true;
          //  JOptionPane.showMessageDialog(null, "El valor de la pregunta tres es " + cuestionarioCatorce.getValorPreguntaTres());

        }
    }//GEN-LAST:event_radioVecesPregunta42ActionPerformed

    private void radioSiemprePregunta42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiemprePregunta42ActionPerformed
        if (radioSiemprePregunta42.isSelected() == true) {
            cuestionarioCatorce.setValorPreguntaTres(new Cuestionario().asignarValorSiempre());
            validar.preguntaTres = true;
           // JOptionPane.showMessageDialog(null, "El valor de la pregunta tres es " + cuestionarioCatorce.getValorPreguntaTres());

        }
    }//GEN-LAST:event_radioSiemprePregunta42ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPreguntas14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VentanaPreguntas14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPregunta14;
    private javax.swing.JLabel labelPregunta40;
    private javax.swing.JLabel labelPregunta41;
    private javax.swing.JLabel labelPregunta42;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelPregunta40;
    private javax.swing.JPanel panelPregunta41;
    private javax.swing.JPanel panelPregunta42;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton radioNuncaPregunta40;
    private javax.swing.JRadioButton radioNuncaPregunta41;
    private javax.swing.JRadioButton radioNuncaPregunta42;
    private javax.swing.JRadioButton radioSiemprePregunta40;
    private javax.swing.JRadioButton radioSiemprePregunta41;
    private javax.swing.JRadioButton radioSiemprePregunta42;
    private javax.swing.JRadioButton radioVecesPregunta40;
    private javax.swing.JRadioButton radioVecesPregunta41;
    private javax.swing.JRadioButton radioVecesPregunta42;
    // End of variables declaration//GEN-END:variables
}
