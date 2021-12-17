package br.com.elder;

import java.util.Date;

public class MensagemMidia extends Mensagem{

    private Midia tipoMidia;
    private String midia;

    public MensagemMidia(Date enviadaEm,
                         Emissor emissor,
                         Destinatario destinatario,
                         Midia tipoMidia,
                         String midia) {
        super(enviadaEm, emissor, destinatario);
        this.tipoMidia = tipoMidia;
        this.midia = midia;
    }
}
