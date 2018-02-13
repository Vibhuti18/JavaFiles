import {Component} from '@angular/core';
import {Product} from './Product';
import {ProductServiceOld} from './products.service';

@Component({
    selector:'mobile',
    template:`

    <table border="1">
    <th>Id</th>
    <th>Name</th>
    <th>Description</th>
    <th>Price</th>
    <th>Quantity</th>
    <th>Image</th>
    <th>Action</th>
    <tr *ngFor="let product of mproducts;let i=index;">
    <td>{{product.id}}</td>
    <td>{{product.name}}</td>
    <td>{{product.dec}}</td>
    <td>{{product.price}}</td>
    <td>{{product.qty}}</td>
    <td><img [src]="product.imgPath"/></td>
    <td *ngIf="isAdmin"><button  (click)="remove(i)">Delete</button></td>
    <td><button [disabled]="!isAdmin">Edit</button></td>
    </tr>
    </table>

    `
})

export class MobileComponent
{
    mproducts:Product[];
    constructor(private productservice:ProductServiceOld)
    {
        //fetch it ffrom service
        console.log("Mobile Product component constructor called");
        this.mproducts = productservice.getProducts().filter(function(val:Product){
            return val.dec==='Mobile';
        });
    }
}
