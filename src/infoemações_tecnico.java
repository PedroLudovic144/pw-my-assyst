public class infoemações_tecnico {
    public static void main(String[] args) {
        Tecnico primeirotecnico = new Tecnico();
        primeirotecnico.email_tecnico = "Jeferson@gmail.com";
        System.out.println("o email é:" +  primeirotecnico.email_tecnico);

        Tecnico segundotecnico = new Tecnico();
        segundotecnico.nome_tecnico = "Jeferson";
        System.out.println("nome:" + segundotecnico.nome_tecnico);

        Tecnico terceirotecnico = new Tecnico();
       /* terceirotecnico.telefone_tecnico = "978564371";*/
        System.out.println("Telefone:" + terceirotecnico.telefone_tecnico);

    }
}

/*
    public static void main(String[] args) {
        Livro primeirolivro = new Livro();
        primeirolivro.titulo = "Hello Word";
        System.out.println("Titulo:" + primeirolivro.titulo);
        Livro segundolivro = new Livro();
        segundolivro.titulo = "Sam Porter Bridges";
        System.out.println("Titulo:" + segundolivro.titulo );
    }
     */