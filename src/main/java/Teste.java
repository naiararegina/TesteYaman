import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Teste {

    public static void main(String[] args){
        //Carro fusca;
        Carro fusca = new Carro();
        if (fusca.ligaedesliga) {

            fusca.acelera(60.0);
        }
    }
}