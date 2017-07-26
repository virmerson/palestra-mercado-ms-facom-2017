package br.com.fabricadeprogramador.service;

import br.com.fabricadeprogramador.helper.Sorteio;
import br.com.fabricadeprogramador.model.Pessoa;
import br.com.fabricadeprogramador.repository.ListaPessoaFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Virmerson Bento dos Santos on 7/26/17.
 */
@Service
public class SorteioService {

    @Autowired
    ListaPessoaFactory listaPessoaFactory;

    public Pessoa realizarSorteio (){

        try {
            List<Pessoa> listaPessoas = listaPessoaFactory.getListaPessoas();

            Sorteio sorteio = new Sorteio(listaPessoas);

            Pessoa pessoa = sorteio.sortear();

            return pessoa;

        }catch (Exception e){
            e.printStackTrace();
            //LOG Aqui
            //Lancar Exception de Service para Controller
        }

        return null;

    }
}
