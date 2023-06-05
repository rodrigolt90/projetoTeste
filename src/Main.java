import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        Tela tela = new Tela();
        tela.setContentPane(tela.painelPrincipal);
        tela.setTitle("Contas");
        tela.setSize(800,600);
        tela.setVisible(JFrame.EXIT_ON_CLOSE);

    }
}