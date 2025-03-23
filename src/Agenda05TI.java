import javax.swing.*;

public class Agenda05TI {
    public static void main(String[] args) {
        String variavelStr = JOptionPane.showInputDialog("Entre com uma String: ");

        JOptionPane.showMessageDialog(null, "Valor String: " +  variavelStr,
                "Programa De Codificação", JOptionPane.INFORMATION_MESSAGE);

        // Converte a String em um array de caracteres
        char[] caracteres = variavelStr.toCharArray();

        // Variáveis para armazenar os valores ASCII originais e criptografados
        String asciiOriginal = "";
        String asciiCriptografado = "";

        // Obter o Valor ASCII do caracter Original
        StringBuilder mensagemCriptografada = new StringBuilder();
        for (char c: caracteres) {
            int valorAsciiOriginal = (int) c;
            int valorAsciiCriptografado = valorAsciiOriginal + 10;
            char caractereCriptografado = (char) valorAsciiCriptografado;

            asciiOriginal += valorAsciiOriginal + " ";
            asciiCriptografado += valorAsciiCriptografado + " ";
            mensagemCriptografada.append(caractereCriptografado);
        }

        //Exibir o valor Ascii Original
        JOptionPane.showMessageDialog(null, "ASCII Original: " + asciiOriginal.trim(),
                "ASCII Original", JOptionPane.INFORMATION_MESSAGE);

        // Exibir valor ascii criptografado
        JOptionPane.showMessageDialog(null, "ASCII Criptografado (+10): " + asciiCriptografado.trim(),
                "ASCII Criptografado", JOptionPane.INFORMATION_MESSAGE);

        // Exibe mensagem criptografada
        JOptionPane.showMessageDialog(null, "Mensagem Criptografada: " + mensagemCriptografada,
                "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}
