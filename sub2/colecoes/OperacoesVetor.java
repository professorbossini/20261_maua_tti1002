import javax.swing.JOptionPane;

public class OperacoesVetor {
  static int [] elementos = new int[10];
  static int quantidade = 0;
  static String menu = "1-Adicionar\n2-Exibir vetor\n3-Buscar elemento\n4-Maior valor\n0-Sair";
  public static void main(String[] args) {
    int opcao;
    do{
      opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch(opcao){
        case 1:
          adicionar();
          break;
        case 2:
          exibir();
          break;
        case 3:
          buscar();
          break;
      }
    }while(opcao != 0);
  }
  static void adicionar(){
    if(quantidade == elementos.length){
      JOptionPane.showMessageDialog(null, "Vetor cheio!");
      return;
    }
    int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
    elementos[quantidade] = valor;
    quantidade++;
    JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
  }

  static void exibir(){
    if(quantidade == 0){
      JOptionPane.showMessageDialog(null, "Vetor vazio");
      return;
    }
    String texto = "";
    for(int i = 0; i < quantidade; i++){
      texto = texto + elementos[i];
      texto += " ";
    }
    JOptionPane.showMessageDialog(null, texto);
  }

  static void buscar(){
    if(quantidade == 0){
      JOptionPane.showMessageDialog(null, "Vetor vazio");
      return;
    }
    int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor?"));
    for(int i = 0; i < quantidade; i++){
      if(elementos[i] == valor){
        JOptionPane.showMessageDialog(
          null,
          String.format("Encontrado na posição %d\n", i)
        );
        return;
      }
    }
    JOptionPane.showMessageDialog(null, "Não foi encontrado");
    //se estiver vazio, avisar e sair
    //caso contrário, buscar
    //se encontrar, dizer em que posição está
    //caso contrário, dizer que não existe
  }
}
