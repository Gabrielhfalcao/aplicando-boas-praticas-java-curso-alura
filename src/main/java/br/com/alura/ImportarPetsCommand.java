package br.com.alura;

import br.com.alura.services.PetService;
import br.com.alura.services.RequestService;

import java.io.IOException;

public class ImportarPetsCommand implements Command {
    @Override
    public void execute() {
        RequestService client = new RequestService();
        PetService petService = new PetService(client);

        try{
            petService.importarPetsDoAbrigo();
        }
        catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
