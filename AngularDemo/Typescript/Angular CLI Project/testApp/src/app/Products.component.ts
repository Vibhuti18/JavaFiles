

import {Component} from '@angular/core';
import {Product} from './Product';
import {ProductServiceOld} from './products.service';
@Component({
    selector:'products',
    templateUrl:'./product.component.html'
    
    ,

    styles:
    [
        `
        img
        {
            height:100px;
            width:100px
        }
        `
    ],

    providers:[{provide:ProductServiceOld,useClass:ProductServiceOld}]
})

export class ProductsComponent
{
    products:Array<Product>;
    isAdmin:boolean=true;
    constructor(private productservice:ProductServiceOld)
    {
        //fetch it ffrom service
        console.log("Product component constructor called");
        this.products = productservice.getProducts();
    }


    remove(index:number):void{
        this.products.splice(index,1);
    }


    validate(searchstr:string):void{
        console.log(searchstr);
    }
}
