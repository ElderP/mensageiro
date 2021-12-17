package br.com.elder;

import javax.swing.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Emissor emissor = new Emissor("email@a.com", "José");

        Destinatario destinatario = new Destinatario("outroemail@a.com", "Miguel");

        String texto = JOptionPane.showInputDialog("Mensagem de Texto");

        MensagemTexto mensagemTexto = new MensagemTexto(new Date(), emissor, destinatario, texto );

        emissor.enviaMensagem(mensagemTexto);
        destinatario.recebeMensagem(mensagemTexto);

        emissor.imprimeMensagem(mensagemTexto);



    }
}
