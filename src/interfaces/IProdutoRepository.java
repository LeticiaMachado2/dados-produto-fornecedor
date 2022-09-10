package interfaces;

import java.util.List;
import entities.Produto;


public interface IProdutoRepository extends IBaseRepository<Produto> {

	List<Produto> findByPreco(Double precoMin, Double precomax) throws Exception;
	
}
