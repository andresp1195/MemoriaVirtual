/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoriavirtual;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jespi_000
 */
public class FuncionamientoGUI extends javax.swing.JFrame {

    /**
     * Creates new form FuncionamientoGUI
     */
    public FuncionamientoGUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeReferencias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NextButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDeLog = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funcionamiento");

        TablaDeReferencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Frame", "Proceso", "Página", "Bit de Bloqueo", "Dirty Bit (Modificación)", "TS de Creación", "TS de Modificación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaDeReferencias);

        jLabel1.setText("Log de Actividad");

        NextButton.setText("Siguiente");
        NextButton.setToolTipText("Continuar leyendo y ejecutando las siguientes referencias.");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.setToolTipText("Volver a configurar el sistema desde la inserción de los archivos de texto.");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Tabla de Referencias");

        TablaDeLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "# de Referencia", "Proceso", "Pág en Cuestión", "Reemplazo", "Time Stamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaDeLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResetButton)
                        .addGap(39, 39, 39)
                        .addComponent(NextButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextButton)
                    .addComponent(ResetButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        this.setVisible(false);
        this.dispose();
        VentanaInicio vi = new VentanaInicio();
        vi.setVisible(true);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        if (!Main.lineas_archivos_referencias.isEmpty()){
            JOptionPane.showConfirmDialog(new JFrame(), "Ya se cargaron todas las referencias del archivo especificado.");
        }
        else{
            for (int indice = 0; indice < Main.numero_referencias_por_iteracion; indice ++){
                //Obtener y seccionar Referencia
                String[] referenciaSeccionada = Main.lineas_archivos_referencias.get(indice).split(",");
                
                //Validar Referencia
                if (ValidarReferencia(referenciaSeccionada)){
                    //Agregar Referencia válida a la lista en Main.lineas_referencias_en_cuestion
                    Referencia r = new Referencia(Integer.parseInt(referenciaSeccionada[0]),Integer.parseInt(referenciaSeccionada[1]),referenciaSeccionada[2].charAt(0));
                    Main.lineas_referencias_en_cuestion.add(r);
                    
                    //Ejecutar las referencias en Main.lineas_referencias_en_cuestion
                    
                }
            }
        }
    }//GEN-LAST:event_NextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionamientoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionamientoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionamientoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionamientoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionamientoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NextButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JTable TablaDeLog;
    private javax.swing.JTable TablaDeReferencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarReferencia(String[] referenciaSeccionada) {
        try{
            int id = Integer.parseInt(referenciaSeccionada[0]);
            int tamano = Integer.parseInt(referenciaSeccionada[1]);
            if ((referenciaSeccionada[2].equals("w")) || (referenciaSeccionada[2].equals("r"))){
                if (Main.lista_Procesos.stream().anyMatch((a) -> ((a.identificador == id) && (a.tamano >= tamano)))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        catch(Exception e){
            String referencia = "";
            for (String s : referenciaSeccionada){
                referencia = referencia.concat(s);
            }
            VentanaConfiguracion.MensajeError("La referencia que contiene los siguientes datos:\n\n     "+referencia+"\n\nNo presenta un formato válido.", "Referencia Inválida");
            return false;
        }
    }
}
