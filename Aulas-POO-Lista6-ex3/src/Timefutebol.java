import java.util.Comparator;

public class Timefutebol  implements Comparavel {
    private String nomeTime;
    private String[] jogadores;
    private boolean estaClassificado;
    public Timefutebol(String nomeTime, String[] jogadores) {
        this.nomeTime = nomeTime;
        this.jogadores = jogadores;
        estaClassificado = false;
    }
    public String getNomeTime() {
        return this.nomeTime;
    }
    public String[] getJogadores() {
        return this.jogadores;
    }
    public boolean isEstaClassificado() {
        return this.estaClassificado;
    }
    public void setEstaClassificado(boolean estaClassificado) {
        this.estaClassificado = estaClassificado;
    }
    public String toString() {
        return this.nomeTime;
    }
    @Override
    public int comparaCom(Object outroObjeto) {
        return outroObjeto.toString().compareToIgnoreCase(outroObjeto.toString());
    }
}
