# FUNDAMENTOS DO HTML5

## Módulo III

Professor: Ricardo

### Aula 01 - Boas Vindas

Sumário:

- História do HTML
- Estrutura básica
- Tags Estruturais
- Textos e Cabeçalhos
- Links
- Listas
- Tabelas, mesas e outros

### Aula 02 - História do HTML

HTML é uma linguagem de marcação que surgiu junto ao HTTP e é usada para criação de páginas da web.

Foi Criado em 1991 por Tim Berners-Lee, cientista e pesquisador do CERN na Suíça. Inicialmente foi projetado para compartilhar informações com mais facilidade entre instituições de pesquisas.

- É o padrão para linguagens de marcação
- É a linguagem de marcação padrão para criação de web pages
- Descreve a estrutura de uma página na web
- Consiste em vários elementos
- Esses elementos dizem ao navegador como mostrar o conteúdo

### Aula 03 - Estrutura Básica

#### ***Elemento***

Um elemento começa com uma tag inicial, um conteúdo e uma tag final:

        <tagname> "Aqui é o conteúdo..." </tagname>

Um elemento HTML pode estar contido em outro elemento HTML. Todo documento html é um elemento alojado em outro.

Há também elementos vazios, ou seja que não possuem um conteúdo. Por exemplo a tag < br>, que é um elemento vazio sem uma tag de fechamento.

#### ***Tags***

Uma lista de tags pode ser encontrado no site da [W3Schools](https://www.w3schools.com/tags/default.asp).

#### ***Atributos***

Um atributo HTML fornece mais informações sobre um elemento HTML.

- Todos os elementos podem ter atributos
- Atributos são sempre especificados na tag inicial
- Usualmente seguem o tamplate: nome="atributo"

***Exemplo:***

**O atributo lang:**

É um atributo obrigatório usado na tag < html>, que serve para declarar o idioma usado na página.

        <!DOCTYPE html>
        <html lang="pt-br">
        <body>
        ...
        </body>
        </html>

***Observações:***

- Apesar de não ser uma norma, é aconselhado sempre usar letras minúsculas para atributos.
- Sempre usar aspas nos valores dos atributas, duplas ou simples.
- Uma [lista completa de atributos](https://www.w3schools.com/tags/ref_attributes.asp) pode ser encontrado no site da W3Schools.

#### ***Estrutura de um documento HTML***

        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Documento</title>
        </head>
        <body>
            Olá, Mundo!
        </body>
        </html>

#### ***Validador***

Um documento HTML pode ser verificado por um [validador](https://validator.w3.org/) para garantir que não possue erros.

### Aula 04 - Tags Estruturais

#### ***Tags semânticas***

        <main>
        <header>
        <footer>
        <section>
        <article>
        <nav>
        <aside>

#### ***Tags genéricas***

        <div>
        <span>

### Aula 05 - Textos, Cabeçalhos

#### ***Titulos e subtitulos:***

Títulos e subtitulos são defidos com as tags: h1, h2, h3, h4, h5, h6. A tag < h1> define o título mais importante e a tag < h6> define o título menos importante.

Mecanismos de busca usam as informações contidas nas tags de título para indexar a estrutura de uma página na web.

#### ***Parágrafos:***

Parágrafos sempre iniciam em uma nova linha, e geralmente são um bloco de texto.

Um parágrafo é definido pelo elemento < p>Parágrafo</ p>.

Navegadores normalmente não interpretam espaços e linhas adicionados ao documento HTML, para isso é necessário o uso de tags específicas para essa função.

#### ***Horizontal Rules:***

A tag < hr> é usada para adicionar uma divisão temática separando o conteúdo numa página HTML.

#### ***Quebra de linha:***

A quebra de linha é definida pela tag < br>. É usada para iniciar em uma nova linha, sem necessáriamente iniciar um novo parágrafo.

#### ***O elemento < pre>***

Para que o navegador reconheça quebras de linha em um bloco de texto sema utilização da tag < br>.

***Exemplo:***

        <pre>
            My Bonnie lies over the ocean.
            My Bonnie lies over the sea.
            My Bonnie lies over the ocean.
            Oh, bring back my Bonnie to me.
        </pre>

### Aula 06 - Links

Links são refeências de um documento a outro documento. São encontrados em quase todas as páginas da web. Links HTML são Hyperlinks.

#### **Sintaxe**

A tag ***< a>*** define um hyperlink.

        <a href="url">Texto do link</a>

O atributo ***href*** indica o destino do link.

O texto do link é o que ficará visível ao usuário.

Ao clicar no texto do link, o leitor será enviado para o endereço URL em questão.

Por padrão, os links em todos os navegadores aparecerão da seguinte forma:

- Um link que ainda não foi acessado é azul e sublinhado;
- Um link acessado é roxo e sublinhado;
- Um link ativo é vermelho e sublinhado.

#### **O atributo target**

Por padrão o link acionado será aberto na mesma aba. Para mudar isso é necessário especificar outro caminho para o link.

O atributo ***target*** especifica onde o link será aberto e pode ter os seguites valores:

- ***_self*** - É o padrão. abre na mesma aba em que foi clicado;
- ***_blaket*** - Abre o documento em uma nova janela ou aba;
- ***_parent*** - Abre o documento no quadro pai;
- ***_top*** - Abre o documento em todo o corpo da janela.

#### **URLs absolutas X URLs relativas**

URL absoluta é o endereço completo da página enquanto a URL relativa não possui o "https://www" e geralmete é usada para links no mesmo website.

***Exemplo:***

        <h2>Absolute URL</h2>
        <p><a href="https://www.google.com/">Google</a></p>

        <h2>Relative URLs</h2>
        <p><a href="html_images.asp">HTML Images</a></p>
        <p><a href="/css/default.asp">CSS Tutorial</a></p>

#### **Usando uma imagem como link**

Para usar uma imagem como link basta inserir a tag ***< img>*** dentro da tag ***< a>***:

***Exemplo:***

        <a href="default.asp">
        <img src="smiley.gif" alt="HTML tutorial" style="width:42px;height:42px;">
        </a>

#### **Link para um email**

Use ***mailto:*** dentro do atributo ***href*** para criar um link que abre uma aplicação de envio de email para enviar um novo email para o endereço mostrado.

***Exemplo:***

        <a href="mailto:alguem@exemplo.com">Enviar email</a>

#### **Um botão como link**

Para usar um botão HTML como um link é necessário adicionar um código JavaScript para esta função:

***Exemplo:***

        <button onclick="document.location='default.asp'">HTML Tutorial</button>

#### **Títulos para um link

O atributo ***title*** fornece mais informação sobre um link ao passar o ponteiro do mouse sobre ele.

***Exemplo:***

        <a href="https://www.w3schools.com/html/" title="Go to W3Schools HTML section">Visit our HTML Tutorial</a>

### Aula 07 - Listas

### Aula 08 - Tabelas, Mesas e outros

### Aula 09 - Tipos de Arquivos

### Aula 10 - Form

### Aula 11 - Input

### Aula 12 - Select

### Aula 13 - Button

### Aula 14 - Outros Campos

***Fontes:***

- *[HTML - InfoEscola](https://www.infoescola.com/informatica/html/)*
- *[HTML Tutorial - W3schools](https://www.w3schools.com/html/default.asp)*
