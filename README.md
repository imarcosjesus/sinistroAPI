# sinistroAPIRest Java

- Tecnologias:
- Java 17
- Apache maven
- Postman
- H2 database


# Como rodar a aplicação
<p>Rodar o projeto utilizando spring boot</p>
<p>Utilizar Postman para testar os métodos </p>
<p>Abrir o Postman e criar uma nova requisição post, colocar na porta: http://localhost:8080/usuario</p>
<p>Passar o seguinte Json:</p>


```json
{
    "id": "1",
    "nome": "Marcos",
    "carro": "corsa",
    "placa": "abcd123",
    "sinistro": "roubo",
    "endereco": 
    {
        "pais": "Brasil",
        "estado": "Paraná",
        "cidade": "Curitiba",
        "bairro": "Boqueirão",
        "rua": "Carlos Augusto",
        "numero": "102"
    }
}
```

<p>Mudar para o metodo Get no Postman para ver o resultado ou acessar o banco,</p>
<p>Mudar para o Metodo put para alterar os dados e inserir esse json:</p>

```json
{
    "id": "1",
    "sinistro": "Colisão"
}
```

<p>Mudar para o Metodo delete para deletar os dados, passar a porta http://localhost:8080/usuario/1 para excluir o id 1,

# Conexão com o Banco
- Acessar http://localhost:8080/h2-console para ver as alterações ou ver no postman,
- O H2 só funciona enquanto a aplicação está rodando,
- alterar o JDBC URL para jdbc:h2:file:./data/sinistro,
- username=sa,
- password=password,
