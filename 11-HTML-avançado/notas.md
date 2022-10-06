# HTML AVANÇADO

Indice:

- SEO Onpage
- Boas Práticas de Acessibilidade
- Segurança
- PWA
- Web Components

## SEO Onpage

- Não confudir com ONEPAGE;
- Não tem relação com colocar palavras-chave no código (meta name="keywords"), isso não se usa mais. Era usado para interpretar a relevância dos sites, mas isso fazia que os desenvolvedores colocasse palavras chaves irrelevantes para o usuário.
- Diferente do outbound (panfleto, telemarketing), oferece a explicação e conteúdo e depois oferece o produto.
- Há tanto o Onpage quanto o Offpage;
O Onpage é o que está no site;
- O Offpage é o que está fora, como o que os outros sites falam de você, onde é citado.
- Se falam de seu site em outros sites de boa relevância, sua relevâcia sobe, se estiver em sites de baixa relevância, seu site cai.
- Há empresas que colocam o nome da concorrência em sites de baixa relevância para que eles caiam.

### Principais ítens:

- URL Amigável
- Meta Title
- Meta description
- Site Map
- Título da página
- Conteúdo de texto

### Check list

- **Título da página**
- Não tem limite de caracteres, mas não exagere, é o < h1>.

- **Meta title/SEO title**
- Não é o título da página;
- Também é o título da aba;
- Deve ter no máximo 70 caracteres;
- Tag < title> dentro do < head>.

- **Meta description**
- Deve conter o resumo da página;
- Usa-se call to Action (Verbo no imperativo);
- Deve ter no máximo 160 caracte;
- < meta name="description" content="XPTO">.

- **URL Amigável**
- Incluir palavras chaves sem caracteres especiais;
- Separar por hífen.

- **Sitemap**
- Arquivo XML com todas as páginas do site;
- Facilita para que não seja preciso esperar o Crawler do Google encontrar o site para ser analisado, você manda direto para o servidor. A partir disso o Google já começa analisar para definir o posicionamento.

- **Imagens**
- Coloque texto ALT e descrição da imagem;
- Sempre salve com nome otimizado, nunca com nome aleatório;
- < img src="camisa-polo-azul.jpg" alt="camisa azul gola polo">;
- Opcionalmente, você pode colocar um title na sua imagem para quando o usuário passar o mouse.

- **Campos únicos**
- São os dados relacionados ao SEO, como o meta title;
- Não devem ser copiados de outras empresas;
Não devem ser copiados de outras partes do seu site.

- **Conteúdo**
- Ser original;
- Ter qualidade;
- Ser relevante.

- **Hiperlinks**
- Use, quando possível, links para outras páginas suas que corrobore com o texto e crie interatividade;
- Neste caso, são os links que vão para páginas, que muitas vezes explicam algum ponto abordado.

- **Intertítulos** < h2>
- Facilita a leitura d texto;
- Organiza o conteúdo.

- **Outros pontos**
- Mobile-friendliness;
- Velocidade de carregamento;
- Legibilidade (Fácil leitura);
- Inexistência de erros;
- Segurança;

## Boas Práticas de Acessibilidade

- Visa aumentar a facilidade de acesso ao site ou software web.
- Precisa pensar de forma que todos possam acessar o conteúdo.

- Aplicações acessíveis independente de capacidade auditivas, visuais, físicas ou cognitivas;
- Deve ser acessível por teclado, mouse, touch screen, comando de voz.

- **Sites seguros do ponto de vista de saúde:**
- Sem cores não pensadas;
- Sem telas piscantes que prejudicam epiléticos;
- Sem item que podem causar dor de cabeça.

## Segurança

I. **SSL/TLC**

- Protocolo de Camada de Sockets Segura (Secure Sockets Layer);
- Há também o TLS (Segurança de Camada de Transporte/Transport Layer Security);
- Alguns consideram o SSL depreciado e sugerem o uso do TLS;
- É um protocolo criptografado que permite ter mais segurança de comunicação para acessar um ambiente virtual como páginas web ou e-mail;
- Os dados são criptografados, impossibilitando outras pessoas de utilizar;
- Geralmente o usuário pode escolher em usar sem o protocolo de segurança (http) ou com (https);
- A instalação é feita normalmente através do servidor contratado, alguns oferecem versões pagas e gratuitas;
- No WordPress há plugins para esta funcionalidade.

II. **CORS**

- Cross-origin Resource sharing ou compartilhamento de recursos de origem cruzada ou origens diferentes;
- É um mecanismo que usa cabeçalhos adicionais HTTP para permitir que um WebApp seja executado numa origem/domínio com permissão para acessar recursos pré-selecionados de um outro servidor;
- Executa requisição Cross-origin HTTP ao solicitar um recurso de origem diferente, podendo ser domínio ou protocolo ou porta diferente da origem;
- Pode ocorrer nos testes que utilizamos recursos em portas diferentes: <http://localhost:3000/> e <http://localhost:3001/>;
- Ou usar recursos de outros domínios dentro do nosso WebApp, como imagens que estão no nosso domínio.

**Possíveis erros:**

- Erros mais comuns são com as requisições Javascript que utilizam XMLHttpRequest ou Fetch APIs;
- XMLHttpRequest são objetos usados para interagir entre servidores, indo desde obtenção/recuperação de dados dentro de uma URL até atualização completa de dados;
Aetch APIs são interfaces para buscar recursos, usada para acessar e manipular pipeline HTML, com request e reponses objects.
- Erros de CSS Shapes
- Erros de carregamento de imagens

**Algumas Soluções:**

- Geralmente os problemas são causados por falta de header.
- Há a opção também de fazer esta configuração no servidor web (Exemplo Apache).
- A forma de usar depende da ferramenta que está usando, se for Express, a documentação é: <http://expressjs.com/en/resources/middleware/cors.html>

III. **CSP**

- Content Security Policy, ou Politica de Segurança de Conteúdo.
- É uma camada adicional de segurança, visando detectar e amenizar alguns tipo de ataque, como injeção de dados e Cross Site Scripting/XSS.
- Geralmente estes ataques baseiam-se em ir em algum formulário e inserir Javascript para obter alguma vantagem, como roubo de dados ou distribuição de malware.
- Para habilitar, usamos a seguinte linha no < head>

        <meta http-equiv="Content-Security-Policy" content="default-src'self';img-src https://* child-src'none';">

- Guia completo: <https://content-security-policy.com>

IV. **OWASP Top 10**

- Open Web Application Security Project, ou Projeto Aberto de Segurança em Aplicações Web.
- É um documento de conscientização para segurança de sites e aplicações web.
- Aponta as principais falhas de segurança, apontados por vários especialistas de vários lugares.
- Tem também o OWASP Top 10 de controles preventivos.
<https://owasp.org/www-project-top-ten/>

## PWA

### **Progressive Web App**

- É basicamente uma págia web, ou seja, um site com cara de app.
- Pode ser desenvolvido para se comportar como um app nativo.
- Se o browser não suportar um recurso, só não irá ter o recurso, mas o resto funciona.
- Instalar ou não a escolha é do usuário.
- Usado por Twitch, Facebook, Twiter, e Uber, por exemplo.

### **Vantagens**

- Poucas alterações de fonte.
- Permite o uso de HTML/CSS/Javascript.
- Acesso à API's como câmera, microfone e localização.
- Aplicações leves.
- Envio de notificação push.
- Pode ser usado offline.
- Multiplataforma.

### **Desvantagens**

- Não fica disponível nas lojas do sistema operacional.
- Se a aplicação for pesada, pode ficar lenta.
- Acesso limitado ou inexistente á alguns recursos.
- Pode funcionar de forma diferente em sistemas diferentes.

### **serviceWorker**

- Instalação do serviceWorker:

        npm install serviceworker

- Inclusão do serviceWorker:

        <script>
            if('serviceWorker' in navigator){
                navigator.serviceWorker.register('generate-sw.js');
            }
        </script>

### **Cache**

**O Service Worker possui então as seguintes etapas:**

- Install: Ativado só uma vez, se alterar, é chamado novamente.
- Activate: Chamado só uma vez, quando uma nova versão do sw.js é instalada e se não tiver outra versão sendo executada. É aqui onde deleta as antigas.
- Fetch: Usado toda vez que a página é requisitada.
- message
- sync
- push

### **Manifest**

Criar arquivo manifest.json:

- Exemplos:

    <https://app-manifest.firebaseapp.com/>
    <https://www.simicart.com/manifest-generator.html>

- Criar ícone (é sugerido 512px por 512px)

### **App Shell**

É o mínimo de HTML, CSS e Javascript que alimenta uma interface de usuário.

Entre as premissas, estão:

- Carregamento rápido
- Ter armazenamento em cache
- Ter exibição dinâmica de conteúdo

A arquitetura do app shell leva em consideração os seguintes pontos:

- Priorização do carregamento inicial, ou seja, o service worker armazenará cache dos itens básicos para economizar tempo de carregamento.
- Carregamento assíncrono visando já montar de forma rápida o aplicativo. Uso de cache é bem-vindo.
- Usar ferramentas confiáveis de gerenciamento de conteúdo estático para armazenar e atualizar cahce.

## Web Components
