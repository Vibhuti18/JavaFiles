import {Component} from '@angular/core';
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


clicked():void{
    console.log("Login successfull")

}

}