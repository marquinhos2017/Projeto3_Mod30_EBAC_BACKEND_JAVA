package br.dao;

import Exceptions.DAOException;
import Exceptions.TipoChaveNaoEncontradaException;
import br.dao.generic.IGenericDAO;
import br.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}