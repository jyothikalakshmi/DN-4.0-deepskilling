import './App.css';
import IndianPlayers from './components/IndianPlayers';
import ListOfPlayers from './components/ListOfPlayers';
import { useState } from 'react';

function App() {
const [flag,setFlag]=useState(true);
  
const handleToggle=()=>{
  setFlag(prev=>!prev)
}
  
return(
  <div>
  <button style={{padding:'10px 10px',marginTop:'5px',marginBottom:'0px'}} onClick={handleToggle}>{flag.toString()} </button>
   {flag?<ListOfPlayers/>: <IndianPlayers/>}
   </div>
)
    }

export default App;
