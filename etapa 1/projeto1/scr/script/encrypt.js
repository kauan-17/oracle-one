


const mainCrypt = () =>  {
    let originalStr;
    const states = {
        document: {
            userMainInput: document.getElementById("animated__input"),
            output__area:document.querySelector(".output__area"),
            cryptBtn: document.querySelector(".btn__encrypt"),
            images:document.querySelector(".image__guyWLupe"),
            asideTitle:document.querySelector('.out__area'),
            asideText:document.querySelector('.out__paragraph'),
            decryptBtn: document.querySelector(".bnt__decrypt"),
            copyBtn: document.querySelector(".btn__copy"),

        }
    }



    const encrypt = () =>   {

        const checkForContent = ()  =>  {
            const getText = states.document.userMainInput.value;
            let textContent;
            let defaut = 'Digite seu texto aqui!';

            if (getText === "" || getText === undefined || getText === null) {
                textContent = "Por favor, insira algo!";
                main(textContent);

            }else   {


                getUserInput();

            }


        }
        const getOriginalString = () => {
            const decryptBtn  = states.document.decryptBtn;

            decryptBtn.setAttribute('disabled', true);
            states.document.asideText.textContent = originalStr;

        }


        const copyToClipboard = () =>   {


            var getCopy = states.document.asideText.textContent;

            navigator.clipboard.writeText(getCopy)
                .then(function() {
                    // Optionally, provide user feedback
                    alert("Text copied to clipboard: " + getCopy);
                })
                .catch(function(err) {
                    console.error('Unable to copy text to clipboard', err);
                });
        }
        const checkForInput = () => {
            states.document.cryptBtn.addEventListener("click", () =>    {

                checkForContent();
            })

            states.document.decryptBtn.addEventListener('click', () =>  {
                getOriginalString();
            })

            states.document.copyBtn.addEventListener('click', () => {

                copyToClipboard();
            })
        }
        checkForInput();

        const getUserInput = () => {
            const userTxt = states.document.userMainInput.value;
            states.document.decryptBtn.removeAttribute('disabled');
            originalStr = userTxt;
            let str = [];
            const checkCryptoLogic = (char) =>   {


                const addToStr = (newChar) =>  {
                    str.push(newChar);
                    console.log(str);
                }

                switch(char)    {
                    case 'a':
                        char = 'ai';
                        addToStr(char);
                        break;
                    case 'i':
                        char = 'imes';
                        addToStr(char);
                        break;
                    case 'e':
                        char = 'enter';
                        addToStr(char);
                        break;
                    case 'o':
                        char = 'ober';
                        addToStr(char);
                        break;
                    case 'u':
                        char = 'ufat';
                        addToStr(char);
                        break;
                    default:
                        addToStr(char);
                        break;
                }

                return str.join('');

            }

            const defineCryptograph = () => {
                let encryptedStr;


                const setupAside = () =>    {

                    let asideImage = states.document.images;
                    let asideTitle = states.document.asideTitle;
                    let asideParagraph = states.document.asideText;

                    states.document.userMainInput.value = '';


                    main('Digite seu texto aqui!');

                    const changeText = () =>   {
                        asideTitle.classList.add('deactivate_display');

                        asideImage.classList.add('deactivate_display');

                        asideParagraph.classList.add('toUp');


                        asideParagraph.textContent = encryptedStr;

                    }
                    changeText();

                }
                for(let i = 0; i < userTxt.length; i++) {

                    encryptedStr = checkCryptoLogic(userTxt[i]);
                }
                setupAside();

            }
            defineCryptograph();


        }
    }
    encrypt();

}
mainCrypt();