/*
====================================
 GUIA COMPLETO DE POO NO INTELLIJ
====================================
*/

// 1. Criando uma classe simples e objeto
/*
public class Pessoa {
    String nome;
    int idade;

    public void dizerOla() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.idade = 30;
        p1.dizerOla();
    }
}

// 2. Encapsulamento com getters e setters

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

// 3. Construtores

public class Carro {
    String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
}

// 4. Herança

public class Animal {
    public void emitirSom() {
        System.out.println("Som de animal");
    }
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }
}

// 5. Polimorfismo

public class Main {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        a.emitirSom(); // Saída: Latido
    }
}

// 6. Abstração (classe abstrata)

public abstract class Forma {
    public abstract double calcularArea();
}

// 7. Interface

public interface Operavel {
    void ligar();
    void desligar();
}

// 8. Projeto Final - Conta Bancária

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    public void imprimir() {
        System.out.println("Titular: " + titular + " | Saldo: " + saldo);
    }
}

public class Banco {
    public static void main(String[] args) {
        Conta conta = new Conta("Maria");
        conta.depositar(1000);
        conta.sacar(300);
        conta.imprimir(); // Titular: Maria | Saldo: 700.0
    }
}

/*
================================================//
BOAS PRÁTICAS NO INTELLIJ IDEA//
================================================//
- Use Alt + Insert para gerar getters/setters//
- Use Ctrl + Space para autocompletar//
- Use Alt + Enter para sugestões rápidas//
- Use Ctrl + F12 para ver estrutura da classe//
- Clique no lado esquerdo para adicionar breakpoints//
- Use F8 (Step Over) e F7 (Step Into) no debug///
- Organize por pacotes://
*/