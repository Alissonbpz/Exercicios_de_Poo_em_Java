package Exercicios_Avaliativos_4.ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Notificavel> notificacoes = new ArrayList<>();

        notificacoes.add(new NotificacaoEmail());

        notificacoes.add(new NotificacaoSMS());

        for (Notificavel n : notificacoes) {
            n.enviarNotificacao("Seu pedido foi aprovado!");
        }
    }
}