<h1 align="center">Welcome to resilia-desafio-backend 👋</h1>
<p>
  <a href="https://twitter.com/Sousa.Mardoqueu" target="_blank">
    <img alt="Twitter: Sousa.Mardoqueu" src="https://img.shields.io/twitter/follow/Sousa.Mardoqueu.svg?style=social" />
  </a>
</p>

> API REST para um sistema de gestão de turmas onde o cliente pode gerenciar informações de aulas e alunos.

## Projeto de sistema de gestão de turmas

Este projeto consiste em um sistema de gestão de turmas onde o cliente pode gerenciar informações de aulas e alunos. O cliente pode cadastrar turmas com nome, curso, data de início e data de encerramento, além de cadastrar alunos com nome, CPF e e-mail. Também é possível matricular um aluno em uma única turma.

O projeto utiliza o padrão de API REST (HTTP/JSON) e foi desenvolvido em Java, utilizando o framework Spring Boot. 

O diagrama ER da modelagem do banco de dados está disponível no diretório do projeto.

Foram desenvolvidos testes com JUnit 5, Mockito e Spring Boot para garantir a qualidade do código e das funcionalidades implementadas.

## Como rodar o projeto

Clone o repositório em sua máquina local:

Abra o projeto em sua IDE de preferência.

Execute o comando mvn clean install na raiz do projeto para instalar as dependências e compilar o código.

Inicie o servidor com o comando mvn spring-boot:run.

Acesse a documentação da API no endereço http://localhost:8080/

Utilize ferramentas como o Postman para testar as funcionalidades da API.

Importante: é necessário ter o Java 11 e o Maven instalados em sua máquina para executar o projeto. Certifique-se de que as portas utilizadas pela aplicação (8080) estão disponíveis em seu sistema.

## Endpoints disponíveis:

-POST /turmas: cadastra uma nova turma no sistema.

-POST /alunos: cadastra um novo aluno no sistema.

-POST /matriculas: matricula um aluno em uma turma.

-GET /turmas: lista todas as turmas cadastradas no sistema.

-GET /alunos: lista todos os alunos cadastrados no sistema.

-GET /turmas/{id}: exibe os detalhes de uma turma específica.

-GET /alunos/{id}: exibe os detalhes de um aluno específico.

## Teste dos Endpoints:

![image](https://user-images.githubusercontent.com/11077068/219143621-cfb01b35-2f7a-45bc-99b9-c8c034bc2443.png)

![image](https://user-images.githubusercontent.com/11077068/219143699-7881d7cb-391f-4090-942e-ffeb1450200b.png)

![image](https://user-images.githubusercontent.com/11077068/219143779-f56aed16-4af0-4735-865e-7a1c72a82c25.png)

![image](https://user-images.githubusercontent.com/11077068/219143836-92fc81e2-8d53-4417-b727-f2e03cdcc534.png)

![image](https://user-images.githubusercontent.com/11077068/219143898-990626ba-d82a-41e5-8e21-8e2ef52ec470.png)

## Testes com JUnit 5 Mockito e Spring Boot (REST APIs):

![image](https://user-images.githubusercontent.com/11077068/219146263-fb466201-b340-4529-9c71-7911fafe6482.png)


## Author

👤 **Mardoqueu Sousa**

* Website: https://mardoqueu.vercel.app/
* Twitter: [@Sousa.Mardoqueu](https://twitter.com/Sousa.Mardoqueu)
* Github: [@mardoqueu](https://github.com/mardoqueu)
* LinkedIn: [@mardoqueu-sousa](https://linkedin.com/in/mardoqueu-sousa)

## Show your support

Give a ⭐️ if this project helped you!

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_
