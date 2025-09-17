package br.com.alura.comex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.alura.comex.dao.ProdutoDao;
import br.com.alura.comex.model.Produto;
import jakarta.transaction.Transactional;

@Service
public class ProdutoService {

  private final ProdutoDao repositorio;

  public ProdutoService(ProdutoDao produtoDao) {
    this.repositorio = produtoDao;
  }

  @Transactional
  public void cadastrar(Produto produto) {
    repositorio.save(produto);
  }

  public List<Produto> listarTodos() {
    return repositorio.findAll();
  }

}
