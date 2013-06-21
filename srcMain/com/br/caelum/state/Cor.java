package com.br.caelum.state;

import java.util.List;


public enum Cor {

	BRANCO{
		@Override
		public void busca(No no, List<No> list) {
			no.setCor(CINZA, list);
		}
	},
	CINZA{
		@Override
		public void assumiu(No no, List<No> list){
			for(No adj:no.getAdjacentes()){
				adj.buscaProfundidade(list);
				no.setCor(PRETO, list);
			}

		}
	},
	PRETO{
		@Override
		public void assumiu(No no, List<No> list){
			for(No adj : no.getAdjacentes()){
				list.add(adj);
			}
		}
	};

	public void busca(No no, List<No>nos){};
	public void assumiu(No no, List<No>nos){};
}