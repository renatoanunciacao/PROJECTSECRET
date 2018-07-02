/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Correios;
import br.edu.ifsul.servicos.ServicoCorreio;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Renato
 */
@Stateless
public class ClienteDAO implements Serializable {

    private ServicoCorreio cliente;
    Correios obj;

    public ClienteDAO() {
        cliente = new ServicoCorreio();
    }
  

    
    public ServicoCorreio getCliente() {
        return cliente;
    }

    public void setCliente(ServicoCorreio cliente) {
        this.cliente = cliente;
    }

}
