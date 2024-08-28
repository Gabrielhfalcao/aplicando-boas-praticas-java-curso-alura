package br.com.alura;

import br.com.alura.models.Abrigo;
import br.com.alura.services.AbrigoService;
import br.com.alura.services.RequestService;

import java.io.IOException;

public class ListarAbrigoCommand implements Command {
    @Override
    public void execute() {
        RequestService client = new RequestService();
        AbrigoService abrigoService = new AbrigoService(client);

        try{
            abrigoService.listarAbrigo();
        }
        catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
