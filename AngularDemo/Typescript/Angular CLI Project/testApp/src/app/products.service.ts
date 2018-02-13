import {Product} from './Product';
import {Injectable} from '@angular/core';


@Injectable()
export class ProductServiceOld
{
    products:Array<Product>;
    constructor()
    {
        console.log("ProductService constructor called")
        this.products=new Array<Product>();
        let userObj1=new Product(10,"MotoG4","Mobile",200,50,"assets/images/1.jpg");
        let userObj2=new Product(20,"SonyDSC","Camera",100,52,"assets/images/2.jpg");
        let userObj3=new Product(30,"xiomi","Mobile",500,150,"assets/images/3.jpg");
        let userObj4=new Product(40,"Samsung","Mobile",600,500,"assets/images/4.jpg");
        let userObj5=new Product(50,"Nokia","Mobile",1000,250,"assets/images/5.jpg");
   this.products.push(userObj1);
   this.products.push(userObj2);
   this.products.push(userObj3);
   this.products.push(userObj4);
   this.products.push(userObj5);  
    }


    getProducts():Array<Product>
    {
        return this.products;
    }


}