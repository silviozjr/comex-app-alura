package br.com.alura.comex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.model.Categoria;

@Service
public class CategoriaService {

  public void cadastrar(Categoria categoria) {
    categoria.setAtivo(true);
    CategoriaDao dao = new CategoriaDao();
    dao.cadastra(categoria);
  }

  public List<Categoria> listarTodos() {
    CategoriaDao dao = new CategoriaDao();
    return dao.listaTodos();
  }

}
