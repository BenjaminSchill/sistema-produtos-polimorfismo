# Sistema de Cadastro de Produtos (Herança e Polimorfismo)

Projeto em Java desenvolvido para consolidar os conceitos fundamentais da Programação Orientada a Objetos (POJO), focado em herança, polimorfismo e encapsulamento estrito.

## 🛠️ Conceitos Aplicados

- **Herança**: As subclasses `ImportedProduct` e `UsedProduct` herdam os atributos e métodos base da classe pai `Product`.
- **Polimorfismo**: O método `priceTag()` é sobrescrito (`@Override`) nas subclasses para exibir etiquetas customizadas de forma dinâmica em uma lista única (`List<Product>`).
- **Encapsulamento Estrito**: Todos os atributos da classe pai foram definidos como `private`, garantindo a segurança dos dados e o acesso controlado unicamente através de métodos *getters* e *setters*.
- **Datas Modernas**: Uso da API `java.time` (`LocalDate` e `DateTimeFormatter`) para formatação e manipulação de datas no padrão brasileiro (`dd/MM/yyyy`).

## 💻 Como Executar o Projeto

1. Certifique-se de ter o **Java 8** ou superior instalado em sua máquina.
2. Clone o repositório:
   ```bash
   git clone https://github.com
   ```
3. Abra o projeto na sua IDE de preferência (Eclipse, IntelliJ, VS Code) e execute a classe `Program.java`.
