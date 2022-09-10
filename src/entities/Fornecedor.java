package entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor {

	private Integer idForcenedor;
	private String nome;
	private String cnpj;
	private List<Produto> produtos;
	// Fornecedor tem tbm uma lista de produtos.
	// List - declara uma coleção de obsjetos.


}


