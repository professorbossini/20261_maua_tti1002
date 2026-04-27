import javax.swing.JOptionPane;
public class OperacoesVetores {
  static int [] elementos = new int[4];
  static int quantidade = 0;
  public static void main(String[] args) {
    String menu = "1-Adicionar elemento\n2-Exibir vetor\n3-Buscar elemento\n4-Encontrar maior\n0-Sair";
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
      }
    }while(opcao != 0);
  }

  static void adicionar(){
    if(quantidade == elementos.length){
      JOptionPane.showMessageDialog(null, "Vetor cheio! Não é possível adicionar!");
      return;
    }
    int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
    elementos[quantidade] = valor;
    quantidade++;
    JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
  }

  static void exibir(){
    //se estiver vazio, avisa que está vazio e termina
    if(quantidade == 0){
      JOptionPane.showMessageDialog(null, "Vetor vazio!");
      return;  
    }
    //caso contrário, exibir cada elemento existente
    String resultado = "";
    for(int i = 0; i < quantidade; i++){
      resultado = resultado + elementos[i] + " ";
    }
    JOptionPane.showMessageDialog(null, resultado);
  }

  static void buscar(){
    if(quantidade == 0){
      JOptionPane.showMessageDialog(null, "Vetor vazio!");
      return;
    }
    int valor = 
      Integer.parseInt(JOptionPane.showInputDialog("Qual o valor?"));
    for(int i = 0; i < quantidade; i++){
      if(elementos[i] == valor){
        JOptionPane.showMessageDialog(null, "Encontrado na posição " + i);
        return;
      } 
    }
    JOptionPane.showMessageDialog(null, "Elemento não encontrado");
  }
}
