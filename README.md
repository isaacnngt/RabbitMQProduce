# 🚀 RabbitMQ Projeto simples 

Este projeto é um serviço de produção de mensagens utilizando RabbitMQ, desenvolvido com Spring Boot e Java 17. O serviço demonstra a implementação de um sistema de mensageria robusto e escalável.


# 🛠 Tecnologias Utilizadas

-   Java 17
-   Spring Boot
-   RabbitMQ
-   Docker
-   Maven
-   Postman (para testes)

## 📋 Pré-requisitos

-   Java 17 instalado
-   Docker e Docker Compose instalados
-   Maven instalado
-   Postman (para testes das APIs)

## 🚀 Como Executar

1. Subindo o RabbitMQ com Docker
```
Abrir o local do projeto que está o arquivo "docker-compose-yml" e rodar o comando:
# docker-compose up
```
2. Acessando a Interface do RabbitMQ
-   URL: [http://localhost:15672](http://localhost:15672)
-   Usuário: `guest`
-   Senha: `guest`

3. Compilando e Executando a Aplicação
```
# Compilar o projeto 
- mvn clean install 
# Executar a aplicação 
- mvn spring-boot:run
```

## 🔍 Estrutura do Projeto

```
src/ 
├── main/
│ 	├── java/
│ 	│	└── com/
│ 	│ 		└── producer/
│ 	│ 			├── config/ 
│ 	│ 			│ 	└── RabbitMQConfig.java 
│ 	│ 			├── controller/ 
│ 	│ 			│ 	└── MessageController.java 
│ 	│ 			└── service/ 
│ 	│ 				└── MessageService.java 
│ 	└── resources/ 
│ 		└── application.yml (properties)
```

## 🌐 Endpoints da API

POST /api/message 
Content-Type:  application/json 
{ 
"message":  "Sua mensagem aqui" 
}

## 📝 Configurações do RabbitMQ

As configurações do RabbitMQ podem ser encontradas no arquivo `application.yml`


# 🐋 Docker Compose

Para facilitar o deploy, você pode usar o Docker Compose presente no projeto.

`docker-compose up -d`


## 🧪 Testando com Postman

-   Abra o Postman
-   Crie uma nova requisição POST para `http://localhost:8080/produces`
-   Configure o header `Content-Type: application/json`
-   No body, adicione:
`{ 
"message":  "Teste de mensagem" 
}`

## 📫 Monitoramento

Para monitorar as mensagens e filas:

1.  Acesse o RabbitMQ Management em [http://localhost:15672](http://localhost:15672)
2.  Faça login com guest/guest
3.  Navegue até a aba "Queu

## 🤝 Contribuindo

Sinta-se à vontade para contribuir com o projeto.!

## 📝 Licença

Isaac C. Nunes
