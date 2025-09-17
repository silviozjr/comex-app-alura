package br.com.alura.comex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.model.Categoria;

@Service
public class CategoriaService {

  private final CategoriaDao repositorio;

  public CategoriaService(CategoriaDao categoriaDao) {
    this.repositorio = categoriaDao;
  }

  public void cadastrar(Categoria categoria) {    
    categoria.setAtivo(true);
    repositorio.save(categoria);
  }

  public List<Categoria> listarTodos() {
    return repositorio.findAll();
  }

}
