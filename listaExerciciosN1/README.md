**Estas respostas não foram corrigidas e por isso não tem garantia de que estão corretas**

<br><br><br><br>

# 1
A área de complexidade de algoritmos abrange a medição da eficiência de um algoritmo frente à quantidade de operações realizadas até que ele encontre seu resultado final. A respeito desse contexto, suponha que um arquivo texto contenha o nome de N cidades de determinado estado, que cada nome de cidade esteja separado do seguinte por um caracter especial de fim de linha e classificado em ordem alfabética crescente. Considere um programa que realize a leitura linha a linha desse arquivo, à procura de nome de cidade.

Com base nessa descrição, verifica-se que a complexidade desse programa é:
- **A:** O(1), em caso de busca sequencial.
- **B:** O(n), em caso de busca sequencial.
- **C:** O(log n), em caso de busca binária.
- **D:** O(n), em caso de transferência dos nomes para uma árvore binária e, então, realizar a
busca.
- **E:** O(log n), em caso de transferência dos nomes para uma árvore binária e, então, realizar a
busca.

## Resposta
- **B:** O(n), em caso de busca sequencial.
- Letra B pois o algoritmo irá verificar cada item da lista sequencialmente até encontrar o item desejado. Caso o item desejado seja o último da lista, ele irá realizar N verificações.

<br><br>

# 2
Julgue os itens a seguir, acerca de algoritmos para ordenação.

- **I:** O algoritmo de ordenação por inserção tem complexidade O(n log ⁡ n).
- **II:** Um algoritmo de ordenação é dito estável caso ele não altere a posição relativa de
elementos de mesmo valor.
- **III:** No algoritmo quicksort, a escolha do elemento pivô influencia o desempenho do
algoritmo.
- **IV:** O shellsort e uma melhoria do método de ordenação por inserção, enquanto o inserção
se preocupa com elementos adjacentes tornando-o de complexidade O(N²) shellsort tem complexidade O(N).

Estão certos apenas os itens:
- **A:** I e II
- **B:** I e III
- **C:** II, III
- **D:** I, III, IV
- **E:** II, III, IV

## Resposta
- **C:** II, III.
- I - Falso. O Isertion Sort possui uma complexidade de O(N²) no pior caso.
- II - Verdadeiro.
- III - Verdadeiro.
- IV - Falso. O Shell Sort não possui uma complexidade assintótica definida.


<br><br>

# 3
Considere o algoritmo que implementa o seguinte processo: uma coleção desordenada de elementos é dividida em duas metades e cada metade é utilizada como argumento para a reaplicação recursiva do procedimento. Os resultados das duas reaplicações são, então, combinados pela intercalação dos elementos de ambas, resultando em uma coleção ordenada.

Qual é a complexidade desse algoritmo?
- **A:** O(N²)
- **B:** O(N^2N)
- **C:** O(2N)
- **D:** O(log N * log N)
- **E:** O(N log N)

## Resposta
- **E:** O(N log N)
- Este algoritmo utiliza o conceito de divisão para conquista onde sempre irá dividir a massa de dados pela metade até que chegue unidades. Por causa desta divisão este é um algoritmo logarítmico. O mesmo conceito utilizado no Merge Sort.

<br><br>

# 4
O algoritmo a seguir recebe um vetor v de números inteiros e rearranja esse vetor de tal forma que seus elementos, ao final, estejam ordenados de forma crescente.

```java
 1 void ordena(int[] v, int n) {
 2   for (int i = 1; i < n; i++) {
 3     int chave = v[i];
 4     int j = i - 1;
 5
 6     while(j >= 0 && v[j] < chave) {
 7       v[j - 1] = v[j];
 8       j--;
 9     }
10
11     v[j + 1] = chave;
12   }
13 }
```

Considerando que nesse algoritmo há erros de lógica que devem ser corrigidos para que os elementos sejam ordenados de forma crescente, assinale a opção correta no que se refere às correções adequadas.

- **A:** A linha 2 deve ser corrigida da seguinte forma: ``for (int i = 1; i < n - 1; i++)`` e a linha 11, do seguinte modo: ``v[j - 1] = chave``.
- **B:** A linha 2 deve ser corrigida da seguinte forma: ``for (int i = 1; i < n - 1; i++)`` e a linha 4, do seginte modo: ``int j = i + 1``.
- **C:** A linha 4 deve ser corrigida da seguinte forma: ``int j = i + 1``; a linha 6, do seguinte modo: ``while (j >= 0 && v[j] > chave)``.
- **D:** A linha 6 deve ser corrigida da seguine forma: ``while (j >=0 && v[j] > chave)`` e a linha 7, do seguinte modo: ``v[j + 1] = v[j]``.
- **E:** A linha 7 deve ser corrigida da seguinte forma: ``v[j + 1] = v[j]``; e a linha 11, do seguinte modo: ``v[j - 1] = chave``;

## Resposta
- **D:** A linha 6 deve ser corrigida da seguine forma: ``while (j >=0 && v[j] > chave)`` e a linha 7, do seguinte modo: ``v[j + 1] = v[j]``.

<br><br>

# 5
Explique o que é complexidade assintótica. Qual o impacto da complexidade assintótica de um algoritmo? O que quer dizer um algoritmo possui complexidade assintótica O(N) e O (N²) , explique a diferença.

## Resposta
- Complexidade assintótica é a medição da complexidade de um algoritmo em seu pior caso e quando sua massa tende ao infinito. A complexidade permique que sejam realizadas comparações entre algoritmos de forma matemática.
- Um algoritmo com complexidade O(N) irá executar N operações na massa de dados.
- Um algoritmo com complexidade O(N²) irá executar N² operações para cada elemento na massa de dados.

<br><br>

# 6
Tendo os seguintes cenários abaixo e os principais métodos de ordenação, associe os cenários aos métodos e justifique explicando o comportamento e a complexidade assintótica de cada algoritmo conhecendo o pior, o médio e o melhor caso para ordenar as massas de dados de forma crescente. Obs, você só pode usar cada algoritmo uma única vez, ou seja, tendo usado o mergesorte em um dos cenários não pode ser aplicado em outro.

- **I:** Pequena massa de dados organizados de forma aleatória.
- **II:** Grande massa de dados ordenados de forma descrescente.
- **III:** Grande massa de dados organizados de forma aletória
- **IV:** Pequena massa de dados ordenado de forma descrescente

## Resposta
- **I:** Insertion Sort: Este é um algoritmo lento, no entando, como a massa de dados é pequena será sufiente e pouco complexo já que sua implementação é simples. Apesar de possuir no médio e pior caso uma complexidade O(N²), no melhor caso terá uma complexidade O(N) o que o faz um algorimo melhor que o Selection Sort e Bubble Sort.
- **II:** Merge Sort: Por possuir uma complexidade O(N log N) em qualquer caso, será a melhor escolha para esta massa. O merge sort irá dividir recursivamente a massa de dados até que cheguem em unidades e isso o faz um algoritmo bem otimizado para este cenário.
- **III:** Quick Sort: Apesar de possuir um pior caso de O(N²), este pior caso não deve acontecer neste cenário e por isso será o algoritmo mais rápido para resolver esta massa e deverá resolver com uma complexidade de O(N log N).
- **IV:** Shell Sort: Apesar de não ser considerado uma método simples, sua implementação não é complexa e apesar de não ter uma complexidade assintótica definida o Shell Sort se saira bem superior ao Bubble Sort, Insertion Sort e Selection Sort.

<br><br>

## Resposta
- Incorreto. O algoritmo O(N²) apesar de lento, ainda será superior ao O(N³) pois para o primeiro serão executadas N² operações para cada elemento da massa de dados enquanto que no segundo serão executadas N³ operações para cada elemento da massa de dados.

<br><br>

# 10
Explique o processo de ordenação do algoritmos pedidos, levando em consideração que sua massa de dados é: 51, 27, 3, 12, 6, 73, 93, 19, 97, 37, 5, 10, 4. Mostre a configuração do vetor após cada troca de elementos. Apresente e explique a complexidade de cada um dos métodos.

- Insertionsort
- SelectionSort
- Quicksort
- Merge sorte
## Resposta
- Insertion Sort - Similar a ordenação de um baralho de cartas à mão. Um elemento é destacado e todos os elementos anteriores maiores que ele são movidos para a direita. Quando não há mais elemento à esquerda maior que o elemento destacado o elemento destacado é inserido na posição. Este processo será repetido até que a massa esteja ordenada.
```
Pior e Médio Caso: O(N²)
Melhor Caso: O(N)

Array inicial: [51, 27, 3, 12, 6, 73, 93, 19, 97, 37, 5, 10, 4]

Elemento Destacado: 27

  1. [51, 51, 3, 12, 6, 73, 93, 19, 97, 37, 5, 10, 4]
  2. [27, 51, 3, 12, 6, 73, 93, 19, 97, 37, 5, 10, 4]

Elemento Destacado: 3

  3. [27, 51, 51, 12, 6, 73, 93, 19, 97, 37, 5, 10, 4]
  4. [27, 27, 51, 12, 6, 73, 93, 19, 97, 37, 5, 10, 4]
  5. [ 3, 27, 51, 12, 6, 73, 93, 19, 97, 37, 5, 10, 4]

Elemento Destacado: 12

  6. [3, 27, 51, 51, 6, 73, 93, 19, 97, 37, 5, 10, 4]
  7. [3, 27, 27, 51, 6, 73, 93, 19, 97, 37, 5, 10, 4]
  8. [3, 12, 27, 51, 6, 73, 93, 19, 97, 37, 5, 10, 4]

Elemento Destacado: 6

  9. [3, 12, 27, 51, 51, 73, 93, 19, 97, 37, 5, 10, 4]
 10. [3, 12, 27, 27, 51, 73, 93, 19, 97, 37, 5, 10, 4]
 11. [3, 12, 12, 27, 51, 73, 93, 19, 97, 37, 5, 10, 4]
 12. [3,  6, 12, 27, 51, 73, 93, 19, 97, 37, 5, 10, 4]

Elemento Destacado: 73
Elemento Destacado: 93
Elemento Destacado: 19

 13. [3, 6, 12, 27, 51, 73, 93, 93, 97, 37, 5, 10, 4]
 14. [3, 6, 12, 27, 51, 73, 73, 93, 97, 37, 5, 10, 4]
 15. [3, 6, 12, 27, 51, 51, 73, 93, 97, 37, 5, 10, 4]
 16. [3, 6, 12, 27, 27, 51, 73, 93, 97, 37, 5, 10, 4]
 17. [3, 6, 12, 19, 27, 51, 73, 93, 97, 37, 5, 10, 4]

Elemento Destacado: 37

 18. [3, 6, 12, 19, 27, 51, 73, 93, 97, 97, 5, 10, 4]
 19. [3, 6, 12, 19, 27, 51, 73, 93, 93, 97, 5, 10, 4]
 20. [3, 6, 12, 19, 27, 51, 73, 73, 93, 97, 5, 10, 4]
 21. [3, 6, 12, 19, 27, 51, 51, 73, 93, 97, 5, 10, 4]
 22. [3, 6, 12, 19, 27, 37, 51, 73, 93, 97, 5, 10, 4]

Elemento Destacado: 5

 23. [3, 6, 12, 19, 27, 37, 51, 73, 93, 97, 97, 10, 4]
 24. [3, 6, 12, 19, 27, 37, 51, 73, 93, 93, 97, 10, 4]
 25. [3, 6, 12, 19, 27, 37, 51, 73, 73, 93, 97, 10, 4]
 26. [3, 6, 12, 19, 27, 37, 51, 51, 73, 93, 97, 10, 4]
 27. [3, 6, 12, 19, 27, 37, 37, 51, 73, 93, 97, 10, 4]
 28. [3, 6, 12, 19, 27, 27, 37, 51, 73, 93, 97, 10, 4]
 29. [3, 6, 12, 19, 19, 27, 37, 51, 73, 93, 97, 10, 4]
 30. [3, 6, 12, 12, 19, 27, 37, 51, 73, 93, 97, 10, 4]
 31. [3, 6,  6, 12, 19, 27, 37, 51, 73, 93, 97, 10, 4]
 32. [3, 5,  6, 12, 19, 27, 37, 51, 73, 93, 97, 10, 4]

Elemento Destacado: 10

 33. [3, 5,  6, 12, 19, 27, 37, 51, 73, 93, 97, 97, 4]
 34. [3, 5,  6, 12, 19, 27, 37, 51, 73, 93, 93, 97, 4]
 35. [3, 5,  6, 12, 19, 27, 37, 51, 73, 73, 93, 97, 4]
 36. [3, 5,  6, 12, 19, 27, 37, 51, 51, 73, 93, 97, 4]
 37. [3, 5,  6, 12, 19, 27, 37, 37, 51, 73, 93, 97, 4]
 38. [3, 5,  6, 12, 19, 27, 27, 37, 51, 73, 93, 97, 4]
 39. [3, 5,  6, 12, 19, 19, 27, 37, 51, 73, 93, 97, 4]
 40. [3, 5,  6, 12, 12, 19, 27, 37, 51, 73, 93, 97, 4]
 41. [3, 5,  6, 10, 12, 19, 27, 37, 51, 73, 93, 97, 4]

Elemento Destacado: 4

 41. [3, 5,  6, 10, 12, 19, 27, 37, 51, 73, 93, 97, 97]
 41. [3, 5,  6, 10, 12, 19, 27, 37, 51, 73, 93, 93, 97]
 41. [3, 5,  6, 10, 12, 19, 27, 37, 51, 73, 73, 93, 97]
 41. [3, 5,  6, 10, 12, 19, 27, 37, 51, 51, 73, 93, 97]
 41. [3, 5,  6, 10, 12, 19, 27, 37, 37, 51, 73, 93, 97]
 41. [3, 5,  6, 10, 12, 19, 27, 27, 37, 51, 73, 93, 97]
 41. [3, 5,  6, 10, 12, 19, 19, 27, 37, 51, 73, 93, 97]
 41. [3, 5,  6, 10, 12, 12, 19, 27, 37, 51, 73, 93, 97]
 41. [3, 5,  6, 10, 10, 12, 19, 27, 37, 51, 73, 93, 97]
 41. [3, 5,  6,  6, 10, 12, 19, 27, 37, 51, 73, 93, 97]
 41. [3, 5,  5,  6, 10, 12, 19, 27, 37, 51, 73, 93, 97]
 41. [3, 4,  5,  6, 10, 12, 19, 27, 37, 51, 73, 93, 97]
```

- Selection Sort - Itera o array procurando o menor elemento e o coloca em sua posição. Este processo é repetido até que a massa esteja ordenada.
```
Todos os Casos: O(N²)

Array inicial: [51, 27, 3, 12, 6, 73, 93, 19, 97, 37, 5, 10, 4]

  1. [3, 27, 51, 12, 6, 73, 93, 19, 97, 37, 5, 10, 4]
  2. [3, 4, 51, 12, 6, 73, 93, 19, 97, 37, 5, 10, 27]
  3. [3, 4, 5, 12, 6, 73, 93, 19, 97, 37, 51, 10, 27]
  4. [3, 4, 5, 6, 12, 73, 93, 19, 97, 37, 51, 10, 27]
  5. [3, 4, 5, 6, 10, 73, 93, 19, 97, 37, 51, 12, 27]
  6. [3, 4, 5, 6, 10, 12, 93, 19, 97, 37, 51, 73, 27]
  7. [3, 4, 5, 6, 10, 12, 19, 93, 97, 37, 51, 73, 27]
  8. [3, 4, 5, 6, 10, 12, 19, 27, 97, 37, 51, 73, 93]
  9. [3, 4, 5, 6, 10, 12, 19, 27, 37, 97, 51, 73, 93]
 10. [3, 4, 5, 6, 10, 12, 19, 27, 37, 51, 97, 73, 93]
 11. [3, 4, 5, 6, 10, 12, 19, 27, 37, 51, 93, 97, 93]
 12. [3, 4, 5, 6, 10, 12, 19, 27, 37, 51, 93, 93, 97]

```

<br><br>

# 11
"Considerando dois algoritmos com tempo de execução O(N²) e O(N³) espera-se que o segundo seja mais eficiente que o primeiro." 

Julgue o item acima como verdadeiro ou falso. Justifique sua resposta.

## Resposta
- Incorreto. O algoritmo O(N²) apesar de lento, ainda será superior ao O(N³) pois para o primeiro serão executadas N² operações para cada elemento da massa de dados enquanto que no segundo serão executadas N³ operações para cada elemento da massa de dados.

<br><br>
