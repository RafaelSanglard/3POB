# Trabalho de Banco de Dados AgendaTel

## Contexto

A aplicação *AgendaTel* é uma aplicação Java usando a biblioteca de janelas
gráficas ao usuário (*GUI*) chamada *Swing*. Basicamente a aplicação é um *CRUD*
para entradas em uma agenda telefônica com nome e telefone.

## Preparação

1. É necessário ter o Git instalado

> Assista ao vídeo instrucional *Instalação Git for Windows* na página do curso

2. É necessário ter uma conta no BitBucket

> Assista ao vídeo instrucional *Como criar uma conta no BitBucket* na página do curso

3. realizar fork do repositório AgendaTel

- [Repositório AgendaTel no BitBucket](https://bitbucket.org/mbelo/agendatel/)

- Não esqueça de dar permissão de escrita para os parceiros de grupo (se houver) e de leitura para o professor (**marcio.belo@faeterj-rio.edu.br**) e para o monitor.

> Assista ao vídeo instrucional *Como entregar um trabalho usando um repositório Git* na página do curso

3. clonar repositório localmente

ATENÇÃO: **NÃO** é para clonar o de repositório do professor! É para clonar o seu próprio repositório (criado a partir do fork). Repare o *fulano* abaixo representa seu nome de usuário no BitBucket.

```sh
git clone https://fulano@bitbucket.org/fulano/agendatel.git
```

4. Baixar uma IDE

Use uma IDE de sua preferência.

Dica: se você quiser alterar a interface com o usuário, no NetBeans há um editor visual de telas Swing's muito bom.

[Link NetBeans](https://netbeans.apache.org)

5. Abrir o projeto e rodar

Teste a aplicação usando serialização em disco.

Explore o código da aplicação: a aplicação usa *Swing* para criação da interface com o usuário.

## O Trabalho

Após sua análise do código, você perceberá que os registros são salvos num objeto serializável que é persistido num arquivo em disco (`agenda.ser`).

Mude a aplicação para que ele persista os registros num banco de dados
*MySQL*.

> Dica: em *Windows*, use um software como WampServer (ou VertrigoServ). Ele
cria uma instalação local do *MySQL* de forma simples para começar a usar.
Teste sua conexão antes de tentar codificar a solução.

Sua entrega será composta por duas partes:

1. Submissão da URL do seu repositório GIT.

P.ex.: `https://bitbucket.org/fulano/agendatel/`

> Atenção: o repositório de entrega NÃO pode ser público. Não esqueça de conceder permissão de leitura para o professor e o monitor (se for o caso).

2. Coloque o link de um video Não-listado do Youtube demonstrando sua aplicação já utilizando o banco de dados *MySQL*.

P.ex.: `https://www.youtube.com/watch?v=QzY57FaENXg`

> Atenção: o vídeo deve ser 'Não listado'. Não deve ser exibido na pesquisa do Youtube.