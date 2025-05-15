# 📦 Projeto FullStack com Spring Boot HTML e Javascript 

Este projeto é uma aplicação **backend** desenvolvida com **Spring Boot (Java)**, utilizando uma arquitetura em camadas, seguindo boas práticas de desenvolvimento e preparada para comunicação com um **frontend navegável** via **API REST**.

📚 Funcionalidades (Backend)
- API REST com endpoints para apenas exibir entidades. /api/v1/product
- Integração com banco PostgreSQL usando JPA.
- Retorno de dados paginados com suporte a filtros de ate 100 items por pagina.
- Separação de responsabilidades por camadas.
- Comunicação com frontend via requisições HTTP.

📂 Estrutura de Páginas (Frontend)
- Listar dados paginados com botões para voltar e avançar nas paginas.
- GET via requisições REST.
- Interface simples de uso para testes e demonstração.
- O frontend foi desenvolvido com HTML/JS puro.

## 🚀 Tecnologias Utilizadas

### Backend (Java 17 + Spring Boot 3.4.5)

- **Spring Web** – Para desenvolvimento da API REST.
- **Spring Data JPA** – Para integração com o banco de dados e acesso a dados via repositórios.
- **Lombok** – Para reduzir o boilerplate com geração automática de getters, setters, construtores etc.
- **Spring DevTools** – Para facilitar o desenvolvimento com hot reload.
- **Driver PostgreSQL** – Para integração com banco de dados PostgreSQL.
- **Maven** – Para gerenciamento de dependências e build do projeto.
- **Empacotamento JAR** – Projeto configurado para gerar um `.jar` executável.

### Frontend

- Interface navegável para consumo da API REST.
- Comunicação via requisições HTTP (GET, POST, PUT, DELETE) com o backend.
- Permite testar e navegar pelas funcionalidades expostas pela API.

## 🛠️ Como Executar

### Pré-requisitos

- Java 17
- Maven
- PostgreSQL (com base de dados configurada)

### Passos para execução

```bash
# Clone o repositório
git clone https://github.com/seuusuario/seurepositorio.git
cd seurepositorio
./mvnw spring-boot:run
````

Configure o arquivo application.properties:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

- Compile e execute o projeto:
  
Acesse a API no navegador ou via ferramentas como Postman:

http://localhost:8080/api/v1/product 
- retorno dos dados via JSON 

```
http://localhost:8080/index.html
- Pagina para exibição e navegação dos dados da API. 
```
