

import {Component} from '@angular/core';
import {Product} from './Product';
import {ProductServiceOld} from './products.service';
import { LoginService } from './login.service';
import { CartService } from './cart.service';
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
    isAdmin:boolean;
    constructor(private productservice:ProductServiceOld,private loginservice:LoginService,private cartservice:CartService)
    {
        //fetch it ffrom service
        console.log("Product component constructor called");
        this.products = productservice.getProducts();
        this.loginservice.getUser().subscribe(newname=>{
            //this is a lambda expression which handles the new name that arrives
            this.isAdmin=newname.isAdmin;
        });
    }


    remove(index:number):void{
        this.products.splice(index,1);
    }


    validate(searchstr:string):void{
        console.log(searchstr);
    }


    addTocart(index:number):void{

        this.cartservice.setProductToCart(this.products[index]);
        this.products.splice(index,1);
    }
}
