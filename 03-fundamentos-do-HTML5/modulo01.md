# FUNDAMENTOS DO HTML5

## Módulo I

Professor: Ricardo

### Aula 01 - Boas Vindas

Como funciona a Internet

### Aula 02 - História do www

- O início da internet se deu no período da gerra fria(1945-1991), nesse período havia uma divisão entre bloco socialista e capitalista, liderados respectivamentes pela União Soviética e Estados Unidos.
- Para facilitar a comunicação, temendo ataques soviéticos, o Departamento de Defesa dos Estados Unidos, por meio da **ARPA(*Advenced Research Projects Agency*)** cria um sistema de compartilhamento de informações que ficou conhecido como **ARPAnet(*Advenced Research Projects Agency Network*)**.
- A primeira conexão foi estabelecida pela Universidade da Califórnia e o Instituto de Pesquisa de Stanford em 29 de outubro de 1969.
- Na década de 90 surge a **World Wide Web** o "www" com o desenvolvimento do primeiro navegador pelo ciêntista, físico e professor britânico Tim Berners-lee. Assim surge a rede mundial de computadores, a **Internet**. E ainda nos anos 90 ocorre o fenômeno que ficou conhecido como o **"Boom da internet"** com desenvolvimentos de novos navegadores, sites e redes sociais e a popularização entre usuários comuns.
- [O primeiro website](http://info.cern.ch/) foi desenvolvido pelo **CERN** e ainda está online.

### Aula 03 - HTTP

## **Visão Geral**

**HTTP** é um protocolo que visa a optenção de recursos, como documentos HTML. É um tipo de procolo cliente-servidor, o que significa que as requisições são feitas pelo navegador, ou seja, o destinatário. O **HTTP** é a base de todas as trocas de informações na Web.

**Solicitações:** ou *request*, ou também requisições, são as mensagens enviadas pelo cliente ao servidor.
**Respostas:** ou *responses* são as informações enviadas do servidor ao cliente como resposta a uma *request*.

![Esquema cliente e servidor](/assets/images/simple-client-server.png)

O protocolo **HTTP** foi criado em 1990, ele é extensível e evolui ao longo do tempo. Por ser extensível, além de buscar hipertextos, também é usado para buscar imagens e vídeos ou publicar conteúdo em servidores.

## **Componentes de sistemas baseados em HTTP**

**Proxies:** são entidades que estão entre as solicitações e respostas, que executam diversas operações e atuam como *gateways* ou *caches*, por exemplo.

- **cacheamento** (o cache pode ser púplico ou privado, como o cache dos navegadores).
- **filtragem** (como um scanner de antivírus, controle de acesso, etc).
- **balanceamento de carga** (para permitir que vários servidores possam responder a diferentes requisições).
- **autenticação** (para controlar quem tem acesso aos recursos).
- **autorização** (para controlar quem tem acesso a determinada informação).
- **registro de informação** (permite o armazenamento de informações de histórico).

### **Cliente: o agente-usuário**

**Agente-usuário** é qualquer ferramenta que age em nome do usuário, geralmente o navegador.

O navegador é sempre a entidade que realiza as requisições.

Uma página da web é um documento hipertexto (HTML). Isso significa que algumas partes do documento são links, que conectam a outras páginas, facilmente acessíveis por cliques do mouse, permitindo o usuário a navegar pela a internet.

### **O servidor de páginas web**

Do outro lado do canal de comunicação está o servidor, que fornece as informações requisitadas pelo navegador, podendo ser mais de um dividindo as cargas.

## **Fluxo HTTP**

Passo a passo de comunicação entre um cliente e um servidor.

1. Abre uma conexão TCP;
2. Envia mensagem HTTP:

        GET / HTTP/1.1
        Host: developer.mozilla.org
        Accept-Language: fr

3. Lê a resposta do servidor:

        HTTP/1.1 200 OK
        Date: Sat, 09 Oct 2010 14:28:02 GMT
        Server: Apache
        Last-Modified: Tue, 01 Dec 2009 20:18:22 GMT
        ETag: "51142bc1-7449-479b075b2891b"
        Accept-Ranges: bytes
        Content-Length: 29769
        Content-Type: text/html

        <!DOCTYPE html... (here comes the 29769 bytes of the requested web page)

4. Fecha ou reutiliza a requisição para conexões futuras.

### Aula 04 - Camadas de Internet

## **Estrutura**

Como ilustrado na imagem a informação passa por diversas camadas sendo encapsulada e transferida de um computador a outro pelo processo inverso.

![Esquema estrutural da rede](/assets/images/estrutura-rede.png)

Algumas dessas camadas são:

- **Camada de aplicação** é camada onde o usuário interaje, é composta por um conjunto de aplicativos que necessitam de comunicação com a rede.

- **Camada de transporte** nessa camada é onde age o **TCP/IP** fornecendo uma conexão confiável dos dados, dividindo em pacotes e garantido que eles sejam reconhecidos pelo receptor.

- **Camada datalink** é a parte física como cabos ethernet e redes sem fio.

## **DNS**

O DNS (Domain Name System - Sistema de nome de domínio) converte nomes de domínio legíveis por seres humanos para endereços de IP.

![Esquema DNS](/assets/images/esquema-dns.png)

Todos os computadores conectados a internet, incluido smartphones, tablets e laptops, comunicam-se através de números conhecido como **endereços IP**.

Ao abrir um site não necessitamos lembrar esses números, bastando simplesmente escrever o seu endereço de domínio como www.exemplo.com e o DNS fará conexão com o domínio correspondente.

## **TCP/IP**

**TCP** e **IP** são dois protocolos distintos. IP (Internet Protocol) é o número de identificação de um computador. O **TCP** (Transmission Control Protocol) é responsável pela entrega de dados. Apesar de terem conceitos distintos ambos funcionam sempre juntos. Assim que o números de IP é identificado, uma conexão entre a origem e destino é realizado, os dados são divididos em vários pacotes menores e transmitido por diversos caminho na rede até o destino final. Portando **TCP/IP** é um conjunto de protocolos responsável por identificar endereços IP's, fazer conexão segura entre uma origem e um destino, dividir os pacotes e fazer o transporte.

### Aula 05 - Navegadores

Na camada de aplicação há muitas informações que precisam ser interpretadas, como documentos HTML. A função dos navegadores é basicamente fazer essa interpretação e permite que um usuário consiga navegar por meio de um documento hipertexto.

O primeiro navegador foi criado por Tim Barners-lee em 1990, enquanto trabalhava para a Organização Européia de Pesquisa Nuclear (CERN), na Suiça. Foi batizado de **"WorldWideWeb"**. Era fácil de usar e foi criado para ser usado no computador NeXT.

Durante o grande Boom da internet em 1993, as grandes intituições e empresas privadas perceberam o grande potencial da internet, criando uma grande necessidade de desenvolvimento de programas de computador para acessa-la. Nesse ano nasce o **Mosaic**, criado no Centro Nacional de Aplicações de Supercomputação (NCSA), na Universidade de Illinois, pelo cientista de computação Marc Andreessen.

Em 1994, Andreessen lança para o público o navegador **Netscape**, que foi um grande sucesso, dando o pontapé inicial numa guerra por usuário na internet.

Em 1995 a Microsoft licencia o **Mosaic** e desenvolve seu próprio navegador, o Internet **Explorer**. A netscape trabalharam freneticamente por um oferecer um serviço cada vez melhor e superar a concorrente.

Nessa briga surge o **JavaScript** desenvolvido pela Netscape, que deu um grande poder computacioal para as aplicações web, também nesse período ocorre a implementação da tag *< blink >*. Como resposta a Microsoft cria o **Cascating Style Sheets (CSS)** que se tornou o padrão para design de páginas web.

Momentaneamente o Internet Explorer ganhou a guerra abocanhando 75% do mercado. A Netscape decidiu então deixar o seu código aberto e fundou a organização sem fim lucrativos **Mozilla**, que criou o navegador **Firefox** em 2002. Em 2010, o **Mozilla Firefox** e outros navegadores reduziram a fatia de mercado do internet explorer em 50%.

Entre os anos 90 e 2000 surgiram outros navegadores, como o Opera, o Safari e o Google Chrome. O internet explorer entrou em desuso e foi substituído em 2015 pelo Microsoft Edge com o lançamento do Windows 10.

Atualmente a competição está entre poucos navegadores e os usuário tem dado preferência por acessar a web através de dispositivos móveis, todos os navegadores mais populares possuem versão para Android e iOS.

No futuro a web vai se afastar ainda mais do hipertexto e se tornar ainda mais interativas, e navegadores possívelmente não serão mais como conhecemos hoje e a web será acessada por meio de dispositivos de realidade virtual. Esse futuro não está muito longe.

***Fontes:***

- *[Uma visão Geral do HTTP](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Overview)*
- *[Como a Web funciona](https://developer.mozilla.org/pt-BR/docs/Learn/Getting_started_with_the_web/How_the_Web_works)*
- *[Como a Internet funciona?](https://developer.mozilla.org/pt-BR/docs/Learn/Common_questions/How_does_the_Internet_work)*
- *[O que é o DNS?](https://aws.amazon.com/pt/route53/what-is-dns/#:~:text=O%20sistema%20DNS%20da%20internet,dom%C3%ADnio%20no%20navegador%20da%20web.)*
- *[Protocolo TCP/IP: o que é e como funciona](https://www.hostgator.com.br/blog/o-que-e-protocolo-tcp-ip/)*
- *[A história dos navegadores web](https://www.mozilla.org/pt-BR/firefox/browsers/browser-history/#:~:text=criados%20at%C3%A9%201990.-,Era%20da%20web,a%20internet%20de%20%22WorldWideWeb%22.)*
