let  titulo = document.querySelector("h1");
titulo.innerHTML = "Hora do Desafio";
function verificarConsole(){
    console.log("Chute");
}
function verificarAletar(){
    alert("Eu amo JS");
}
function verificarPrompt (){
    let cidade = prompt("Qual é da sua Cidade?");
    alert("Estiver e,  " + cidade + " E lembrei de você");
}
function verificarSoma(){
   let primeiroNumero = parseInt(prompt("Digite o primeiro numero"));
   let segundoNumero = parseInt(prompt("Digite o segundo numero"));
   let resultado = primeiroNumero + segundoNumero;
    alert(`${primeiroNumero} + ${segundoNumero} = ${resultado}`)
}