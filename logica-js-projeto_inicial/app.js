alert("Boas vinda ao jogo do número secreto");
let numeroMaximo = 5000;
let numeroScreto = parseInt(Math.random() * numeroMaximo);
console.log(numeroScreto);
let chute;
let tentativas = 1;
     while(chute != numeroScreto){
       chute = prompt(`escolha um numero de  1 e ${numeroMaximo}`);
       if (numeroScreto == chute) {
        break;
       }
      else {

        if (chute > numeroScreto) {
         alert(`Você errou! O número secreto é menor ${chute}`);
        }
        else {
         alert(`Você errou! O número secreto é maior ${chute}`);
        }
        tentativas++;
      }
}
let palavraTentativa = tentativas >1 ? "tentativas" : "tentativa";

alert(`Você acetou o numero secreto ${numeroScreto} com ${tentativas} ${palavraTentativa}`);