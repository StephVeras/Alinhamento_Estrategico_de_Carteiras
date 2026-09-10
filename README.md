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

//If adicionado para resolver outofbound e precisa formatar resposta, fazer readme e confirmar parÂmetros de entrega; calcular complexidade

// segundo erro encontrado: indice2 = j: faz pegar elemento repetido. Indice2 = j+1

//ERRO FATAL: achou um elemento e o seguinte não procurar outras sequencias com aquele elemento, só pq o seguinte ja achou (isso para cada elemento achado)
* tentativa 1: duplicar o código do algoritmo invertendo vetores: resolve em massa esse problema em um dos vetores, comparando primeiro o primeiro vetor como referência e depois o segundo vetor. Porém esse problema pode acontecer nos dois ao mesmo tempo, e analisando um depois o outro não resolve.
* tentativa 2: algum outro loop com outra variavel teste pra armazenar onde parou, pra ver se abrange todos os casos, Ver se tem que ser antes ou depois do loop i, verificar se a atribuicao ao oficial e o descarte dos menores esta sendo feito e voltar no ultimo testado e continuar pulando posições ja testadas com x++
ex:
a b c d e f g
b d e c f a d g
//COMO ESTA: quando chega no b, vai pro c e procura ele, encontra, continua e da ruim pq no próximo loop k coloca c como potencial primeiro do vetor.
//COMO DEVERIA SER: depois de achar o vetor com o c (b c d g),compara com o vetor inicial, se necessário salva
//Depois voltar para o inicio(b), pular uma casa (x++), e tentar de novo
//depois x++ caso tenha encontrado outro elemento (isso pra cada element0o encontrado, ou seja, desde o primeiro c achado teria que pular o d e procurar b c e, depois b c f... so depois b d e, b d f...)
🥲🥲​🥲​🥲​🥲​🥲​🥲​🥲​🥲​🥲​🥲​🥲​🥲​
Ta nas tuas mãos, Senhor. Obrigada por me iluminar até aqui. Eu vos amo e só quero amar mais
Confio na tua divina providência e entrego novamene este projeto a Vos, por meio de Maria, nossa mãezinha querida
Que o Senhor possa me iluminar para bem fazer esse trabalho da melhor forma possível, sem usar métodos errados e quebrando meu orgulho de fazer sozinha
Amém