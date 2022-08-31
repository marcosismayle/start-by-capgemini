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

### **Fluxo HTTP**

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
