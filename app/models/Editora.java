package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Editora extends Model {

  /*      =================
         C O N S T R U T O R E S
          ==================
  */

  public Editora() { }

  public Editora(String endereco, String gerente, String telefone) {
      this.endereco = endereco;
      this.gerente = gerente;
      this.telefone = telefone;
  }

  /*      =================
         A T R I B U T O S
          ==================
  */


  @Id
  private Integer codigo;

  @Column(length=35,nullable=false)
  private String endereco;

  @Column(length=25,nullable=false)
  private String gerente;

  @Column(length=15,nullable=false)
  private String telefone;

  public static final Finder<Integer, Editora> find = new Finder<>(Editora.class);

  /*      =================
         G E T T E R S
          ==================
  */

  public Integer getCodigo(){
    return codigo;
  }

  public String getEndereco(){
    return endereco;
  }

  public String getGerente(){
    return gerente;
  }

  public String getTelefone(){
    return telefone;
  }


  /*      =================
         S E T T E R S
          ==================
  */


  public void setCodigo(Integer codigo){
    this.codigo = codigo;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  public void setGerente(String gerente){
    this.gerente = gerente;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }

}
