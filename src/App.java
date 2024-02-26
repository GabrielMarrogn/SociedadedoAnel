import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int qtd = Integer.parseInt(br.readLine());
        int hobbit = 0, humano = 0, elfo = 0, anao = 0, mago = 0;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            String[] nome = br.readLine().split(" ");
            list.add(nome[1]);
        }

        for (String p : list) {
            switch (p) {
                case "X":
                    hobbit++;
                    break;
                case "H":
                    humano++;
                    break;
                case "E":
                    elfo++;
                    break;
                case "A":
                    anao++;
                    break;
                case "M":
                    mago++;
                    break;

            }
        }

        System.out.println(hobbit +" Hobbit(s)");
        System.out.println(humano +" Humano(s)");
        System.out.println(elfo +" Elfo(s)");
        System.out.println(anao +" Anao(oes)");
        System.out.println(mago +" Mago(s)");


    }
}
