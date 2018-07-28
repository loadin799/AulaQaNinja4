package br.com.rcc.lojavirtual.Teste1.robotTeste1;
import br.com.rcc.lojavirtual.R;
import br.com.rcc.lojavirtual.common.ScreenRobot;
import static br.com.rcc.lojavirtual.Teste1.constantsTeste1.Teste1Constants.BOTAO;
import static br.com.rcc.lojavirtual.Teste1.constantsTeste1.Teste1Constants.FRASE;
import static br.com.rcc.lojavirtual.Teste1.constantsTeste1.Teste1Constants.OPCAO1;
import static br.com.rcc.lojavirtual.Teste1.constantsTeste1.Teste1Constants.OPCAO2;
import static br.com.rcc.lojavirtual.Teste1.constantsTeste1.Teste1Constants.OPCAO3;
import static br.com.rcc.lojavirtual.Teste1.constantsTeste1.Teste1Constants.SELECAO1;
import static br.com.rcc.lojavirtual.Teste1.constantsTeste1.Teste1Constants.SELECAO2;
import static br.com.rcc.lojavirtual.Teste1.constantsTeste1.Teste1Constants.SELECAO3;
import static br.com.rcc.lojavirtual.Teste1.constantsTeste1.Teste1Constants.TITULO;

public class Teste1Robot extends ScreenRobot<Teste1Robot>{

    private static final int OPCAO1_MENU = R.id.cbCsharp;
    private static final int OPCAO2_MENU = R.id.cbAndroid;
    private static final int OPCAO3_MENU = R.id.cbJava;
    private static final int BOTAO_COMPRAR = R.id.btComprar;

    public Teste1Robot verificarTitulo(){
        checkViewContainsText(TITULO);
        return this;
    }

    public Teste1Robot verificarFrase(){
        checkViewContainsText(FRASE);
        return this;
    }

    public Teste1Robot verificarOpcao1(){
        checkViewContainsText(OPCAO1);
        return this;
    }

    public Teste1Robot verificarOpcao2(){
        checkViewContainsText(OPCAO2);
        return this;
    }

    public Teste1Robot verificarOpcao3(){
        checkViewContainsText(OPCAO3);
        return this;
    }

    public Teste1Robot verificarBotaoComprar(){
        checkViewContainsText(BOTAO);
        return this;
    }

    public Teste1Robot clicarOpcao1(){
        clickOnView(OPCAO1_MENU);
        return this;
    }

    public Teste1Robot clicarOpcao2(){
        clickOnView(OPCAO2_MENU);
        return this;
    }

    public Teste1Robot clicarOpcao3(){
        clickOnView(OPCAO3_MENU);
        return this;
    }

    public Teste1Robot clicarEmComprar(){
        clickOnView(BOTAO_COMPRAR);
        return this;
    }

    public Teste1Robot escolheuOPrimeiro(){
        checkViewContainsText(SELECAO1);
        return this;
    }

    public Teste1Robot escolheuOSegundo(){
        checkViewContainsText(SELECAO2);
        return this;
    }

    public Teste1Robot escolheuOTerceiro(){
        checkViewContainsText(SELECAO3);
        return this;
    }

    public Teste1Robot clicarEmVoltar(){
        pressBack();
        return this;
    }
}
