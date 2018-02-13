import { Component, OnInit } from '@angular/core';
import { Product } from './Product';
import { CartService } from './cart.service';
import { ProductServiceOld } from './products.service';

@Component({
    selector: 'cart-name',
    template: `
    
    <h1>Cart Content</h1>
    <table border="1">
    <th>Id</th>
    <th>Name</th>
    <th>Description</th>
    <th>Price</th>
    <th>Quantity</th>
    <th>Image</th>
    <th>Action</th>
    <tr *ngFor="let product of products;let i=index;">
    <td>{{product.id}}</td>
    <td>{{product.name}}</td>
    <td>{{product.dec}}</td>
    <td>{{product.price}}</td>
    <td>{{product.qty}}</td>
    <td><img [src]="product.imgPath"/></td>
    <td *ngIf="isAdmin"><button [disabled]="!isAdmin"  (click)="remove(i)">Delete</button></td>
    <td><button [disabled]="!isAdmin">Edit</button></td>
    <td><button (click)="removeFromCart(i)">RemoveFromCart</button></td>
    </tr>
    </table>`,
    styles:
    [
        `
        img
        {
            height:100px;
            width:100px
        }
        `
    ]
})
export class CartComponent implements OnInit {
    products:Product[]=[];

        constructor(private cartservice:CartService)
        {
            //fetch it ffrom service

           
            this.cartservice.getProductsFromCart().subscribe(newname=>{
                //this is a lambda expression which handles the new name that arrives
                this.products.push(newname);
            });
        }
    

    ngOnInit() { }


    // removeFromCart(index:number):void{

    //     this.productservice.setProductBackToCart(this.products[index]);
    //     this.products.splice(index,1);
    // }
}