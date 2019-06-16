
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[HashSet[String],List[Livro],String,List[Fisico],List[Compra],String,List[Editora],List[Livro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(autores : HashSet[String], books : List[Livro],
escritor : String, clientes : List[Fisico], 
compras : List[Compra], comprador : String,
editoras : List[Editora], booksEd : List[Livro]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Q1")/*6.12*/ {_display_(Seq[Any](format.raw/*6.14*/("""
"""),format.raw/*7.1*/("""<div>
  <h2>[*] Popule o banco</h2>
  <a href="popular">Popular</a>
</div>
<hr>
<div>
  <h2>[a] Selecione um Ator</h2>
  <form action="listarLivros" method="POST">
    <select name="autor">
      """),_display_(/*16.8*/for(autor <- autores) yield /*16.29*/{_display_(Seq[Any](format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""<option>"""),_display_(/*17.18*/autor),format.raw/*17.23*/("""</option>
      """)))}),format.raw/*18.8*/("""
    """),format.raw/*19.5*/("""</select>
    <input type="submit" value="Listar Livros"/>
  </form>
  """),_display_(/*22.4*/if(escritor != null)/*22.24*/{_display_(Seq[Any](format.raw/*22.25*/("""
    """),format.raw/*23.5*/("""<h3>Livros do """),_display_(/*23.20*/escritor),format.raw/*23.28*/("""</h3>
    <ul>
      """),_display_(/*25.8*/for(book <- books) yield /*25.26*/{_display_(Seq[Any](format.raw/*25.27*/("""
        """),format.raw/*26.9*/("""<li>"""),_display_(/*26.14*/book/*26.18*/.getAssunto()),format.raw/*26.31*/("""</li>
      """)))}),format.raw/*27.8*/("""
    """),format.raw/*28.5*/("""</ul>
  """)))}),format.raw/*29.4*/("""
"""),format.raw/*30.1*/("""</div>
<hr>
<div>
    <h2>[b] Selecione um Cliente p/ listar compras</h2>
    <form action="listarCompras" method="POST">
        <select name="cliente">
          """),_display_(/*36.12*/for(cliente <- clientes) yield /*36.36*/{_display_(Seq[Any](format.raw/*36.37*/("""
            """),format.raw/*37.13*/("""<option>"""),_display_(/*37.22*/cliente/*37.29*/.getCpf()),format.raw/*37.38*/("""</option>
          """)))}),format.raw/*38.12*/("""
        """),format.raw/*39.9*/("""</select>
        <input type="submit" value="Listar Compras"/>
      </form>
      """),_display_(/*42.8*/if(comprador != null)/*42.29*/{_display_(Seq[Any](format.raw/*42.30*/("""
        """),format.raw/*43.9*/("""<h3>Livros comprados por """),_display_(/*43.35*/comprador),format.raw/*43.44*/("""</h3>
        <ul>
          """),_display_(/*45.12*/for(compra <- compras) yield /*45.34*/{_display_(Seq[Any](format.raw/*45.35*/("""
            """),format.raw/*46.13*/("""<li>ISBN livro comprado: """),_display_(/*46.39*/compra/*46.45*/.getLivro().getIsbn()),format.raw/*46.66*/("""</li>
            <li>Assunto livro comprado: """),_display_(/*47.42*/compra/*47.48*/.getLivro().getAssunto()),format.raw/*47.72*/("""</li>
            <hr>
          """)))}),format.raw/*49.12*/("""
        """),format.raw/*50.9*/("""</ul>
      """)))}),format.raw/*51.8*/("""
"""),format.raw/*52.1*/("""</div>
<hr>
<div>
    <h2>[c] Selecione uma editora p/ listar livros</h2>
    <form action="listarLivrosEditora" method="POST">
        <select name="editoras">
          """),_display_(/*58.12*/for(editora <- editoras) yield /*58.36*/{_display_(Seq[Any](format.raw/*58.37*/("""
            """),format.raw/*59.13*/("""<option>"""),_display_(/*59.22*/editora/*59.29*/.getCodigo()),format.raw/*59.41*/("""</option>
          """)))}),format.raw/*60.12*/("""
        """),format.raw/*61.9*/("""</select>
        <input type="submit" value="Selecionar"/>
      </form>
    """),_display_(/*64.6*/if(booksEd != null)/*64.25*/{_display_(Seq[Any](format.raw/*64.26*/("""
      """),format.raw/*65.7*/("""<ul>
        """),_display_(/*66.10*/for(ed <- booksEd) yield /*66.28*/{_display_(Seq[Any](format.raw/*66.29*/("""
          """),format.raw/*67.11*/("""<li>"""),_display_(/*67.16*/ed/*67.18*/.getAssunto()),format.raw/*67.31*/("""</li>
        """)))}),format.raw/*68.10*/("""
      """),format.raw/*69.7*/("""</ul>
    """)))}),format.raw/*70.6*/("""
"""),format.raw/*71.1*/("""</div>
  
""")))}),format.raw/*73.2*/("""
"""))
      }
    }
  }

  def render(autores:HashSet[String],books:List[Livro],escritor:String,clientes:List[Fisico],compras:List[Compra],comprador:String,editoras:List[Editora],booksEd:List[Livro]): play.twirl.api.HtmlFormat.Appendable = apply(autores,books,escritor,clientes,compras,comprador,editoras,booksEd)

  def f:((HashSet[String],List[Livro],String,List[Fisico],List[Compra],String,List[Editora],List[Livro]) => play.twirl.api.HtmlFormat.Appendable) = (autores,books,escritor,clientes,compras,comprador,editoras,booksEd) => apply(autores,books,escritor,clientes,compras,comprador,editoras,booksEd)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jun 15 23:39:12 BRT 2019
                  SOURCE: /home/igu/Desktop/PW-Ebean/app/views/index.scala.html
                  HASH: cb7badd09fb7917b417d3efd58b2c5aa8e33e570
                  MATRIX: 1035->1|1315->188|1342->190|1360->200|1399->202|1426->203|1649->400|1686->421|1725->422|1761->431|1797->440|1823->445|1870->462|1902->467|2000->539|2029->559|2068->560|2100->565|2142->580|2171->588|2219->610|2253->628|2292->629|2328->638|2360->643|2373->647|2407->660|2450->673|2482->678|2521->687|2549->688|2741->853|2781->877|2820->878|2861->891|2897->900|2913->907|2943->916|2995->937|3031->946|3142->1031|3172->1052|3211->1053|3247->1062|3300->1088|3330->1097|3387->1127|3425->1149|3464->1150|3505->1163|3558->1189|3573->1195|3615->1216|3689->1263|3704->1269|3749->1293|3814->1327|3850->1336|3893->1349|3921->1350|4120->1522|4160->1546|4199->1547|4240->1560|4276->1569|4292->1576|4325->1588|4377->1609|4413->1618|4518->1697|4546->1716|4585->1717|4619->1724|4660->1738|4694->1756|4733->1757|4772->1768|4804->1773|4815->1775|4849->1788|4895->1803|4929->1810|4970->1821|4998->1822|5039->1833
                  LINES: 28->1|36->5|37->6|37->6|37->6|38->7|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|59->28|60->29|61->30|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|70->39|73->42|73->42|73->42|74->43|74->43|74->43|76->45|76->45|76->45|77->46|77->46|77->46|77->46|78->47|78->47|78->47|80->49|81->50|82->51|83->52|89->58|89->58|89->58|90->59|90->59|90->59|90->59|91->60|92->61|95->64|95->64|95->64|96->65|97->66|97->66|97->66|98->67|98->67|98->67|98->67|99->68|100->69|101->70|102->71|104->73
                  -- GENERATED --
              */
          