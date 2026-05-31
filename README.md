# 🌱 EcoTrack API

API REST desenvolvida em Java com Spring Boot para gerenciamento de ações sustentáveis, usuários e conteúdos educativos voltados para ESG (Environmental, Social and Governance).

---

## Sobre o Projeto

A EcoTrack API foi desenvolvida como projeto acadêmico com foco em sustentabilidade e conscientização ambiental.

A aplicação fornece recursos para gerenciamento de usuários, registro de ações sustentáveis, consulta de dicas ESG e informações climáticas, promovendo práticas alinhadas aos princípios ambientais e sociais.

Além das funcionalidades de negócio, o projeto aplica conceitos modernos de desenvolvimento backend, segurança, persistência de dados e conteinerização.

---

## Objetivo

O objetivo da EcoTrack é incentivar hábitos sustentáveis através de uma plataforma capaz de:

- Gerenciar usuários
- Registrar ações sustentáveis
- Disponibilizar dicas ESG
- Consultar informações climáticas
- Garantir segurança dos dados
- Promover educação ambiental

---

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Oracle Database
- Flyway
- Docker
- Maven
- Spring Boot Actuator
- Git
- GitHub
- Postman
- Insomnia

---

## ⚙️ Funcionalidades

### 👤 Usuários

- Cadastro de usuários
- Consulta de usuários
- Atualização de dados
- Exclusão de usuários

### 🌱 Ações Sustentáveis

- Cadastro de ações sustentáveis
- Consulta por ID
- Listagem de ações
- Consulta de ações por usuário
- Atualização de registros
- Exclusão de ações

### 💡 Dicas ESG

- Listagem de dicas sustentáveis
- Busca por ID
- Filtro por categoria

### 🌤️ Clima

- Consulta de informações climáticas por cidade

### 🔒 Segurança

- Autenticação HTTP Basic
- Proteção de endpoints
- Controle de acesso utilizando Spring Security

---

## 🔗 Principais Endpoints

### 👤 Usuários

```http
POST /usuarios
GET /usuarios
GET /usuarios/{id}
PUT /usuarios/{id}
DELETE /usuarios/{id}
```

### 🌱 Ações Sustentáveis

```http
POST /acoes-sustentaveis
GET /acoes-sustentaveis
GET /acoes-sustentaveis/{id}
GET /acoes-sustentaveis/usuario/{id}
PUT /acoes-sustentaveis/{id}
DELETE /acoes-sustentaveis/{id}
```

### 💡 Dicas ESG

```http
GET /dicas-esg
GET /dicas-esg/{id}
GET /dicas-esg?categoria=ENERGIA
```

### 🌤️ Clima

```http
GET /clima?cidade=SaoPaulo
```

### ❤️ Monitoramento

```http
GET /actuator/health
```

---

## Banco de Dados

O projeto utiliza Oracle Database para armazenamento das informações.

As migrações são gerenciadas através do Flyway, permitindo controle de versão e evolução do banco de dados de forma segura e organizada.

---

## Segurança

A aplicação utiliza Spring Security para autenticação e proteção dos recursos da API.

Os endpoints protegidos exigem autenticação HTTP Basic utilizando e-mail e senha.

---

## Docker

O projeto foi preparado para execução em containers Docker.

### Build da Imagem

```bash
docker build -t ecotrack-api .
```

### Executar Container

```bash
docker run -p 8080:8080 ecotrack-api
```

---

##  Testes da API

Os testes dos endpoints foram realizados utilizando Postman e Insomnia.

A collection utilizada para validação das funcionalidades encontra-se disponível neste repositório.

### Funcionalidades Testadas

- Cadastro de usuários
- Autenticação
- CRUD de ações sustentáveis
- Consulta de dicas ESG
- Consulta de clima
- Segurança dos endpoints
- Health Check da aplicação

---

##  Conceitos Aplicados

Durante o desenvolvimento foram aplicados conhecimentos em:

- Desenvolvimento Backend
- APIs REST
- Java
- Spring Boot
- Spring Security
- Oracle Database
- Flyway
- Docker
- Arquitetura em Camadas
- Tratamento de Exceções
- Validação de Dados
- Versionamento com Git e GitHub

---

##  Contexto ESG

O EcoTrack está alinhado aos princípios ESG (Environmental, Social and Governance), incentivando práticas sustentáveis através do registro e acompanhamento de ações ambientais.

Entre os objetivos da solução estão:

- Redução de impactos ambientais
- Incentivo a hábitos sustentáveis
- Educação ambiental
- Conscientização sobre ESG
- Monitoramento de iniciativas sustentáveis

---

##  Projeto Acadêmico

Projeto desenvolvido na FIAP com foco em sustentabilidade, desenvolvimento backend e aplicação de boas práticas de engenharia de software.

---

## 👩‍💻 Desenvolvido por

**Jéssica Pereira**

📧 jessica.pereirapsx@gmail.com

🔗 LinkedIn: https://linkedin.com/in/jessiepsx

💻 GitHub: https://github.com/jessiepsx
