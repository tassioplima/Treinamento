#language: pt
#Version: 1.0
#Encoding: iso-8859-1
Funcionalidade: Buscar conteudo e valores OLX

  Contexto: Realizacao do acesso inicial como pre-requisito 
    Dado que estou na pagina inicial
    E selecionar estado na area de busca
    
      | Estado |
      | R     |


  @ID01 @PesquisaCenario
  
  Cenario: Realizar uma pesquisa no site da OLX e imprimir os resultados 
    Quando realizar busca de um produto
      | Busca |
      | bicicleta  |
    Entao e apresentado resultado da busca do "5" resultado

  @ID02 @PesquisaCenario
  
  Cenario: Realizar uma pesquisa no site da OLX que contenha paginacao
    Quando realizar busca de um produto
      | Busca 		 |
      | bicicleta  |
    E realizar paginacao
      | Pagina |
      |      2 |
    Entao e apresentado resultado da busca do "1" resultado
