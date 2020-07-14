# jQuery Parts 1 & 2

## Instalando Node.js

```bash
sudo apt-get install -y nodejs
```

## Rodando o servidor

Depois do Node.js ter sido instalado, dentro da pasta do projeto alura-typer, você deve encontrar a pasta servidor, navegue até ela e dentro dela execute o comando:

```bash
npm start
```

O terminal ficará aguardando indefinidamente, sinal de que o servidor está escutando. Agora é só abrir o navegador no endereço http://localhost:3000/principal.html. A página do seu Alura Typer será exibida!

A partir daqui toda vez que começar a trabalhar no projeto, deve utilizar o npm start dentro da pasta servidor para subir o servidor web!

As frases podem ser vistas em http://localhost:3000/frases

Ao acesssar http://192.168.0.83/frases aparece a lista de frases dessa aplicação.

O placar pode ser verificado em http://localhost:3000/placar

## Same Origin Policy

Para testar o Same Origin Policy foi criado um segundo projeto servidor. Vamos tentar acessar as "frases" desse servidor para ver os mecanismos de segurança.

1) Abra um terminal e navegue na linha de comando para a pasta:

```bash
alura-typer-servidor-cors/servidor
```

2) Dentro dessa pasta rode o comando 

```bash
npm start
```

Você pode testar as frases acessando:

http://localhost:3001/frases

Importante: O servidor ainda não tem CORS habilitado.

3) Vamos testar a Same Origin Policy do navegador. Para tal, abra o arquivo js/frase.js do seu projeto original.

Altere as duas URLs da função .get e troque a porta de 3000 para 3001.

Use: http://localhost:3001/frases

Lembrando que por padrão não é permitido acessar outro IP ou mudar a porta, nem podemos alterar de http para https.

4) Recarregue a página principal no navegador (o servidor do seu projeto deve estar rodando). Tente carregar uma frase aleatória. No console deve aparecer o erro.

## Habilitando CORS

1) Primeiro pare a servidor da pasta alura-typer-servidor-cors.

2) Abra o arquivo express.js dentro da pasta alura-typer-servidor-cors/servidor/config.

Nesse arquivo você encontrará algumas configurações sobre o framework MVC Express do node.js. 

Navegador recebe a permissão para executar uma requisição cross-origin (CORS).

```code
res.header("Access-Control-Allow-Origin", "http://localhost:3000");
```

3) Reinicie o servidor (da pasta alura-typer-servidor-cors/servidor) na linha de comando:

```bash
npm start
```

4) No navegador recarregue a aplicação e a requisição cross-origin deve funcionar:

http://localhost:3000/principal.html















