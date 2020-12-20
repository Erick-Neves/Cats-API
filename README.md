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
	2. <img align="center" width="700" src="https://i.imgur.com/bQ60yKR.jpg"/>

4. Abra um terminal dentro desta pasta.
	1. Uma das formas de fazer isso, é apagar todo o conteúdo do caminho da pasta, e digitar "cmd"
	2. <img align="center" width="700" src="https://i.imgur.com/f0HLcfs.png"/>
	3. <img align="center" width="700" src="https://i.imgur.com/hmIirdN.png"/>
	4. <img align="center" width="700" src="https://i.imgur.com/yzDBbjq.jpg"/>
	
5. Agora devemos buildar nossa aplicação dentro do Docker:  
	1. No terminal, verifique se existe algum container ativo com o comando: docker ps
	2. <img align="center" width="700" src="https://i.imgur.com/6je1BE9.jpg"/>
	3. Utilize o comando para buildar: docker-compose up -d --build 	
	4. <img align="center" width="700" src="https://i.imgur.com/7cUet3r.jpg"/>
	5. Verifique se o container está ativo com o comando: docker ps
	6. <img align="center" width="700" src="https://i.imgur.com/YjlIDeE.jpg"/>
	7. Agora copie o 'CONTAINER ID' de catapi_cat-api.
	8. Cole o 'CONTAINER ID' no comando: docker logs -f 'CONTAINER ID'
	9. <img align="center" width="700" src="https://i.imgur.com/ETD27uP.jpg"/>
	10. Quando aparecer "JVM running for 15.473", use o atalho CTRL+C duas vezes, para voltar a usar o terminal.
	11. <img align="center" width="700" src="https://i.imgur.com/MN7uizP.jpg"/>
	12. Para popular nosso banco, utilize o comando: docker exec -i catapi_db_1 mysql -uroot -p"rootadmin" db_catapi < db_catapi.sql
	13. <img align="center" width="700" src="https://i.imgur.com/Wtj77Rn.jpg"/>
6. Agora devemos consumir nossa API via Postman:
	1. Com a aplicação rodando no docker, podemos acessar a documentação do projeto pelo link: http://localhost:9000/swagger-ui.html#/
	2. Abra o Postman, e importe a collection que está dentro da pasta "../Cats-API/Documentação"
	3. Escolha alguma das requisições para fazer os testes.
	4. <img align="center" width="700" src="https://i.imgur.com/i7LIH6y.jpg"/>


