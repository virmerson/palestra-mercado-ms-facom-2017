package br.com.fabricadeprogramador.repository;

import br.com.fabricadeprogramador.model.Pessoa;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Virmerson Bento dos Santos on 7/26/17.
 */
@Repository
public class ListaPessoaFactory {


    public List<Pessoa> getListaPessoas() throws IOException, BiffException {

        //Ler o Arquivo
        Workbook workbook = Workbook.getWorkbook(new File("/Users/mac/Desktop/ucdb/sorteio-final.xls"));

        //ler a planilha
        Sheet sheet = workbook.getSheet(0);

        int rows = sheet.getRows();

        //Montar lista
          List<Pessoa> pessoas = new ArrayList<Pessoa>();
        for (int i =0 ;  i< rows ; i++){

            //Nome
            Cell colNome = sheet.getCell(2, i);
            String nome = colNome.getContents();

            //Telefone
            Cell colFone = sheet.getCell(4, i);
            String fone = colFone.getContents();

            //Instanciando Pessoa
            Pessoa p = new Pessoa();
            p.setNome(nome);
            p.setTelefone(fone);

            //Adicionando na lista
            pessoas.add(p);

        }

        //Retornar a lista

        return pessoas;
    }
}
