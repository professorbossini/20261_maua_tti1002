public class Musica {
  private String titulo;
  private int avaliacao;
  
  public Musica(String titulo){
    this.titulo = titulo;
  }

  public String getTitulo(){
    return titulo;
  }

  public void setAvaliacao(int avaliacao) {
    this.avaliacao = avaliacao;
  }

  @Override
  public String toString() {
    return titulo;
  }
}
