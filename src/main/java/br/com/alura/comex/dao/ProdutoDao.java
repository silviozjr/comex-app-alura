package br.com.alura.comex.dao;

import br.com.alura.comex.db.ConnectionFactory;
import br.com.alura.comex.db.DatabaseUtils;
import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoDao extends JpaRepository<Produto, Long> {

}