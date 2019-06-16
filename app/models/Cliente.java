package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@MappedSuperclass
public class Cliente extends Model {

  /*      =================
         C O N S T R U T O R E S
          ==================
  */

  public Cliente () { }

  public Cliente (String endereco, String telefone) {
    this.endereco = endereco;
    this.telefone = telefone;
  }

  /*      =================
         A T R I B U T O S
          ==================
  */

  @Id
  private Integer codigo;

  @Column(length=25,nullable=false)
  private String endereco;

  @Column(length=15,nullable=false)
  private String telefone;


  // public static final Finder<Integer, Cliente> find = new Finder<>(Cliente.class);

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

    public String getTelefone(){
      return telefone;
    }


  /*      =================
         S E T T E R S
          ==================
  */


  public void setCodigo(){
    this.codigo = codigo;
  }

  public void setEndereco(){
    this.endereco = endereco;
  }

  public void setTelefone(){
    this.telefone = telefone;
  }

}
