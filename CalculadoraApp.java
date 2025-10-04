Import javax.swing.SwingUtilities;

public class CalculadoraApp {

    public static void main(String[] args) {
        // Garante que a interface seja iniciada na thread de eventos do Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interface(); 
            }
        }
    }
}
