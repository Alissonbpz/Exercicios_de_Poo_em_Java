package Exercicios_Avaliativos_4.ex4;

public class NotificacaoEmail implements Notificavel {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("[EMAIL] para fulano@email.com: " + mensagem);
    }
}