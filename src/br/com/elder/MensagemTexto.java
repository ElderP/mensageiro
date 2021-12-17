package br.com.elder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MensagemTexto extends Mensagem{

    private String texto;

    public MensagemTexto(Date enviadaEm,
                         Emissor emissor,
                         Destinatario destinatario,
                         String texto) {
        super(enviadaEm, emissor, destinatario);
        this.texto = texto;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");

    @Override
    public String toString() {
        return "MensagemTexto{" +
                getEmissor().getApelido() + "\n" +
                " Enviou às "+ sdf.format(getEnviadaEm()) + "\n" +
                " texto='" + texto + '\'' +
                '}';
    }

    public String getTexto() {
        return texto;
    }

}
