import { Component } from '@angular/core';

@Component({
  selector: 'menu',
  template: `
  <ul class="nav navbar-nav" [ngSwitch]="true" >
                <li class="active">
                     <a routerLink="/login">Login</a>
                </li>
                <li *ngSwitchCase="isAdmin===1||isAdmin===2">
                    <a routerLink="/todolist">ToDOList</a>
                </li>
                <li *ngSwitchCase="isAdmin===1||isAdmin===2">
                <a routerLink="/summary">Summary</a>
            </li>
           
            </ul>
  `
})
export class MenuComponent {
 
  isAdmin:number=1;
  //1 Admin 
  //2  Logged In
  //3 not logged in
}
