### <h1>Cats-API</h1>

## Descrição

Para a solução do teste, escolhi a linguagem Java com framework Springboot.
Na aplicação busquei simplicidade na codificação.
Utilizei de injeção de dependências via dump/backup do Mysql, e posteriormente será restaurado em um container em execução. 

### Pontos relevantes

1. Os endpoints da aplicação tem CRUD completo, embora tenha sido solicitado apenas as requisições de GET.
2. Na URI temos três contextos:
	1. '/racas' - acessa as raças e suas informações.
	2. '/chapeu' - retorna as três imagens de gato com chapéu.
	3. '/oculos' - retorna as três imagens de gato com óculos.

## O que vamos precisar?

* Docker Desktop(para buildar os containers)
* Postman(para consumir API)
* Git(para clonar o projeto)

## Como executar a aplicação?

1. Clone o repositório em seu diretório local.
	1. Utilize o comando: git clone https://github.com/Erick-Neves/Cats-API.git

2. Abra o Docker Desktop para inicializa-lo.

3. Na pasta do projeto navegue até o diretório que contem o docker-compose.yml
	1. ../Cats-API/catapideploy/catapi
	2. <img align="center" src="https://i.imgur.com/bQ60yKR.jpg"/>

4. Abra um terminal dentro desta pasta.
	1. Uma das formas de fazer isso, é apagar todo o conteúdo do caminho da pasta, e digitar "cmd"
	2. <img align="center" width="350" src="https://i.imgur.com/f0HLcfs.png"/>
	3. <img align="center" width="350" src="https://i.imgur.com/hmIirdN.png"/>
	4. <img align="center" width="350" src="https://i.imgur.com/yzDBbjq.jpg"/>
	
5. Agora devemos buildar nossa aplicação dentro do Docker:
	1. No terminal, verifique se existe algum container ativo com o comando: docker ps
	2. 
