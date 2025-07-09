import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';
import ProductList from './ProductList';
function App() {
  const [products,setProducts]=useState([]);
  useEffect(()=>{
    fetch("http://localhost:8080/api/products")
    .then(response => response.json())
    .then(data => setProducts(data));
  },[]);
 return(
 <div className='container'>
  <div>
  {products.length?(
    <ProductList products={products}/>
  ):(
    <p>Products not found</p>
  )}
  </div>
 </div>
 );
}

export default App;
