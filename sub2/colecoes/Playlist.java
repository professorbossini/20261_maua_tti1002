import java.util.*;
import javax.swing.JOptionPane;
public class Playlist {
  public static void main(String[] args) {
    //python: musicas = []
    List <Musica> musicas = new ArrayList<Musica>();
    String menu = "1-Cadastrar música\n2-Listar músicas\n3-Avaliar música\n0-Sair";
    int op;
    do{
      op = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch(op){
        case 1:
          String titulo = JOptionPane.showInputDialog("Titulo?");
          Musica musicaAdicionar = new Musica(titulo);
          musicas.add(musicaAdicionar);
          JOptionPane.showMessageDialog(null, "Música cadastrada!");
          break;
        case 2:
          //foreach ou enhanced for
          String textoFinal = "";
          for(Musica m : musicas){
            textoFinal = textoFinal + m.getTitulo() + " ";
          }
          JOptionPane.showMessageDialog(null, textoFinal);
          break;
        case 3:
          //pegar o nome de uma música
          String nomeMusica = JOptionPane.showInputDialog("Música?");
          //pegar uma nota pra ela
          int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota?"));
          //atribuir essa nota à musica encontrada na coleção
          for(int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).getTitulo().equals(nomeMusica)){
              musicas.get(i).setAvaliacao(nota);
              JOptionPane.showMessageDialog(null, "Música avaliada");
            }
          }
      }
    }while(op != 0);
  }
}
