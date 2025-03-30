# LAB 4 Alta Coesão Baixo Acoplamento

## Descrição

Este projeto visa implementar um sistema para o cálculo de áreas e perímetros de figuras geométricas básicas, como
retângulos, quadrados e círculos. Utiliza a interface `FiguraGeometrica` que define métodos comuns para todas as
figuras, e cada classe concreta (como `Circulo`, `Quadrado`, `Retangulo`) implementa esses métodos conforme suas
necessidades.

## Tecnologias Utilizadas

- **Java 8** (ou superior)
- **BigDecimal** para cálculos precisos

## Por que usar `BigDecimal`?

O uso de `BigDecimal` é essencial para garantir a precisão nos cálculos envolvendo áreas e perímetros. Diferente dos
tipos primitivos como `float` ou `double`, que podem introduzir erros de arredondamento em cálculos financeiros ou
geométricos, o `BigDecimal` permite controle preciso sobre a quantidade de casas decimais, evitando falhas nos
resultados. No contexto deste projeto, a precisão de duas casas decimais foi escolhida para garantir que os valores
calculados para área e perímetro sejam precisos e consistentes.

## Diagrama de Classes

O diagrama de classes ilustra as classes `FiguraGeometrica`, `Circulo`, `Quadrado` e `Retangulo`, com os respectivos
métodos para calcular área, perímetro e retornar uma descrição da figura. A interface `FiguraGeometrica` é implementada
pelas três classes de figuras geométricas, o que garante coesão e flexibilidade para o sistema.

![Diagrama de Classes](/src/main/resources/diagrama_classes.png)

## Coesão e Acoplamento

- **Coesão**: O sistema foi projetado para garantir alta coesão, ou seja, cada classe tem uma responsabilidade clara e
  única. A interface `FiguraGeometrica` define um contrato comum que todas as figuras geométricas devem seguir, mas cada
  classe (como `Circulo`, `Quadrado`, e `Retangulo`) implementa o cálculo de área e perímetro de forma independente,
  respeitando o princípio de responsabilidade única.

- **Acoplamento**: O sistema foi projetado para ter baixo acoplamento, o que significa que as classes são independentes
  umas das outras. Cada figura geométrica pode ser utilizada de forma isolada, sem depender de outras figuras. A
  interface `FiguraGeometrica` garante que a comunicação entre as classes seja feita de maneira genérica, sem que uma
  classe precise conhecer os detalhes de implementação de outra.

## Melhorias e Sugestões

- **Tratamento de Erros**: O tratamento de exceções foi melhorado nas classes para capturar e gerenciar erros, como
  valores negativos para dimensões. Isso melhora a robustez do sistema e facilita a depuração.

- **Encapsulamento**: As variáveis de instância de cada classe são privadas, o que garante que os dados sejam acessados
  apenas por métodos da própria classe. O uso de métodos `get` ou `set` também poderia ser considerado para permitir
  acesso controlado aos dados.

- **Comportamento Semelhante**: A estrutura permite que classes com comportamentos semelhantes, como `Circulo`,
  `Quadrado` e `Retangulo`, sejam tratadas de forma unificada, mas com suas implementações específicas, respeitando a
  flexibilidade do design.

## Testes Unitários

Cada classe foi acompanhada de testes unitários que validam as operações de cálculo de área e perímetro, bem como a
correta manipulação de entradas inválidas (como valores negativos). Os testes garantem que o sistema se comporta
corretamente em cenários normais e de erro.

