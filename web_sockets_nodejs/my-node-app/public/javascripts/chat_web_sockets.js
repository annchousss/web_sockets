// var webSocket;
//
// function connect(id, name) {
//     document.cookie = 'X-Authorization=' + id + ';path=/';
//     webSocket = new WebSocket('ws://localhost:8080/chat');
//
//     webSocket.onmessage = function receiveMessage(response) {
//         let data = response['data'];
//         let json = JSON.parse(data);
//         $('#messagesList').first().after("<li>" + json['from'] + " " +  json['text'] + "</li>")
//     };
//
//     webSocket.onerror = function errorShow() {
//         alert('Ошибка авторизации')
//     }
//     webSocket.onopen = () => sendMessage(name, "Hello!")
// }
//
// function sendMessage(from, text) {
//     let message = {
//         "from": from,
//         "text": text
//     };
//
//     webSocket.send(JSON.stringify(message));
// }

let user = {};

function sendUserData() {
    let username = document.getElementById("name").value;

    $.ajax({
        type: 'post',
        url: '/getId',
        data: {"username": username}

    }).done(function (data) {

    });
    
}