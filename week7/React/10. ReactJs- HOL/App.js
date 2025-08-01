import logo from './logo.svg';
import './App.css';

function App() {
  const ele="Office Space, at affordable Range";
  const sr="https://as2.ftcdn.net/jpg/03/84/55/29/1000_F_384552930_zPoe9zgmCF7qgt8fqSedcyJ6C6Ye3dFs.jpg"
  const image=<img src={sr} width="15%" height="15%" alt="office space"/>

  const list=[
    {Name: "DBS",Rent: "5000",Adress: "chennai"},
    {Name: "AMS",Rent:"8000",Adress:"Bangalore"},
    {Name:"SDA",Rent:"9000",Adress:"Hyderabad"}
  ]
  const obj=list.map(list=>
    <div key={list.Name}>
    <h2 style={{padding:0, marginTop:0}}> Name:<span>{list.Name}</span></h2>
     <h3 style={{color:list.Rent>6000?"green": "red",padding:0, marginTop:0}}> Rent:<span>{list.Rent}</span></h3>
     <h3> Address:<span>{list.Adress}</span></h3>
    </div>
  )
  return (
    <div className='container'>
    <h2>{ele}</h2>
    {image}
   {obj}
    </div>
  );
}

export default App;
