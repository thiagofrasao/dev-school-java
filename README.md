<h1>Dev School Java (MJV)</h1>

> Status: Desenvolvendo ⚠️

# Sobre o projeto

Projetos realizados no curso Dev School Java da empresa MJV Innovation, ministrado pelo professor Gleyson Sampaio.


# Atividades realizadas: 

## Impressão de cupom

+ Criar objetos que relacionando-se, teremos uma perspectiva de pedido com todas as informações necessárias;
+ Imprimir este pedido no estilo cupom;
+ Gerar Cupom;
+ Criar a classe Endereço com os atributos: logradouro, numero, bairro, cidade e sigla do estado;
+ Formatar os atributos CNPJ, IE. IM e DATA/HORA;
+ Imprimir o cupom.


## Criar uma base de dados com JDBC

+ Fazer um CRUD em Java com Postgres JDBC;
+ Montar a DAO para salvar um registro em Java com Postgres JDBC;
+ Salvar um registro com Java JDBC;
+ Listar registros do banco de dados com Java JDBC;
+ Visualizar os dados;
+ Fazer UPDATE em Java;
+ Fazer uma exclusão em Java.

## Pesquisa e exemplo sobre Coleções (LIST)

+ LIST

  A coleção Lista é uma estrutura de dados homogênea, ou seja, você pode guardar apenas dados do mesmo tipo. Também é uma coleção ordenada, isso significa que os elementos, assim como no vetor, são acessados por posições.

  A lista inicia vazia e seus elementos são alocados por demanda, vai acrescentando e removendo conforme a necessidade. O vetor já é diferente, você já tem que alocá-lo com quantos elementos ele tem.

    No java, o tipo para trabalharmos com listas é o LIST. 

    O LIST não é uma classe e sim uma interface, uma interface é um tipo que define apenas as especificações das operações, pra gente trabalhar com um objeto desse tipo, nós teremos que instanciar esse tipo, porém a interface não pode ser instanciada, nós vamos precisar de uma classe que implemente essa interface. 

    Existem várias classes que implementam a interface List, por exemplo o ArrayList, o LinkedList, dentre outras...

    Vamos escolher a classe ArrayList para apresentar os exemplos por ser uma classe mais otimizada e pega as melhores características tanto do vetor quanto da lista.
  
### Exemplos:

+ Adicionando elementos na lista

  Para você adicionar um elemento é a operação "add", então aqui eu vou colocar qual elemento eu quero adicionar na lista, no caso é uma lista de Strings, eu posso colocar Maria, Alex, Bob e Ana. Para testar se minha lista está ok, eu vou percorrer a lista com ForEach e vou mandar imprimir cada elemento da minha lista. O tipo da lista é String, então vou colocar para cada String x pertencente a minha lista list, eu vou mandar imprimir na tela o valor de x.
  
+ Inserir um elemento na posição 2 da minha lista

  Vamos inserir um elemento entre o Alex e o Bob, quero inserir um novo elemento na posição 2 da minha lista. Eu vou chamar o list.add(2, "MARCO"), vou usar essa sobrecarga que é o add que recebe a posição e depois o elemento.
  
+ Ver o tamanho da lista

  É só chamar a lista.size.
  
+ Remover um elemento da lista

    A lista tem uma operação que é capaz de remover um dado a partir da comparação dele com outro.

    Vamos remover quem estiver na posição 1.  Quem está na posição 1 aqui na minha lista? Alex.

  list.add("Maria");
  list.add("Alex");
  list.add("Marco");
  list.add("Bob");
  list.add("Ana");

  Se eu mandar remover a posição 1, o Alex vai ter que sair da lista.

  list.remove(1);

  Nós ainda podemos remover da lista aqueles elementos que atendam a um predicado, por exemplo, eu quero remover todos os elementos que comecem com a letra M.

  A minha lista é de elementos do tipo String, então eu vou ter que montar um predicado que trabalhe com String, por exemplo, eu posso falar que quero remover todo o String x, tal que x.chatAt(0) == "M".

  list.removeIf(x -> charAt(0) == "M")


+ Encontrar a posição de um elemento

  Agora eu quero encontrar a posição de um elemento. Para encontrar a posição de um elemento eu uso a função Index of.

  System.out.println("Index of Bob: " + list.indexOf("Bob"));

  Alex
  Bob
  Ana

  Index of Bob: 1

  A minha lista agora tem 0, 1, 2 elementos, quem é o Bob? É o que está na posição 1.

  E se eu quiser procurar alguém que não existe na lista?

  System.out.println("Index of Marco: " + list.indexOf("Marco"));

  Index od Marco: -1

  Quando o Index Of não encontra o elemento, ele retorna -1.


+ Deixar na minha lista apenas os elementos que começam com a letra A

  Eu quero filtrar minha lista de modo que fique na lista somente aqueles que tem o nome começado por "A".

  Para eu fazer isso, eu vou ter que declarar uma nova lista, vou chamá-la de result que é o resultado e aqui eu vou colocar um comando pra pegar a minha lista list que é original, filtrar nessa lista somente aqueles elementos que começam com A e devolver pra mim uma nova lista somente com esses elementos.

  Eu vou ter que pegar a minha lista, converter para um tipo Stream, esse tipo Stream, é um tipo especial do Java 8 em diante que aceita operações com expressões lambda. A partir desse stream, eu vou chamar a função filter. O filter recebe um predicado, vou colocar nesse predicado (x -> charAt(0) == "A"). Esse filter vai me devolver um stream filtrado conforme esse predicado, só que esse stream não é compatível com list, eu vou ter que pegar esse stream e converter ele de novo para lista, pra converter ele de novo para a lista, eu vou ter que chamar a função collect e dentro dos parênteses eu vou colocar Collectors.toList());

  Fica um pouco verboso, mas essa foi a solução que o Java 8 conseguiu para manter a compatibilidade com o list, que é um tipo antigo, e permitir que eu possa fazer operações de lambda com o tipo list.

  List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

    

# Atividades em desenvolvimento:

### Tecnologias utilizadas:
<table>
  <tr>
    <td>Java</td>
    <td>Maven</td>
    <td>JDBC</td>
    <td>Eclipse</td>
    <td>Postgres</td>
    <td>Dbeaver</td>
  </tr>
</table>
