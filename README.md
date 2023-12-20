
<h1>README: CRUD de Login e Cadastro de Usuário</h1>
Visão Geral
Este é um projeto simples que implementa operações básicas de CRUD (Create, Read, Update, Delete) para a funcionalidade de login e cadastro de usuários. O projeto é baseado na linguagem de programação Java, usando o framework Spring Boot para o desenvolvimento da aplicação web.

Funcionalidades
Cadastro de Usuário:

Os usuários podem se cadastrar fornecendo informações como nome, sobrenome, data de nascimento, e-mail e senha.
Login:

Os usuários registrados podem fazer login utilizando seu e-mail e senha.
Atualização de Perfil:

Os usuários podem atualizar suas informações pessoais, como nome, sobrenome e senha.
Exclusão de Conta:

Os usuários têm a opção de excluir suas contas, o que resulta na remoção permanente de seus dados.
Tecnologias Utilizadas
Java
Spring Boot (Spring MVC, Spring Data JPA, Spring Security)
Thymeleaf (para a camada de visualização)
Banco de Dados (pode ser configurado para usar MySQL, PostgreSQL, etc.)
Bootstrap (para aprimorar a interface do usuário)
Configuração do Projeto
Configuração do Banco de Dados:

Configure as propriedades do banco de dados no arquivo application.properties (ou application.yml) com as informações corretas de conexão.
Configuração do Spring Security:

Personalize as configurações de segurança, como regras de autorização, no arquivo de configuração do Spring Security.
Execução do Projeto:

Execute o aplicativo Spring Boot. Acesse http://localhost:8080 para interagir com a aplicação.
Estrutura do Projeto
src/main/java/com/example/loginCad: Pacote principal que contém as classes Java.
controller: Contém os controladores da aplicação.
model: Define as entidades do domínio.
repository: Contém interfaces do Spring Data JPA para acessar o banco de dados.
service: Contém a lógica de negócios.
security: Configurações de segurança usando Spring Security.
src/main/resources: Recursos da aplicação.
templates: Contém os templates Thymeleaf para as páginas HTML.
static: Contém recursos estáticos, como arquivos CSS e JavaScript.
Como Usar
Cadastro de Usuário:

Acesse a página de cadastro (/cadastro) e preencha o formulário com as informações necessárias.
Login:

Após o cadastro, acesse a página de login (/login) e insira seu e-mail e senha.
Atualização de Perfil:

Após fazer login, acesse a página de perfil (/perfil) para atualizar suas informações.
Exclusão de Conta:

Na página de perfil, há a opção de excluir a conta.
Contribuição
Se você quiser contribuir para este projeto, sinta-se à vontade para criar pull requests ou relatar problemas (issues). Sua contribuição é valiosa para melhorar esta aplicação.
