# Árvore
<img src="https://miro.medium.com/max/594/1*Lnf6-lCybTBlRFzfQktuVA.png">

<br><br>

- Conjunto finito de elementos denominados nós, possuindo uma relação de hierarquia entre eles.
- Assim como as listas lineares, etruturas de dados do tipo àrvore podem ser implementadas através de arranjos(vetores) ou através de ponteiros.

<br><br>

# Como implementar árvores?
- Usando ponteiros, um dos campos armazenará o valor da chave e os outros serão ponteiros para outros nós.

# Definições
- **Raiz de uma folha**: Existe um nó especial chamado raiz, os demais são particionados em estruturas disjuntas chamadas sub-ásvores.
- **Nó folha**: Um nó que não possui decendestes próprios é chamado de nó folha, ou sejam um nó folha é aquele com o grau nulo.
- **No Interno**: Nó que não é folha.
- **Nós filhos e Pais**: São as raízes das sub-árvores de um nó e este é o pai delas.
- **Nós irmãos e Avô**: São os nós filhos que apresentam o mesmo pai.
- **Grau de nó**: Número de filhos de um nó.
- **Grau de árvore**: Valor máximo entre os graus de seus nós.
- **Caminho na árvore**: Sequencia de nós distintos v2, v2, ..., vK, tal que existe sempre estre nós consecutivos (insto é, entre v1 e v2, ebtre v2, ..., vK-1 e vk) a relação 'é filho de' ou  'é pai de'.
- **Comprimento do caminho**: Um caminho que passa por vk vértices é obtido pela sequencia de k - 1 pares. O valor de k - 1 é o comprimento do caminho.
- **Nível de um nó**: É o número de nós do caminho da raiz até o nó (raiz tem nível 1).
- **Altura de um nó**: Número de nós no maio caminho do nó até um de seus descendentes (Folhas têm altura 1).
- **Altura da árvore**: Máximo altura de seus nós.