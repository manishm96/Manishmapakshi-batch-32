Array.prototype.secondSmallestValue = function(){

    this.sort(function(a,b){return a-b});

    console.log(this);

    let i = 1;
    let result;

    while(i < this.length)
    {
        if(this[i-1] == this[i])
        {
            i++;
        }else{
            result = this[i];
            return result;
        }
    }

}

const arr = [3, 2, 8, 12, 1];

arr.secondSmallestValue();