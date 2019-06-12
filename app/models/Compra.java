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

  public Compra (Cliente cliente, Livro livro) {
    this.cliente = cliente;
    this.livro = livro;
  }

  /*      =================
         A T R I B U T O S
          ==================
  */

  @Id
  private Integer codigo;

  @ManyToOne(optional=false)
  public Livro livro;

  @ManyToOne(optional=false)
  public Cliente cliente;

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

        public Cliente getCliente(){
          return cliente;
        }

  /*      =================
         S E T T E R S
          ==================
  */

        public void setCodigo(Integer codigo){
          this.codigo = codigo;
        }

        public void setLivro(){
          this.livro = livro;
        }

        public void setCliente(){
          this.cliente = cliente;
        }

}
