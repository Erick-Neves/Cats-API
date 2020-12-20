### Cats-API

## Descrição

Para a solução do teste, escolhi a linguagem Java com framework Springboot.
Na aplicação busquei simplicidade na codificação.
Utilizei de injeção de dependências via dump/backup do Mysql, e posteriormente será restaurado em um container em execução. 

### Pontos relevantes

1. Os endpoints da aplicação tem CRUD completo, embora tenha sido solicitado apenas as requisições de GET.
2. Na URI temos três contextos:
	1.'/racas' - acessa as raças e suas informações.
	2.'/chapeu' - retorna as três imagens de gato com chapéu.
	3.'/oculos' - retorna as três imagens de gato com óculos.

## O que vamos precisar?

*Docker desktop(para buildar os containers)
*Postman(para consumir API)
*Git(para clonar o projeto)

## Como executar a aplicação?

1. Clone o repositório em seu diretório local.
	1. Utilize o comando: git clone https://github.com/Erick-Neves/Cats-API.git

2. Abra o Docker Desktop para inicializa-lo.

3. Na pasta do projeto navegue até o diretório que contem o docker-compose.yml
	1. Teste_API\Cats-API\catapideploy\catapi
<img align="center" src="https://i.imgur.com/bQ60yKR.jpg"/>
