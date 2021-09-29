// var allH1 = document.querySelectorAll('h1');
// for (h1 of allH1) {
//     h1.style.color = 'red';
// }


function getRandomColor() {
    var letters = '0123456789ABCDEF';
    var color = '#';

    for (var i = 0; i < 6; i++) {
        var r1 = Math.floor(Math.random() * 16);
        color = color + letters[r1];
    }
    return color;
}

var b = document.querySelector('button');
b.addEventListener('click', changeColor);

function changeColor() {
    var body = document.querySelector('body');
    body.style.background = getRandomColor();
}