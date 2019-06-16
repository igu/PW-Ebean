package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Compra extends Model {


  /*      =================
         C O N S T R U T O R E S
          ==================
  */

  public Compra () { }

  public Compra (Fisico fisico, Livro livro) {
    this.fisico = fisico;
    this.livro = livro;
  }

  public Compra (Juridico juridico, Livro livro) {
    this.juridico = juridico;
    this.livro = livro;
  }

  /*      =================
         A T R I B U T O S
          ==================
  */

  @Id
  private Integer codigo;

  @ManyToOne
  public Livro livro;

  @ManyToOne(optional=true, targetEntity=Fisico.class)
  public Fisico fisico;

  @ManyToOne(optional=true, targetEntity=Juridico.class)
  public Juridico juridico;

  public static final Finder<Integer, Compra> find = new Finder<>(Compra.class);


  /*      =================
         G E T T E R S
          ==================
  */

        public Integer getCodigo(){
          return codigo;
        }

        public Livro getLivro(){
          return livro;
        }

        public Fisico getFisico(){
          return fisico;
        }

        public Juridico getJuridico(){
          return juridico;
        }

  /*      =================
         S E T T E R S
          ==================
  */

        public void setCodigo(Integer codigo){
          this.codigo = codigo;
        }

        public void setLivro(Livro livro){
          this.livro = livro;
        }

        public void setFisico(Fisico fisico){
          this.fisico = fisico;
        }

        public void setJuridico(Juridico juridico){
          this.juridico = juridico;
        }

}
