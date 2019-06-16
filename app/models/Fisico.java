package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Fisico extends Cliente {

  /*      =================
         C O N S T R U T O R E S
          ==================
  */

    public Fisico() {}

    public Fisico(String endereco, String telefone, String cpf){
        super(endereco,telefone);
        this.cpf = cpf;
        this.compras = new ArrayList<Compra>();
    }


  /*      =================
         A T R I B U T O S
          ==================
  */

  @Column(length=11,nullable=false)
  private String cpf;

  @OneToMany(mappedBy="fisico")
  private List<Compra> compras;

  public static final Finder<Integer, Fisico> find = new Finder<>(Fisico.class);

  /*      =================
         G E T T E R S
          ==================
  */

  public String getCpf(){
    return cpf;
  }

  /*      =================
         S E T T E R S
          ==================
  */

  public void setCpf(String cpf){
    this.cpf = cpf;
  }


}