Array.prototype.secondLargestValue = function(){

    this.sort(function(a,b){return a-b});

    console.log(this);

    let i = this.length-1;
    let result;

    while(i > 0)
    {
        if(this[i-1] == this[i])
        {
            i--;
        }else{
            result = this[i-1];
            return result;
        }
    }

}

const arr = [3, 2, 8, 12, 1];

arr.secondLargestValue();

