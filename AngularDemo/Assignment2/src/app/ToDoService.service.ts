import { Injectable } from '@angular/core';
import {Items} from './Items';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs/Observable';

@Injectable()
export class ToDoService {

    products:Array<Items>;

    constructor(private Http:HttpClient)
    {
        this.products=new Array<Items>();
//         let userObj1=new Items("MotoG4",true,new Date(2017,1,12),new Date(2017,1,12));
//         let userObj2=new Items("SonyDSC",false,new Date(2017,1,12),new Date(2017,1,12));
//         let userObj3=new Items("xiomi",true,new Date(2017,1,12),new Date(2017,1,12));
//         let userObj4=new Items("Samsung",false,new Date(2017,1,12),new Date(2017,1,12));
//    this.products.push(userObj1);
//    this.products.push(userObj2);
//    this.products.push(userObj3);
//    this.products.push(userObj4);

   
    }

 


    // setItems(item:Items):void{
    //     this.products.push(item);
    // }
    getItems():Observable<any>
    {
     return this.Http.get('https://jsonplaceholder.typicode.com/todos');
    }

     postItem(Item1:Items):void{
         
        this.Http.post('https://jsonplaceholder.typicode.com/todos',Item1
            
          ).subscribe(data=>{
              console.log("Data Posted");
          });

        
}

// "userId": Item1.userId,
// "id": Item1.id,
// "title": Item1.title,
// "completed": Item1.completed
    
}