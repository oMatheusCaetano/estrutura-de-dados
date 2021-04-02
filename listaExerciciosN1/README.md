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

# 11
"Considerando dois algoritmos com tempo de execução O(N²) e O(N³) espera-se que o segundo seja mais eficiente que o primeiro." 

Julgue o item acima como verdadeiro ou falso. Justifique sua resposta.

## Resposta
- Incorreto. O algoritmo O(N²) apesar de lento, ainda será superior ao O(N³) pois para o primeiro serão executadas N² operações para cada elemento da massa de dados enquanto que no segundo serão executadas N³ operações para cada elemento da massa de dados.

<br><br>
