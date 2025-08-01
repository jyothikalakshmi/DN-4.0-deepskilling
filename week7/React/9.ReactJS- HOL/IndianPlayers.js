import React from 'react'
const T20Players = ['Mr.Sachin', 'Mr.Dhoni', 'Mr.Virat'];
const RanjiTrophyPlayers = ['Mr.Rohith', 'Mr.Yuvraj', 'Mr.Raina'];
const allPlayers = [...T20Players, ...RanjiTrophyPlayers];

const merged=allPlayers.map((name,index)=>({
name,
score: index+1
})
)
   export function Oddplayers([first, ,third, ,fifth]){
    return(
        <div>
            <li>First: {first.name}{first.score}</li>
            <li>Third: {third.name}{third.score}</li>
            <li>fifth: {fifth.name}{fifth.score}</li>
        </div>
    )
   }
   export function Evenplayers([, second, ,fourth, ,sixth]){
    return(
        <div>
            <li>Second: {second.name}{second.score}</li>
            <li>Fourth: {fourth.name}{fourth.score}</li>
            <li>Sixth: {sixth.name}{sixth.score}</li>
        </div>
    )
   }
   export default function IndianPlayers() {
    const indians=[
    {name:'Mr.Sachin', score:1},
     {name:'Mr.Dhoni', score:2},
    {name:'Mr.Virat', score:3},
    {name:'Mr.Rohith', score:4},
    {name:'Mr.Yuvraj',score:5},
    {name:'Mr.Raina',score:6}
    ]
return (
    <div>
        <h1>Odd players</h1>
      {Oddplayers(indians)}
      <h1>even players</h1>
      {Evenplayers(indians)}
      <h1>List of indian players merged</h1>
       <ul>
        {merged.map((indians, idx) => (
          <li key={idx}>{indians.name}</li>
        ))}
      </ul>
    </div>
  );
}
   
