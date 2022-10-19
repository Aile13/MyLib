package it.unibs.eliapitozzi.mylib;

import com.sun.source.tree.SwitchExpressionTree;

import java.util.function.Consumer;

/**
 * Viene usata nella classe per creare i menu.
 * Ogni istanza contine la voce e il comando
 * ad essa associata.
 *
 * @author Elia
 */
public class VoceEComando {

    private final String voce;
    private final Thunk comando;

    public VoceEComando(String voce, Thunk comando) {
        this.voce = voce;
        this.comando = comando;
    }

    public String getVoce() {
        return voce;
    }

    public Thunk getComando() {
        return comando;
    }
}
