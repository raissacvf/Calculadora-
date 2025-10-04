import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame implements ActionListener {

    private JTextField display;
    private JPanel painelBotoes;
    private Calculos calculos; 

    // Variáveis de estado da calculadora 
    private String operador = "";
    private double primeiroNumero = 0;
    private boolean novoNumero = true; 

    private String[] botoes = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "C", "0", "=", "+"
    };

    // construtor 
    public Interface() {
        super("Calculadora Simples");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        this.calculos = new Calculos();

        // Configura o Visor (Display)
        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        // Configura o Painel de Botões
        painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(4, 4, 10, 10)); 

        // Adiciona os botões ao painel
        for (String textoBotao : botoes) {
            JButton botao = new JButton(textoBotao);
            botao.setFont(new Font("Arial", Font.BOLD, 18));
            botao.addActionListener(this); 
            painelBotoes.add(botao);
        }

        add(painelBotoes, BorderLayout.CENTER);
        
        setResizable(false);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand(); 

        if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9' || comando.equals(".")) {
            if (novoNumero) {
                display.setText(comando);
                novoNumero = false;
            } else {
                display.setText(display.getText() + comando);
            }
        } else if (comando.equals("C")) {
            display.setText("0");
            operador = "";
            primeiroNumero = 0;
            novoNumero = true;
        } else if (comando.equals("=")) {
            if (!operador.isEmpty()) {
                try {
                    double segundoNumero = Double.parseDouble(display.getText());
                   
                    double resultado = calculos.calcular(primeiroNumero, segundoNumero, operador);
                    display.setText(String.valueOf(resultado));
                } catch (IllegalArgumentException ex) {
                    display.setText("ERRO");
                } catch (NumberFormatException ex) {
                    display.setText("ERRO");
                }
                operador = "";
                novoNumero = true;
            }
        } else { 
            primeiroNumero = Double.parseDouble(display.getText());
            operador = comando;
            novoNumero = true;
        }
    }
}
