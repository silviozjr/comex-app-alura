package br.com.alura.comex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.alura.comex.dao.ProdutoDao;
import br.com.alura.comex.model.Produto;

@Service
public class ProdutoService {

  public void cadastrar(Produto produto) {
    ProdutoDao dao = new ProdutoDao();
    dao.cadastra(produto);
  }

  public List<Produto> listarTodos() {
    ProdutoDao dao = new ProdutoDao();
    return dao.listaTodos();
  }

}
