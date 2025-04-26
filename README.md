## Carro Builder

O CarroBuilder é um pequeno codigo que usei para treinar o padrão de projeto Builder.Com ele posso criar um carro com as caracteristicas que eu quiser de forma simplificada e dinamica.

## Como usar?

1. Crie um objeto CarroBuilder usando o construtor CarroBuilder();
2. Crie um Carro usando o metodo build();

## Exemplo:

```

CarroBuilder carrobuilder= new CarroBuilder();

Carro carro=carrobuilder.setMarca("Honda").setModelo("Civic").setAno(2021).setCor("Prata").setPortas(4).setAutonomia(20).build();

System.out.println(carro);

```

## Resultado:

```
AQUI ESTÁ SEU CARRO

Marca = Honda
Modelo = Civic
Ano = 2021
Cor = Prata
Porta = 4   
Autonomia = 20

```

## Melhorias

Para melhorar a experiencia do usuario, adicionei um scanner que permite que o usuario interaja com o programa sem codificar nada.
