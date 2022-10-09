package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class Prateleira {

    private Games games; // = new Games(null, null, 0);

    List<Games> biblioteca = new ArrayList<>();

    //Metodos
    public void jogos() {
        biblioteca.add(new Games("Dark Souls", "SoulsLike", 0));
        biblioteca.add(new Games("Elden Ring", "SoulsLike", 0));
        biblioteca.add(new Games("The Witcher 3", "RPG", 1));
        biblioteca.add(new Games("Resident Evil 5", "A��o", 0));
        biblioteca.add(new Games("Porradaria 2: Pagode of the night", "A��o", 1));
        biblioteca.add(new Games("Zelda", "RPG", 1));
    }

    public void procura() {

        int search = 0;

        search = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o correspondente:\n\n"
                + "Mostrar a lista completa[1]\n\n"
                + "Procurar por g�nero[2]\n\n"
                + "Incluir Jogos[3]\n\n"
                + "Remover Jogos[4]\n"));

        switch (search) {
            case 1:
                mostrarJogos();
                break;
            case 2:
                agruparGenero();
                break;
            case 3:
                incluirJogos();
                break;
            case 4:
                removerJogos();
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERRO!!! N�mero incorreto!!!");
                procura();
        }
    }

    public void mostrarJogos() {
        String output = "";
        for (int i = 0; i < biblioteca.size(); i++) {
            String nome;
            nome = (biblioteca.get(i).toString());
            output += nome;
        }
        JOptionPane.showMessageDialog(null, output);
        procura();
    }

    public void incluirJogos() {
        String incluirNome, incluirGenero;
        int incluirZerou, incluirOutroJogo;

        incluirNome = JOptionPane.showInputDialog("Nome do Jogo:");
        incluirGenero = JOptionPane.showInputDialog("G�nero do Jogo:");
        incluirZerou = JOptionPane.showConfirmDialog(null, "Zerou?", "", JOptionPane.YES_NO_OPTION);
        
        incluirOutroJogo = JOptionPane.showConfirmDialog(null, "Deseja incluir outro Jogo?", "", JOptionPane.YES_NO_OPTION);

        games = new Games(incluirNome, incluirGenero, incluirZerou);
        biblioteca.add(games);

        if (incluirOutroJogo == 0) {
            incluirJogos();
        } else {
            mostrarJogos();
            procura();
        }
    }

    public void removerJogos() {
        int h = 0;
        String r;

        String output = "";
        for (int i = 0; i < biblioteca.size(); i++) {
            String num;
            String text;
            num = (i + " = ");
            text = (biblioteca.get(i).toString());

            output += num + " " + text;

        }

        r = JOptionPane.showInputDialog(null, output + "Qual Jogo deseja remover?\n");

        try {
            h = Integer.parseInt(r);
            if (h <= biblioteca.size()) {
                biblioteca.remove(h);
                mostrarJogos();
            } else {
                JOptionPane.showMessageDialog(null, "Erro, n�mero invalido");
                mostrarJogos();
            }
        } catch (Exception NumberFormatException) {
            JOptionPane.showMessageDialog(null, "Vc tem problema");
            procura();
        }

    }

    public void agruparGenero() {
        
        JOptionPane.showMessageDialog(null, biblioteca.stream().collect(Collectors.groupingBy(Games::getGenero)));
        procura();
    }
}
