function getAllMessages() {

    fetch('/messages')
        .then(response => response.json())
        .then(list => list.reverse().forEach(item => addItem(item)));
}

function saveMessage() {

    let message = {
        name: document.getElementById('name').value,
        text: document.getElementById('text').value
    }

    let options = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(message)
    }

    let element = document.getElementById('messages');
    element.innerHTML = '';

    fetch('/message', options)
        .then(response => response.json())
        .then(list => list.reverse().forEach(item => addItem(item)));
    ;

}

function addItem(item) {
    let h4Element = document.createElement('h4');
    let pElement = document.createElement('p');
    let divElement = document.createElement('div');
    let element = document.getElementById('messages');
    divElement.appendChild(h4Element).innerText = item.name;
    divElement.appendChild(pElement).innerText = item.text;
    element.appendChild(divElement);
}

function cleanInputs() {
    document.getElementById('name').value = '';
    document.getElementById('text').value = '';
}
