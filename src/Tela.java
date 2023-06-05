import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame{
    private JPanel conta;
    private JLabel valor;
    private JTextField textConta;
    private JTextField textValor;
    private JButton btnCadastrar;
    private JButton btnVisualizar;
    private JButton btnEditar;
    private JButton btnExcluir;
    private JLabel Conta;
    private JTextField visualizacao;
    private JButton btnFake;

public Tela() {
    textConta.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    textValor.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    btnCadastrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    btnEditar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    btnExcluir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    btnFake.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    btnVisualizar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}

    public static class TelaPrincipal {
        private JPanel telaConta;
        private JLabel Conta;
        private JLabel valor;
        private JTextField textConta;
        private JTextField textValor;
        private JButton btnCadastrar;
        private JButton btnVisualizar;
        private JButton btnEditar;
        private JButton btnExcluir;
        private JTextField visualizacao;
        private JButton btnFake;
    }
}
