import React from 'react'

function ListOfPlayers() {
     const players=[
    {name:'Mr.Jack', score:50},
    {name:'Mr.Michael', score:70},
    {name:'Mr.John', score:40},
    {name:'Mr.Ann', score:61},
    {name:'Mr.Elisabeth', score:61},
    {name:'Mr.Sachin', score:95},
    {name:'Mr.Dhoni', score:100},
    {name:'Mr.Virat', score:84},
    {name:'Mr.Jadeja', score:64},
    {name:'Mr.Raina',score:75},
    {name:'Mr.Rohith',score:80}
  ]
   const list=players.map(players=>
    <li key={players.name}>
      {players.name}
      {players.score}
    </li>
  );
  const lessthan=[]
  players.map((item)=>{
    if(item.score<=70){
      lessthan.push(item);
    }
  })
  const lessthan70=lessthan.map(lessthan=>
    <li key={lessthan.name}>
      {lessthan.name}-{lessthan.score}
    </li>
  )
  return (
    <li>
      <h1 style={{marginTop:0}}>list of players</h1>
    <ul style={{marginTop:0}}>{list}</ul>
    <h1>players whose score is less than 70</h1>
    <ul>{lessthan70}</ul>
    </li>
  )
}

export default ListOfPlayers
