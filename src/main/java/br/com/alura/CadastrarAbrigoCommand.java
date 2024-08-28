package br.com.alura;

import br.com.alura.services.AbrigoService;
import br.com.alura.services.RequestService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command {

    @Override
    public void execute() {
        RequestService client = new RequestService();
        AbrigoService abrigoService = new AbrigoService(client);

        try{
            abrigoService.cadastrarAbrigo();
        }
        catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
