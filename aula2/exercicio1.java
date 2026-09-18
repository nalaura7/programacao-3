class Carro {
    String marca;
    String modelo;
    int ano;

    void exibirInfo() {
        System.out.println("modelo: " + modelo);
        System.out.println("marca: " + marca);
        System.out.println("ano: " + ano);
    }
}

public class exercicio1 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "nao sei";
        carro1.marca = "Mercedes";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.modelo = "não vou ta sabendo dnv";
        carro2.marca = "Ferrari";
        carro2.ano = 2023;

        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}
