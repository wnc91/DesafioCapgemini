import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Questao3_Test {

    @Test
    public void test(){
        Questao3 questao3 = new Questao3();
        int retorno =questao3.questao_3("PROPAROXITONA");
        Assertions.assertEquals(14,retorno);

    }
}
