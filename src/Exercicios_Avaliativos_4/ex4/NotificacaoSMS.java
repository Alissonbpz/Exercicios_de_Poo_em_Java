package Exercicios_Avaliativos_4.ex4;

public class NotificacaoSMS implements Notificavel {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("[SMS] para (54)99999-0000: " + mensagem);
    }
}