/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ouvidoria;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;
import java.util.Date;

/**
 *
 * @author N0026925
 */
public class nova_os extends javax.swing.JDialog {

    Menu mn;
    tratar tr;
    String contrato;
    int current_id;
    boolean is_reag;
    String[] num_os;
    String[] tipo_os_arr;

    /**
     * Creates new form nova_os
     */
    public nova_os(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public nova_os(Menu mn, boolean modal, tratar tr, String contrato, int id, String janela, Date data, String cop) {

        super(mn, modal);
        initComponents();

        this.tr = tr;
        this.contrato = contrato;
        this.mn = mn;
        this.current_id = id;

        global.fill_combo(janela_alter, "SELECT nome_janela "
                + "FROM janelas "
                + "WHERE cop = '" + cop + "' "
                + "ORDER BY nome_janela", true);

        global.fill_combo(tipo_os_agenda, "SELECT tipo_os "
                + "FROM tipo_os_novo "
                + "WHERE cop = '" + cop + "' "
                + "ORDER BY tipo_os", true);

        botao_submit.setText("Inserir OS!");

        data_alter.setDate(data);
        janela_alter.setSelectedItem(janela);

        global.open_modal(this, "Adicionar nova OS");
    }

    public nova_os(Menu mn, boolean modal, tratar tr, String contrato, int id, boolean is_reag,
            String[] num_os, String[] tipo, String janela, Date data, String cop) {

        super(mn, modal);
        initComponents();

        this.tr = tr;
        this.contrato = contrato;
        this.mn = mn;
        this.current_id = id;
        this.is_reag = is_reag;

        this.num_os = num_os;
        this.tipo_os_arr = tipo;

        num_os_alter.setVisible(false);
        tipo_os_agenda.setVisible(false);

        global.fill_combo(janela_alter, "SELECT nome_janela "
                + "FROM janelas "
                + "WHERE cop = '" + cop + "' "
                + "ORDER BY nome_janela", true);

        global.fill_combo(tipo_os_agenda, "SELECT tipo_os "
                + "FROM tipo_os_novo "
                + "WHERE cop = '" + cop + "' "
                + "ORDER BY tipo_os", true);

        num_os_alter.setEnabled(false);
        tipo_os_agenda.setEnabled(false);
        label_num_os.setVisible(false);
        label_tipo_os.setVisible(false);

        botao_submit.setText("Reagendar OS!");

        data_alter.setDate(data);
        janela_alter.setSelectedItem(janela);

        global.open_modal(this, "Reagendar OS");

    }

    public void insere_os() {

        //testando o número da OS
        if (num_os_alter.getText().length() > global.iMaxNumOS) {
            global.show_error_message("Número da OS não pode possuir mais de " + global.iMaxNumOS + " caracteres");
            return;
        }
        try {
            Long lNumOS = Long.parseLong(num_os_alter.getText());
        } catch (Exception e) {
            global.show_error_message("Número da OS inválido");
            return;
        }
        //
        
        this.dispose();

        tr.insert_nova_os(num_os_alter.getText(), data_alter.getDate(),
                (String) janela_alter.getSelectedItem(), (String) tipo_os_agenda.getSelectedItem(),
                obs_horario_alter.getText(), obs_agendamento.getText());

    }

    public void reagenda_os() {

        this.dispose();

        tr.reagenda_os(num_os, data_alter.getDate(), (String) janela_alter.getSelectedItem(),
                tipo_os_arr, obs_horario_alter.getText(), obs_agendamento.getText());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        obs_horario_alter = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        botao_submit = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        data_alter = new org.jdesktop.swingx.JXDatePicker();
        jLabel16 = new javax.swing.JLabel();
        janela_alter = new javax.swing.JComboBox();
        tipo_os_agenda = new javax.swing.JComboBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        obs_agendamento = new javax.swing.JTextArea();
        label_tipo_os = new javax.swing.JLabel();
        label_num_os = new javax.swing.JLabel();
        num_os_alter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel30.setText("Observação");

        obs_horario_alter.setColumns(20);
        obs_horario_alter.setRows(1);
        jScrollPane5.setViewportView(obs_horario_alter);

        jLabel21.setText("Particularidade");

        botao_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/date.png"))); // NOI18N
        botao_submit.setText("Alterar agendamento");
        botao_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_submitActionPerformed(evt);
            }
        });

        jLabel20.setText("Nova janela");

        jLabel16.setText("Nova data");

        obs_agendamento.setColumns(20);
        obs_agendamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        obs_agendamento.setLineWrap(true);
        obs_agendamento.setRows(2);
        obs_agendamento.setWrapStyleWord(true);
        jScrollPane6.setViewportView(obs_agendamento);

        label_tipo_os.setText("Tipo de OS");

        label_num_os.setText("Numero da OS");

        num_os_alter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                num_os_alterKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_os_alterKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botao_submit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel30)
                            .addComponent(jLabel16)
                            .addComponent(label_tipo_os)
                            .addComponent(label_num_os))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tipo_os_agenda, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(data_alter, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(janela_alter, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(num_os_alter, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_os_alter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_num_os))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(data_alter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(janela_alter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tipo_os)
                    .addComponent(tipo_os_agenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botao_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_submitActionPerformed

        if (is_reag) {

            reagenda_os();

        } else {

            insere_os();
        }

    }//GEN-LAST:event_botao_submitActionPerformed

    private void num_os_alterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_os_alterKeyTyped
        //KeyTyped é para Caracteres Imprimíveis

        if ((evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && (evt.getKeyCode() != KeyEvent.VK_ENTER))) {
            if (!Character.isDigit(evt.getKeyChar())) {
                evt.consume();
                evt.setKeyCode(0);
                return;
            }

            if (num_os_alter.getText().length() >= global.iMaxNumOS) {
                evt.consume();
                evt.setKeyCode(0);
                return;
            }
        }

    }//GEN-LAST:event_num_os_alterKeyTyped

    private void num_os_alterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_os_alterKeyPressed
        //KeyPressed é para Caracteres Não-Imprimíveis

        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V) {
            String sTexto = "";
            Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
            Clipboard systemClipboard = defaultToolkit.getSystemClipboard();
            DataFlavor dataFlavor = DataFlavor.stringFlavor;

            if (systemClipboard.isDataFlavorAvailable(dataFlavor)) {
                try {
                    sTexto = (String) systemClipboard.getData(dataFlavor);
                    sTexto = sTexto.trim();
                    if (sTexto.length() <= global.iMaxNumOS) {
                        sTexto = sTexto.substring(0, sTexto.length());
                        for (int i = 0; i < sTexto.length(); i++) {
                            if (Integer.parseInt(sTexto.substring(i, i + 1)) >= 0) {

                            }
                        }
                    } else {
                        sTexto = "";
                        global.show_error_message("O que era para ser colado possui mais de " + global.iMaxNumOS + " caracteres");
                    }
                } catch (Exception e) {
                    sTexto = "";
                    global.show_error_message("O que era para ser colado não é um número");
                }
            }
            if ("".equals(sTexto)) {
                num_os_alter.setTransferHandler(null);
            } else {
                num_os_alter.setTransferHandler(null);
                num_os_alter.setText(sTexto);
            }
        }
    }//GEN-LAST:event_num_os_alterKeyPressed

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
            java.util.logging.Logger.getLogger(nova_os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nova_os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nova_os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nova_os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nova_os dialog = new nova_os(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_submit;
    private org.jdesktop.swingx.JXDatePicker data_alter;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox janela_alter;
    private javax.swing.JLabel label_num_os;
    private javax.swing.JLabel label_tipo_os;
    private javax.swing.JTextField num_os_alter;
    private javax.swing.JTextArea obs_agendamento;
    private javax.swing.JTextArea obs_horario_alter;
    private javax.swing.JComboBox tipo_os_agenda;
    // End of variables declaration//GEN-END:variables
}
