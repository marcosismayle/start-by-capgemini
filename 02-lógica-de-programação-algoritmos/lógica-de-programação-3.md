# Lógica de Programação e Algorítmos 3

Instrutor: Márcio

## Aula 1 - Boas Vindas

- Boas Vindas e apresentação do Instrutor.

## Aula 2 - Apresentação do Conteúdo

### Introdução ao treinamento e plano de ensino

    1. Linguagem JAVA
        1.1. Conhecendo sua ferramenta de desenvolvimento (NetBeans)
        1.2. Diferenção entre Portugol e JAVA
        1.3. Comentários
        1.4. Comandos de entrada e saída
        1.5. Variáveis, tipos e operadores
        1.6. Estruturas condicionais
            1.6.1. Estrutura if
            1.6.2. Estrutura switch
            1.6.3. Exercícios estruturas condicionais I
            1.6.4. Exercícios estruturas condicionais II
        1.7. Estruturas de Repetição
            1.7.1. Estrutura while
            1.7.2. Estrutura for
            1.7.3. Exercícios estruturas de repetição I
            1.7.4. Exercícios estruturas de repetição II
            1.7.5. Exercícios estruturas de repetição III
        1.8. Orientação a objetos
        1.9. Classes
        1.10. Métodos
        1.11. Objetos
        1.12. Modificadores de acesso
        1.13. Métodos construtores
        1.14. Herança
        1.15. Exercícios JAVA
        1.16. Exercícios OO
    2. Interfaces gráficas utilizando o SWING
        2.1. Criando uma tela
        2.2. Paleta de componentes
            2.2.1. Componentes
            2.2.2. Propriedades
            2.2.3. Eventos (Programação orientada a eventos)
        2.3. Árvore de componentes
        2.4. Detalhes importantes
        2.5. Exercícios (Criando uma tela de login)
    3. Iniciando um projeto
        3.1. Definição de um projeto básico
            3.1.1. Requisitos do projeto
            3.1.2. Regras de negócio
            3.1.3. Definição da tecnologia
    4. Especificando o projeto
        4.1. Criando as tabelas da aplicação
        4.2. Protótipo de interfase
    5. Iniciando a codificação
        5.1. Finalizando a criação das classes do modelo
        5.2. Criação da conexão com o Banco de Dados
        5.3. Criação dos Controladores
        5.4. Construção da interfase gráfica
        5.5. Implementando a tela de cadastro de projetos
        5.6. Implementando a tela de cadastro de tarefas
        5.7. Carregando a lista de projetos
        5.8. Implementando o model da lista de tarefas
        5.9. Finalizando as funcionalidades básicas
        5.10. Customizações na interface
        5.11. Validações
        5.12. Alternativas de implementação
        5.13. Rodando a aplicação em modo debug
        5.14. Resultado obtido e considerações finais

## Aula 3 - Instalação de Ferramentas

## 🐧 LINUX

### 🔺 Instalação OpenJDK

**O OpenJDK (Kit de Desenvolvimento Java Aberto)** é uma  implementação gratuita e de código aberto da linguagem de programação  Java.  A implementação está licenciada sob a GNU General Public License  (GPL) com uma exceção de vinculação. **JDK = JRE + JVM**

🔸 1. Abra o terminal e vamos verificar se temos o Java instalado:

    java -version

🔸 2. Para instalar o openJDK-11, digite no terminal:

    sudo apt-get install openjdk-11-jdk

*A versão mais atual LTS é do Java 11, que terá seu suporte  estendido até Setembro de 2022. Este tipo de suporte iniciou no Java 8  que será mantido até 2023.*

🔸 3.Confirme se realmente foi instalado com sucesso:

    java -version

🔸4. Vamos configurar o ambiente JAVA_HOME:

​4.1. Verificar o caminho da instalação do Java:

    sudo update-alternatives --config java

4.2. Copie o caminho que aparecerá no terminal, no meu caso:

    /usr/lib/jvm/java-11-openjdk-amd64/bin/java

4.3. Vamos editar o arquivo .bashrc:

    sudo gedit ~/.bashrc

4.4. Copie o código abaixo e cole no final do arquivo .bashrc.

***IMPORTANTE**: cuidado para não alterar nada no arquivo além de apenas colar no final do mesmo o que vou te disponibilizar a seguir.*

​*JAVA_HOME = aqui você coloca o caminho do tópico 4.2, tirando o /bin/java*

    JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
    export JAVA_HOME
    export PATH=$PATH:$JAVA_HOME

4.3. Salve o arquivo

​4.4. Vamos conferir se a alteração ficou salva:

    cat ~/.bashrc

🔸5. Feche o terminal e abra novamente

🔸6. Vamos conferir mais uma vez se o Java está instalado na nossa máquina

    java --version

### 🔺 Instalação Eclipse

🔸 1. Entre no site oficial do Eclipse Foundation e faça o download:

<https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-06/R/eclipse-inst-jre-linux64.tar.gz>

*O site já identifica o sistema operacional.*

🔸 2. Descompacte a pasta

🔸 3. Procure o arquivo eclipse-inst e execute

🔸 4. Escolha segunda a opção: Eclipse IDE for Enterprise Java and Web Developers

🔸 5. Clique no folder da primeira opção e selecione o JDK que instalamos na nossa máquina.

🔸 6. Mantenha as opções "create start menu entry" e "create desktop shortcut"

🔸 7. Install

🔸 8. Accept now

🔸 9. Launch

🔸 10. Pronto, intalação concluída!

### 🔺 Instalação IntelliJ IDEA Community

🔸 1. Entre no site ofical do intellij:

<https://www.jetbrains.com/idea/download/#section=windows>

🔸 2. Escolha a opção Community e faça o download

🔸 3. Descompacte a pasta e vamos para o terminal

🔸 4. Abra o terminal (Ctrl + Alt +  t) e entre no diretório que você descompactou

    cd Downloads/IdealC

🔸 5. Entre na pasta bin

    cd bin

🔸 6. Execute o arquivo de instalação idea.sh

    ./idea.sh

### 🔺 Instalação Git

🔸 1. Abra o terminal (Ctrl + Alt + t) e vamos verificar se temos o git instalado:

    git --version

🔸 2. Execute o comando:

    sudo apt-get install git-all

🔸 3. Confirme novamente se o git realmente está instalado:

    git --version

🔸 4. Vamos começar as configurações iniciais:

​4.1. Cofigurar o nome de usuário

    git config --global user.name "Seu nome"

4.2. Configurar o endereço de e-mail:
​
    git config --global user.email seuemail@email.br

*É de suma importância que o ENDEREÇO DE E-MAIL SEJA O MESMO DO GITHUB afim de evitar conflitos!*
​
4.3. Vamos conferir a lista de configurações:

    git config --list

🔸 5. Pronto, git instalado e configurado com sucesso!

## 🪟 WINDOWS

### 🔺 Instalação JDK Zulu

Aqui no windows, vamos fazer o download do **OpenJDK Zulu**.
*As compilações do Azul Zulu do OpenJDK são compilações de código aberto, testadas pelo TCK e certificadas do OpenJDK. O Zulu Blue está disponível para uma ampla variedade de plataformas de hardware e sistemas operacionais. A documentação do Azul Zulu inclui notas de lançamento, um guia de instalação e licenças de terceiros.*

🔹 1. Entre no <https://www.azul.com/downloads/?package=jdk>

🔹 2. Faça o download do arquivo .zip do JDK 11.0.11+9. No meu caso, o x86 64-bit

🔹 3. Vá no drive C://Arquivo de Programas

🔹 4. Caso não tenha um diretório com o nome Java, crie

🔹 5. Entre neste diretório e descompacte o download do zip JDK Zulu 11.0.11+9 neste diretório

🔹 6. Vamos configurar o ambiente JAVA_HOME:

​6.1. Menu iniciar -> Editar as varáveis de ambiente do sistema

6.2. Irá abrir a janela Propriedades do Sistema, escolha a aba Avançado, em seguida clique em variáveis de Ambiente

​6.3. Na janela Variáveis de Ambiente,  crie uma nova variável de sistema

​6.4. Abrirá uma jabela: Nova Variável de Sistema.

​6.5. Nome da variável: JAVA_HOME

​6.6. Valor da variável: em seguida OK.

​*O valor da variável é o caminho do diretório que você descompactou o zip JDK Zulu 11.0.11+9 no passo 5*

6.7. Na mesma janela Variáveis do Sistema, localize a variável Path, selecione e clique a opção Editar...

​6.8. Clique na opção Novo e cole o mesmo caminho do passo 5 acrescentando \bin

6.9. Continue com o path selecionado e clique na opção Mover para Cima até chegar no topo

🔹 7. Pronto, finalizada a configuração. Próximo passo é conferir se está instalado tudo certinho

🔹 8. Abra o Prompt de Comando: Menu iniciar -> cmd

🔹 9. Vamos conferir mais uma vez se o Java está instalado na nossa máquina

    java -version

### 🔺 Instalação Eclipse - Windows

🔹 1. Acessar o site oficial do Eclipse:

<https://www.eclipse.org/downloads/>

🔹 2. Fazer o download do instalador

🔹 3. Escolha segunda a opção: Eclipse IDE for Enterprise Java and Web Developers.
Link de download para Windows:
<https://www.eclipse.org/downloads/packages/">

🔹 4. Clique no folder da primeira opção (Java 11 + VM) e selecione o JDK que instalamos na nossa máquina

🔹 5. Mantenha as opções "create start menu entry" e "create desktop shortcut"

🔹 6. Install

🔹 7. Accept now

🔹 8. Launch

🔹 9. Pronto, intalação concluída

### 🔺 Instalação IntelliJ IDEA Community - Windows

🔹 1. Entre no site ofical do Intellij:

<https://www.jetbrains.com/idea/download/#section=windows>

🔹 2. Escolha a opção Community e faça o download

🔹 3. Siga com next

🔹 4. Na opção Installation Options, deixe selecionado as opções:

4.1. 64-bit launcher (caso seu sistema seja 64-bit, caso não, selecione 32-bit)

4.2. Add "Open Folder as Project"

4.3. .java - .groovy - .kt - .kts

4.4. Add lauchers dir to the PATH

4.5. Next

🔹 5. Install

🔹 6. Para finalizar a instalação, escolha a opção reebot later

🔹7. Com o IntelliJ já instalado, vamos iniciar:

​7.1 Aceite os termos: I confirm that I have... >> Confirm

7.2 Data Sharing >> Send Anonymous Statistics

🔹8. IDE pronta para uso!

### 🔺 Instalação Git - Windows

🔹 1. Entre no site ofical do GIT:

<https://git-scm.com/downloads>

🔹 2. Escolha a opção Windows e o instalador será baixado automáticamente

🔹 3. Mantenha as opções pré selecionadas e siga com Next

🔹 4. Install

🔹 5. Antes de finaizar a instalação, selecione a opção Lauch Git Bash

🔹 6. Ao finalizar o passo 5, irá abrir o Git Bash

🔹 7. Agora vamos fazer as configurações iniciais:

🔹 8. Confirme se o git realmente está instalado:

    git --version

🔹 9. Vamos começar as configurações iniciais:

​9.1. Configurar o nome de usuário

    git config --global user.name "Seu nome"

9.2. Configurar o endereço de e-mail:

    git config --global user.email seuemail@email.br

*É de suma importância que o ENDEREÇO DE E-MAIL SEJA O MESMO DO GITHUB afim de evitar conflitos!*

​9.3. Vamos conferir a lista de configurações:

    git config --list

🔹 10. Pronto, git instalado e configurado com sucesso!
