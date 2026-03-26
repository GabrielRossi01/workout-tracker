![Imagem](https://drive.google.com/uc?export=view&id=1pVAyAJuby6_YKuOfqatiXvJKWIveepAG)

# 🍃 Back com Spring

Esse é o motor (API RESTful) da aplicação **Workout Tracker**. Ele é responsável por gerir a autenticação de utilizadores, proteger rotas e integrar de forma fluida com a API externa (API Ninjas) para fornecer os dados dos treinos.

## 🎯 Objetivo da aplicação

Garantir uma infraestrutura de backend robusta, segura e escalável, aplicando padrões corporativos de desenvolvimento Java e conteinerização. Além de atuar como um gateway para dados externos, a API garante que as preferências do usuário (como treinos favoritos) sejam salvas com segurança.

## ✨ Funcionalidades

* **Autenticação Segura:** login via JWT protegendo o acesso aos dados.
* **Gateway de Exercícios:** comunicação direta com a API Ninjas para buscar exercícios por grupo muscular.
* **Meus Favoritos:** capacidade de favoritar/desfavoritar treinos, cruzando os dados da API externa com persistência local no banco de dados Oracle, garantindo que cada usuário tenha a sua lista privada de exercícios.

## 🛠️ Tecnologias e Arquitetura

O backend foi desenhado com foco em segurança e performance, utilizando o ecossistema Spring:

* **Core:** Spring Boot 3+ com Java.
* **Persistência de Dados:** Spring Data JPA para ORM, mapeando relacionamentos entre Usuários e Treinos Favoritos.
* Conexão com banco de dados **Oracle**.
* **Flyway** para controle de versão e migração automatizada do banco de dados.
* **Segurança (Spring Security):** Autenticação STATELESS utilizando **Tokens JWT.**
* Criptografia de senhas com `BCryptPasswordEncoder`.
* **Integração Externa:** uso moderno de **HttpExchange / RestClient** para consumo da API Ninjas.
* **Docker Compose:** aplicação utilizando a dependência Docker Compose Support. Orquestração via `compose.yaml`.

## 🚀 Como executar a aplicação

### Pré-requisitos

* Java 17+ instalado.
* Docker instalado.
* API Key da API Ninjas.

### 🚶‍♂️ Passos para clonar e rodar

1. Clone este repositório
```bash
git clone https://github.com/GabrielRossi01/workout-tracker.git
```

2. Acesse a pasta do projeto
```bash
cd workout-tracker
```

3. Configure as variáveis de ambiente e chaves de segurança

* Crie um arquivo `.env` na raiz do projeto e preencha com suas credenciais do banco de dados e chave da API Ninjas.

4. Rode a aplicação -> a API estará disponível na porta 8080
