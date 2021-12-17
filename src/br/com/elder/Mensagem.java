package br.com.elder;

import java.util.Date;

public abstract class Mensagem {

    private Date enviadaEm;
    private Date recebidaEm;
    private Emissor emissor;
    private Destinatario destinatario;

    public Mensagem(Date enviadaEm, Emissor emissor, Destinatario destinatario) {
        this.enviadaEm = enviadaEm;
        this.emissor = emissor;
        this.destinatario = destinatario;
    }

    public Date getEnviadaEm() {
        return enviadaEm;
    }

    public Date getRecebidaEm() {
        return recebidaEm;
    }

    public void setRecebidaEm(Date recebidaEm) {
        this.recebidaEm = recebidaEm;
    }

    public Emissor getEmissor() {
        return emissor;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

}
