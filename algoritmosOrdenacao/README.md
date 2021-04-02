# Tipos de algoritmos
#### Algoritmos Simples
- Adequados para pequenas massas de dados.
- Requerem O(N²) comparações.
- Produzem programas pequenos.

#### Algoritmos Complexos
- Adequados para grandes massas de dados.
- Requerem O(N log N) comparações.
- Usam menos comparações.
- As comparações são mais complexas nos detalhes.

<br><br>

# Exemplos de Algoritmos
### Algoritmos simples
- Insertion Sort: Elementos são inseridos na posição correta.
- Selection Sort: É realizada uma seleção dos maior ou menor valor e este é realocado no vetor.
- Bubble Sort: Comparações sucessivas trocam elementos de posição no vetor.

### Algoritmos complexos
- Shell Sort: Uma evolução do Insertion sort. Não lida com elementos adjacentes.
- Quick Sort: Quebra a massa de dados para poder realizar a ordenação.
- Merge Sort: Divide recursivamente a massa de dados até chegar em unidades e então volta fazendo a mescla dos dados.

<br><br>

# Classificações
## Estabilidade
- Algoritmos instáveis: A ordem relativa dos items com chaves iguais é alterada durante o processo de ordenação.
- Algoritmos estáveis: A ordem relativa dos items com chaves iguais nao é alterada durante o processo.

Obs: Alguns métodos de ordenação mais eficientes são instáveis.

## Ordenação
- Ordenação Interna: O conjunto de registros cabe na memória principal.
[Insertion Sort, Selection Sort, Bubble Sort, Shell Sort, Quick Sort].
- Ordenação Externa: O conjunto de registros não cabe completamente na memória principal e deve ser armazenado em disco ou fita. [Merge Sort]

Obs: Alguns autores utilizam ordenação de vetores (Ordenação interna) e ordenação de registros (Ordenação externa).

<br><br>

# Insertion Sort
<img src="https://media.geeksforgeeks.org/wp-content/uploads/insertionsort.png">

<br><br>

- Considerado um algoritmo lento.
- Possui baixa eficiência.
- **Não** indicado para grandes massas de dados.
- Similar a ordenação de cartas em um baralho.
- Realiza a comparação de dois elementos e se o primeiro for maior que o segundo, realiza a comparação dos elementos anteriores ao primeiro até encontrar um elemento anterior menor que o segundo.
- É feita uma única passagem, mas com vários retornos.
- O procedimento é encerrado quando ordena-se o elemento da última posição do vetor.

 **Tipo**: Algoritmo Simples <br>
 **Estabilidade**: Algoritmo estável <br>
 **Ordenação**: Ordenação Interna <br>
 **Complexidade Pior Caso**: O(N²) <br>
 **Complexidade Médio Caso**: O(N²) <br>
 **Complexidade Melhor Caso**: O(N) <br>

 ### Passo a passo da ordenação.
 - Massa de dados está desordenada
 ```
Resultado: [5, 3, 2, 4, 7]
 ```
<br>

  - Destaca-se um número que será usado como base para as comparações: ``3(array[1])`` <br>
``` Elemento destacado: 3```

  - Compara se o ``5(array[0])`` é maior que o ``3(Elemento destacado)``.
  - Neste caso a comparação é VERDADEIRA e não há elementos anteriories ao ``5(array[0])`` então os elementos são trocados.
 ```
Resultado: [3, 5, 2, 4, 7]
 ```

<br>

  - Destaca-se um número que será usado como base para as comparações: ``2(array[2])`` <br>
``` Elemento destacado: 2```
  - Compara se o ``5(array[1])`` é maior que o ``2(Elemento destacado)``.
  - Neste caso a comparação é VERDADEIRA então o ``5(array[1])`` irá para a posição que era do ``2(Elemento destacado)``.
 ```
 Elemento destacado: 2
Resultado parcial: [3, 5, 5, 4, 7]
 ```

<br>

  - Compara se o ``3(array[0])`` é maior que o ``2(Elemento destacado)``.
  - Neste caso a comparação é VERDADEIRA e não há elementos anteriories ao ``3(array[0])`` então este é movido para a posição adjacente e o ``2(Elemento destacado)`` é inserido na posição do ``3(array[0])`.
 ```
Resultado  [2, 3, 5, 4, 7]
 ```

<br>

  - Destaca-se um número que será usado como base para as comparações: ``4(array[3])`` <br>
``` Elemento destacado: 4```
  - Compara se o ``5(array[2])`` é maior que o ``4(Elemento destacado)``.
  - Neste caso a comparação é VERDADEIRA então o ``5(array[2])`` irá para a posição que era do ``2(Elemento destacado)``.
 ```
 Elemento destacado: 4
Resultado parcial: [2, 3, 5, 5, 7]
 ```

<br>

  - Compara se o ``3(array[1])`` é maior que o ``4(Elemento destacado)``.
  - Neste caso a comparação é FALSA então nada é feito em relação ao ``3(array[1])`` e o ``4(Elemento destacado)`` é inserido na posição do ``5(array[2])``
 ```
Resultado  [2, 3, 4, 5, 7]
 ```

 <br>

  - Destaca-se um número que será usado como base para as comparações: ``7(array[4])`` <br>
``` Elemento destacado: 7```
  - Compara se o ``5(array[3])`` é maior que o ``7(Elemento destacado)``.
  - Neste caso a comparação é FALSA então nenhuma troca é realizada.
 ```
Resultado final: [2, 3, 4, 5, 7]
 ```

## Implementação
- [Implementação em JAVA](www.google.com)

### Pseudo Código
```
procedure insertionSort(var a: array[integer]; n: integer);
var i:integer;
var j:integer;
var chave:integer;

begin
  for j = 2 to n do
  begin
    chave = a[j];
    i = j - 1;
    while i > 0 and a[j] > chave do
    begin
      a[i + 1] = a[i];
      i = i - 1;
    end;
    a[i + 1] = chave
  end;
end
```

<br><br><br><br>
# Selection Sort
<img src="https://lh3.googleusercontent.com/proxy/UWjw8YSpHa-Owjjz1H0eurr1UHZrGZCnCLaVzzWJBD30lZAXN5Zm5R9FxEvU_Gsdfuza3I4cAjvY7JbYo_jNi6C_C4OMzhUQZ3I81pfGQgm2UWjI-8YTBsQT8sbtQnjDEeubLzDNQq8">

<br><br>

- Considerado um algoritmo lento.
- Possui baixa eficiência.
- Procura-se o menor elemento dentro da massa de dados.
- No primeiro passo, são feitas n - 1 comparações para determinar o menor valor.
- No segundo passo, n - 2 comparações e assim sucessivamente.
- Até que no último passo é efetuada apenas uma comparação.
- Troca-se este elemento com o primeiro elemento da massa de dados.
- **Não** indicado para grandes massas de dados.
- Ordena através de sucessivas seleções do elemento de menor valor em uma massa de dados não-ordenado e seu posicionamento no final.

 **Tipo**: Algoritmo Simples <br>
 **Estabilidade**: Algoritmo instável <br>
 **Ordenação**: Ordenação Interna <br>
 **Complexidade Qualquer Caso**: O(N²) <br>

 ### Passo a passo da ordenação.
 - Massa de dados está desordenada
 ```
Resultado: [5, 3, 2, 4, 7]
 ```
<br>

- Define-se a posição onde o elemento de menor valor será inserido: ``array[0]`` <br> ``Posição a ser preenchida: 0``.
- Define um elemento inicial a ser definido como o elemento de menor valor: ``array[0]`` <br> ``Elemento de menor valor: 5``.
- Define o elemento inicial a ser comparado com o ``5(Elemento de menor valor)``: ``array[1]`` <br> ``Elemento a ser comparado: 3``.
 ```
Posição a ser preenchida: 0
Elemento de menor valor: 5
Elemento a ser comparado: 3
Array: [5, 3, 2, 4, 7]
 ```

<br>

- Compara se o ``3(Elemento a ser comparado)`` é menor que o ``5(Elemento de menor valor)``
- Neste caso a comparação é VERDADEIRA então o elemento de menor valor passa a ser o ``3(Elemento a ser comparado)``
- Define o próximo elemento a ser comparado com o ``3(Elemento de menor valor)``: ``array[2]`` <br> ``Elemento a ser comparado: 2``.
- 
 ```
Posição a ser preenchida: 0
Elemento de menor valor: 3
Elemento a ser comparado: 2
Array: [5, 3, 2, 4, 7]
 ```

<br>

- Compara se o ``2(Elemento a ser comparado)`` é menor que o ``3(Elemento de menor valor)``
- Neste caso a comparação é VERDADEIRA então o elemento de menor valor passa a ser o ``2(Elemento a ser comparado)``
- Define o próximo elemento a ser comparado com o ``2(Elemento de menor valor)``: ``array[3]`` <br> ``Elemento a ser comparado: 4``.
- 
 ```
Posição a ser preenchida: 0
Elemento de menor valor: 2
Elemento a ser comparado: 4
Array: [5, 3, 2, 4, 7]
 ```

<br>

- Compara se o ``4(Elemento a ser comparado)`` é menor que o ``2(Elemento de menor valor)``
- Neste caso a comparação é FALSA então nada acontece.
- Define o próximo elemento a ser comparado com o ``2(Elemento de menor valor)``: ``array[4]`` <br> ``Elemento a ser comparado: 7``.
- 
 ```
Posição a ser preenchida: 0
Elemento de menor valor: 2
Elemento a ser comparado: 7
Array: [5, 3, 2, 4, 7]
 ```

<br>

- Compara se o ``7(Elemento a ser comparado)`` é menor que o ``2(Elemento de menor valor)``
- Neste caso a comparação é FALSA então nada acontece.
- Como não há mais elementos da massa de dados a serem comparados, o ``2(Elemento de menor valor)`` troca de posição com o ``5(Elemento na posição a ser preenchida)``
- 
 ```
Resultado: [2, 3, 5, 4, 7]
 ```

<br>

- Define-se a posição onde o elemento de menor valor será inserido: ``array[1]`` <br> ``Posição a ser preenchida: 1``.
- Define um elemento inicial a ser usado como o elemento de menor valor: ``array[1]`` <br> ``Elemento de menor valor: 3``.
- Define o elemento inicial a ser comparado com o ``3(Elemento de menor valor)``: ``array[2]`` <br> ``Elemento a ser comparado: 5``.
 ```
Posição a ser preenchida: 1
Elemento de menor valor: 3
Elemento a ser comparado: 5
Array: [2, 3, 5, 4, 7]
 ```

<br>

- Compara se o ``5(Elemento a ser comparado)`` é menor que o ``3(Elemento de menor valor)``
- Neste caso a comparação é FALSA então nada acontece.
- Define o próximo elemento a ser comparado com o ``3(Elemento de menor valor)``: ``array[3]`` <br> ``Elemento a ser comparado: 4``.
- 
 ```
Posição a ser preenchida: 1
Elemento de menor valor: 3
Elemento a ser comparado: 4
Array: [2, 3, 5, 4, 7]
 ```

<br>

- Compara se o ``4(Elemento a ser comparado)`` é menor que o ``3(Elemento de menor valor)``
- Neste caso a comparação é FALSA então nada acontece.
- Define o próximo elemento a ser comparado com o ``3(Elemento de menor valor)``: ``array[4]`` <br> ``Elemento a ser comparado: 7``.
- 
 ```
Posição a ser preenchida: 1
Elemento de menor valor: 3
Elemento a ser comparado: 7
Array: [2, 3, 5, 4, 7]
 ```

<br>

- Compara se o ``7(Elemento a ser comparado)`` é menor que o ``3(Elemento de menor valor)``
- Neste caso a comparação é FALSA então nada acontece.
- Como não há mais elementos da massa de dados a serem comparados, e o ``3(Elemento de menor valor)`` já está na posição a ser preenchida nada acontece.
- 
 ```
Resultado: [2, 3, 5, 4, 7]
 ```

<br>

- Define-se a posição onde o elemento de menor valor será inserido: ``array[2]`` <br> ``Posição a ser preenchida: 2``.
- Define um elemento inicial a ser utilizado como o elemento de menor valor: ``array[2]`` <br> ``Elemento de menor valor: 5``.
- Define o elemento inicial a ser comparado com o ``5(Elemento de menor valor)``: ``array[3]`` <br> ``Elemento a ser comparado: 4``.
 ```
Posição a ser preenchida: 2
Elemento de menor valor: 5
Elemento a ser comparado: 4
Array: [2, 3, 5, 4, 7]
 ```

<br>

- Compara se o ``4(Elemento a ser comparado)`` é menor que o ``4(Elemento de menor valor)``
- Neste caso a comparação é VERDADEIRA então o elemento de menor valor passa a ser o ``4(Elemento a ser comparado)``
- Define o próximo elemento a ser comparado com o ``4(Elemento de menor valor)``: ``array[4]`` <br> ``Elemento a ser comparado: 7``.
- 
 ```
Posição a ser preenchida: 2
Elemento de menor valor: 4
Elemento a ser comparado: 7
Array: [2, 3, 5, 4, 7]
 ```

<br>

- Compara se o ``7(Elemento a ser comparado)`` é menor que o ``4(Elemento de menor valor)``
- Neste caso a comparação é FALSA então nada acontece.
- Como não há mais elementos da massa de dados a serem comparados, o ``4(Elemento de menor valor)`` troca de posição com o ``5(Elemento na posição a ser preenchida)``
- 
 ```
Resultado: [2, 3, 4, 5, 7]
 ```

 <br>

- Define-se a posição onde o elemento de menor valor será inserido: ``array[3]`` <br> ``Posição a ser preenchida: 3``.
- Define um elemento inicial a ser utilizado como o elemento de menor valor: ``array[3]`` <br> ``Elemento de menor valor: 5``.
- Define o elemento inicial a ser comparado com o ``5(Elemento de menor valor)``: ``array[4]`` <br> ``Elemento a ser comparado: 7``.
 ```
Posição a ser preenchida: 3
Elemento de menor valor: 5
Elemento a ser comparado: 7
Array: [2, 3, 4, 5, 7]
 ```

<br>

- Compara se o ``7(Elemento a ser comparado)`` é menor que o ``5(Elemento de menor valor)``
- Neste caso a comparação é FALSA então nada acontece.
- Como não há mais elementos da massa de dados a serem comparados, e o ``5(Elemento de menor valor)`` já está na posição a ser preenchida nada acontece.
- Como não há mais posições na massa de dados a serem comparadas, chega-se ao resultado final.

 ```
Resultado Final: [2, 3, 4, 5, 7]
 ```

 ## Implementação
- [Implementação em JAVA](www.google.com)

### Pseudo Código
```
procedure selectionSort(var a: array[integer]; n: integer);
var i:integer;
var j:integer;
var min:integer;
var aux:integer;

begin
  for i = 1 to n - 1 do
  begin
    min = i;
    for j = i + 1 to n  do
    begin
      if a[j] < a [min]
      then
        min = j;
    end;
    aux = a[min];
    a[min] = a[i];
    a[i] = aux;
  end;
end
```

<br><br><br><br>