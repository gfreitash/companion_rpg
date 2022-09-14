Companion RPG
----------------
----------------
## Introdução
O projeto consiste de uma interface que permite:
- Criar, editar, excluir e listar NPCs (Non-Player Characters)
- Criar, editar, excluir e listar itens
- Criar, excluir e listar mapas
- Rolar dados de forma aleatória

## Como funciona
O projeto é dividido em duas partes:
- A interface, que é responsável por receber os dados do usuário
- O CRUD, que é responsável por armazenar os dados em arquvos .json

### A Interface
gerencia a interação com o usuário. A interface possui um menu que permite ao usuário
navegar entre as opções disponíveis.

A interface valida todos os dados que o usuário insere, garantido assim a consistência dos dados.

### O Crud
é responsável por manipular os dados em arquivos .json, que são salvos na pasta "data" do projeto.

A implementação do CRUD é feita através de uma classe concreta chamada "CrudGenerico" que implementa
a interface "Crud". Para que o CRUD funcione, o tipo genérico deve estender a classe 
"Comparavel".

A biblioteca utilizada para manejar os arquivos json é a Gson. É necessário ter cuidado ao manipular os arquivos, pois é
necessário garantir que o arquivo exista e que o conteúdo do arquivo possua um array "[ ]". Por padrão, os arquivos utilizados
nesse programa já cumprem essa regra.

## Como executar
Para executar o programa, basta executar a classe ```CompanionRpg``` que está na pasta ```"src/br/com/"```.

Além disso, é necessário garantir que a IDE esteja carregando as dependências necessárias para o funcionamento do programa.
Os arquivos necessários estão na pasta ```"libs"```.

## Os participantes
- Gabriel Henrique Freitas
- Thiago de Stecca Prado
- Thiago Pereira de Lacerda
