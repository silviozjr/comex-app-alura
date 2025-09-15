package br.com.alura.comex;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.model.Categoria;

public class TestaCadastroDeCategoria {

    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Automotiva");

        CategoriaDao dao = new CategoriaDao();
        dao.cadastra(categoria);

        System.out.println("Categoria cadastrada com sucesso!");

        Categoria categoriaConsultada = dao.pesquisaPeloId(4L);
        System.out.println("ID: " + categoriaConsultada.getId());
        System.out.println("NOME: " + categoriaConsultada.getNome());
    }
}
