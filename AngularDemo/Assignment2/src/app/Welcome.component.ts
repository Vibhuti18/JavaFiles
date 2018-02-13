import {Component} from '@angular/core';
@Component({
    selector:'Welcome',
    template:`
    <h1>{{welcomeMsg}}</h1>
    `
})
export class WelcomeComponent
{
welcomeMsg:string;
constructor()
{
    this.welcomeMsg="Welcome to my Application";
}

}