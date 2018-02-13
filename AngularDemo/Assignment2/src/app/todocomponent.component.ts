import { Component, OnInit,Input } from '@angular/core';
import {Items} from './Items'

@Component({
    selector: 'todoname',
    template: `
    <h1>{{Itemsobj.userId}}</h1>
    <h1>{{Itemsobj.id}}</h1>
    <h1>{{Itemsobj.title}}</h1>
    <h1>{{Itemsobj.completed}}</h1>
  
    
    `,

})
export class todoComponent implements OnInit {
    @Input()
    
    Itemsobj:Items;
    constructor() { }

    ngOnInit() { }
}