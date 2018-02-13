import {Component} from '@angular/core';
@Component({
    selector:'Welcome',
    template:`
    <h1>{{welcomeMsg}}</h1>
    CamelCase: {{welcomeMsg|camelcase}}
    numbercase: {{num|numberpipe}}
    `
})
export class WelcomeComponent
{
welcomeMsg:string;
num:number=14852565646;
constructor()
{
    this.welcomeMsg="Welcome to my Application";
}

}