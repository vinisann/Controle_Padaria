package telas;

import java.sql.*;
import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
    }

    public TelaMenu(String usuario, String cargo) {
        initComponents();
        pnlCadastrarProdutos.setVisible(false);
        lblSaudacao.setText("Bem-vindo(a), " + usuario);
        if (cargo.equalsIgnoreCase("caixa") || cargo.equalsIgnoreCase("balconista")) {
            habilitar();
        }
    }

    private void habilitar() {
        itmCadastrarProdutos.setEnabled(false);
        itmAlterarProdutos.setEnabled(false);
        itmExcluirProdutos.setEnabled(false);
        itmRelatoriosProdutos.setEnabled(true);
        itmCadastrarFuncionarios.setEnabled(false);
        itmAlterarFuncionarios.setEnabled(false);
        itmExcluirFuncionarios.setEnabled(false);
        itmRelatorioFuncionarios.setEnabled(false);
    }

    public TelaMenu(String cargo) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();
        pnlCadastrarProdutos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        barMenu = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmCadastrarProdutos = new javax.swing.JMenuItem();
        itmAlterarProdutos = new javax.swing.JMenuItem();
        itmExcluirProdutos = new javax.swing.JMenuItem();
        itmRelatoriosProdutos = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        itmRelatorioFuncionarios = new javax.swing.JMenuItem();

        setTitle("Menu");
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(null);

        lblSaudacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(340, 0, 350, 30);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/fundoPadaria.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(550, 320, 140, 70);

        pnlCadastrarProdutos.setLayout(null);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigo.setText("C??digo");
        pnlCadastrarProdutos.add(lblCodigo);
        lblCodigo.setBounds(20, 10, 90, 30);
        pnlCadastrarProdutos.add(txtCodigo);
        txtCodigo.setBounds(110, 10, 170, 30);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("Nome");
        pnlCadastrarProdutos.add(lblNome);
        lblNome.setBounds(20, 60, 90, 30);
        pnlCadastrarProdutos.add(txtNome);
        txtNome.setBounds(110, 60, 360, 30);

        lblCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCategoria.setText("Categoria");
        pnlCadastrarProdutos.add(lblCategoria);
        lblCategoria.setBounds(20, 110, 90, 30);
        pnlCadastrarProdutos.add(txtCategoria);
        txtCategoria.setBounds(110, 110, 210, 30);

        lblPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPreco.setText("Pre??o");
        pnlCadastrarProdutos.add(lblPreco);
        lblPreco.setBounds(20, 160, 90, 30);
        pnlCadastrarProdutos.add(txtPreco);
        txtPreco.setBounds(110, 160, 170, 30);

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnConsultar);
        btnConsultar.setBounds(230, 220, 190, 40);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnSalvar);
        btnSalvar.setBounds(20, 220, 190, 40);

        getContentPane().add(pnlCadastrarProdutos);
        pnlCadastrarProdutos.setBounds(10, 20, 550, 290);

        mnuProdutos.setMnemonic('P');
        mnuProdutos.setText("Produtos");

        itmCadastrarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarProdutos.setText("Cadastrar");
        itmCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmCadastrarProdutos);

        itmAlterarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarProdutos.setText("Alterar");
        itmAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmAlterarProdutos);

        itmExcluirProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirProdutos.setText("Excluir");
        mnuProdutos.add(itmExcluirProdutos);

        itmRelatoriosProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatoriosProdutos.setText("Relat??rios");
        itmRelatoriosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmRelatoriosProdutos);

        barMenu.add(mnuProdutos);

        mnuFuncionarios.setMnemonic('F');
        mnuFuncionarios.setText("Funcion??rios");

        itmCadastrarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarFuncionarios.setText("Cadastrar");
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmAlterarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarFuncionarios.setText("Alterar");
        mnuFuncionarios.add(itmAlterarFuncionarios);

        itmExcluirFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirFuncionarios.setText("Excluir");
        mnuFuncionarios.add(itmExcluirFuncionarios);

        itmRelatorioFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatorioFuncionarios.setText("Relat??rios");
        mnuFuncionarios.add(itmRelatorioFuncionarios);

        barMenu.add(mnuFuncionarios);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(710, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmAlterarProdutosActionPerformed

    private void itmCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(true);
        btnConsultar.setVisible(false);
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {

            // Declara as var??aveis que vamos usar
            Connection conexao;
            PreparedStatement st;
            // Fazer a conex??o com o banco de dados
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "123456");
            // Inserir os dados na tabela
            st = conexao.prepareStatement("INSERT INTO cadastrar_produtos VALUES (?, ?, ?, ?)");
            st.setString(1, txtCodigo.getText());
            st.setString(2, txtNome.getText());
            st.setString(3, txtCategoria.getText());
            st.setDouble(4, Double.parseDouble(txtPreco.getText()));
            st.executeUpdate();
            // Mostrar mensagem indicando sucesso na opera????o
            JOptionPane.showMessageDialog(btnSalvar, "Produto salvo com sucesso!");
            // limpar os campos
            txtCodigo.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            txtPreco.setText("");
            txtCodigo.requestFocus();

            // Aqui a parte que vai salvar
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o tem o driver na biblioteca " + ex.getMessage());
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Este c??digo de produto j?? est?? cadastrado");
                txtCodigo.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro n??mero " + ex.getErrorCode() + "\nEntre em contato com o administrador e informe o n??mero do erro");
    }//GEN-LAST:event_btnSalvarActionPerformed
   
        }
    }
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        pnlCadastrarProdutos.setVisible(false);
        btnSalvar.setVisible(false);
        btnConsultar.setVisible(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void itmRelatoriosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnConsultar.setVisible(true);
    }//GEN-LAST:event_itmRelatoriosProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmAlterarProdutos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarProdutos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmExcluirProdutos;
    private javax.swing.JMenuItem itmRelatorioFuncionarios;
    private javax.swing.JMenuItem itmRelatoriosProdutos;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JPanel pnlCadastrarProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
