package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Livro extends Model {

  /*      =================
         C O N S T R U T O R E S
          ==================
  */

  public Livro() {}

  public Livro(Integer qtde, String assunto, String autor, String isbn){
    this.qtde = qtde;
    this.autor = autor;
    this.isbn = isbn;
    this.assunto = assunto;
  }

  /*      =================
         A T R I B U T O S
          ==================
  */

  @Id
  private String isbn;

  @Column(length=25,nullable=false)
  private String autor;

  @Column(nullable=false)
  private Integer qtde;

  @Column(nullable=false)
  private String assunto;

  @ManyToOne
  public Editora editora;

  public static final Finder<String, Livro> find = new Finder<>(Livro.class);


  /*      =================
         G E T T E R S
          ==================
  */

  public String getIsbn(){
    return isbn;
  }

  public String getAssunto(){
    return assunto;
  }

  public String getAutor(){
    return autor;
  }

  public Integer getQtde(){
    return qtde;
  }

  public Editora getEditora(){
    return editora;
  }

  /*      =================
         S E T T E R S
          ==================
  */

  public void setIsbn(String isbn){
    this.isbn = isbn;
  }

  public void setAssunto(String assunto){
    this.assunto = assunto;
  }

  public void setAutor(String autor){
    this.autor = autor;
  }

  public void setQtde(Integer qtde){
    this.qtde = qtde;
  }

  public void setEditora(Editora editora){
    this.editora = editora;
  }

}
