/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.cadastrocliente.dao;

import br.com.cadastrocliente.domain.Cliente;
import java.util.Collection;

/**
 *
 * @author alan.menezes
 */
public interface IClienteDAO {
    
    public Boolean cadastrar(Cliente cliente);
    
    public void excluir(Long cpf);
    
    public void alterar(Cliente cliente);
    
    public Cliente consultar (Long cpf);
    
    public Collection<Cliente> buscarTodos();

   // public Cliente consultarPorNome(String nome);
    
}
