import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Automato {

    public int[] estados;
    public int[] estadosFinais;
    public int[] simbolos;

    public static void main(String[] args) {
        Automato automato = new Automato();

        try {
            automato.lerConfiguracao("numeros.txt");
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

}

    public void lerConfiguracao(String arquivo) throws IOException {

        BufferedReader config = new BufferedReader(new FileReader(arquivo));

        estados = lerInteiros(config.readLine());

        estadosFinais = lerInteiros(config.readLine());

        simbolos = lerInteiros(config.readLine());

        String linha;

        while ((linha = config.readLine()) != null) {
            linha = linha.strip();

            if (linha.isEmpty()) {
                continue;
            }

            String[] partes = linha.split("\\s+");

            System.out.println("Origem: " + partes[0]);
            System.out.println("Símbolo: " + partes[1]);
            System.out.println("Destino: " + partes[2]);
        }

        config.close();
    }

    private double[] lerNumeros(String linha) {
    String[] partes = linha.strip().split("\\s+");

    double[] valores = new double[partes.length];

    for (int i = 0; i < partes.length; i++) {
        valores[i] = Double.parseDouble(partes[i]);
    }

    return valores;
}

}
