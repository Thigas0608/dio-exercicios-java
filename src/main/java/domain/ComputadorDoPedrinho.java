package domain;

import apps.FacebookMensserger;
import apps.MSNMensserger;
import apps.ServicoMensagemIntantanea;
import apps.Telegram;

public class ComputadorDoPedrinho {
    public static void main (String [] args){

        ServicoMensagemIntantanea smi = null;

        String appEscolhido = "fcb";

        if(appEscolhido.equals("msg")) {
            smi = new MSNMensserger();
        }
        else if(appEscolhido.equals("fcb")) {
            smi = new FacebookMensserger();
        }
        else if(appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.receberMensagem();
        smi.enviarMensagem();

    }
}
