A. Take a sentence as an input and reverse every word in that sentence.
a. Example - This is a sunny day > shiT si a ynnus yad.


function reverseWords(sentence) {
     let words = sentence.split(' ');
    let reversedWords = words.map(word => {
              return word.split('').reverse().join('');
    });
    let reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);
console.log("Reversed Sentence: " + reversedSentence);
