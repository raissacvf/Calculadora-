package Calculadora;

import javax.swing.SwingUtilities;

/*
 * @author raissa
 */
public class CalculadoraApp {

    public static void main(String[] args) {
        // Garante que a interface seja iniciada na thread de eventos do Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Interface aInterface = new Interface();
            }
        }}}
