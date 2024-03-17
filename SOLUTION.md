# Desafio: Tempo Médio entre Picos - Ígor Souza

### ❗ Implementação de solução

***`Criação do método: LerDadosDoArquivo`***

- Ler os dados do arquivo informado na variável *fileName*.
- Utiliza a classe *BufferedReader* para ter uma entrada de caracteres de forma eficiente. Sendo a solução perfeita para uma entrada de dados.
- Retorna os dados coletados.

***`Criação do método: EncontrarPicos`***

- Encontra os picos perante os dados coletados através do método LerDadosDoArquivo.
- Utiliza um contaddor para percorrer a lista gerada pelos dados coletados.
- Retorna os picos verdadeiros encontrados

### ✅ Geração de dados para validação da solução

Utilizei o CHATGPT 3.5 para realizar a contagem dos números informados no *exemplo.txt* . Após ser informado de que haviam 75 números na lista, solicitei que o mesmo me retornasse outros 75 números de 1 a 100, seguindo a lógica dos números informados anteriormente. Assim gerei o arquivo *exemplo1.txt* e repeti o mesmo processo para o arquivo *exemplo2.txt* .


### 🛠 Execução da solução.

Para a execução da solução *Main.java* será necessário nstalar o [*__JDK 21__*](https://www.oracle.com/java/technologies/downloads/#jdk21-windows). Logo após verificar se todos os arquivos de exemplo e *Main.java* estão no diretório correto. Na IDE execute o comando:

```
java Main.java
```
Visando validar outras soluções, é interessante alterar  o parâmetro *fileName* na linha ***11*** de *'exemplo.txt'* para *'exemplo1.txt'* ou *'exemplo2.txt'* .

> lerDadosDoArquivo("exemplo1.txt"); ou lerDadosDoArquivo("exemplo2.txt");


### 🛠 Dificuldades

Acredito que a abstração foi o mais complicado. Desafio requer mais sobre lógica matemática do que lógica de programação por si só.

Outro grande vilão foi a rotina, mas fico feliz por conseguir terminar.
