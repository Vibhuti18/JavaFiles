import { Injectable } from '@angular/core';
import { Product } from './Product';
import { Subject } from 'rxjs/Subject';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class CartService {

    temp:any;
    namesubj:Subject<any>=new Subject<any>();
    setProductToCart(u1:any):void{
        
this.namesubj.next(u1);
this.temp=u1;
//next adds the name to the stream of bytes
    }


    getProductsFromCart():Observable<any>{
        //returns a stram of values
return this.namesubj.asObservable();

    }
}