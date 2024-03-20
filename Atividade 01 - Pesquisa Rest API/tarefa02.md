# Definição

Primeiramente, é importante definir o que significa o termo API (Application Programming Interface). Basicamente, API é uma forma de comunicação entre sistemas. Ela permite a troca de informações entre dois componentes de software, sendo essa troca de informações definidas por um conjunto de definições e protocolos, que estes irão definir como serão as solicitações e respostas que irão ocorrer durante essa troca.

O termo REST (Representational State Transfer) seria o conjunto de restrições de arquitetura. No momento que há uma solicitação do lado do cliente, a API transfere uma representação do estado atual do recurso ao cliente. A informação trocada é entregue por meio do protocolo HTTP, e pode ser em formatos variados, como JSON, XML, HTML, etc.

## HTTP

O protocolo HTTP (Hypertext Transfer Protocol) é um conjunto de regras que vão definir a comunicação na web. Ele é baseado no modelo cliente servidor, em que um cliente faz as requisições para um servidor, e o servidor responde com dados, páginas ou qualquer outro recurso solicitado e disponível. Ao usar HTTP, existem métodos padrões utilizados para fazer as requisições, e que são nomeados por meio de verbos, como GET, PUT, DELETE, PATCH, etc. Esses métodos são apenas padrões de nomenclatura para operações comuns, por exemplo, o GET é utilizado quando o cliente deseja obter informações. O HTTP também utiliza códigos para sinalizar os status das requisições, como por exemplo, se a solicitação não teve problema e o servidor respondeu corretamente, então é devolvido o status de 200. Ou temos o 403, quando o cliente solicita informação que ele não está autorizado a ver.

## Características do Rest API:

Dentro do REST API, algumas das características importantes que vale destacar:

1 - A forma de se acessar a algum recurso é por meio de endpoints, que basicamente é um endereço que permite o cliente poder fazer uma requisição diretamente a esse endereço, pedindo algo baseado no método escolhido.

2 - Para cada requisição, o servidor não mantém o estado delas, ou seja, as novas requisições não dependem de requisições anteriores para serem processadas. (stateless client)

3 - Para acessar os recursos, é utilizado o protocolo HTTP, mantendo um padrão de comunicação e facilitando para o lado do liente

4 - Possui arquitetura cliente servidor, como mencionado, há o cliente fazendo requisição de um lado, e do outro lado temos um servidor que recebe a requisição, processa e devolve a informação (ou faz operação de alteração de estado como delete, put, post), de acordo com o que o cliente pedir.

5 - O principail, o REST é um padrão, ou seja, ele é uma das formas de comunicação mais utilizados na WEB atualmente, e soluciona diversos problemas pela sua simplicidade e clareza. Como é um padrão, facilita também a comunicação entre os desenvolvedores ao buscar soluções para seus problemas.
