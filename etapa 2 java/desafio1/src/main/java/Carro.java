public class Carro {
        String modelo,cor;
        int ano;

        void FichaTenica(){
            System.out.println("-----------------Classe carro ---------------");
            System.out.println("Modelo: "+modelo);
            System.out.println("Cor: "+cor);
            System.out.println("Ano: "+ano);
            System.out.println("---------------------------------------------");
        }
        int IdadeDoCarro(){
            return 2024-ano;
        }

}
