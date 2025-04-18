
# ☕ Java Advanced - Gestão de Contatos

Este projeto demonstra o uso de conceitos avançados de Java com Spring Boot, incluindo persistência de dados com Spring Data JPA e integração com banco de dados Oracle. A aplicação permite o **cadastro, listagem e gerenciamento de contatos**.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.4
- Spring Web
- Spring Data JPA
- Oracle Database
- Flyway (versionamento de banco)
- Maven

---

## 📚 Objetivos do Projeto

- Praticar mapeamento objeto-relacional com JPA
- Implementar REST APIs com Spring Boot
- Integrar com banco Oracle usando JDBC e Flyway
- Utilizar boas práticas de versionamento de scripts SQL

---

## ⚙️ Como Executar o Projeto

### 1. Clone o repositório:

```bash
git clone https://github.com/Carolxyn/JavaAdvanced.git
cd JavaAdvanced
2. Configure o banco Oracle no arquivo application.properties:
properties
Copiar
Editar
spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/XEPDB1
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration
💡 Lembre-se de criar a sequência CONTATOS_SEQ no Oracle, ou inclua um script Flyway com isso.

3. Execute o projeto com Maven:
bash
Copiar
Editar
./mvnw spring-boot:run
📫 Endpoints da API

Método	Endpoint	Descrição
POST	/contatos	Cadastrar novo contato
GET	/contatos	Listar todos os contatos
GET	/contatos/{id}	Buscar contato por ID
PUT	/contatos/{id}	Atualizar contato
DELETE	/contatos/{id}	Remover contato
🧠 Destaques Técnicos
Uso de @Entity, @Table, @Id, @GeneratedValue, @Column com JPA

Integração com Oracle usando ojdbc11

Versionamento de scripts com Flyway

Boas práticas de arquitetura e nomenclatura JavaBeans

Persistência correta de datas (LocalDate com @Column(name = "data_nascimento"))

👩‍💻 Desenvolvedora
Desenvolvido por @Carolxyn com muito 💙 e foco em boas práticas de Java!

📜 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para usar, modificar e compartilhar.
