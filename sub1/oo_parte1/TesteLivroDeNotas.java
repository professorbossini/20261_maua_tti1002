public class TesteLivroDeNotas{
  static public void main(String args []){
    LivroDeNotas livro1 = new LivroDeNotas();
    livro1.nomeDaDisciplina = "POO";
    livro1.exibirMensagem();
    LivroDeNotas livro2 = new LivroDeNotas();
    livro2.nomeDaDisciplina = "Lógica";
    livro2.exibirMensagem();
    LivroDeNotas livro3 = new LivroDeNotas();
    livro3.nomeDaDisciplina = "Modelagem";
    livro3.exibirMensagem();
  }
}