package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.helper.Sorteio;
import br.com.fabricadeprogramador.model.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Virmerson Bento dos Santos on 7/26/17.
 */

public class TestSorteio {

    @Test
    public void testSortear(){

        Pessoa p1 =  new Pessoa();
        p1.setNome("Jao");
        p1.setTelefone("33872941");


        Pessoa p2 =  new Pessoa();
        p2.setNome("Ze");
        p2.setTelefone("99999");


        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        pessoas.add(p2);

        Sorteio s =  new Sorteio(pessoas);
        int indice = s.sortearIndice();

        Assert.assertTrue(indice>=0 && indice<pessoas.size());
    }

}
