package br.com.elder;

import javax.swing.*;
import java.util.Date;

public class Destinatario extends Usuario implements Receptor{

    public Destinatario(String email, String apelido) {
        super(email, apelido);
    }

    @Override
    public void recebeMensagem(Mensagem mensagem) {
        mensagem.setRecebidaEm(new Date());
        JOptionPane.showMessageDialog(null, "Mensagem Recebida " + mensagem);
    }

}
