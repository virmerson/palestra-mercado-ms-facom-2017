package br.com.fabricadeprogramador.main;



import br.com.fabricadeprogramador.helper.Sorteio;
import br.com.fabricadeprogramador.model.Pessoa;
import br.com.fabricadeprogramador.repository.ListaPessoaFactory;
import jxl.read.biff.BiffException;

import java.io.IOException;
import java.util.List;

/**
 * Created by Virmerson Bento dos Santos on 7/26/17.
 */
public class ProgramaPrincipal {


    public static void main(String[] args) throws IOException, BiffException {

        ListaPessoaFactory lf =  new ListaPessoaFactory();
        List<Pessoa> listaPessoas = lf.getListaPessoas();

        Sorteio sorteio = new Sorteio(listaPessoas);

        Pessoa pessoa = sorteio.sortear();

        System.out.println(pessoa.getNome() + " "+ pessoa.getTelefone());

    }
}
