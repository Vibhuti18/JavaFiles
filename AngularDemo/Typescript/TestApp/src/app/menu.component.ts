import { Component } from '@angular/core';

@Component({
  selector: 'menu',
  template: `
  <ul class="nav navbar-nav" [ngSwitch]="true" >
                <li class="active">
                     <a routerLink="/login">Login</a>
                </li>
                <li *ngSwitchCase="isAdmin===1||isAdmin===2">
                    <a routerLink="/products">Products</a>
                </li>
                <li *ngSwitchCase="isAdmin===1||isAdmin===2">
                    <a routerLink="/photos">Photos</a>
                </li>
                <li *ngSwitchCase="isAdmin===1||isAdmin===2">
                    <a routerLink="#">Profile</a>
                </li>
                <li>
                    <a routerLink="#">signUp</a>
                </li>
                <li *ngSwitchCase="isAdmin===1">
                    <a routerLink="#">Inventory</a>
                </li>
                <li *ngSwitchCase="isAdmin===1">
                    <a routerLink="#">Reports</a>
                </li>
                <li>
                    <a routerLink="#">contacts</a>
                </li>
                <li>
                    <a routerLink="#">Help</a>
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
