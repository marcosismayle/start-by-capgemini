# FUNDAMENTOS DO HTML5

## Módulo II

Professor: Ricardo

### Aula 01 - Boas Vindas

Temas abordados:

- Hospedagem e servidores

- Tipos de servidores

- Como fazer uma hospedagem

- Hospedagem na nuvem

### Aula 02 – Hospedagem e Servidores

#### **Servidor**

- Um servidor pode ser qualquer computador registrado a um DNS, mas não é muito eficiente. Para isso temos os data centers, com sistema de computação centralizado que fornece serviços a uma rede de computadores, chamada de cliente.

#### **Data center**

- Data center é uma instalação física usada para hospedar aplicativos e dados essenciais. Os principais componentes de um data center incluem roteadores, switches, firewalls, sistemas de armazendamento, servidores e controladores de disponibilização de aplicativos.

#### **Hospedagem**

- É um serviço que permite armazenamento de dados de site e aplicativos em um servidor. Ao contratar um serviço de hospedagens estamos contratando a infraestrutura de um data center, com seus servidores, rotedadores, refrigeração e etc.

#### **Conteúdo estático x conteúdo dinâmico**

- Conteúdo estático é basicamente um arquivo que já existe no servidor, como vídeos, imagens e textos, já o conteúdo dinâmico é gerado por uma aplicação e entregue ao usuário pelo servidor web.

#### **Servidor web – Como funciona**

- Servidor web ou *Web Server* refere-se a uma máquina ou software, ou ambos trabalhando juntos.

    ![Esquema Servidor Web](/assets/images/servidor-web.jpg)

- Como hardware, é um computador que armazena arquivos que compoem um site e os entrega para o dispositivo do usuário.

- Como software, um servidor web possui componentes que controlam como um usuário acessa arquivos hospedados.

### Aula 03 – Tipos de servidores

#### **Servidor compartilhado**

- É utilizado por uma rede de usuários compartilhando os mesmos recursos de uma máquina.

![Servidor Compartilhado](/assets/images/servidor-compartilhado.jpg)

#### **Servidor dedicado**

- É um servidor físico exclusivo para um determinado usuário, ou seja não compartilha recursos com outro clientes.

![Servidor Dedicado](/assets/images/servidor-dedicado.jpg)

#### **VPS – Servidores virtualmente privados**

- É um servidor virtual privado, *virtual private server*. Oferece uma máquina virtual privada separada de outras estâcias

![Servidores Virtualmente Privados](/assets/images/vps.jpg)

### Aula 04 – Principais softwares de servidores web

#### **Apache**

- É o servidor web livre criado em 1995 por um grupo de desenvolvedores da NCSA, tendo como base o servidor web NCSA HTTPd criado por Rob McCool.

#### **NGiNX**

- Nginx é um servidor leve de HTTP, proxy reverso, proxy de e-mail IMAP/POP3, feito por Igor Sysoev em 2005, sob licença BSD-like 2-clause. O Nginx consome menos memória que o Apache, pois lida com requisições Web do tipo “event-based web server”

- Muito usado para entrega de conteúdo estático e como cache de outros servidores.

#### **Microsoft IIS**

- IIS é um servidor web criado pela Microsoft para seus sistemas operacionais para servidores. Sua primeira versão foi introduzida com o Windows NT Server versão 4, e passou por várias atualizações. É também o sucessor do PWS.

#### **Node + express**

- Não é exatamente um servidor, mas ao usar o Node junto com o framework Express é possível criar um servidor.

### Aula 05 – Containers

#### **Virtual machine x Container**

- Containers são geralmente medido em megabites, contêm a aplicação e os recurso necessários para roda-la, e também podem ser usados para empacotar funções individuais para realizar tarefas específicas (microsserviços). São mais leves e possuem sistema operacional compartilhado.

- Máquinas virtuais possuem seu próprio sistema operacional e possibilidade a utilização de muito mais recursos que um container. São medidas em gigabites.

#### **Serveless**

- É um modelo de desenvolvimento nativo na *nuvem* para criação e execução de aplicações sem o gereciamento de servidores. Os servidores ainda são necessários mas não abrange o desenvolvimento sendo gereciado por um provedor de núvem, como a AWS.

***Fontes:***

- *[Servidor - Wekipedia](https://pt.wikipedia.org/wiki/Servidor)*
- *[O que é um data center - Cisco](https://www.cisco.com/c/pt_br/solutions/data-center-virtualization/what-is-a-data-center.html)*

- *[O que é um servidor web (web server)? - Mozilla](https://developer.mozilla.org/pt-BR/docs/Learn/Common_questions/What_is_a_web_server)*

- *[Containers e máquinas virtuais (VMs) - RedHat](https://www.redhat.com/pt-br/topics/containers/containers-vs-vms)*

- *[O que é serverless? - RedHat](https://www.redhat.com/pt-br/topics/cloud-native-apps/what-is-serverless)*
