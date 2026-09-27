class Animal {
    public void emitirSom() {
        System.out.println("O animal emite um som");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato faz: Miau!");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au au!");
    }
}

public class exercicio4 {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro();
        animais[1] = new Gato();

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}