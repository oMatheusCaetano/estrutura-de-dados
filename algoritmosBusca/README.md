# Contextualização
- Em muitas aplicaçoes com vetores, é comum que precisemos em algum momento, ordenar e também pesquisar determinado valor entre os elementos do vetor.

- A pesquisa consiste na verificação da existência de um determinado valor dentro de um vetor, e, em caso afirmativo da posição da ocorrência. Veremos dois métodos de pesquisa bastante difundidos: **Pesquisa Sequencial** e **Pesquisa Binária**.

<br><br>

# Busca Sequencial

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/Linear-Search.png">


<br><br>

- A pesquisa sequencial, ou linear, é o método utilizado para encontrar um elemento particular em um vetor não classificado. isto é, cujos elementos não estão ordenados segundo qualquer critério.

- Esta técnica consiste em comparar sequencialmente, cada chave do vetor com um certo valor procurado, até que seja encontrado ou seja atingido o final do vetor sem sucesso.

- **Problema**: Buscar pelo valor V em um conjunto de N elementos. O procedimento retorna o valor da posição da list sequencial se encontrar e N caso contrário.

**Complexidade**: O(N)

## Implementação
- [Busca Sequencial: Implementação em JAVA]()

# Busca Binária

<img src="https://res.cloudinary.com/practicaldev/image/fetch/s--Uj818KRw--/c_imagga_scale,f_auto,fl_progressive,h_420,q_auto,w_1000/https://dev-to-uploads.s3.amazonaws.com/i/5hsod7t93v85b23rk671.png">


<br><br>
- **A lista precisa estar ordenada para realizar a busca**.
- Busca baseada em dividir para conquistar.
- Divide um conjunto de elementos em duas partes
- Determina a qual dessas duas partes a chave pertence e se concentra nessa parte.

- **Problema**: Buscar um valor V não existente em uma lista sequencial ordenada com N elementos.

**Complexidade Qualquer Caso**: O(log N)

## Implementação
- [Busca Sequencial: Implementação em JAVA]()

