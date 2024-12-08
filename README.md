Imagine que você foi contratado por uma grande empresa de transportes para desenvolver um sistema que ajude no gerenciamento da frota de veículos. O sistema deve ser capaz de armazenar diferentes tipos de veículos, calcular o valor do seguro de cada um e garantir que eles passem por manutenções periódicas.

 

A empresa possui uma frota variada, composta por carros e motos, e cada tipo de veículo possui suas particularidades no cálculo do seguro e na realização de manutenções. A empresa também deseja armazenar todos os veículos em uma lista para fácil consulta.

 

Requisitos:

1.     Crie uma classe abstrata chamada Veiculo com os atributos placa (String) e ano (int). A classe deve ter:

o   Um construtor para inicializar os atributos.

o   Um método abstrato chamado calcularValorSeguro(), que será implementado pelas subclasses.

o   Um método concreto chamado exibirDetalhes(), que exibe a placa e o ano do veículo.



2.     Crie uma interface chamada Manutencao que define:

o   Um método chamado realizarManutencao() que retorna uma string indicando que a manutenção foi realizada.



3.     Crie as seguintes subclasses de Veiculo:

o   Carro: com o atributo adicional numeroPortas (int) e implementando o método calcularValorSeguro(), considerando o número de portas para definir o valor do seguro.

o   Moto: com o atributo adicional cilindrada (int) e implementando o método calcularValorSeguro(), considerando a cilindrada para definir o valor do seguro. Ambas as classes devem implementar a interface Manutencao, indicando como a manutenção é realizada para cada tipo de veículo.



4.     Crie uma estrutura de dados do tipo ArrayList para armazenar diversos veículos.



5.     Implemente uma classe principal GerenciadorVeiculos que:

o   Cria uma lista de veículos (ArrayList).

o   Adiciona instâncias de Carro e Moto à lista.

o   Percorre a lista exibindo os detalhes de cada veículo, calculando o valor do seguro e realizando a manutenção.
