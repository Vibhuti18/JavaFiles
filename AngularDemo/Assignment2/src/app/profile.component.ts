import { Component, OnInit } from '@angular/core';
import { LoginService } from './login.service';
import { Router } from '@angular/router';


@Component({
    selector: 'profile-name',
    template: `
    
    <input placeholder="Enter name"  #box="ngModel" [(ngModel)]="uname" required>
    <p *ngIf="box.errors?.required">task title is mandatory field</p> 
    <button (click)="update()">Update</button>
    `
})
export class ProfileComponent implements OnInit {
    uname:string;
    constructor(private changeservice:LoginService,private router:Router) { 

    }
update():void{
    console.log(this.uname);
    this.router.navigate(['todolist',this.uname])

}
    ngOnInit() { }
}