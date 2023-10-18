B. Perform sorting of an array in descending order.
function bubbleSortDescending(arr) {
    let len = arr.length;
    let swapped;
    do {
        swapped = false;
        for (let i = 0; i < len - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                let temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
    } while (swapped);
    return arr;
}
let inputArray = [5, 2, 8, 1, 3];
let sortedArray = bubbleSortDescending(inputArray);
console.log("Sorted Array in Descending Order: " + sortedArray.join(', '));
