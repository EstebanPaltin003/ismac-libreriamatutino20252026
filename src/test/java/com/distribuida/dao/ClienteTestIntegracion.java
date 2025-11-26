package com.distribuida.dao;


import com.distribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)
public class ClienteTestIntegracion {

    @Autowired
    public ClienteDAO clienteDAO;


    @Test
    public void findALL(){
        List<Cliente> clientes = clienteDAO.findAll();
        for(Cliente item: clientes){
            System.out.println(item.toString());
        }
    }

    @Test
    public void findOne(){
        Optional<Cliente> cliente = clienteDAO.findById(1);
        System.out.println(cliente.toString());

    }

    @Test
    public void save(){
        Cliente cliente = new Cliente(0,"1752775237","Armando","Bronca","Av siempre muerta","0925857496","abronca@correo.com");
        clienteDAO.save(cliente);
    }


    @Test
    public void update(){

        Optional<Cliente> cliente = clienteDAO.findById(39);

        cliente.orElse(null).setCedula("1752775235");
        cliente.orElse(null).setNombre("Susan");
        cliente.orElse(null).setApellido("Ahoria");
        cliente.orElse(null).setDireccion("Av siempre viva");
        cliente.orElse(null).setTelefono("0999998855");
        cliente.orElse(null).setCorreo("sahoria@correo.com");

        clienteDAO.save(cliente.orElse(null));
    }


    @Test
    public void delete(){
        clienteDAO.deleteById(39);
    }
}
//OwO