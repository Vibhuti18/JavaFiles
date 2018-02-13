import {Component} from '@angular/core';
import { LoginService } from './login.service';
import { NewUser } from './NewUser';
import { Router } from '@angular/router';
@Component({
    selector:'login',
    template:`
    <form>
    Username:<input type="text" name="newname" [(ngModel)]="username"/><br/>
    Password:<input type="password" name="pwd" [(ngModel)]="password"/><br/>
    <button type="submit" (click)="clicked()">submit</button>
    </form>
    value of the name:{{username}}
    `
})
export class LoginComponent
{
username:string="admin";
password:string="admin";
isAdmin:boolean=true;

constructor(private loginservice:LoginService,private router:Router){

}


clicked():void{
    console.log("Login successfull");
    //set uder nsmr fr the login servie

    let u1= new NewUser(this.username,this.password,this.isAdmin);
    this.loginservice.setUser(u1);

    this.router.navigate(['/products'])
}

}