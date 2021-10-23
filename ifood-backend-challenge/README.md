# O problema

Crie um micro-serviço capaz de aceitar solicitações HTTP recebendo um id de restaurante como parâmetro e retornando seu (s) menu (s).

Com base nos requisitos abaixo, elabore seu próprio modelo de dados e crie um banco de dados para armazenar os dados (você pode preencher o banco de dados manualmente).

Bifurque este repositório e envie seu código.

##Requisitos
Restaurante é uma entidade que contém um ou mais Menus.
Rede é uma entidade que contém Restaurantes.
A cadeia pode conter menus ou não.
Restaurante pode ser associado a uma Rede ou não.
O Restaurante associado a uma Rede herda seu Menu, mas pode substituir qualquer item.
Você não precisa modelar toda a entidade Restaurante / Cadeia. Apenas os ids e sua relação são suficientes.
O Menu é basicamente composto por 4 entidades: Item, Grupo de Itens, Opção e Grupo de Opções (suas relações e propriedades são você quem decide).
##Requisitos não Funcionais
Como esse serviço será um sucesso mundial, ele deve estar preparado para ser tolerante a falhas, responsivo e resiliente.

Além disso, pode hospedar milhares de Menus de restaurantes, por isso deve ser modelado para ser facilmente manipulado (operações criar / atualizar / excluir que não precisam ser implementadas, mas devem ser consideradas na modelagem). Por exemplo: se o restaurante ficar sem "bacon" e precisar definir todos os itens / opções que contêm "bacon" como indisponíveis, devemos implementar essa operação facilmente.

Esta solução pode ser utilizada na integração com outros sistemas / serviços.

Você pode considerar como seu microsserviço irá expor "Itens Modelo" como Pizza (um Item que contém tamanhos / base / crosta / coberturas / extras) e Combos (um Item que contém uma combinação de outros Itens a preços diferentes). Eles podem ser modelados como Item / Grupo de Item / Opção / Grupo de Opção regular, mas podem ser expostos de forma diferente.

Use qualquer linguagem, ferramentas, estruturas e bancos de dados com os quais se sinta confortável.

Além disso, elabore brevemente sua solução, detalhes da arquitetura, escolha de padrões e estruturas.

##Dicas
Você pode conferir os restaurantes do iFood e seus cardápios em https://www.ifood.com.br/delivery/campinas-sp/ (mas lembre-se: essa pode não ser a melhor solução).

Também há APIs de menu públicas na web que você pode verificar para se inspirar. Se você usar algum, lembre-se de mencioná-lo.

##Exemplos
A entidade “Pizza” deve ser oferecida em três tamanhos diferentes (pequeno, médio e grande).

Pode haver tantos recheios quanto o restaurante precisar (pelo menos, para este exemplo, "Muzzarela", "Calabrezza" e "Margherita").

Uma pizza pode ser pedida com uma, duas ou três opções de coberturas diferentes. Cada cobertura deve ser personalizável (por exemplo, "cebolas adicionais" ou "bacon adicional").

Além disso, como opção, o cliente pode escolher "Cheddar Stuffed Crust" em vez de nossa crosta tradicional.

É importante ressaltar que o preço total da pizza pode variar de acordo com a escolha do cliente. Por exemplo, "Cheddar Stuffed Crust" em uma pizza pequena é mais barato do que a opção em uma pizza grande.

Quando o "cheddar" acaba no restaurante, as pizzas não podem ser pedidas dentro desta opção.

Além disso, como exemplo, segue quatro itens vendidos por um restaurante fictício:

*	Chips (~ $ 4)

	- Opcionais (escolha qualquer):
		- Bacon (+ $ 1)

*	Hambúrguer de Queijo Duplo (~ $ 12)

	- Opcionais (escolha qualquer):
		- Salada (+0)
		- Hambúrguer extra (+ $ 3)
		- Bacon (+ $ 2)
*	Cola ($ 3)

*	Combo nº5 (~ $ 17)

	- Hamburguer de queijo duplo
		- Escolha pelo menos dois entre:
			- Cebolas (+0)
			- Salada (+0)
			- Hambúrguer extra (+ $ 3)
			- Bacon (+ $ 2)
		- Acompanhamento (escolha um):
			- Anéis de cebola (+ $ 1)
			- Fichas (+0)
				- Opcionais (escolha qualquer):
					- Bacon (+ $ 1)
		- Bebida (escolha uma):
			- Soda:
				- Cola
				- Dr. Pepper
			- Suco (+ $ 1):
				- Laranja
				- Limão
				
Se o restaurante ficar sem bacon, os itens 1, 2 e 4 do exemplo dado devem exibir a opção de guarnição de bacon como "ESGOTADO".