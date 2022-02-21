import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Questao2_Test {

    @Test
    public void test(){
        Questao2 questao2 = new Questao2();
        int retorno =questao2.questao_2("Abcd@1234");
        Assertions.assertEquals(0,retorno);

    }
}
