# Trabalho de Projeto e Análise de Algoritmo: Alinhamento Estratégico de Carteiras Recomendadas

* Desenvolvido por Stephanie Accorinte Veras

Projeto para a elaboração de um algoritmo capaz de obter a quantidade máxima de ativos da estratégia de consenso de 2 ou mais instituições e a sequência destes.

## O Algoritmo 1

### Explicação

O algoritmo um foi desenvolvido com base na ideia de força bruta. Ele possui tres loops encadeados onde as condições de inicío dos loops mais internos dependem da posição dos elementos ja encontrados.

### Problemas enfrentados

* IndexOutOfBoundException -> solucionada com uma condicional a mais (i< lista1.size(), linha 38);

* indice2 recebia j, mas resultava em erro de repetir algum termo, então indice2= j+1 (linha 39).

### Complexidade θ()

A complexidade do código é θ(M²*N), onde M é o tamanho do primeiro vetor e N o tamanho do segundo.

A complexidade ficou grande demais, por isso foi pensado algumas melhorias que poderiam ter sido feitas, incluindo:

* Verificar o menor vetor pra ser o elevado ao quadrado na complexidade;

* Tentar diminuir a quantidade de vezes que o algoritmo repete e chega no mesmo resultao em vão (quantidade significativamente alta);

* Tentativas com mais casos de teste (única implementada a tempo).

### Casos de teste e Conclusão

Foi utilizada IA para gerar casos de testes maiores e mais desordenados (o problema foi explicado e os casos de testes seguiram as orientações recomendadas, todos realizados a mão posteriormente). Entretanto, a soluçaõ não foi como esperado nestes testes,segue o exemplo de falha abaixo:

```

Entrada:
7 8
a b c d e f g
b d e c f a d g

Saída obtida:
4
b c d g

Saída esperada:
5
b d e f g

Explicação:
Quando o algoritmo encontra c após ter encontrado b ele não volta e analisa as outras possibilidades com inicio em b
isso para cada termo encontrado

```

Concluiu-se, portanto, que a solução não abrange todas as possibilidades.

## O Algoritmo 2

### Explicação

O algoritmo 2 foi pensado utilizando a mesma lógica do um e aplicando recursivide, onde para cada termo encontrado ele retornasse e executasse a função novamente, sem o último elemento, e retornando caso tivesse 1 ou menos elementos iguais encontrados nas duas listas

### Tentativas de Criação do Algoritmo

* *tentativa 1:* duplicar o código do algoritmo invertendo vetores -> resolve em massa esse problema em um dos vetores, comparando primeiro o primeiro vetor como referência e depois o segundo vetor. Porém esse problema pode acontecer nos dois ao mesmo tempo, e analisando um depois o outro não resolve.

* *tentativa 2:* Fazer mais um loop x entre o loop k e o loop i para tentar voltar e repetir os loops i e j para as outras possibilidades -> não foi possível implementar, mas deu o início para a tentativa 5

* *tentativa 3:* criar todas as sequencias possíveis com os elementos repetidos e verificar se estão na ordem -> Não chegou a ser implementada
 
* *tentativa 4:* criar função com os for pra conseguir repetir código mais facilmente -> Não foi possível devido a ter que passar parâmetros por referência (deu origem a tentativa 5)

* *tentativa 5:* Criar uma classe para utilizar métodos recursivos para repetir os loops i e j para abranger os casos não abrangidos antes

### Complexidade

 A Complexidade obtida foi pior que a anteriorr, θ(M²*N), onde a base do código se mantem a mesma e repete os loops x-i vezes, sendo x a quantidade de elementos iguais em sequencia encontrados naquele loop. Segue a resolução simplificada da Função T(M) para a análise do Algoritmo:

 M *[ T(M) = M * N + T(M-1) ] 
no pior caso repete até T(1), então M-1 vezes
M*[M(M*N)] -> θ(M³*N)

### Casos de teste e conclusão

O algoritmo ainda contem alguns problemas de complexidade e abranger todos os casos. A linha 54 do arquivo Teste.java é fundamental, e fazendo algumas modificações pode-se chegar ao resultado esperado. Nesta linha, quando comparado com a lista2 ele da erro, enquanto com a lista 1 ele pega de forma muio mais complexa do que deveria todos os elementos iguais, sem odem, dos vetores. Sem esse bloco de código os resultados foram como o do algoritmo anterior. 

Portanto, mesmo com as alterações a avanços o resultado não abrangiu todos os casos de testes, embora traga uma solução certa (mas não necessariamente a maior) de termos iguais e em ordem entre os dois vetores.

## Referências e Agradecimento
Perplexity para gerar casos de teste.

Não foram utilizadas refêrencias de apoio teórico, o que foi um erro que dificultou muito o trabalho. Apesar disso, acredito que as tentativas foram muito válidas.

Agradeço o ensino e reforço do professor Douglas Castilho em fazer o código sem IA, a experiência foi muito válida e será aprimorada para trabalhos futuros

E agradeço a Deus e sua mãe querida por me ajudarem até aqui



Obs: Após tentativa 2 do segundo algoritmo o trabalho foi entregue ao Senhor:
🥲🥲​🥲​🥲​🥲​🥲​🥲​🥲​🥲​🥲​🥲​🥲​🥲​
Ta nas tuas mãos, Senhor. Obrigada por me iluminar até aqui. Eu vos amo e só quero amar mais
Confio na tua divina providência e entrego novamene este projeto a Vos, por meio de Maria, nossa mãezinha querida
Que o Senhor possa me iluminar para bem fazer esse trabalho da melhor forma possível, sem usar métodos errados e quebrando meu orgulho de fazer sozinha
Amém

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Continuação pós entrega do trabalho:
* mudança na condicional que chama a recursão. Quando tiver 1 elemento apaga e encerra ciclo.
* FUNCIONOOOU, mas pra entradas grandes como 100x100 deu algum erro ainda não identificado:
```
at Teste.loopJ(Teste.java:68)
```
