package com.distribuida.dao;

import com.distribuida.model.Factura;
import com.distribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)
public class FacturaTestIntegracion {

    @Autowired
    private FacturaDAO facturaDAO;
    //8
    @Autowired
    private ClienteDAO clienteDAO;

    @Test
    public void testFacturaFindAll() {
        List<Factura> factura = facturaDAO.findAll();
        assertNotNull(factura);
        assertTrue(factura.size()>0);
        factura.forEach(System.out::println);
    }

    @Test
    public void testFacturaFindOne() {
        Optional<Factura> factura = facturaDAO.findById(1);
        assertTrue(factura.isPresent());
        assertEquals("FAC-0001", factura.orElse(null).getNumFactura());
        assertEquals(150.96, factura.orElse(null).getTotal());
        System.out.println(factura.toString());
    }

    @Test
    public void testFacturaSave() {
        Optional<Cliente> cliente = clienteDAO.findById(1);

        assertTrue(cliente.isPresent());

        Factura factura = new Factura();
        factura.setIdFactura(0);
        factura.setNumFactura("FAC-00066");
        factura.setFecha(new Date());
        factura.setTotalNeto(100.00);
        factura.setIva(15.00);
        factura.setTotal(115.00);
        factura.setCliente(cliente.orElse(null));

        Factura facturaGuardada = facturaDAO.save(factura);
        assertNotNull(facturaGuardada);
        assertEquals("FAC-00066", facturaGuardada.getNumFactura());
        assertEquals(100.00, facturaGuardada.getTotalNeto());
    }

    @Test
    public void testFacturaUpdate() {
        Optional<Cliente> cliente = clienteDAO.findById(2);

        assertTrue(cliente.isPresent());

        Optional<Factura> factura = facturaDAO.findById(86);

        Factura facturaActualizada = facturaDAO.save(factura.orElse(null));
        assertNotNull(facturaActualizada);
        assertEquals("FAC-00077", facturaActualizada.getNumFactura());
        assertEquals(260.00, facturaActualizada.getTotal());

        if (factura.isPresent()) {

            Factura f = factura.get();   // <<< LA CORRECCIÓN

            f.setNumFactura("FAC-00025");
            f.setFecha(new Date());
            f.setTotalNeto(200.00);
            f.setIva(60.00);
            f.setTotal(260.00);
            f.setCliente(cliente.orElse(null));

            facturaDAO.save(f);

        } else {
            System.out.println("No existe la factura con ID 86");
        }
    }

    @Test
    public void testFacturaDelete(){
        if(facturaDAO.existsById(87)){
            facturaDAO.deleteById(87);
        }
        assertFalse(facturaDAO.existsById(87));
    }

}






//uwu