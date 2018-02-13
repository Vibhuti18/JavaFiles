import { Component, OnInit,Input,EventEmitter,Output} from '@angular/core';
import { User } from './user';


@Component({
    selector: 'profile',
    template: `
    
    <h1>Profile Component</h1>
    Username is {{username}}
   <input type="text" [(ngModel)]="username"/>
   <button (click)="updateName()">update</button>
    `
})
export class ProfileComponent implements OnInit {
    @Input()
   // Userobject:User;
    username:string;
    constructor() { 
        
    }

    @Output()
    update:EventEmitter<string> = new EventEmitter<string>();

    updateName():void{
        //trigger a custom event update
        this.update.emit(this.username)

    }

    ngOnInit() { }
}