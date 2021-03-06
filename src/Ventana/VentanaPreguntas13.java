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
public class VentanaPreguntas13 extends javax.swing.JFrame {

    public int valorPasado;
    Cuestionario cuestionarioTrece;
    Validacion validar;

    public VentanaPreguntas13() {
        initComponents();
        this.setLocationRelativeTo(this);
        cargarRadioBotones();

    }

    public VentanaPreguntas13(int valorPasado) {
        this.valorPasado = valorPasado;
        initComponents();
        this.setLocationRelativeTo(this);
        cargarRadioBotones();
        cargarClases(this.valorPasado);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/test.png")));

    }

    public void cargarClases(int valorPasado) {
        cuestionarioTrece = new Cuestionario(valorPasado);
        validar = new Validacion();

    }

    public void cargarRadioBotones() {
        cargarRadioPregunta19();
        cargarRadioPregunta20();
        cargarRadioPregunta21();

    }

    public void cargarRadioPregunta19() {
        ButtonGroup grupoPregunta19 = new ButtonGroup();
        grupoPregunta19.add(radioNuncaPregunta37);
        grupoPregunta19.add(radioVecesPregunta37);
        grupoPregunta19.add(radioSiemprePregunta37);

    }

    public void cargarRadioPregunta20() {
        ButtonGroup grupoPregunta20 = new ButtonGroup();
        grupoPregunta20.add(radioNuncaPregunta38);
        grupoPregunta20.add(radioVecesPregunta38);
        grupoPregunta20.add(radioSiemprePregunta38);

    }

    public void cargarRadioPregunta21() {
        ButtonGroup grupoPregunta21 = new ButtonGroup();
        grupoPregunta21.add(radioNuncaPregunta39);
        grupoPregunta21.add(radioVecesPregunta39);
        grupoPregunta21.add(radioSiemprePregunta39);

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
        labelPregunta13 = new javax.swing.JLabel();
        btnSiguiente12 = new javax.swing.JButton();
        panelPregunta39 = new javax.swing.JPanel();
        radioNuncaPregunta39 = new javax.swing.JRadioButton();
        radioVecesPregunta39 = new javax.swing.JRadioButton();
        radioSiemprePregunta39 = new javax.swing.JRadioButton();
        labelPregunta39 = new javax.swing.JLabel();
        panelPregunta38 = new javax.swing.JPanel();
        labelPregunta38 = new javax.swing.JLabel();
        radioNuncaPregunta38 = new javax.swing.JRadioButton();
        radioVecesPregunta38 = new javax.swing.JRadioButton();
        radioSiemprePregunta38 = new javax.swing.JRadioButton();
        panelPregunta37 = new javax.swing.JPanel();
        radioNuncaPregunta37 = new javax.swing.JRadioButton();
        radioVecesPregunta37 = new javax.swing.JRadioButton();
        radioSiemprePregunta37 = new javax.swing.JRadioButton();
        labelPregunta37 = new javax.swing.JLabel();

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

        labelPregunta13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPregunta13.setText("PREGUNTAS DEL TEST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(labelPregunta13, gridBagConstraints);

        btnSiguiente12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSiguiente12.setText("Siguiente");
        btnSiguiente12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 40;
        panelDerecho.add(btnSiguiente12, gridBagConstraints);

        panelPregunta39.setBackground(new java.awt.Color(250, 253, 214));
        panelPregunta39.setPreferredSize(new java.awt.Dimension(625, 170));
        panelPregunta39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioNuncaPregunta39.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioNuncaPregunta39.setText("Nunca");
        radioNuncaPregunta39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuncaPregunta39ActionPerformed(evt);
            }
        });
        panelPregunta39.add(radioNuncaPregunta39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        radioVecesPregunta39.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioVecesPregunta39.setText("Algunas veces");
        radioVecesPregunta39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVecesPregunta39ActionPerformed(evt);
            }
        });
        panelPregunta39.add(radioVecesPregunta39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        radioSiemprePregunta39.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioSiemprePregunta39.setText("Siempre");
        radioSiemprePregunta39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiemprePregunta39ActionPerformed(evt);
            }
        });
        panelPregunta39.add(radioSiemprePregunta39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        labelPregunta39.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelPregunta39.setText("39. Soy capaz de comprender el punto vista de los dem??s. ");
        panelPregunta39.add(labelPregunta39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(panelPregunta39, gridBagConstraints);

        panelPregunta38.setBackground(new java.awt.Color(250, 253, 214));
        panelPregunta38.setPreferredSize(new java.awt.Dimension(625, 170));
        panelPregunta38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPregunta38.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelPregunta38.setText("38. Me comunico bien con la gente con la que me relaciono. ");
        panelPregunta38.add(labelPregunta38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, -1));

        radioNuncaPregunta38.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioNuncaPregunta38.setText("Nunca");
        radioNuncaPregunta38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuncaPregunta38ActionPerformed(evt);
            }
        });
        panelPregunta38.add(radioNuncaPregunta38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        radioVecesPregunta38.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioVecesPregunta38.setText("Algunas veces");
        radioVecesPregunta38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVecesPregunta38ActionPerformed(evt);
            }
        });
        panelPregunta38.add(radioVecesPregunta38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        radioSiemprePregunta38.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioSiemprePregunta38.setText("Siempre");
        radioSiemprePregunta38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiemprePregunta38ActionPerformed(evt);
            }
        });
        panelPregunta38.add(radioSiemprePregunta38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(panelPregunta38, gridBagConstraints);

        panelPregunta37.setBackground(new java.awt.Color(250, 253, 214));
        panelPregunta37.setPreferredSize(new java.awt.Dimension(625, 170));
        panelPregunta37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioNuncaPregunta37.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioNuncaPregunta37.setText("Nunca");
        radioNuncaPregunta37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuncaPregunta37ActionPerformed(evt);
            }
        });
        panelPregunta37.add(radioNuncaPregunta37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        radioVecesPregunta37.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioVecesPregunta37.setText("Algunas veces");
        radioVecesPregunta37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVecesPregunta37ActionPerformed(evt);
            }
        });
        panelPregunta37.add(radioVecesPregunta37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        radioSiemprePregunta37.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioSiemprePregunta37.setText("Siempre");
        radioSiemprePregunta37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiemprePregunta37ActionPerformed(evt);
            }
        });
        panelPregunta37.add(radioSiemprePregunta37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        labelPregunta37.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelPregunta37.setText("37. Soy capaz de aguantar bien la frustraci??n cuando no consigo lo que me propongo.   ");
        panelPregunta37.add(labelPregunta37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelDerecho.add(panelPregunta37, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelPrincipal.add(panelDerecho, gridBagConstraints);

        jScrollPane1.setViewportView(panelPrincipal);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguiente12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente12ActionPerformed
        if (!validar.preguntaUno || !validar.preguntaDos || !validar.preguntaTres) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione todas las preguntas");

        } else {
            cuestionarioTrece.retornarSubtotal();
            cuestionarioTrece.retornarTotal();

//            JOptionPane.showMessageDialog(null, "El subtotal es " + cuestionarioTrece.retornarSubtotal());
//            JOptionPane.showMessageDialog(null, "El total es " + cuestionarioTrece.retornarTotal());
            VentanaPreguntas14 ventanaCatorce = new VentanaPreguntas14(cuestionarioTrece.retornarTotal());
            ventanaCatorce.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSiguiente12ActionPerformed

    private void radioNuncaPregunta37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuncaPregunta37ActionPerformed
        if (radioNuncaPregunta37.isSelected() == true) {
            cuestionarioTrece.setValorPreguntaUno(new Cuestionario().asignarValorNunca());
            validar.preguntaUno = true;
            //JOptionPane.showMessageDialog(null, "El valor de la pregunta uno es " + cuestionarioTrece.getValorPreguntaUno());

        }
    }//GEN-LAST:event_radioNuncaPregunta37ActionPerformed

    private void radioVecesPregunta37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVecesPregunta37ActionPerformed
        if (radioVecesPregunta37.isSelected() == true) {
            cuestionarioTrece.setValorPreguntaUno(new Cuestionario().asignarValorAlgunasVeces());
            validar.preguntaUno = true;
            //JOptionPane.showMessageDialog(null, "El valor de la pregunta uno es " + cuestionarioTrece.getValorPreguntaUno());

        }
    }//GEN-LAST:event_radioVecesPregunta37ActionPerformed

    private void radioSiemprePregunta37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiemprePregunta37ActionPerformed
        if (radioSiemprePregunta37.isSelected() == true) {
            cuestionarioTrece.setValorPreguntaUno(new Cuestionario().asignarValorSiempre());
            validar.preguntaUno = true;
           // JOptionPane.showMessageDialog(null, "El valor de la pregunta uno es " + cuestionarioTrece.getValorPreguntaUno());

        }
    }//GEN-LAST:event_radioSiemprePregunta37ActionPerformed

    private void radioNuncaPregunta38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuncaPregunta38ActionPerformed
        if (radioNuncaPregunta38.isSelected() == true) {
            cuestionarioTrece.setValorPreguntaDos(new Cuestionario().asignarValorNunca());
            validar.preguntaDos = true;
            //JOptionPane.showMessageDialog(null, "El valor de la pregunta dos es " + cuestionarioTrece.getValorPreguntaDos());

        }
    }//GEN-LAST:event_radioNuncaPregunta38ActionPerformed

    private void radioVecesPregunta38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVecesPregunta38ActionPerformed
        if (radioVecesPregunta38.isSelected() == true) {
            cuestionarioTrece.setValorPreguntaDos(new Cuestionario().asignarValorAlgunasVeces());
            validar.preguntaDos = true;
           // JOptionPane.showMessageDialog(null, "El valor de la pregunta dos es " + cuestionarioTrece.getValorPreguntaDos());

        }
    }//GEN-LAST:event_radioVecesPregunta38ActionPerformed

    private void radioSiemprePregunta38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiemprePregunta38ActionPerformed
        if (radioSiemprePregunta38.isSelected() == true) {
            cuestionarioTrece.setValorPreguntaDos(new Cuestionario().asignarValorSiempre());
            validar.preguntaDos = true;
           // JOptionPane.showMessageDialog(null, "El valor de la pregunta dos es " + cuestionarioTrece.getValorPreguntaDos());

        }
    }//GEN-LAST:event_radioSiemprePregunta38ActionPerformed

    private void radioNuncaPregunta39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuncaPregunta39ActionPerformed
        if (radioNuncaPregunta39.isSelected() == true) {
            cuestionarioTrece.setValorPreguntaTres(new Cuestionario().asignarValorNunca());
            validar.preguntaTres = true;
           // JOptionPane.showMessageDialog(null, "El valor de la pregunta tres es " + cuestionarioTrece.getValorPreguntaTres());

        }
    }//GEN-LAST:event_radioNuncaPregunta39ActionPerformed

    private void radioVecesPregunta39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVecesPregunta39ActionPerformed
        if (radioVecesPregunta39.isSelected() == true) {
            cuestionarioTrece.setValorPreguntaTres(new Cuestionario().asignarValorAlgunasVeces());
            validar.preguntaTres = true;
           // JOptionPane.showMessageDialog(null, "El valor de la pregunta tres es " + cuestionarioTrece.getValorPreguntaTres());

        }
    }//GEN-LAST:event_radioVecesPregunta39ActionPerformed

    private void radioSiemprePregunta39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiemprePregunta39ActionPerformed
        if (radioSiemprePregunta39.isSelected() == true) {
            cuestionarioTrece.setValorPreguntaTres(new Cuestionario().asignarValorSiempre());
            validar.preguntaTres = true;
            //JOptionPane.showMessageDialog(null, "El valor de la pregunta tres es " + cuestionarioTrece.getValorPreguntaTres());

        }
    }//GEN-LAST:event_radioSiemprePregunta39ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPreguntas13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPreguntas13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPregunta13;
    private javax.swing.JLabel labelPregunta37;
    private javax.swing.JLabel labelPregunta38;
    private javax.swing.JLabel labelPregunta39;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelPregunta37;
    private javax.swing.JPanel panelPregunta38;
    private javax.swing.JPanel panelPregunta39;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton radioNuncaPregunta37;
    private javax.swing.JRadioButton radioNuncaPregunta38;
    private javax.swing.JRadioButton radioNuncaPregunta39;
    private javax.swing.JRadioButton radioSiemprePregunta37;
    private javax.swing.JRadioButton radioSiemprePregunta38;
    private javax.swing.JRadioButton radioSiemprePregunta39;
    private javax.swing.JRadioButton radioVecesPregunta37;
    private javax.swing.JRadioButton radioVecesPregunta38;
    private javax.swing.JRadioButton radioVecesPregunta39;
    // End of variables declaration//GEN-END:variables
}
