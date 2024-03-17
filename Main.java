import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Lista que armazena os dados coletados do arquivo informado
        List<Integer> dadosColetados = lerDadosDoArquivo("exemplo.txt");

        //Retorna dados coletados
        System.out.println("Dados coletados:");
        System.out.println(dadosColetados);

        //Lista que armazena os picos encontrados perante dos dados
        List<Integer> picosEncontrados = encontrarPicos(dadosColetados);

        //Retornas os picos verdadeiros
        System.out.println("Picos verdadeiros:");
        System.out.println(picosEncontrados);


        //Verifica se existem picos a serem calculados
        if (picosEncontrados.size() < 2) 
        {
            System.out.println("Não há picos suficientes para calcular o tempo médio.");
        } 

        //Realiza a soma, calcula o tempo médio entre os picos e formata a saída do tempo em minutos:segundos
        else 
        {
            int somaDePicos = 0;
            for (int indicePicos = 1; indicePicos < picosEncontrados.size(); indicePicos++) {
                somaDePicos += picosEncontrados.get(indicePicos) - picosEncontrados.get(indicePicos - 1);
            }
            int tempoMedio = somaDePicos / (picosEncontrados.size() - 1);
            int minutos = tempoMedio / 60;
            int segundos = tempoMedio % 60;
            System.out.printf("Tempo médio entre picos: %02d:%02d\n", minutos, segundos);
        }
    }

    // Método que lê os dados do Arquivo informado através da variável fileName, retornando-os e armanzenando-os na Lista.
    private static List<Integer> lerDadosDoArquivo(String fileName) {
        List<Integer> dadosColetados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                dadosColetados.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dadosColetados;
    }

    // Método que encontra os picos perante os dados coletados com o método LerDadosDoArquivo.
    private static List<Integer> encontrarPicos(List<Integer> dadosColetados) {
        List<Integer> picosEncontrados = new ArrayList<>();
        for (int indicePicos = 1; indicePicos < dadosColetados.size() - 1; indicePicos++) {
            if (dadosColetados.get(indicePicos) > dadosColetados.get(indicePicos - 1) && dadosColetados.get(indicePicos) > dadosColetados.get(indicePicos + 1) && dadosColetados.get(indicePicos) >= 50) {
                picosEncontrados.add(indicePicos);
            }
        }
        return picosEncontrados;
    }
}
