public class CriaLivro {
    public static void main(String[] args) {
         Livro primeirolivro = new Livro();
         primeirolivro.titulo = "Hello Word";
         System.out.println("Titulo:" + primeirolivro.titulo);

         Livro segundolivro = new Livro();
         segundolivro.titulo = "Sam Porter Bridges";
         System.out.println("Titulo:" + segundolivro.titulo );
         primeirolivro.tipodecapaEnum = TipodeCapaEnum.Personalizada;

        Editora primeiraeditora = new Editora();
        primeiraeditora.site= "www.rocco.com.br";
        primeiraeditora.nome= "rocco";
        System.out.println("NOME:" + primeiraeditora.nome );
        System.out.println("SITE:" + primeiraeditora.site);
    }
}



