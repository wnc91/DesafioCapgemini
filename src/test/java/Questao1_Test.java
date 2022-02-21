import org.junit.jupiter.api.*;

public class Questao1_Test {

    @Test
    public void test(){
        Questao1 questao1 = new Questao1();
        int retorno =questao1.questao_1(2);
        Assertions.assertEquals(2,retorno);

    }
}
