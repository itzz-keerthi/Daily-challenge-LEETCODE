function fizzBuzz(n: number): string[] {
    const emptyArray: string[] = [];
    for(let i:number=1;i<=n;i++){
        if(i%5==0 && i%3==0){
            emptyArray.push("FizzBuzz");
        }
        else if(i%3==0){
            emptyArray.push("Fizz");
        }
        else if(i%5==0){
            emptyArray.push("Buzz");
        }
        else{
            emptyArray.push(i.toString());
        }
    }
    return emptyArray;
};
