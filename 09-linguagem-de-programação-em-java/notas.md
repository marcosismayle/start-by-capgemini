# Linguagem de Programação em JAVA

## Aula 01 - Boas Vindas

Índice:

- Interfaces
- Construtores
- Enumeradores
- Modificadores
- Matriz
- Cobranças
- Tópicos Avançados
- Genéricos
- Anotações
- Fios
- Laços
- Trabalhando com Dados
- Persistência de dados
- Exceções e controle de erros
- Considerações Finais

## Aula 02 - Interfaces

- É um recurso muito utilizado em linguagens de programação
- Tem o objetivo de "obrigar" um determinado grupo de classes a ter métodos ou propriedades em comum
- Métodos podem ser implementados em cada classe de uma maneira diferente
- Dentro da interface existem somente assinaturas de métodos e propriedades, cabendo à classe que a utilizará realizar a implementação as assinaturas, dando comportamentos práticos aos métodos.
- Ao contrário da herança que limita uma classe a herdar somente uma classe pai por vez, é possível ter classes implementando varias interfaces ao mesmo tempo.

## Aula 03 - Construtores

- Todas as classes devem ter ao menos um construtor
- link a parte externa da classe com a parte interna

## Aula 04 - Enumeradores

## Aula 05 - Modificadores

- Exitem quatro tipos de modificadores de acesso:
Private > default > protected > puplic

- São padrões de visibilidade de acessos a classes e membros de uma classe (métodos);
- Determinam se uma classe pode usar uma outra, ivocando um determinado atributo ou um determinado método.
- Há dois níveis de modificadores de acesso
**- Nível superior:**
    1. Aplicados a **classes**;
    2. São os seguintes modificadores:
        2.1. **public**; e
        2.2. **default**;
            2.2.1. Sem modificador explícito;

**- Nível de membro:**
    1. Aplicados a:
        1.1. **Atributos**;  e
        1.2. **Métodos**;
    2. São os seguintes modificadores:
        2.1. **private**;
        2.2. **public**;
        2.3. **protected**;
        2.4. **default**;
            2.4.1. Sem modificador explícito.

**- *public***
É o modificador menos restritivo de todos. Permite que qualquer outra parte da sua aplicação tenha acesso ao componente marcado como public.

**- *protected***
Os membros das classes marcados com protected podem ser acessíveis por classes e interfaces dentro do mesmo pacote e por classes derivadas mesmo que estejam em pacotes diferentes.

**- *default***
O modificador de acesso padrão, também conhecido como acessibilidade de pacote é o marcador atribuídos aos membros da classe que não foram marcados explicidamente com um outro modificador de acesso. Membros com acessibilidade de pacote só podem ser acessados por outras classes ou interfaces definidas dentro do mesmo pacote.

**- *private***
É o mais restritivo. Todo membro de uma classe marcada com esse modificador só é acessível para a própria classe. Não importa a localização dentro de pacotes ou se a classe foi herdada ou não, um membro private só é acessível dentro da mesma classe em que ele foi declarado.

## Aula 06 - Matriz

## Aula 07 - Cobranças

### Collections

Uma coleção é uma estrutura de dados que permite armazenar objetos.

Em Java, a coleção também é um objeto.

As operações que podem ser feitas em coleção variam mas normalmenteincluem:

- Adição de elementos
- Remoção de elementos
- Acesso aos elementos
- Pesquisa de elementos

### Arraylist

Arraylist não é um array.

Um **array** é um vetor de objetos  ou tipos primitivos, possui um tamanho fixo informado no momento em que é utilizado.

Um **ArrayList** é uma implementação da interface List, outra implementação desta interface é o LinkedList, como o nome sugere, são implementações de um tipo de dado conhecido como lista

## Aula 08 - Tópicos Avançados

### Classes Wrapper

Classes Wrapper possuem métodos púplicos disponíveis na subclasse Object.
Por exemplo: o método **equals**(Object) usamos para comparações, enquanto o **toString** possibilita imprimir o conteúdo de um objeto em formato texto.
Classes derivadas da subclasse **Number** possuem vários métodos para devolverem um tipo primitivo, tais como: **byteValue()**, **shortValue()**, **intValue**, **longValue()**, **doubleValue()**, **floatValue()**.
Além disso as classes derivadas de number possuem também o método **compareTo**(Objects) que faz comparações entre objetos **wrapper**.

### Vantagens de usar Tipos Primitivos

- Tipos primitivos são bem rápidos
- Consomem pouca memória
- Permitem operações mais complexas
- São bastantes eficientes em laços e expressões

### Boxing-Unboxing / Encaixotamento

- **Autoboxing (wraping automático): é o processo de conversão automático que um computador faz para que um tipo primitivo passe a ser um objeto utilizando uma classe Wrapper.

## Aula 09 - Genéricos

## Aula 10 - Anotações

É um recurso que permite adicionar informações no código fonte.

### Formas de uso no código fonte

- informações para o compilador
- em tempo de execução
- o código-fonte pode utlizar essas informações para compilar o código-fonte (.class) ou Deploy no caso de desenvolvimento web (.war)

As Annotations são precedidas de @Override,@Inherited, @Deprecated, etc.

### Uso de anotações

- Documentação, por exemplo, XDoclet
- Compilação
- IDE
- Estrutura de teste, por exemplo, JUnit
- Recipiente IoC, por exemplo, como Spring
- Serialização, por exemplo, XML
- Programação orientada a aspectos (AOP), por exemplo, Spring AOP
- Servidores de aplicativos, por exemplo, contêiner EJB, serviço da Web
- Mapeamento objeto-relacional (ORM), por exemplo, Hibernate, JPA
- e muito mais...

## Aula 11 - Fios

### Threads

São conjuntos de instruções que podem ser executados dentro de um processo.
Esse conceito permite que as threads sejam executadas de forma paralela, porém, é importante salientar que o programador não tem controle sobre a sequência de execução dos processos, então, não tem como determinar quem vai executar antes ou depois.

## Aula 12 - Laços

## Aula 13 - Trabalhando com Dados

## Aula 14 - Persistência de dados

## Aula 15 - Exceções e controle de erros

## Aula 16 - Considerações Finais
