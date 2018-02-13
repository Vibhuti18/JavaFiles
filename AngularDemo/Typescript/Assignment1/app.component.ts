import {Component} from '@angular/core';
@Component({
    selector:'app-root',
    template:`

    <ul [ngSwitch]="v">
    <li *ngSwitchCase="'Mohan'">Hello Mohan</li>
    <li *ngSwitchCase="'Sohan'">Hello Sohan</li>
    <li *ngSwitchCase="'Vijay'">Hello Vijay</li>
    <li *ngSwitchDefault>Bye Bye</li>
  </ul>  



    
    `
})

export class ProductsComponent
{
  
    isAdmin:number=0;
    constructor()
    {
        
   
    }
}
