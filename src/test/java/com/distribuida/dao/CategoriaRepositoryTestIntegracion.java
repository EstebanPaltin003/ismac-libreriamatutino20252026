package com.distribuida.dao;

import com.distribuida.model.Categoria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CategoriaRepositoryTestIntegracion {

    @Autowired
    private CategoriaDAO categoriaDAO;

    @Test
    public void findAll() {
        List<Categoria> categorias = categoriaDAO.findAll();
        assertNotNull(categorias);
        categorias.forEach(System.out::println);
    }

    @Test
    public void findOne() {
        Optional<Categoria> categoria = categoriaDAO.findById(1);
        System.out.println(categoria.toString());
    }

    @Test
    public void save() {
        Categoria categoria = new Categoria();
        categoria.setNombre("Terror");

        Categoria guardado = categoriaDAO.save(categoria);
        assertNotNull(guardado);
    }

    @Test
    public void update (){
        Optional<Categoria> categoria = categoriaDAO.findById(1);

        if(categoria.isPresent()){
            categoria.get().setNombre("Editada");
            categoriaDAO.save(categoria.get());
        } else {
            System.out.println("No existe categoría con ID 1");
        }
    }

    @Test
    public void delete() { categoriaDAO.deleteById(1); }

}
