# Alinhamento_Estrat-gico_de_Carteiras_Recomendadas

* Branch main: código original, complexo mas funcionando
* Ramificações: tentativas de aprimoramento


Projeto para a elaboração de um algoritmo capaz de obter a quantidade máxima de ativos da estratégia de consenso de 2 ou mais instituições e a sequência destes.

O algoritmo desenvolvido apresenta uma resolução M²x N, sendo M e N o tamanho das entradas. Sua complexidade é: O(n³) //verificar.
O código percorre os dois vetores através de 2 loops e procura elementos iguais. Quando acha, ele incrementa a variável do loop externo e só continua o loop de dentro a partir daquele valor salvo (Achando assim a sequencia)
Para procurar mais sequências ele possui mais um loop, externo a esses dois, percorrendo novamente o array externo, para que cubra todaws as possibilidades

problema: complexo demais
* melhor caso percorre N²(recalcular), pior M * N²
* até no melhor caso está ruim...

Como tornar isso mais eficiente?
Precisa percorrer tantas vezes repetidas? O loop mais externo abrange os partes já verificadas
Tem como reduzir pra 2 loops, ajustando a lógica de verificar as possibilidades?
O de fora define o elemento inicial. Precisa disso? Se ele percorre os dois vetores inteiros deve ter um jeito de já encontrar a maior sequência
Mas tem casos de testes bem mais desordenados que os testados...
