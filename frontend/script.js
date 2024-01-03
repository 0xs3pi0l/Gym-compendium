let button = document.getElementsByTagName("button")[0];
button.addEventListener("click", fetchContent);

function fetchContent(){
    
    console.log("OK");
    let selects = document.getElementsByTagName("select");
    let muscle = selects[0].value;
    let equipment = selects[1].value;
    const url = "http://localhost:8080/exercise?muscle=" + muscle + "&equipment=" + equipment;

    fetch(url)
        .then(response => response.json())
        .then(data => swapContent(data))
    //swapContent(content);
}


function swapContent(jsonData){
    let cardsContainer = document.getElementsByClassName("cards-container");
    console.log(jsonData);
}