package br.com.elder;

import javax.swing.*;
import java.text.SimpleDateFormat;

public class Emissor extends Usuario implements Mensageiro{


    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");

    public Emissor(String email, String apelido) {
        super(email, apelido);
    }

    @Override
    public void enviaMensagem(Mensagem mensagem){
        JOptionPane.showMessageDialog(null,
                "Mensagem Enviada \n " + mensagem);
    }

    //
    public void imprimeMensagem(MensagemTexto mensagem){
        String msg = null ;
        if ( mensagem.getRecebidaEm() != null ){
            msg =  "Mensagem Enviada e Recebida{" +
                    this.getApelido() + "\n" +
                    " Enviou às "+ sdf.format(mensagem.getEnviadaEm()) + "\n" +
                    " texto='" + mensagem.getTexto() + '\'' +
                    " Recebido por " + mensagem.getDestinatario().getApelido()+ "\n" +
                    " às " + sdf.format(mensagem.getRecebidaEm()) +
                    '}';
        } else {
            msg =  "Mensagem Enviada{" +
                    mensagem.getEmissor().getApelido() + "\n" +
                    " Enviou às "+ sdf.format(mensagem.getEnviadaEm()) + "\n" +
                    " texto='" + mensagem.getTexto() + '\'' +
                    '}';
        }
        JOptionPane.showMessageDialog(null, msg);
    }


}
