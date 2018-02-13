import { Component, OnInit,Input } from '@angular/core';

@Component({
    selector: 'profile',
    template: `
    
    <h1>ProfileComponent</h1>
    Username is {{username}}
    
    `,
    styleUrls: ['./name.component.scss']
})
export class ProfileComponent implements OnInit {

    @Input()
    username:string;
    constructor() { }

    ngOnInit() { }
}