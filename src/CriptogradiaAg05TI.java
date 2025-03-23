import javax.swing.JOptionPane;

public class CriptogradiaAg05TI {
    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "Hello World!","Programa do JC", JOptionPane.INFORMATION_MESSAGE);
        //  int variavelInt = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor inteiro: "));
        //  double variavelDob = Double.parseDouble(JOptionPane.showInputDialog("Entre com um valor Double: "));
        String variavelStr = JOptionPane.showInputDialog("Entre com uma mensagem a criptografada: ");

        // sessão para exibir os inputs

        // JOptionPane.showMessageDialog(null, "Valor Inteiro: " +variavelInt,"Programa do JC", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Valor Double: " +  variavelDob,"Programa do JC", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Valor String: " +  variavelStr,
                "Programa do JC", JOptionPane.INFORMATION_MESSAGE);

        char[] caracteres = variavelStr.toCharArray();

        for ( char c: caracteres) {
            JOptionPane.showMessageDialog(null, c);

        }
            // Obter o Valor ASCII do caracter Original

        StringBuilder mensagemCriptografada = new StringBuilder();
            for (char c: caracteres) {
                int valorAsciiOriginal = (int) c;

                //Exibir o valor Ascii Original

                JOptionPane.showMessageDialog(null, "Valor Ascii do caracter: '" + c + "': " + valorAsciiOriginal);

                // Adicionar +2 para criptografar
                int valorAsciiCriptogrfado = valorAsciiOriginal + 2;

                // Exibir valor ascii criptografado
                JOptionPane.showMessageDialog(null, "Valor Criptografado: " + valorAsciiCriptogrfado);

                // Converter novo valor ascii de volta para caracter
                char caracterGriptografado = (char) valorAsciiCriptogrfado;

                //Adiciona o caracter criptografado à mensagem criptografada
                mensagemCriptografada.append(caracterGriptografado);
            }

            // Exibe mensagem criptografada
        JOptionPane.showMessageDialog(null, "Mensagem Criptografada: " + mensagemCriptografada.toString());
    }
}