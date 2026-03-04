package Classes02;
import java.util.Random;

public class PopulacaoBaratas {
    public double quantidade;

    public PopulacaoBaratas (){
        Random gerador = new Random();
        this.quantidade = gerador.nextInt(91)+10;
    }
    public void aumentarBaratas (double valor){
        this.quantidade *= valor;
    }
    public void spray () {
        this.quantidade *= 0.9;
    }
    public int getNumeroBaratas (){
        return (int) this.quantidade;
    }
}
