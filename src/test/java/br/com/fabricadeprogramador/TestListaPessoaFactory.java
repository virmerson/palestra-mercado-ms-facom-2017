package br.com.fabricadeprogramador;


import br.com.fabricadeprogramador.model.Pessoa;
import br.com.fabricadeprogramador.repository.ListaPessoaFactory;
import jxl.read.biff.BiffException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by Virmerson Bento dos Santos on 7/26/17.
 */
public class TestListaPessoaFactory {

    @Test
    public void testListaPessoas() throws IOException, BiffException {
        List<Pessoa> listaPessoas = new ListaPessoaFactory().getListaPessoas();

        Assert.assertNotNull(listaPessoas);
        Assert.assertTrue(listaPessoas.size()>0);
//        for (Pessoa p: listaPessoas){
//            System.out.println(p.getNome()+  " " + p.getTelefone());
//            System.out.println();
//        }
    }

}
