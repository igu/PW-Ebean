package controllers;

import play.mvc.*;
import models.*;
import java.util.*;

public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }


    public Result popular(){

      //   ==== Editoras

      Editora ed1 = new Editora("Rua Bom Jesus","Arliete Maria","(84) 99818-8575");
      ed1.save();

      Editora ed2 = new Editora("Av. Presidente Getúlio Vargas","Isabel Cristina","(84) 98823-1565");
      ed2.save();

      Editora ed3 = new Editora("Bairro Latino","Enthony Davi","(84) 98866-1515");
      ed3.save();


      //  ==== Livros


      Livro l1 = new Livro(5,"Guerra mundial","Igor Frank","0000000000001");
      l1.setEditora(ed1);
      l1.save();

      Livro l2 = new Livro(10,"Natureza","Gorreti Aragao","0000000000002");
      l2.setEditora(ed1);
      l2.save();

      Livro l3 = new Livro(3,"Vergonha pra que?","Magnolia Soares","0000000000003");
      l3.setEditora(ed2);
      l3.save();

      Livro l4 = new Livro(4,"A matematica em forma de algebra","Francisco Batista","0000000000004");
      l4.setEditora(ed2);
      l4.save();

      Livro l5 = new Livro(5,"Como gerir seu tempo","Fabio Santos","0000000000005");
      l5.setEditora(ed3);
      l5.save();


      //  ==== Clientes

      Cliente n1 = new Cliente("Alameda das Mansoes","(84) 0000-0000");
      n1.save();

      Cliente n2 = new Cliente("Familia dos Picuí","(84) 0000-0001");
      n2.save();

      Cliente n3 = new Cliente("Nova floresta","(84) 0000-0003");
      n3.save();

      //  ==== Compras

      Compra c1 = new Compra(n1,l1);
      c1.save();

      Compra c2 = new Compra(n2,l1);
      c2.save();


      return ok("Banco de Dados populado.");


    }


    public Result novaEditora(){
      return ok("Oi");
    }

}
