<!doctype html>
<html lang="ru">
<head>
    <script
            src="https://code.jquery.com/jquery-3.4.1.js"
            integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
            crossorigin="anonymous"></script>
    <script src="js/chat_web_sockets.js"></script>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Chat</title>
</head>
<body>
<div>
    <input name="name" id="name" placeholder="Нэйм">
    <button onclick="connect('${id}', $('#name').val())">Войти</button>
    <h1>Ваш id: ${id}</h1>
<#--    <h1>Ваш id: ${ids}</h1>-->
    <br>
    <input name="message" id="message" placeholder="Сообщение">
    <button onclick="sendMessage($('#name').val(), $('#message').val())" id="sendMessageButton">Отправить</button>
</div>
<br>
<div>
    <h3>СООБЩЕНИЯ:</h3>
    <ul id="messagesList">

    </ul>
</div>
</body>
</html>