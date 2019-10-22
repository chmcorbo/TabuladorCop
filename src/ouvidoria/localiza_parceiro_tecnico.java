/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ouvidoria;

import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import net.coderazzi.filters.gui.AutoChoices;
import net.coderazzi.filters.gui.TableFilterHeader;

/**
 *
 * @author ROBSMAC
 */
public class localiza_parceiro_tecnico extends javax.swing.JDialog {

    Menu mn;
    JTable main_tab;

    String s_cidade;
    String s_parceiro;
    String s_email;

    /**
     * Creates new form localiza_parceiro_tecnico
     */
    public localiza_parceiro_tecnico() {
        initComponents();
    }

//public localiza_parceiro_tecnico(java.awt.Frame parent, boolean modal) {
    public localiza_parceiro_tecnico(Menu mn, boolean modal) {
        super(mn, modal);
        initComponents();

        this.mn = mn;
        //atualiza_painel();

        global.open_nonmodal(this, "Localizador de Parceiras e Técnicos");

        jtxt_cidade.setText("");
        jtxt_email.setText("");
        jtxt_parceiro.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxt_cidade = new javax.swing.JTextField();
        jtxt_email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxt_parceiro = new javax.swing.JTextField();
        jckb_cop_net = new javax.swing.JCheckBox();
        jckb_cop_dth = new javax.swing.JCheckBox();
        jbt_localizar = new javax.swing.JButton();
        jpnl_planilha = new javax.swing.JPanel();
        jpnl_status_bar = new javax.swing.JPanel();
        jlbl_status_bar = new javax.swing.JLabel();
        jckb_refinar_busca = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("Cidade");

        jLabel4.setText("Cadastro");

        jLabel3.setText("Parceiro");

        jLabel5.setText("eMail");

        jtxt_cidade.setText("Cidade");

        jtxt_email.setText("eMail");
        jtxt_email.setToolTipText("Preenchendo este campo, a lista de técnicos também será considerada");

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Parâmetros de busca. Informar dois parâmetros ao menos é recomendável.");

        jtxt_parceiro.setText("Parceiro");

        jckb_cop_net.setSelected(true);
        jckb_cop_net.setText("NET");

        jckb_cop_dth.setText("DTH");

        jbt_localizar.setText("Localizar");
        jbt_localizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_localizarActionPerformed(evt);
            }
        });

        jpnl_planilha.setBackground(new java.awt.Color(204, 204, 255));
        jpnl_planilha.setToolTipText("");

        javax.swing.GroupLayout jpnl_planilhaLayout = new javax.swing.GroupLayout(jpnl_planilha);
        jpnl_planilha.setLayout(jpnl_planilhaLayout);
        jpnl_planilhaLayout.setHorizontalGroup(
            jpnl_planilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnl_planilhaLayout.setVerticalGroup(
            jpnl_planilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        jpnl_status_bar.setBackground(new java.awt.Color(153, 204, 255));

        jlbl_status_bar.setText("Aguardando comando");

        javax.swing.GroupLayout jpnl_status_barLayout = new javax.swing.GroupLayout(jpnl_status_bar);
        jpnl_status_bar.setLayout(jpnl_status_barLayout);
        jpnl_status_barLayout.setHorizontalGroup(
            jpnl_status_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl_status_barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_status_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnl_status_barLayout.setVerticalGroup(
            jpnl_status_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl_status_barLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbl_status_bar))
        );

        jckb_refinar_busca.setSelected(true);
        jckb_refinar_busca.setText("Refinar busca");
        jckb_refinar_busca.setToolTipText("Marcado, traz informações que satisfazem a todas as condições, caso contrário, que satisfazem a uma ou outra condição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jckb_cop_net)
                                        .addGap(19, 19, 19)
                                        .addComponent(jckb_cop_dth))
                                    .addComponent(jtxt_parceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jbt_localizar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpnl_planilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnl_status_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jckb_refinar_busca)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jtxt_parceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jckb_cop_net)
                            .addComponent(jckb_cop_dth)
                            .addComponent(jbt_localizar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jckb_refinar_busca)
                .addGap(9, 9, 9)
                .addComponent(jpnl_planilha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnl_status_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_localizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_localizarActionPerformed
        // TODO add your handling code here:
        StringBuilder sMsg = new StringBuilder();

        Integer i_qtd_vazios = 0;

        jtxt_cidade.setText(jtxt_cidade.getText().trim());
        jtxt_email.setText(jtxt_email.getText().trim());
        jtxt_parceiro.setText(jtxt_parceiro.getText().trim());

        if (jtxt_cidade.getText().length() == 0) {
            i_qtd_vazios = i_qtd_vazios + 1;
        }
        if (jtxt_email.getText().length() == 0) {
            i_qtd_vazios = i_qtd_vazios + 1;
        }
        if (jtxt_parceiro.getText().length() == 0) {
            i_qtd_vazios = i_qtd_vazios + 1;
        }

        if (i_qtd_vazios == 3) {
            sMsg.append("Informe ao menos um critério textual\n");
            sMsg.append("  > Recomenda-se dois ao menos\n");
        }

        if (!jckb_cop_dth.isSelected() && !jckb_cop_net.isSelected()) {
            sMsg.append("Informe o tipo de parceiro ou técnico: NET e/ou DTH\n");
        }

        if (sMsg.length() != 0) {
            this.setVisible(false);
            global.show_warning_message("Faltam informações. Veja abaixo: \n\n" + sMsg.toString());
            this.setVisible(true);
            return;
        }

        s_cidade = jtxt_cidade.getText();
        s_parceiro = jtxt_parceiro.getText();
        s_email = jtxt_email.getText();

        atualiza_painel();
    }//GEN-LAST:event_jbt_localizarActionPerformed

    public void atualiza_painel() {

        Cursor hourglassCursor = new Cursor(Cursor.WAIT_CURSOR);
        Cursor normalCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        
        jlbl_status_bar.setText("Processando...");

        jpnl_planilha.removeAll();
        jpnl_planilha.repaint();
        jpnl_planilha.revalidate();

        String sCondicional = "";
        if (jckb_refinar_busca.isSelected()) {
            sCondicional = "and ";
        } else {
            sCondicional = "or ";
        }
        
        String sCondicao = "";
        if (s_parceiro.length() != 0) {
            if (sCondicao.length() != 0) {
                sCondicao = sCondicao + sCondicional;
            }
            sCondicao = sCondicao + "(Parceira like '%" + s_parceiro + "%' or Outro_Nome like '%" + s_parceiro + "%') \n";
        }
        if (s_email.length() != 0) {
            if (sCondicao.length() != 0) {
                sCondicao = sCondicao + sCondicional;
            }
            sCondicao = sCondicao + "(eMail_Parceira like '%" + s_email + "%') \n";
        }
        if (s_cidade.length() != 0) {
            if (sCondicao.length() != 0) {
                sCondicao = sCondicao + sCondicional;
            }
            sCondicao = sCondicao + "(cidade like '%" + s_cidade + "%') \n";
        }

        sCondicao = "where " + sCondicao;

        StringBuilder sSQL = new StringBuilder();
        if (jckb_cop_net.isSelected()) {
            if (sSQL.length() > 0) {
                sSQL.append("UNION \n");
            }
            sSQL.append("select * \n");
            sSQL.append("from \n");
            sSQL.append("( \n");
            sSQL.append("select \n");
            sSQL.append("'NET' as COP, p.cidade as Cidade, p.parceira as Parceira, p.email_parceira as eMail_Parceira, \n");
            sSQL.append("ifnull(pdp.fonte_outras,'<não há>') as Outro_Nome, \n");
            sSQL.append("ifnull(p.atividade, '<sem informação>') as Atividade \n");
            //sSQL.append("from (select cidade as Cidade, parceira as Parceira, email as eMail_Parceira from ouvidoria.cop_info_parceiras) p \n");
            sSQL.append("from (select cidade as Cidade, parceira as Parceira, email as eMail_Parceira, atividade from ouvidoria.vw_cop_info_parceiras) p \n");
            sSQL.append("left join ouvidoria.tb_parceiras_de_para pdp on p.parceira = pdp.fonte_cop \n");
            sSQL.append("order by p.cidade, p.parceira, p.eMail_Parceira \n");
            sSQL.append(") as a \n");
            sSQL.append(sCondicao);
        }
        if (jckb_cop_dth.isSelected()) {
            if (sSQL.length() > 0) {
                sSQL.append("UNION \n");
            }
            sSQL.append("select * \n");
            sSQL.append("from \n");
            sSQL.append("( \n");
            sSQL.append("select \n");
            sSQL.append("'DTH' as COP, p.cidade as Cidade, p.parceira as Parceira, p.email_parceira as eMail_Parceira, \n");
            sSQL.append("ifnull(pdp.fonte_outras,'<não há>') as Outro_Nome, \n");
            sSQL.append("'<sem informação>' as Atividade \n");
            sSQL.append("from (select mr as Cidade, codigo as Parceira, email1 as eMail_Parceira from ouvidoria.cop_info_dth) p \n");
            sSQL.append("left join ouvidoria.tb_parceiras_de_para pdp on p.parceira = pdp.fonte_cop \n");
            sSQL.append("order by p.cidade, p.parceira, p.eMail_Parceira \n");
            sSQL.append(") as a \n");
            sSQL.append(sCondicao);
        }
        if (s_email.length() > 0) {
            if (sSQL.length() > 0) {
                sSQL.append("UNION \n");
            }
            sSQL.append("select * \n");
            sSQL.append("from \n");
            sSQL.append("( \n");
            sSQL.append("select \n");
            sSQL.append("'TÉCNICA' as COP, cidade as Cidade, '<sem informação>' as Parceira, \n");
            sSQL.append("email as eMail_Parceira, '<não se aplica>' as Outro_Nome, \n");
            sSQL.append("ifnull(p.atividade, '<sem informação>') as Atividade \n");
            //sSQL.append("from ouvidoria.cop_info_tecnica p \n");
            sSQL.append("from ouvidoria.vw_cop_info_tecnica p \n");
            sSQL.append("order by cidade, parceira, email_parceira \n");
            sSQL.append(") as a \n");
            sSQL.append(sCondicao);
        }

        try {
            setCursor(hourglassCursor);
            JTable tab = global.getTable(sSQL.toString(), jpnl_planilha);

            //int invisible_ids[] = {3, 4, 5, 6};
            int invisible_ids[] = {};
            int column_widths[] = {50, 150, 100, 100, 100, 100};

            global.hide_columns(invisible_ids, tab);
            global.adjust_columns(column_widths, tab);

            main_tab = tab;

            TableFilterHeader filter = new TableFilterHeader(main_tab, AutoChoices.ENABLED);
            filter.setAdaptiveChoices(true);

            main_tab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setCursor(normalCursor);
            
            jlbl_status_bar.setText(main_tab.getRowCount() + " registro(s) encontrado(s)");

        } catch (Exception ex) {
            setCursor(normalCursor);
            jlbl_status_bar.setText("Erro na última consulta");
            this.setVisible(false);
            Logger.getLogger(div_turno.class.getName()).log(Level.SEVERE, null, ex);
            global.show_error_message("Problemas na consulta.\n\nErro original: " + ex.getMessage());
            this.setVisible(true);
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
            java.util.logging.Logger.getLogger(localiza_parceiro_tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(localiza_parceiro_tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(localiza_parceiro_tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(localiza_parceiro_tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new localiza_parceiro_tecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbt_localizar;
    private javax.swing.JCheckBox jckb_cop_dth;
    private javax.swing.JCheckBox jckb_cop_net;
    private javax.swing.JCheckBox jckb_refinar_busca;
    private javax.swing.JLabel jlbl_status_bar;
    private javax.swing.JPanel jpnl_planilha;
    private javax.swing.JPanel jpnl_status_bar;
    private javax.swing.JTextField jtxt_cidade;
    private javax.swing.JTextField jtxt_email;
    private javax.swing.JTextField jtxt_parceiro;
    // End of variables declaration//GEN-END:variables
}