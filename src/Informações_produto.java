public class Informações_produto {

    public static  void main(String[] args){
        equipamento primeiroequipamento = new equipamento();
        primeiroequipamento.Descricao = "DVD Blue ray";
        System.out.println("Descrição:" + primeiroequipamento.Descricao);

        equipamento primeiroDono = new equipamento();
        primeiroDono.Dono = "Jefferson";
        System.out.println("Dono:" + primeiroDono.Dono);

        equipamento primeiromodelo = new equipamento();
        primeiromodelo.Modelo = "2007";
        System.out.println("Modelo:" + primeiromodelo.Modelo);


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