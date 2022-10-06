# CSS Avançado

## Aula 01 - Boas Vindas

- Processadores CSS
- SASS
- Pós CSS
- Componentes Estilizados
- Módulos CSS
- Web Components
- Google Mobile

## Aula 02 - Apresentação do Curso

- Pré-processadores CSS, como SASS e LESS
- Variáveis, Loopings, Funções e operações para pré-processadores CSS
- PostCSS
- Shadow DOM
- Styled Components
- CSS Modules

## Aula 03 - Processadores CSS

### Introdução

- O Cascadind Style Sheets (CSS) é uma "folha de estilo" composta por "camadas" e utilizada para definir apresentação (aparência) em páginas da internet que adotam no seu desenvolvimento linguagens de marcação (como XML, HTML e XHTML).

### Pré-processadores CSS

- CSS não possui dinamismo e alguns recursos de Ruby, Python ou JavaScript.
- A falta de dinamismo deixa nosso código estenso e repetitivo.
- Existem linguagens intermediárias, os pré-processadores, que adcionam recursos para criar estilos com menos código.
- São interpretadores de código.
- Permitem gerar CSS a partir de um arquivo de outra sintaxe, conforme o pré-processador utilizado.
- Leem todo código gerado e convertem para CSS(podendo ser minificado, se assim estiver definido).
- Possuem funcionalidades que não existe no CSS puro, como herança por exemplo.
- Bons exemplos são:
    1. LESS
    2. Sass
    3. Stylus
- São semmelhantes, logo vale a pena analisar que agrada mais ou atende melhor uma demanda.

### Vantagens

- Maioria permite a criação de Variáveis, Condicionais, Repetição, Imports/Extends, Funções e Mixins.
- Facilitam a manutenção do código.
Permite um código limpo.
- Códigos CSS flexíveis e reutilizáveis.
- Linguagem/estrutura de melhor entendimento para pessoas.

### Desvantagens

- Aumento de complexidade em relação ao CSS puro.
- Devido a este aumento de complexidade, aumenta também a chance de desempenho.

## LESS

- É um pré-processador de CSS.
- Amplia a capacidade do CSS e compila mais rápido que outros pré-processadores.
- É baseado em JavaScript (Não precisa conhecer a linguagem).
- Reduz a redundância de código.
- É usado por vária empresas e frameworks, como o Bootstrap.
- Permite o uso de variáveis, funções, cálculos e hierarquias.
- Site: <https://lesscss.org/>
- Instalção no NodeJs:

    npm install less

Obs.: Funciona também sem a necessidade de instalação.

### Arquivo HTML

    <link rel="stylesheet/less" type="text/css" href="styles.css"/>

- A parte importante do link é o stylesheet/less onde faz a definição do processamento.
- href="style.css"=> pode ser também href="styles.less"

### Variáveis

- usa o @
Exemplo: @cor
- Ao invés de utilizar um determinado valor, você usa a variável criada.
- Facilita a mudança de propriedades do CSS de forma mais dinâmica e rápida.

### Hierarquia

- Pode ser usada de forma mais intuitiva, colocando um dentro do outro:

    p {
        color: @cor;
        b{
            color: @cor2;
        }
    }

### Função

- Permite a manipulação de valores a partir de uma lista de funções predefinidas pelo LESS.
- Permite tranformar um valor noutro, manipular condicionais, fazer cálculos, etc
- Site: <https://lesscss.org/functions>

### Mixins

- Usado quando há ítens iguais em mais de um seletor e acaba usando a mesma estrutura de função.
- É como criar "function" dentro do CSS, com passagem ou não de parâmentros.
- Possibilita uso de valores padrão.
- Evita repetições.

### Condições/if

- Pode ser usado para fazer alguma condição de cores:

    & when (@color =") {
        color: darkgreen;
    } else {
        color: @color;
    }

### Math

- Ao fazer uma configuração, a definição de um estilo, você pode fazer cálculos para definir padrões/proporcionalidades.
- Funciona também com cores.
- Opções: + - * /
- Devido às versões do less, em algumas o / não funciona a não ser que force o ./ que está obsoleto atualmente.

## Aula 04 - SASS

- Sass é uma extensão de CSS que empodera o CSS básico.
- É um pré-processador de CSS, assim como o less.
- Permite o uso de variável, funções, cálculos e hierarquia.
- É uma Gem do Ruby, ou seja, uma biblioteca escrita em Ruby.
- [Site](https://sass-lang.com)
- Exemplos de conversores online:
    1. <https://jsonformatter.org/sass-to-css-converter>
    2. <https://codebeautyfy.org/sass-to-css-converter>
- Plug-in Live Sass Compiler para VSCode.
- Para variável se usa $ e não o @, conforme outras linguagens.
- Permite usar os formatos .sass e .scss.
    1. .scss é mais parecido com a sintaxe de CSS e LESS.

        $cor:red;
        .item{
            color:$cor;
        }

    2. .sass é mais parecido com a sintaxe do Pug, ou seja, sem abertura e fechamento de chaves.

        $cor:red;
            .item
                color:$cor;

- Para funções, usamos o @mixin para a declaração

        @mixin fundoP($color) {
            background-color:$color;
        }

- Na chamada usamos o @include

        .tipo {
            @include fundoP($cor);
        }

### Import

- É possível fazer o uso de imports:
    1. @use 'base';
    2. @import 'base'; /*este está em desuso*/
- Ao contrário das importações de CSS simples, que exigem que o navegador faça várias solicitações HTTP à medida que renderiza sua página, aqui importa tudo de uma vez, visto que irá se tornar só um arquivo CSS.

### Operadores/Math

        <, <=, >, >=, == e != para comparações.
        +, -, *, / para números.
        + para concatenar strings.

**- Exemplos:**

        => 1 + 2 * 3 == 1 + (2 * 3) // true
        => true or false and false == true or (false and false) // true

### Remover aspas de uma string

- \#{$variável + 1}
- Cria uma string sem aspas
- Se for usar como número, pode não funcionar, pois apesar de parecer um número não é.
- Se for para transformar em número, use $number * 1px.

### Repetição/For/Looping

- Exemplo:

    $cor:red;

    @for $i from 1 through 3 {
        $nome: 'tipo' + $i;
        #{nome} {
            background-color: lighten($cor, $i * 5%);
        }
    }

## Aula 05 - Pós CSS

## Aula 06 - Componentes Estilizados

## Aula 07 - Módulos CSS

## Aula 08 - Web Components

## Aula 09 - Google Mobile
