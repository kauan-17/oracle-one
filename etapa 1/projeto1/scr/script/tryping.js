
const main = ((txt) =>  {




    const typeAnimation = (newTxt) => {


        let i = 0;
        let placeholder = "";
        const txt = newTxt;
        const typingSpeed = 10;
        console.log(placeholder);
        const typing = ()   =>  {
            console.log(txt);
            placeholder += txt.charAt(i)

            document.getElementById('animated__input').setAttribute('placeholder', placeholder)//add a placeholder with you current placeholder value to the target.
            i++;
            if(i < txt.length)  {
                setTimeout(typing, typingSpeed);
            }else   {
                console.log('timeout Finished')
            }
        }
        typing();
    }


    typeAnimation(txt);


});
main('Digite seu texto aqui!');