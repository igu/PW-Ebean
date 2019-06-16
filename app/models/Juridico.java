package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Juridico extends Cliente {

  /*      =================
         C O N S T R U T O R E S
          ==================
  */

    public Juridico() {}

    public Juridico(String endereco, String telefone, String cnpj){
        super(endereco,telefone);
        this.cnpj = cnpj;
        this.compras = new ArrayList<Compra>();
    }


  /*      =================
         A T R I B U T O S
          ==================
  */

  @Column(length=14,nullable=false)
  private String cnpj;

  @OneToMany(mappedBy="juridico")
  private List<Compra> compras;

  public static final Finder<Integer, Juridico> find = new Finder<>(Juridico.class);

  /*      =================
         G E T T E R S
          ==================
  */

  public String getCnpj(){
    return cnpj;
  }

  /*      =================
         S E T T E R S
          ==================
  */

  public void setCnpj(String cnpj){
    this.cnpj = cnpj;
  }


}