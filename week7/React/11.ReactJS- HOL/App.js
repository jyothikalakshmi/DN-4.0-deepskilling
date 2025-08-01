import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const[no,setNo]=useState(0);
   const increasevalue=()=>{
     setNo(no+1);
    }
    const hello=()=>{
alert("Hello! member1");
    }
  function handleClick(){
     increasevalue();
     hello();
  }
  function decreasevalue(){
    setNo(no-1);
  }
  function show(message){
    alert(message);
  }
const OnPress=()=>{
alert("I was clicked");
}
function handleSubmit(event){
  event.preventDefault();
let amt=document.getElementById('amount').value;
let euro=amt/90;
document.getElementById('currency').value=euro.toFixed(2);
}
  return (
    <div>
   <p>{no}</p>
  <button onClick={handleClick}>Increment</button><br/><br/>
  <button onClick={decreasevalue}>Decrement</button><br/><br/>
  <button onClick={()=>show("Welcome")}>Say Welcome</button><br/><br/>
  <button onClick={OnPress}>Click on me</button>
  <h1 style={{color:"green"}}>Currency Converter!!!</h1>
  <form>
<label for="amount">Amount:</label>
<input type="text" id="amount" style={{marginLeft:10}} /><br/><br/>
<label for="currency">Currency:</label>
<input type="text" id="currency" readonly style={{marginLeft:10}}/><br/><br/>
<button onClick={handleSubmit}>submit</button>
</form>
  </div>
  );
}

export default App;
