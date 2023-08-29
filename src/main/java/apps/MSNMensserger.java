package apps;

public class MSNMensserger extends ServicoMensagemIntantanea{

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Mensseger");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Mensseger");
    }
}
