package services;

import br.dao.IProdutoDAO;
import br.domain.Produto;
import services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}