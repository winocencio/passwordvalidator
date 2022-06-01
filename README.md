# Password Validator

Validador de senhas fortes com o intiuto de validar os seguintes criterios:

- Entre nove e dezesseis caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial, sendo eles: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto
- Não possuir caracteres invalídos sendo ele apenas o: (espaço em branco)

## Tech

Foi usado no projeto:

- [Java](https://www.java.com/) - Linguagem de programação orientada a objeto.
- [Spring Boot](https://spring.io/) - Spring é um framework open source para a plataforma Java
- [Docker](https://www.docker.com/) - Docker usa virtualização de nível de sistema operacional para entregar software em pacotes chamados contêineres.

## Sobre a solução

O Validador foi criado utilizando o design pattern **Chain of Responsibility**, separando cada criterio de validação em uma classe quee extende a classe abstrata "RulePassword".
Tornando assim a API maleavel a qualquer alteração ou extensão de novas regras de validação, como em casos onde seja necessario criar uma nova rota com uma validação menos criteriosa, ou a implementação de um novo criterio, ou a implementação de uma mensagem informando o que a torna uma senha invalida.
Cada criterio é validado em sua propria classe e a manutenção de cada criterio pode ser alterada ou corrigida sem impacto nas demais regras.
Foi realizado o teste unitario de cada RulePassword.

A Utilização do pattern **Chain of Responsibility** foi usado meramente para demonstração de conhecimento e que para os simples criterios citados poderiam ser resolvidos em algumas linhas.

Na regra de tamanhado foi adicionado um tamanho maximo de dezesseis caracteres para a senha, para que não seja algo aberto, podendo assim ser aberto a problemas.
Na regra de caracteres iguais, foi definido que a mesma letra em maisculo e minusculo são caracteres diferentes.
E foi criado uma regra de caracteres invalidos onde apenas os espaço é um caracter invalido.

## Executar
Na raiz do projeto:
```sh
./mvnw clean package
docker image build -t password-validator .
docker run --name password-validator -p 8080:8080 password-validator
```

##### Endpoint:
```GET http://localhost:8080/passwordValidator/{password} ```
