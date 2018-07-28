package br.com.rcc.lojavirtual.Teste1;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import br.com.rcc.lojavirtual.MainActivity;
import br.com.rcc.lojavirtual.Teste1.robotTeste1.Teste1Robot;

public class TesteUi {

    @Rule
    public ActivityTestRule<MainActivity>
                        mainActivityRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Test
    public void VerificarElementos(){

        new Teste1Robot()
                .verificarTitulo()
                .verificarFrase()
                .verificarOpcao1()
                .verificarOpcao2()
                .verificarOpcao3()
                .verificarBotaoComprar();
    }

    @Test
    public void EscolhendoOPrimeiro(){

        new Teste1Robot()
                .clicarOpcao1()
                .clicarEmComprar()
                .escolheuOPrimeiro();
    }

    @Test
    public void EscolhendoOSegundo(){

        new Teste1Robot()
                .clicarOpcao2()
                .clicarEmComprar()
                .escolheuOSegundo();
    }

    @Test
    public void EscolhendoOTerceiro(){

        new Teste1Robot()
                .clicarOpcao3()
                .clicarEmComprar()
                .escolheuOTerceiro();
    }

    @Test
    public void TestandoBotaoVoltar(){

        new Teste1Robot()
                .clicarOpcao3()
                .clicarEmComprar()
                .escolheuOTerceiro()
                .pressBack()
                .verificarTitulo()
                .verificarFrase()
                .verificarOpcao1()
                .verificarOpcao2()
                .verificarOpcao3()
                .verificarBotaoComprar();
    }
}
