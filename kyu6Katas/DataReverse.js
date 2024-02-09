dataReverse=d=>new Array(d
  .length/8)
  .fill('')
  .map((_,i)=>d
      .slice(i*8,(i+1)*8))
  .reverse()
  .flat()
