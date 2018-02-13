import { Component, OnInit } from '@angular/core';
import { LoginService } from './login.service';

@Component({
    selector: 'app-header',
    template: `
    
    <h2>Welcome {{username}} </h2>
    `
    
})
export class HeaderComponent implements OnInit {
    username:string;
    constructor(private loginservice:LoginService) { 

        this.loginservice.getUser().subscribe(newname=>{
            //this is a lambda expression which handles the new name that arrives
            this.username=newname.username;
        });
    }

    ngOnInit() { }
}