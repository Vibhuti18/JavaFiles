import { Component } from '@angular/core';
import {Items} from './Items';
import { LoginService } from './login.service';
import { ToDoService } from './ToDoService.service';


@Component({
  selector: 'app-root',
  template: `
  <menu></menu>
  <router-outlet></router-outlet>
  `,
  providers:[LoginService,ToDoService]
})


// <menu></menu>
// <router-outlet></router-outlet>





export class AppComponent {

//  uobj=new Items("xiomi",false,new Date(2017,5,12),new Date(2017,6,12));
 
}
//<todoname [Itemsobj]="uobj"></todoname>