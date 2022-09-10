package interfaces;

import java.util.List;
import entities.Fornecedor;

//ta criando uma classe que dá continuidade a IBase,e quem herda dela também leva todos os métodos dela. 
public interface IFornecedorRepository extends IBaseRepository<Fornecedor> {

	List<Fornecedor> findByNome(String nome) throws Exception;
	
	
}
