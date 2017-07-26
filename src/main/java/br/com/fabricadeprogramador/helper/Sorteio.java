package br.com.fabricadeprogramador.helper;

import br.com.fabricadeprogramador.model.Pessoa;

import java.util.List;
import java.util.Random;

/**
 * Created by Virmerson Bento dos Santos on 7/26/17.
 */
public class Sorteio {

    private List<Pessoa> pessoas;

    public Sorteio(List pessoas){
        this.pessoas=pessoas;
    }

    public int  sortearIndice() {
        //Gerar Randon
        Random geradorRandom = new Random();
        int size = pessoas.size();
        int sorteado = geradorRandom.nextInt(size);

        return sorteado;
    }


    public Pessoa  sortear() {
        int indice = sortearIndice();
        return pessoas.get(indice);
    }

}
