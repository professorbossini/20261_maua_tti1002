import java.util.*;

import javax.swing.JOptionPane;
public class Playlist {
  public static void main(String[] args) {
    //musicas = []
    //arraylist
    List <Musica> musicas = new ArrayList<Musica>();
    String menu = "1-Adicionar música\n2-Visualizar lista\n3-Avaliar\n0-Sair";
    int opcao;
    do{
      opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
      if(opcao == 1){
        //pegar o nome da música
        String titulo = JOptionPane.showInputDialog("Título?");
        //construir uma música
        Musica musicaAdicionar = new Musica(titulo);
        //adicionar a música no arraylist
        musicas.add(musicaAdicionar);
        JOptionPane.showMessageDialog(null, "Música adicionada!");
      }
      else if(opcao == 2){
        //se a lista estiver vazia, avisar
        if(musicas.isEmpty()){
          JOptionPane.showMessageDialog(null, "Você não tem músicas");
        }
        else{
          //iterar sobre a coleção de músicas, concatenando o título um a um
          //exibir no final
          String resultado = "";
          for(int i = 0; i < musicas.size(); i++){
            resultado = resultado + musicas.get(i).getTitulo() + " ";
          }
          JOptionPane.showMessageDialog(null, resultado);
        }
      }
      else if(opcao == 3){
        //pegar o título de uma música
        //encontrá-la na coleção
        //pegar uma nota de um a 5
        //avaliar a música
        String titulo = JOptionPane.showInputDialog("Título?");
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota?"));
        for (int i = 0; i < musicas.size(); i++){
          //comparação de strings: equals
          if(musicas.get(i).getTitulo().equals(titulo)){
            musicas.get(i).setNota(nota);
            JOptionPane.showMessageDialog(null, "Música avaliada");
          }
        }
      }
      else if(opcao == 0){
        JOptionPane.showMessageDialog(null, "Até mais");
      }
      else{
        JOptionPane.showMessageDialog(null, "Opção inválida");
      }
    }while(opcao != 0);
  }  
}
