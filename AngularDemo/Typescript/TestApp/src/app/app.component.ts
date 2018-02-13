import { Component } from '@angular/core';
import { User } from './user';
import { LoginService } from './login.service';
import { CartService } from './cart.service';

@Component({
  selector: 'app-root',
 template:`
 <!--<app-header></app-header>
  <h1>Parent Component Name {{name}}</h1>
   <profile [username]="name" (update)="handleUpdate($event)"></profile>
 <login></login>
 <products></products>
 <cart-name></cart-name>
 <photo-name></photo-name>-->
 <menu></menu>
 <router-outlet></router-outlet>
 `,
 providers:[LoginService,CartService]
})
export class AppComponent {
  name:string = 'Jane';
 // uobj:User=new User('vibhuti',20,"Margao",9987456321);




  handleUpdate(newvalue:string):void{

    this.name=newvalue;


  }
}
