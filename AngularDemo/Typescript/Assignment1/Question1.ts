import {Component} from '@angular/core';
@Component({
    selector:'products',
    template:`
    <h1>List of Items</h1>
    <table border="1">
    <th>Id</th>
    <th>Name</th>
    <th>Description</th>
    <th>Price</th>
    <th>Quantity</th>
    <th>Image</th>
    <th>Action</th>
    <tr *ngFor="let product of products">
    <td>{{product.id}}</td>
    <td>{{product.name}}</td>
    <td>{{product.dec}}</td>
    <td>{{product.price}}</td>
    <td>{{product.qty}}</td>
    <td><img src="{{product.imgPath}}"/></td>
    <td *ngIf="isAdmin"><button>Delete</button></td>
    </tr>
    </table>
    `
})

export class ProductsComponent
{
    products:Array<Product>;
    isAdmin:boolean=true;
    constructor()
    {
        this.products=new Array<Product>();
        let userObj1=new Product(10,"MotoG4","Mobile",200,50,"images/1.jpg");
        let userObj2=new Product(20,"SonyDSC","Camera",100,52,"images/2.jpg");
        let userObj3=new Product(30,"xiomi","Mobile",500,150,"images/3.jpg");
        let userObj4=new Product(40,"Samsung","Mobile",600,500,"images/4.jpg");
        let userObj5=new Product(50,"Nokia","Mobile",1000,250,"images/5.jpg");
   this.products.push(userObj1);
   this.products.push(userObj2);
   this.products.push(userObj3);
   this.products.push(userObj4);
   this.products.push(userObj5);

   
    }
}
