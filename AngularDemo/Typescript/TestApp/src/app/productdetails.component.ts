import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import { Product } from './Product';
import { ProductServiceOld } from './products.service';

@Component({
    selector: 'productdetails',
    template:`
    <h2>Product details for {{proid}}</h2>
    <table border="1" >
    <th>Id</th>
    <th>Name</th>
    <th>Description</th>
    <th>Price</th>
    <th>Quantity</th>
    <tr>
    <td>{{found.id}}</td>
    <td>{{found.name}}</td>
    <td>{{found.dec}}</td>
    <td>{{found.price}}</td>
    <td>{{found.qty}}</td>
    </tr>
    </table>

    `
})

export class ProductDetailComponent implements OnInit {
  proid:number;
  lproducts:Product[];
  found:Product;
  constructor(private activeroute:ActivatedRoute,private productservice:ProductServiceOld)
  {
      //fetch it ffrom service
      console.log("laptop Product component constructor called");
      this.lproducts = productservice.getProducts();
    
  }
  
    

    ngOnInit() { 

this.activeroute.params.subscribe(routeparams=>{
    //this.product1=routeparams['product'];
    this.proid=parseInt(routeparams['productId']);
    this.lproducts.forEach(element => {

        if(element.id===this.proid)
        this.found=element;
        
    });
//     for(let param in routeparams ) {
//         console.log(param, "the param");
//    }
})



        //fetch the route parameter productId
    }
}