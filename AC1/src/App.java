/*
 * Théo Furtado Maurício
 * 202208386301
 */
public class App {
    public static void main(String[] args) throws Exception {
        Carro gol = new Carro("Preto", "G6", 160.0);

        gol.ligar();

        gol.acelerar(10);

        System.out.println(gol.pegarMarcha());
       
        System.out.println("Tipo de Motor: " + gol.motor.tipo);
        System.out.println("Potencia do Motor: " + gol.motor.potencia);


    }
}
