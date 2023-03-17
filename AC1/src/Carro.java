public class Carro {
    /*
     * Crie uma classe Carro, com os atributos cor, modelo, velocidadeAtual,
     * velocidadeMaxima. 
     */
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor; 


 
    /* Inicialize velocidadeAtual com o valor 0; */
    
    //metodo construtor
    Carro(String cor, String modelo, double velocidadeMaxima){
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.motor = new Motor(300, "MegaLux");
    }


    //metodos

    /* ligar(), que emite a mensagem “O carro está ligado”; */
    public boolean ligar(){
        System.out.println("O carro está ligado");
        return true;
    }

    /* acelerar(quantidade), que aumenta a velocidade atual no valor passado; */
    public void acelerar(double velocidade){
        this.velocidadeAtual += velocidade;
    }


    /* pegarMarcha(), que retorna um número de -1 a 3 conforme a velocidade do carro: */
    public int pegarMarcha(){
        if(velocidadeAtual <= 0){
            return -1;
        } else if(velocidadeAtual < 40){
            return 1;
        } else if(velocidadeAtual < 80){
            return 2;
        } else {
            return 3;
        }

    }

}
