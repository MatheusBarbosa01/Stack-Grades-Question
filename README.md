# Stack-Grades-Question
Um aplicativo de notas precisa armazenar as notas do usuário em ordem cronológica
inversa, para que as notas mais recentes apareçam primeiro. Implemente uma solução
em Java que utilize pilhas para armazenar as notas e exibi-las em ordem inversa.

Foi criado uma classe de pilha genérica com a lógica LIFO(Last in First out), usando os seguinte Métodos: pop(remover o primeiro da pilha, no caso o ultimo da lista que foi criada), push(adiciona o item, e conforme vai adicionado, vai indo para o final da pilha), top(exibe o topo da pilha, no caso o último item da lista), is Empty(é um booleano que afirma se a pilha está vazia ou com algum item),size(retorna o tamanho da pilha). É tambem criado um metodo To String para sobrescrever o que já existe, retornando a lista ao contrário para printar em formato de pilha.

Foi criado uma classe estudantes para retornar suas notas aplicando o conceito de pilha para retornar as notas na ordem inversa.
