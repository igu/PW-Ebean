package controllers;

import play.mvc.*;
import models.*;
import java.util.*;

public class HomeController extends Controller {


    List<Livro> livros = Livro.find.all();
    List<Fisico> fisicos = Fisico.find.all();
    List<Editora> editoras = Editora.find.all();
    HashSet<String> autores = new HashSet<String>();

    public Result index() {
        for(int i = 0; i < livros.size(); i++){
          autores.add(livros.get(i).getAutor());
        }
        
        return ok(views.html.index.render(autores,null,null,fisicos,null,null,editoras,null));
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

      Livro l6 = new Livro(10,"Jogos Vorazes","Igor Frank","0000000000006");
      l6.setEditora(ed1);
      l6.save();


      //  ==== Clientes

      Fisico n1 = new Fisico("Alameda das Mansoes","(84) 0000-0000","59618430090");
      n1.save();

      Fisico n2 = new Fisico("Familia dos Picuí","(84) 0000-0001","06054444042");
      n2.save();

      Juridico n3 = new Juridico("Nova floresta","(84) 0000-0003","63556216000158");
      n3.save();

      Juridico n4 = new Juridico("Nova floresta","(84) 0000-0003","98753777000121");
      n4.save();

      //  ==== Compras

      Compra c1 = new Compra(n1,l1);
      c1.save();

      Compra c2 = new Compra(n2,l1);
      c2.save();

      Compra c3 = new Compra(n3,l2);
      c3.save();

      Compra c4 = new Compra(n1,l3);
      c4.save();

      return ok("Banco de Dados populado.");


    }


    public Result listarLivros(){
      Map<String, String[]> postForm = request().body().asFormUrlEncoded();
      String nameAutor = null;
      try{ 
        nameAutor = postForm.get("autor")[0];
        List <Livro> livros = Livro.find.query().select("*").where().eq("autor",nameAutor).findList();
        return ok(views.html.index.render(autores,livros,nameAutor,fisicos,null,null,editoras,null));
      }catch(NullPointerException e){ 
        return notFound("Erro com o termo de busca de autor");
      }
    }

    public Result listarCompras(){
      Map<String, String[]> postForm = request().body().asFormUrlEncoded();
      String cpf = null;
      try{ 
        cpf = postForm.get("cliente")[0];
        Fisico f = Fisico.find.query().select("*").where().eq("cpf", cpf).findOne();
        List <Compra> compras = Compra.find.query().select("*").where().eq("fisico_codigo",f.getCodigo()).findList();
        return ok(views.html.index.render(autores,null,null,fisicos,compras,cpf,editoras,null));
      }catch(NullPointerException e){ 
        return notFound("Erro com o termo de busca de cliente");
      }
    }

    public Result listarLivrosEditora(){
      Map<String, String[]> postForm = request().body().asFormUrlEncoded();
      String codigo = null;
      try{ 
        codigo = postForm.get("editoras")[0];
        List <Livro> livros = Livro.find.query().select("*").where().eq("editora_codigo",codigo).findList();
        return ok(views.html.index.render(autores,null,null,fisicos,null,null,editoras,livros));
      }catch(NullPointerException e){ 
        return notFound("Erro com o termo de busca de editora");
      }
    }
}
